package org.hbird.rcpgui.tvtable.views;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.tvtable.Activator;
import org.hbird.rcpgui.tvtable.model.LiveParametersModel;
import org.hbird.rcpgui.tvtable.model.ParameterModel;
import org.joda.time.format.ISODateTimeFormat;

/**
 *
 * @author Mark Doyle
 *
 */
public class TelemetryTable extends ViewPart {
	private static class Sorter extends ViewerSorter {
		@Override
		public int compare(final Viewer viewer, final Object e1, final Object e2) {
			final Object item1 = e1;
			final Object item2 = e2;
			return 0;
		}
	}

	@SuppressWarnings("unused")
	private DataBindingContext m_bindingContext;

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.hbird.rcpgui.tvtable.views.TelemetryTable";

	private final ParameterModel model;
	private final ParameterModel liveModel = new LiveParametersModel(Activator.getContext());
	private final ParameterModel archiveModel = new LiveParametersModel(Activator.getContext());

	private TableViewer viewer;

	private ParameterComparator comparator;

	/**
	 * The constructor.
	 */
	public TelemetryTable() {
		this.model = this.liveModel;
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(final Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final CLabel lblTmServiceStatus = new CLabel(composite, SWT.BORDER);
		lblTmServiceStatus.setForeground(SWTResourceManager.getColor(0, 153, 255));
		lblTmServiceStatus.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		lblTmServiceStatus.setAlignment(SWT.CENTER);
		lblTmServiceStatus.setBounds(0, 0, 61, 21);
		lblTmServiceStatus.setText("Live");

		final ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		viewer = new TableViewer(scrolledComposite, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		comparator = new ParameterComparator();
		viewer.setComparator(comparator);
		final Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		final TableViewerColumn tableViewerColumnName = new TableViewerColumn(viewer, SWT.NONE);
		final TableColumn tblclmnName = tableViewerColumnName.getColumn();
		tblclmnName.addSelectionListener(getSelectionAdapter(tblclmnName, 0));
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");

		final TableViewerColumn tableViewerColumnValue = new TableViewerColumn(viewer, SWT.NONE);
		final TableColumn tblclmnValue = tableViewerColumnValue.getColumn();
		tblclmnValue.addSelectionListener(getSelectionAdapter(tblclmnValue, 1));
		tblclmnValue.setMoveable(true);
		tblclmnValue.setWidth(100);
		tblclmnValue.setText("Value");

		final TableViewerColumn tableViewerColumnReceived = new TableViewerColumn(viewer, SWT.NONE);

		tableViewerColumnReceived.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public Image getImage(final Object element) {
				return null;
			}

			@Override
			public String getText(final Object element) {
				System.out.println("Getting text");
				final long timstamp = (Long) element;
				return ISODateTimeFormat.dateTime().print(timstamp);
			}
		});

		final TableColumn tblclmnReceived = tableViewerColumnReceived.getColumn();
		tblclmnReceived.addSelectionListener(getSelectionAdapter(tblclmnReceived, 2));
		tblclmnReceived.setMoveable(true);
		tblclmnReceived.setWidth(100);
		tblclmnReceived.setText("Received");
		scrolledComposite.setContent(table);
		scrolledComposite.setMinSize(table.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		scrolledComposite.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(final ControlEvent e) {
				final Rectangle area = scrolledComposite.getClientArea();
				final Point preferredSize = table.computeSize(SWT.DEFAULT, SWT.DEFAULT);
				int width = area.width - 2 * table.getBorderWidth();
				if (preferredSize.y > area.height + table.getHeaderHeight()) {
					// Subtract the scrollbar width from the total column width if a vertical scrollbar
					// will be required
					final Point vBarSize = table.getVerticalBar().getSize();
					width -= vBarSize.x;
				}
				final Point oldSize = table.getSize();
				if (oldSize.x > area.width) {
					// table is getting smaller so make the columns smaller first and then resize the table
					// to match the client area width
					tblclmnName.setWidth(width / 3);
					tblclmnValue.setWidth(width / 3);
					tblclmnReceived.setWidth(width - tblclmnName.getWidth() - tblclmnValue.getWidth());
					table.setSize(area.width, area.height);
				}
				else {
					// table is getting bigger so make the table bigger first and then make the columns wider
					// to match the client area width
					table.setSize(area.width, area.height);
					tblclmnName.setWidth(width / 3);
					tblclmnValue.setWidth(width / 3);
					tblclmnReceived.setWidth(width - tblclmnName.getWidth() - tblclmnValue.getWidth());
				}
			}
		});

		comparator.setColumn(2);

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.hbird.rcp.telemetry-viewer-table.viewer");
		m_bindingContext = initDataBindings();
	}

	private SelectionAdapter getSelectionAdapter(final TableColumn column, final int index) {
		final SelectionAdapter selectionAdapter = new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				comparator.setColumn(index);
				final int dir = comparator.getDirection();
				viewer.getTable().setSortDirection(dir);
				viewer.getTable().setSortColumn(column);
				viewer.refresh();
			}
		};
		return selectionAdapter;
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	protected DataBindingContext initDataBindings() {
		final DataBindingContext bindingContext = new DataBindingContext();
		//
		final ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		final IObservableMap[] observeMaps = PojoObservables.observeMaps(listContentProvider.getKnownElements(), Parameter.class, new String[] { "name", "value",
		"receivedTime" });
		viewer.setLabelProvider(new ParameterMapLabelProvider(observeMaps));
		viewer.setContentProvider(listContentProvider);
		//
		final IObservableList modelParametersObserveList = BeansObservables.observeList(Realm.getDefault(), model, "parameters");
		viewer.setInput(modelParametersObserveList);
		//
		return bindingContext;
	}
}

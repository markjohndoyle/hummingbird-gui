package org.hbird.rcpgui.tvtable.views;

import java.util.HashSet;
import java.util.Set;

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
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.commons.control.ViewPartObservable;
import org.hbird.rcpgui.commons.control.ViewPartObserver;
import org.hbird.rcpgui.commons.model.ArchiveParameterFilterSettings;
import org.hbird.rcpgui.commons.model.ParameterModel;
import org.hbird.rcpgui.commons.model.LiveArchivedSwitchableModel.MODEL;
import org.joda.time.format.ISODateTimeFormat;

/**
 *
 * @author Mark Doyle
 *
 */
public class TelemetryTable extends ViewPart implements ViewPartObservable {

	@SuppressWarnings("unused")
	private DataBindingContext m_bindingContext;

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.hbird.rcpgui.tvtable.views.TelemetryTable";

	private ParameterModel model;
	// private final ParameterModel liveModel = new LiveParametersModel(Activator.getContext());
	// private ParameterModel archiveModel;

	private TableViewer viewer;

	private final ParameterComparator comparator = new ParameterComparator();

	private final ArchiveParameterFilterSettings filterSettings = new ArchiveParameterFilterSettings();

	private Set<ViewPartObserver> observers;

	private boolean liveMode = true;

	/**
	 * The constructor.
	 */
	public TelemetryTable() {
		setPartName("Telemetry view");
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(final Composite parent) {
		parent.setLayout(new GridLayout(2, false));

		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));

		final CLabel lblTmServiceStatus = new CLabel(composite, SWT.BORDER);
		lblTmServiceStatus.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		lblTmServiceStatus.setForeground(SWTResourceManager.getColor(0, 153, 255));
		lblTmServiceStatus.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		lblTmServiceStatus.setAlignment(SWT.CENTER);
		lblTmServiceStatus.setText("Live");

		Label lblFrom = new Label(composite, SWT.NONE);
		lblFrom.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		lblFrom.setText("From");

		final org.eclipse.swt.widgets.DateTime dateFrom = new org.eclipse.swt.widgets.DateTime(composite, SWT.BORDER | SWT.DROP_DOWN);
		dateFrom.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				filterSettings.fromTime = filterSettings.fromTime.withDate(dateFrom.getYear(), dateFrom.getMonth() + 1, dateFrom.getDay());
				System.out.println("From time is now: " + filterSettings.fromTime);
				fireFilterSettingsChanged();
			}
		});
		dateFrom.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

		final org.eclipse.swt.widgets.DateTime timeFrom = new org.eclipse.swt.widgets.DateTime(composite, SWT.BORDER | SWT.TIME | SWT.LONG);
		timeFrom.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				filterSettings.fromTime = filterSettings.fromTime.withTime(timeFrom.getHours(), timeFrom.getMinutes(), timeFrom.getSeconds(), 0);
				fireFilterSettingsChanged();
			}
		});
		timeFrom.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

		Label lblTo = new Label(composite, SWT.NONE);
		lblTo.setText("To");

		final org.eclipse.swt.widgets.DateTime dateTo = new org.eclipse.swt.widgets.DateTime(composite, SWT.BORDER | SWT.DROP_DOWN);
		dateTo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				filterSettings.toTime = filterSettings.toTime.withDate(dateTo.getYear(), dateTo.getMonth() + 1, dateTo.getDay());
				fireFilterSettingsChanged();
			}
		});
		dateTo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

		final org.eclipse.swt.widgets.DateTime timeTo = new org.eclipse.swt.widgets.DateTime(composite, SWT.BORDER | SWT.TIME | SWT.LONG);
		timeTo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				filterSettings.toTime = filterSettings.toTime.withTime(timeTo.getHours(), timeTo.getMinutes(), timeTo.getSeconds(), 0);
				fireFilterSettingsChanged();
			}
		});
		timeTo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

		Button btnUseTimeFilter = new Button(composite, SWT.CHECK);
		btnUseTimeFilter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				filterSettings.useTimefilter = true;
				toggleLiveArchive();
				fireFilterSettingsChanged();
			}
		});
		btnUseTimeFilter.setText("use time filter");

		Button btnFilterLive = new Button(composite, SWT.NONE);
		btnFilterLive.setEnabled(false);
		btnFilterLive.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				// toggleLiveArchive((Button)e.getSource());
			}
		});
		btnFilterLive.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, false, true, 1, 1));
		btnFilterLive.setText("Filter");

		final Composite scrolledComposite = new Composite(parent, SWT.BORDER);
		scrolledComposite.setLayout(new GridLayout(1, false));
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		viewer = new TableViewer(scrolledComposite, SWT.VIRTUAL);
		viewer.setComparator(comparator);
		final Table table = viewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		final TableViewerColumn tableViewerColumnName = new TableViewerColumn(viewer, SWT.NONE);
		final TableColumn tblclmnName = tableViewerColumnName.getColumn();
		tblclmnName.setMoveable(true);
		// tblclmnName.addSelectionListener(getSelectionAdapter(tblclmnName, 0));
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");

		final TableViewerColumn tableViewerColumnValue = new TableViewerColumn(viewer, SWT.NONE);
		final TableColumn tblclmnValue = tableViewerColumnValue.getColumn();
		// tblclmnValue.addSelectionListener(getSelectionAdapter(tblclmnValue, 1));
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
				final long timstamp = (Long) element;
				return ISODateTimeFormat.dateTime().print(timstamp);
			}
		});
		final TableColumn tblclmnReceived = tableViewerColumnReceived.getColumn();
		// tblclmnReceived.addSelectionListener(getSelectionAdapter(tblclmnReceived, 2));
		tblclmnReceived.setMoveable(true);
		tblclmnReceived.setWidth(100);
		tblclmnReceived.setText("Received");

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.hbird.rcp.telemetry-viewer-table.viewer");

		comparator.setColumn(2);
		m_bindingContext = initDataBindings();
	}

	protected void toggleLiveArchive() {
		if (liveMode) {
			liveMode = false;
			for (ViewPartObserver o : observers) {
				o.switchModel(MODEL.ARCHIVE);
			}
			// btn.setText("Go Live");
		}
		else {
			liveMode = true;
			for (ViewPartObserver o : observers) {
				o.switchModel(MODEL.LIVE);
			}
			// btn.setText("Filter");
		}
	}

	// private SelectionAdapter getSelectionAdapter(final TableColumn column, final int index) {
	// final SelectionAdapter selectionAdapter = new SelectionAdapter() {
	// @Override
	// public void widgetSelected(final SelectionEvent e) {
	// comparator.setColumn(index);
	// final int dir = comparator.getDirection();
	// viewer.getTable().setSortDirection(dir);
	// viewer.getTable().setSortColumn(column);
	// viewer.refresh();
	// }
	// };
	// return selectionAdapter;
	// }

	private void fireFilterSettingsChanged() {
		for (ViewPartObserver o : observers) {
			o.updatedFilterSettings(filterSettings);
		}
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
		final IObservableMap[] observeMaps = PojoObservables.observeMaps(listContentProvider.getKnownElements(), Parameter.class, new String[] { "name",
				"value", "receivedTime" });
		viewer.setLabelProvider(new ParameterMapLabelProvider(observeMaps));
		viewer.setContentProvider(listContentProvider);
		//
		final IObservableList modelParametersObserveList = BeansObservables.observeList(Realm.getDefault(), model, "parameters", Parameter.class);
		viewer.setInput(modelParametersObserveList);
		//
		return bindingContext;
	}

	public void setModel(final ParameterModel model) {
		this.model = model;
	}

	@Override
	public void addObserver(final ViewPartObserver o) {
		if (observers == null) {
			observers = new HashSet<ViewPartObserver>(1);
		}
		boolean addedOk = this.observers.add(o);
	}

	@Override
	public void removeObserver(final ViewPartObserver o) {
		if (observers != null) {
			this.observers.remove(o);
		}
	}

}

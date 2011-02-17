package org.hbird.rcpgui.telemetry.views;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;
import org.hbird.rcpgui.telemetry.model.ParameterSource;
import org.hbird.rcpgui.telemetry.model.TelemetryParameter;

public class TelemetryView extends ViewPart {

	private DataBindingContext m_bindingContext;

	public static final String ID = "org.hbird.rcpgui.telemetry.views.TelemetryView"; //$NON-NLS-1$
	private Table telemetryTable;
	private ParameterSource parametersModel = new ParameterSource();
	private TableViewer tableViewer;
	private TableColumn tblclmnNameColumn;

	public TelemetryView() {
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(final Composite parent) {
		final Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		{
			final Composite composite = new Composite(container, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			final TableColumnLayout tcl_composite = new TableColumnLayout();
			composite.setLayout(tcl_composite);
			{
				tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
				tableViewer.setColumnProperties(new String[] {});
				telemetryTable = tableViewer.getTable();
				telemetryTable.setHeaderVisible(true);
				telemetryTable.setLinesVisible(true);
				{
					final TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
					tblclmnNameColumn = tableViewerColumn.getColumn();
					tcl_composite.setColumnData(tblclmnNameColumn, new ColumnPixelData(150, true, true));
					tblclmnNameColumn.setText("Parameter Name");
				}
				{
					final TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
					final TableColumn tblclmnValueColumn = tableViewerColumn.getColumn();
					tcl_composite.setColumnData(tblclmnValueColumn, new ColumnPixelData(150, true, true));
					tblclmnValueColumn.setText("Value");
				}
				{
					final TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
					final TableColumn tblclmnSpacecraftTimestampColumn = tableViewerColumn.getColumn();
					tcl_composite.setColumnData(tblclmnSpacecraftTimestampColumn, new ColumnPixelData(150, true, true));
					tblclmnSpacecraftTimestampColumn.setText("Spacecraft Timestamp");
				}
				{
					final TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
					final TableColumn tblclmnShortDescription = tableViewerColumn.getColumn();
					tcl_composite.setColumnData(tblclmnShortDescription, new ColumnPixelData(150, true, true));
					tblclmnShortDescription.setText("Short description");
				}
			}
		}

		initializeToolBar();
		initializeMenu();
		m_bindingContext = initDataBindings();
	}


	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		final IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		final IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}
	protected DataBindingContext initDataBindings() {
		final DataBindingContext bindingContext = new DataBindingContext();
		//
		final ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		tableViewer.setContentProvider(listContentProvider);
		//
		final IObservableMap[] observeMaps = PojoObservables.observeMaps(listContentProvider.getKnownElements(), TelemetryParameter.class, new String[] {
			"name", "value", "spacecraftTimestamp", "shortDescription", "longDescription" });
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		//
		final IObservableList parametersModelLiveParameterListObserveList = BeansObservables.observeList(Realm.getDefault(), parametersModel,
		"liveParameterList");
		tableViewer.setInput(parametersModelLiveParameterListObserveList);
		//
		return bindingContext;
	}

	/**
	 * @return the parametersModel
	 */
	public ParameterSource getParametersModel() {
		return parametersModel;
	}

	/**
	 * @param parametersModel
	 *            the parametersModel to set
	 */
	public void setParametersModel(final ParameterSource parametersModel) {
		this.parametersModel = parametersModel;
	}
}

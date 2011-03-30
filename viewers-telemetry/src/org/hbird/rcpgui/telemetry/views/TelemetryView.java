package org.hbird.rcpgui.telemetry.views;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IElementComparer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.telemetryprovision.model.TelemetryParameter;
import org.hbird.rcpgui.telemetryprovision.services.TelemetryProviderServiceFactory;
import org.hbird.rcpgui.telemetryprovision.source.ParameterSource;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.Binding;

public class TelemetryView extends ViewPart  {
	private Binding tmratebinding;

	private DataBindingContext m_bindingContext;

	public static final String ID = "org.hbird.rcpgui.telemetry.views.TelemetryView"; //$NON-NLS-1$
	private Table telemetryTable;
	private final ParameterSource parametersSource;
	private TableViewer tableViewer;
	private TableColumn tblclmnNameColumn;
	private Label lblTmRateValue;

	public TelemetryView() {
		parametersSource = new ParameterSource(true);
		final Object[] serviceObjects = TelemetryProviderServiceFactory.getServices();
//		if (serviceObjects.length > 0) {
//			for (final Object o : serviceObjects) {
//				parameterProviderServices.add((ParameterProvider) o);
//			}
//		}
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
			composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			composite.setLayout(new GridLayout(2, false));
			{
				final Label lblTmRate = new Label(composite, SWT.NONE);
				lblTmRate.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
				lblTmRate.setText("TM Rate");
			}
			{
				lblTmRateValue = new Label(composite, SWT.NONE);
				lblTmRateValue.setText("0 p/s");
			}
		}
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

	/**
	 * @return the parametersModel
	 */
	public ParameterSource getParametersModel() {
		return parametersSource;
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		tableViewer.setContentProvider(listContentProvider);
		//
		IObservableMap[] observeMaps = PojoObservables.observeMaps(listContentProvider.getKnownElements(), TelemetryParameter.class, new String[]{"name", "value", "spacecraftTimestamp", "shortDescription", "longDescription"});
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		//
		IObservableList parametersModelLiveParameterListObserveList = BeansObservables.observeList(Realm.getDefault(), parametersSource, "liveParameterList");
		tableViewer.setInput(parametersModelLiveParameterListObserveList);
		//
		IObservableValue lblTmRateValueObserveTextObserveWidget = SWTObservables.observeText(lblTmRateValue);
		IObservableValue parametersSourceTmRateObserveValue = BeansObservables.observeValue(parametersSource, "tmRate");
		bindingContext.bindValue(lblTmRateValueObserveTextObserveWidget, parametersSourceTmRateObserveValue, null, new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE));
		//
		return bindingContext;
	}
}

package org.hbird.rcpgui.telemetry.views;

import java.util.ArrayList;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.telemetry.ViewersTelemetryActivator;
import org.hbird.rcpgui.telemetryprovision.model.ParameterSource;
import org.hbird.rcpgui.telemetryprovision.model.TelemetryParameter;

public class TelemetryStreamerView extends ViewPart {

	private ParameterSource parameterSource;
	private ArrayList<ParameterProvider> parameterProviderServices;
	private Table table;
	private TableViewer tableViewer;

	public TelemetryStreamerView() {
		final Object[] serviceObjects = ViewersTelemetryActivator.getParameterProviderServiceTracker().getServices();
		if (serviceObjects.length > 0) {
			this.parameterProviderServices = new ArrayList<ParameterProvider>(serviceObjects.length);
			for (final Object o : serviceObjects) {
				parameterProviderServices.add((ParameterProvider) o);
			}
		}
		this.setParameterSource(new ParameterSource(parameterProviderServices.get(0)));
	}

	@Override
	public void createPartControl(final Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		TableColumnLayout tcl_composite = new TableColumnLayout();
		composite.setLayout(tcl_composite);

		tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION | SWT.VIRTUAL);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableViewerColumn tableViewerColumnName = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnName = tableViewerColumnName.getColumn();
		tcl_composite.setColumnData(tblclmnName, new ColumnPixelData(150, true, true));
		tblclmnName.setText("Name");
		// Component create
		TableViewerColumn tableViewerColumnValue = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnValue = tableViewerColumnValue.getColumn();
		tcl_composite.setColumnData(tblclmnValue, new ColumnPixelData(150, true, true));
		tblclmnValue.setText("Value");

		initDataBindings();

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public void setParameterSource(final ParameterSource parameterSource) {
		this.parameterSource = parameterSource;
	}

	public ParameterSource getParameterSource() {
		return parameterSource;
	}


	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		tableViewer.setContentProvider(listContentProvider);
		//
		IObservableMap[] observeMaps = PojoObservables.observeMaps(listContentProvider.getKnownElements(), TelemetryParameter.class, new String[] { "name",
				"value" });
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		//
		IObservableList parametersModelLiveParameterListObserveList = BeansObservables.observeList(Realm.getDefault(), parameterSource, "liveParameterList");
		tableViewer.setInput(parametersModelLiveParameterListObserveList);
		//
		return bindingContext;
	}
}

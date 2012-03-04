package org.hbird.rcpgui.tmcontrol.views;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.part.ViewPart;
import org.hbird.rcpgui.tmcontrol.model.ParameterProvidersModel;
import org.osgi.framework.ServiceReference;

public class TelemetryControlView extends ViewPart {

	@SuppressWarnings("unused")
	private DataBindingContext m_bindingContext;

	private Table table;

	private ParameterProvidersModel model;
	private TableViewer tableViewer;

	public TelemetryControlView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(final Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new TableColumnLayout());

		tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		m_bindingContext = initDataBindings();
	}

	@Override
	public void setFocus() {
	}

	public ParameterProvidersModel getModel() {
		return model;
	}

	public void setModel(final ParameterProvidersModel model) {
		this.model = model;
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		IObservableMap[] observeMaps = PojoObservables.observeMaps(listContentProvider.getKnownElements(), ServiceReference.class, new String[]{"bundle", "usingBundles"});
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		tableViewer.setContentProvider(listContentProvider);
		//
		IObservableList modelParameterProviderServicesObserveList = PojoObservables.observeList(Realm.getDefault(), model, "parameterProviderServices");
		tableViewer.setInput(modelParameterProviderServicesObserveList);
		//
		return bindingContext;
	}
}

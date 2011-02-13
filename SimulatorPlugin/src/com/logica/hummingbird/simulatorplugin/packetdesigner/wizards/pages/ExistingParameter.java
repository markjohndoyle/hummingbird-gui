package com.logica.hummingbird.simulatorplugin.packetdesigner.wizards.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;

import com.logica.hummingbird.simulatorplugin.SimDock;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;

public class ExistingParameter extends WizardPage {
	private DataBindingContext m_bindingContext;

	private SimDock simDock;
	private List parameterList;
	private ListViewer listViewer;
	private List parameterDetailsList;
	private ListViewer listViewer_1;

	/**
	 * Create the wizard.
	 */
	public ExistingParameter() {
		super("wizardPage");
		setTitle("Select existing parameter");
		setDescription("Select an existing parameter from the loaded space system model");
		simDock = SimDock.getInstance();
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		// Component creation
		final SashForm sashForm = new SashForm(container, SWT.NONE);
		// Component creation
		listViewer = new ListViewer(sashForm, SWT.BORDER | SWT.V_SCROLL);
		parameterList = listViewer.getList();
		// Component creation
		listViewer_1 = new ListViewer(sashForm, SWT.BORDER | SWT.V_SCROLL);
		parameterDetailsList = listViewer_1.getList();
		sashForm.setWeights(new int[] { 1, 1 });
		m_bindingContext = initDataBindings();
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableList listObserveItemsObserveListWidget = SWTObservables.observeItems(parameterList);
		IObservableList simDockAllParametersObserveList = PojoObservables.observeList(Realm.getDefault(), simDock, "allParameters");
		bindingContext.bindList(listObserveItemsObserveListWidget, simDockAllParametersObserveList, null, null);
		//
		return bindingContext;
	}
}

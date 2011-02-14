package com.logica.hummingbird.simulatorplugin.packetdesigner.wizards.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

import com.logica.hummingbird.simulatorplugin.SimDock;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

public class ExistingParameter extends WizardPage {
	private DataBindingContext m_bindingContext;

	private SimDock simDock;
	private List parameterList;
	private ListViewer listViewer;
	private Text longDescription;

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
		ScrolledComposite scrolledComposite = new ScrolledComposite(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);

		// Component creation
		final SashForm sashForm = new SashForm(scrolledComposite, SWT.NONE);

		// Component creation
		listViewer = new ListViewer(sashForm, SWT.BORDER | SWT.V_SCROLL);
		parameterList = listViewer.getList();

		// Component creation
		longDescription = new Text(sashForm, SWT.BORDER);
		longDescription.setEditable(false);
		sashForm.setWeights(new int[] { 1, 1 });
		scrolledComposite.setContent(sashForm);
		scrolledComposite.setMinSize(sashForm.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		m_bindingContext = initDataBindings();
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		listViewer.setContentProvider(listContentProvider);
		//
		IObservableMap observeMap = BeansObservables.observeMap(listContentProvider.getKnownElements(), HummingbirdParameter.class, "name");
		listViewer.setLabelProvider(new ObservableMapLabelProvider(observeMap));
		//
		IObservableList simDockAllParametersAsSimParametersObserveList = PojoObservables.observeList(Realm.getDefault(), simDock, "allParametersAsSimParameters");
		listViewer.setInput(simDockAllParametersAsSimParametersObserveList);
		//
		return bindingContext;
	}
}

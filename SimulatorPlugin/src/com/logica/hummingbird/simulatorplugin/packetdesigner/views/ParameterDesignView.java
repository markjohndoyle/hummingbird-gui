package com.logica.hummingbird.simulatorplugin.packetdesigner.views;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateListStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign;

public class ParameterDesignView extends ViewPart {
	private DataBindingContext m_bindingContext;

	public static final String ID = "com.logica.hummingbird.simulatorplugin.packetdesigner.views.ParameterDesignView"; //$NON-NLS-1$
	private Text text;
	private Text text_1;

	private SimPacketDesign packetDesign;
	private List list;

	public ParameterDesignView() {
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		{
			SashForm sashForm = new SashForm(container, SWT.NONE);

			ListViewer listViewer = new ListViewer(sashForm, SWT.BORDER | SWT.V_SCROLL);
			list = listViewer.getList();

			Composite composite = new Composite(sashForm, SWT.NONE);
			composite.setLayout(new GridLayout(2, false));

			Label lblName = new Label(composite, SWT.NONE);
			lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			lblName.setText("Name");

			text = new Text(composite, SWT.BORDER);
			text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

			Label lblType = new Label(composite, SWT.NONE);
			lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			lblType.setText("Type");

			Combo combo = new Combo(composite, SWT.NONE);
			combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

			Label lblValue = new Label(composite, SWT.NONE);
			lblValue.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			lblValue.setText("Value");

			text_1 = new Text(composite, SWT.BORDER);
			text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			sashForm.setWeights(new int[] { 1, 1 });
		}

		createActions();
		initializeToolBar();
		initializeMenu();
		m_bindingContext = initDataBindings();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	public void setPacketDesign(SimPacketDesign packetDesign) {
		this.packetDesign = packetDesign;
	}

	public SimPacketDesign getPacketDesign() {
		return packetDesign;
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableList listObserveItemsObserveListWidget = SWTObservables.observeItems(list);
		IObservableList packetDesigngetPacketParametersObserveList = PojoObservables.observeList(Realm.getDefault(), packetDesign.getPacket(), "parameters");
		bindingContext.bindList(listObserveItemsObserveListWidget, packetDesigngetPacketParametersObserveList, null, new UpdateListStrategy(
				UpdateListStrategy.POLICY_NEVER));
		//
		return bindingContext;
	}
}

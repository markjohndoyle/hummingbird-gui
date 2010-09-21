package com.logica.hummingbird.simulatorplugin.packetdesigner.dialogs;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

public class ParameterEditDialog extends Dialog {

	private DataBindingContext m_bindingContext;
	private com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign simPacketDesign = new com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign();
	private List parametersList;

	/**
	 * @wbp.parser.constructor
	 */
	public ParameterEditDialog(Shell parentShell) {
		super(parentShell);
	}

	public ParameterEditDialog(Shell parentShell, com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign newSimPacketDesign) {
		super(parentShell);
		setSimPacketDesign(newSimPacketDesign, false);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, false));

		new Label(container, SWT.NONE).setText("Parameters:");

		parametersList = new List(container, SWT.BORDER);
		parametersList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		if (simPacketDesign != null) {
			m_bindingContext = initDataBindings();
		}
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
		m_bindingContext = initDataBindings();
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}

	public com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign getSimPacketDesign() {
		return simPacketDesign;
	}

	public void setSimPacketDesign(com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign newSimPacketDesign) {
		setSimPacketDesign(newSimPacketDesign, true);
	}

	public void setSimPacketDesign(com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign newSimPacketDesign, boolean update) {
		simPacketDesign = newSimPacketDesign;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (simPacketDesign != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue parametersListObserveSelectionObserveWidget = SWTObservables.observeSelection(parametersList);
		IObservableValue simPacketDesignParametersObserveValue = PojoObservables.observeValue(simPacketDesign, "parameters");
		bindingContext.bindValue(parametersListObserveSelectionObserveWidget, simPacketDesignParametersObserveValue, null, null);
		//
		return bindingContext;
	}
}

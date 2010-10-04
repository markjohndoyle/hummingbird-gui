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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class PacketEditDialog extends Dialog {

	private DataBindingContext m_bindingContext;
	private com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign packetDesign = new com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign();
	private Text packetNameText;

	/**
	 * @wbp.parser.constructor
	 */
	public PacketEditDialog(Shell parentShell) {
		super(parentShell);
	}

	public PacketEditDialog(Shell parentShell, com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign newPacketDesign) {
		super(parentShell);
		setPacketDesign(newPacketDesign, false);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		parent.setToolTipText("Edit the packet");
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, false));

		new Label(container, SWT.NONE).setText("PacketName:");

		packetNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		packetNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		if (packetDesign != null) {
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
		return new Point(218, 110);
	}

	public com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign getPacketDesign() {
		return packetDesign;
	}

	public void setPacketDesign(com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign newPacketDesign) {
		setPacketDesign(newPacketDesign, true);
	}

	public void setPacketDesign(com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign newPacketDesign, boolean update) {
		packetDesign = newPacketDesign;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (packetDesign != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue packetNameObserveWidget = SWTObservables.observeText(packetNameText, SWT.FocusOut);
		IObservableValue packetNameObserveValue = PojoObservables.observeValue(packetDesign, "packetName");
		bindingContext.bindValue(packetNameObserveWidget, packetNameObserveValue, null, null);
		//
		return bindingContext;
	}
}

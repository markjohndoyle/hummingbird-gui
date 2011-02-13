package com.logica.hummingbird.simulatorplugin.packetdesigner.commands;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimParameter;
import com.logica.hummingbird.simulatorplugin.packetdesigner.wizards.NewParameterWizard;

public class ParameterCreateCommand extends Command {

	SimPacketDesign packetDesign;
	SimParameter parameterToAdd;
	private final WizardDialog wizDialog;

	public ParameterCreateCommand(SimPacketDesign manager) {
		System.out.println("ParameterCreateCommand with no parameter therefore using a default parameter");
		NewParameterWizard wiz = new NewParameterWizard();
		wizDialog = new WizardDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), wiz);
		SimParameter p = new SimParameter("Default Parameter", Integer.class, 0);
		this.packetDesign = manager;
		this.parameterToAdd = p;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		System.out.println("ParameterCreateCommand executing");
		redo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	@Override
	public void redo() {
		wizDialog.open();
		packetDesign.addParameter(parameterToAdd);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		super.undo();
	}

}

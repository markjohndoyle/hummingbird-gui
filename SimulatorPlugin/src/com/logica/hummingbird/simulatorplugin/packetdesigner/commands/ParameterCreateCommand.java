package com.logica.hummingbird.simulatorplugin.packetdesigner.commands;

import org.eclipse.gef.commands.Command;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesign;
import com.logica.hummingbird.telemetry.HummingbirdParameter;
import com.logica.hummingbird.telemetry.Parameter;

public class ParameterCreateCommand extends Command {

	PacketDesign packetDesign;
	HummingbirdParameter parameterToAdd;

	public ParameterCreateCommand(PacketDesign manager) {
		System.out.println("ParameterCreateCommand with no parameter therefore using a default parameter");
		HummingbirdParameter p = new Parameter("Default Parameter", Integer.class, 0);
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

package com.logica.hummingbird.simulatorplugin.packetdesigner.commands;

import org.eclipse.gef.commands.Command;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacket;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimParameter;

public class ParameterDeleteGefCommand extends Command {

	private final SimPacketDesign packetDesign;
	private final SimPacket packet;
	private final SimParameter parameter;

	public ParameterDeleteGefCommand(SimPacketDesign packetDesign, SimPacket packet, SimParameter parameter) {
		if (packet == null || parameter == null || packetDesign == null) {
			throw new IllegalArgumentException();
		}
		setLabel("parameter deletion");
		this.packet = packet;
		this.parameter = parameter;
		this.packetDesign = packetDesign;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		redo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	@Override
	public void redo() {
		packetDesign.removeParameter(parameter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		packetDesign.addParameter(parameter);
	}

}

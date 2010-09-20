package com.logica.hummingbird.simulatorplugin.packetdesigner.commands;

import org.eclipse.gef.commands.Command;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesign;
import com.logica.hummingbird.telemetry.HummingbirdPacket;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

public class ParameterDeleteGefCommand extends Command {

	private final PacketDesign packetDesign;
	private final HummingbirdPacket packet;
	private final HummingbirdParameter parameter;

	public ParameterDeleteGefCommand(PacketDesign packetDesign, HummingbirdPacket packet, HummingbirdParameter parameter) {
		System.out.println("Creating ParameterDeleteGefCommand");
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

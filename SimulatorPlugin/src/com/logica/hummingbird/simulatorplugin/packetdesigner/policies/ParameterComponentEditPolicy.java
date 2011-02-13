package com.logica.hummingbird.simulatorplugin.packetdesigner.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.logica.hummingbird.simulatorplugin.packetdesigner.commands.ParameterDeleteGefCommand;
import com.logica.hummingbird.simulatorplugin.packetdesigner.editparts.PacketDesignEditPart;
import com.logica.hummingbird.simulatorplugin.packetdesigner.editparts.PacketEditPart;
import com.logica.hummingbird.simulatorplugin.packetdesigner.editparts.ParameterEditPart;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacket;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimParameter;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

public class ParameterComponentEditPolicy extends ComponentEditPolicy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editpolicies.ComponentEditPolicy#getDeleteCommand(org.eclipse.gef.requests.GroupRequest)
	 */
	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		System.out.println("Getting delete command for Parameter");
		// Get the packet that this parameter belongs too
		PacketEditPart packetEditPart = (PacketEditPart) getHost().getParent();
		SimPacket packet = packetEditPart.getPacketModel();

		// Create a compound command in case there are multiple selections
		CompoundCommand delete = new CompoundCommand();

		// For each selected figures EditPart...
		for (Object item : request.getEditParts()) {
			// get the edit part so we can...
			EditPart editPart = (EditPart) item;

			if (!(editPart instanceof ParameterEditPart)) {
				return null;
			}

			// get the backing model
			Object model = editPart.getModel();

			// if the model is a parameter we can delete it using this command
			if (model instanceof HummingbirdParameter) {
				// Get the PacketDesign model
				PacketDesignEditPart pdep = (PacketDesignEditPart) ((ParameterEditPart) editPart).getParent().getParent();
				SimPacketDesign pd = pdep.getPacketDesign();

				delete.add(new ParameterDeleteGefCommand(pd, packet, (SimParameter) model));
			}
			else {
				// FIXME Use logging mechanism when it is set up.
				System.err.println("Somehow the model is not a HummingbirdParameter when the Parameter Edit Policy");
			}
		}

		return delete;
	}
}

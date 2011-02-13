package com.logica.hummingbird.simulatorplugin.packetdesigner.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacket;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimParameter;

public class PacketDesignerEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart editPart = null;

		if (model instanceof SimPacketDesign) {
			System.out.println("Returning packet deisgn");
			editPart = new PacketDesignEditPart((SimPacketDesign) model);
		}
		else if (model instanceof SimPacket) {
			System.out.println("Returning packet");
			editPart = new PacketEditPart((SimPacket) model);
		}
		else if (model instanceof SimParameter) {
			System.out.println("Returning parameter");
			editPart = new ParameterEditPart((SimParameter) model);
		}
		else {
			throw new RuntimeException("Can't create part for model element: " + ((model != null) ? model.getClass().getName() : "null"));
		}

		return editPart;
	}

}

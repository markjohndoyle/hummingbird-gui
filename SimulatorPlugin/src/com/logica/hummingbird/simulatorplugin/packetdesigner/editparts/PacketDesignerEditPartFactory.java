package com.logica.hummingbird.simulatorplugin.packetdesigner.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign;
import com.logica.hummingbird.telemetry.HummingbirdPacket;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

public class PacketDesignerEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart editPart = null;

		if (model instanceof SimPacketDesign) {
			System.out.println("Returning packet deisgn");
			editPart = new PacketDesignEditPart((SimPacketDesign) model);
		}
		else if (model instanceof HummingbirdPacket) {
			System.out.println("Returning packet");
			editPart = new PacketEditPart((HummingbirdPacket) model);
		}
		else if (model instanceof HummingbirdParameter) {
			System.out.println("Returning parameter");
			editPart = new ParameterEditPart((HummingbirdParameter) model);
		}
		else {
			throw new RuntimeException("Can't create part for model element: " + ((model != null) ? model.getClass().getName() : "null"));
		}

		return editPart;
	}

}

package com.logica.hummingbird.simulatorplugin.packetdesigner.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.OrderedLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.logica.hummingbird.simulatorplugin.packetdesigner.commands.ParameterCreateCommand;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesign;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

public class PacketLayoutEditPolicy extends OrderedLayoutEditPolicy {

	@Override
	protected Command createAddCommand(EditPart child, EditPart after) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Command createMoveChildCommand(EditPart child, EditPart after) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		if (request.getNewObject() == HummingbirdParameter.class) {
			System.out.println("PacketLayoutEditPolicy is getting create command for HummingbirdParameter classs");
			PacketDesign manager = (PacketDesign) getHost().getParent().getModel();
			return new ParameterCreateCommand(manager);
		}
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected EditPart getInsertionReference(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

}

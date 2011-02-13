package com.logica.hummingbird.simulatorplugin.packetdesigner.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.OrderedLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

public class ParameterLayoutEditPolicy extends OrderedLayoutEditPolicy {

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createAddCommand(EditPart child, EditPart after) {
		System.out.println("ParameterLayoutEditPolicy is createAddCommand with child " + child.toString());
		return null;
	}

	@Override
	protected Command createMoveChildCommand(EditPart child, EditPart after) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected EditPart getInsertionReference(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

}

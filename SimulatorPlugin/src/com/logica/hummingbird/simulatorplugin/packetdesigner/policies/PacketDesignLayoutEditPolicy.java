package com.logica.hummingbird.simulatorplugin.packetdesigner.policies;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.logica.hummingbird.simulatorplugin.packetdesigner.commands.AdjustConstraintGefCommand;

/**
 * Creates commands for Layout related tasks for the {@link AbstractGraphicalEditPart}s
 * 
 * @author Mark Doyle
 * 
 */
public class PacketDesignLayoutEditPolicy extends XYLayoutEditPolicy {

	/**
	 * Creates a command that calculates rectangle based constraint adjustments.
	 */
	@Override
	protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
		if (child instanceof AbstractGraphicalEditPart) {
			if (constraint instanceof Rectangle) {
				return new AdjustConstraintGefCommand((AbstractGraphicalEditPart) child, (Rectangle) constraint);
			}
		}
		return null;
	}

	/**
	 * Can't create a new diagram component so we return unexecutable.
	 */
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		return UnexecutableCommand.INSTANCE;
	}
}

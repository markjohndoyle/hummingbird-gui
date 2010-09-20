package com.logica.hummingbird.simulatorplugin.packetdesigner.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;

import com.logica.hummingbird.simulatorplugin.packetdesigner.editparts.PacketDesignEditPart;
import com.logica.hummingbird.telemetry.HummingbirdPacket;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

/**
 * References the editpart which isn't best practice but the model doesn't store layout/location details.
 * 
 * @author Mark
 * 
 */
public class AdjustConstraintGefCommand extends Command {

	private PacketDesignEditPart packetDesignPart;
	private Object model;

	private GraphicalEditPart editPart;
	private Rectangle newBounds, oldBounds;

	public AdjustConstraintGefCommand(GraphicalEditPart editPart, Rectangle constraint) {
		this.packetDesignPart = (PacketDesignEditPart) editPart.getParent();
		this.model = editPart.getModel();

		// this.editPart = editPart;

		this.newBounds = constraint;
		this.oldBounds = new Rectangle(editPart.getFigure().getBounds());
		setLabel(getOp(oldBounds, newBounds) + getName(editPart));
	}

	private static String getName(GraphicalEditPart editPart) {
		Object model = editPart.getModel();
		if (model instanceof HummingbirdPacket) {
			return ((HummingbirdPacket) model).getName();
		}
		else if (model instanceof HummingbirdParameter) {
			return ((HummingbirdParameter) model).getName();
		}
		else
			return "What the hell is this you are moving?";
	}

	private String getOp(Rectangle oldBounds, Rectangle newBounds) {
		if (oldBounds.getSize().equals(newBounds.getSize())) {
			return "Move";
		}
		else {
			return "Resize";
		}
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
		GraphicalEditPart editPart = getEditPart();
		if (editPart == null) {
			System.err.println("null edit part");
			return;
		}
		System.out.println("setting new constraint = " + newBounds);
		packetDesignPart.setLayoutConstraint(editPart, editPart.getFigure(), newBounds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		GraphicalEditPart editPart = getEditPart();
		if (editPart == null) {
			return;
		}
		packetDesignPart.setLayoutConstraint(editPart, editPart.getFigure(), oldBounds);
	}

	public GraphicalEditPart getEditPart() {
		for (Object o : packetDesignPart.getChildren()) {
			GraphicalEditPart ep = (GraphicalEditPart) o;
			Object childModel = ep.getModel();
			if (model.equals(childModel)) {
				return ep;
			}
		}
		return null;
	}

}

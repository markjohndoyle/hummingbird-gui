package com.logica.hummingbird.simulatorplugin.packetdesigner.editparts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.PlatformUI;

import com.logica.hummingbird.simulatorplugin.packetdesigner.dialogs.PacketEditDialog;
import com.logica.hummingbird.simulatorplugin.packetdesigner.figures.PacketFigure;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacket;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign;
import com.logica.hummingbird.simulatorplugin.packetdesigner.policies.PacketLayoutEditPolicy;
import com.logica.hummingbird.telemetry.HummingbirdPacket;

/**
 * This EditPart deals with the {@link HummingbirdPacket} representation providing the control aspect of the Figure and
 * the model.
 * 
 * @author Mark Doyle
 * 
 */
public class PacketEditPart extends AbstractGraphicalEditPart {

	/** The Figure controlled by this EditPart */
	private final PacketFigure packetFigure = new PacketFigure();

	/**
	 * Builds the EditPart with a {@link HummingbirdPacket} as the model.
	 * 
	 * @param packet
	 */
	public PacketEditPart(HummingbirdPacket packet) {
		setModel(packet);

		// TODO Should this be set here or in refeshVisuals? Don't see why not.
		packetFigure.setPacketName(packet.getName());
	}

	/**
	 * Get the casted {@link HummingbirdPacket} model
	 * 
	 * @return
	 */
	public final SimPacket getPacketModel() {
		return (SimPacket) getModel();
	}

	/**
	 * Creates the Figure this EditPart controls. In this case it is the {@link PacketFigure} built in the constructor.
	 */
	@Override
	protected IFigure createFigure() {
		return packetFigure;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new PacketLayoutEditPolicy());
	}

	@Override
	public void activate() {
		super.activate();
		// TODO Packet listeners!
	}

	/**
	 * This method is used to refresh the figure when the model changes.
	 */
	@Override
	protected void refreshVisuals() {
		System.out.println("Refreshing Packet.  It has " + getPacketModel().getParameters().size() + " parameters.");
		Point location = packetFigure.getLocation();
		PacketDesignEditPart parent = (PacketDesignEditPart) getParent();
		Rectangle constraint = new Rectangle(location.x, location.y, -1, -1);
		parent.setLayoutConstraint(this, packetFigure, constraint);

		// Set the gridlayout number of columns equal to the number of parameters
		// packetFigure.getParameterContainer().setNumCols(getPacketModel().getParameters().size());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	@Override
	protected List getModelChildren() {
		return getPacketModel().getParameters();
	}

	@Override
	public void performRequest(Request req) {
		if (req.getType().equals(RequestConstants.REQ_OPEN)) {
			System.out.println("Double clicked on packet");
			// FIXME this is a test - use commands and make a decent dialog.
			SimPacketDesign packetDesign = ((PacketDesignEditPart) getParent()).getPacketDesign();
			PacketEditDialog dialog = new PacketEditDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), packetDesign);
			dialog.open();
		}
		super.performRequest(req);
	}

	/**
	 * Sets the width of the line when selected
	 */
	public void setSelected(int value) {
		super.setSelected(value);
		PacketFigure packetFigure = (PacketFigure) getFigure();
		if (value != EditPart.SELECTED_NONE) {
			packetFigure.setSelected(true);
		}
		else {
			packetFigure.setSelected(false);
		}
		packetFigure.repaint();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#getContentPane()
	 */
	@Override
	public IFigure getContentPane() {
		return packetFigure.getParameterContainer();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#removeChild(org.eclipse.gef.EditPart)
	 */
	@Override
	protected void removeChild(EditPart child) {
		// TODO Auto-generated method stub
		super.removeChild(child);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#addChild(org.eclipse.gef.EditPart, int)
	 */
	@Override
	protected void addChild(EditPart child, int index) {
		// TODO Auto-generated method stub
		super.addChild(child, index);
	}

	public final void setPacketName(String name) {
		this.packetFigure.setPacketName(name);
	}

}

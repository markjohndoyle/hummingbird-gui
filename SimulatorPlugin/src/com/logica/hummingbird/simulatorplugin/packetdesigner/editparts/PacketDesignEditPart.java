package com.logica.hummingbird.simulatorplugin.packetdesigner.editparts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesign;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesignEvent;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesignEvent.EventType;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesignListener;
import com.logica.hummingbird.simulatorplugin.packetdesigner.policies.PacketDesignLayoutEditPolicy;
import com.logica.hummingbird.telemetry.HummingbirdPacket;

/**
 * This EditPart is linked to the PacketDesign model and as such represents the entire design. Think of it as the
 * Diagram itself.
 * 
 * @author Mark Doyle
 * 
 */
public class PacketDesignEditPart extends AbstractGraphicalEditPart {

	/** The listener this part uses to detect changes to the PacketDesign model */
	private final PacketDesignListener modelListener;

	/**
	 * Sets the model and creates the listener.
	 * 
	 * @param design
	 *            The PacketDesign model linked to this EditPart
	 */
	public PacketDesignEditPart(PacketDesign design) {
		setModel(design);

		// Create a listener to watch for changes to the PacketDeisgn model
		modelListener = new PacketDesignListenerImpl();
	}

	@Override
	protected IFigure createFigure() {
		// The Figure for this EditPart is a layer, that is, the diagram itself
		// Set the diagrams layout (this is the PacketDesign) to freeform
		IFigure layer = new FreeformLayer();
		layer.setOpaque(true);
		layer.setBorder(new MarginBorder(5));
		layer.setLayoutManager(new FreeformLayout());
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		// Set the layout policy. This deals with getting the gef command that deals
		// with calculating repositioning.
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new PacketDesignLayoutEditPolicy());
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractEditPart#isSelectable()
	 */
	@Override
	public boolean isSelectable() {
		// This is the diagram edit part, no need for selection
		return false;
	}

	/**
	 * Returns the casted model, that is, the PacketDesign.
	 * 
	 * @return
	 */
	public final PacketDesign getPacketDesign() {
		return (PacketDesign) getModel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	@Override
	protected List getModelChildren() {
		// Simply returns the HummingbirdPacket that is the root of this PacketDesign.
		HummingbirdPacket packet = getPacketDesign().getPacket();
		Collection<Object> result = new HashSet<Object>();
		result.add(packet);
		return new ArrayList<Object>(result);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#activate()
	 */
	@Override
	public void activate() {
		super.activate();
		// Register the listener (created in the constructor) with the PacketDesign model
		getPacketDesign().addObserver(getModelListener());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#deactivate()
	 */
	@Override
	public void deactivate() {
		super.deactivate();
		// Unregister the listener (created in the constructor) with the PacketDesign model
		getPacketDesign().removeObserver(getModelListener());
	}

	/**
	 * Returns the PacketDesignListener created by this EditPart
	 * 
	 * @return the modelListener
	 */
	public final PacketDesignListener getModelListener() {
		return modelListener;
	}

	/**
	 * 
	 * @author Mark Doyle
	 * 
	 */
	private class PacketDesignListenerImpl implements PacketDesignListener {
		@Override
		public void packetChanged(PacketDesignEvent event) {
			if (event.getType().equals(EventType.PARAMETER_REMOVED)) {
				System.out.println("Model changed param removed - refreshing");
				List packetEditParts = getChildren();
				PacketEditPart packetEditPart = (PacketEditPart) packetEditParts.get(0);
				List parameterEditParts = packetEditPart.getChildren();
				Iterator it = parameterEditParts.iterator();
				while (it.hasNext()) {
					Object o = it.next();
					if (o instanceof ParameterEditPart) {
						ParameterEditPart ped = (ParameterEditPart) o;
						if (ped.getParameterModel().equals(event.getChangedParameter())) {
							ped.setSelected(SELECTED_NONE);
							packetEditPart.removeChild(ped);
							break;
						}
					}
				}
			}
			else if (event.getType().equals(EventType.PARAMETER_ADDED)) {
				System.out.println("Model changed param " + event.getChangedParameter() + " added - refreshing");
				List packetEditParts = getChildren();
				PacketEditPart packetEditPart = (PacketEditPart) packetEditParts.get(0);
				ParameterEditPart ped = new ParameterEditPart(event.getChangedParameter());
				packetEditPart.addChild(ped, packetEditPart.getChildren().size());
			}
			refresh();
		}
	};
}

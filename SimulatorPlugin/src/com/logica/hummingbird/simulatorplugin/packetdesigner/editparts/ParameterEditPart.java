package com.logica.hummingbird.simulatorplugin.packetdesigner.editparts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.PlatformUI;

import com.logica.hummingbird.simulatorplugin.packetdesigner.dialogs.ParameterEditDialog;
import com.logica.hummingbird.simulatorplugin.packetdesigner.figures.ParameterFigure;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimParameter;
import com.logica.hummingbird.simulatorplugin.packetdesigner.policies.ParameterComponentEditPolicy;
import com.logica.hummingbird.simulatorplugin.packetdesigner.policies.ParameterLayoutEditPolicy;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

public class ParameterEditPart extends AbstractGraphicalEditPart implements PropertyChangeListener {

	private final ParameterFigure paramFigure = new ParameterFigure();

	public ParameterEditPart(SimParameter parameter) {
		System.out.println("constructing " + this.getClass().getName() + " with parameter " + parameter.getName());
		this.setModel(parameter);

		paramFigure.setParameterName(parameter.getName());
		paramFigure.setParameterType(parameter.getClassType().getName());
		paramFigure.setParameterValue(parameter.getValue().toString());
	}

	@Override
	protected IFigure createFigure() {
		return paramFigure;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ParameterComponentEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new ParameterLayoutEditPolicy());
	}

	@Override
	public void activate() {
		super.activate();
		getParameterModel().addPropertyChangeListener(this);
	}

	protected void refreshVisuals() {
		System.out.println("ParameterEditPart refreshing visuals");
	}

	public final SimParameter getParameterModel() {
		return (SimParameter) getModel();
	}

	/**
	 * Sets the width of the line when selected
	 */
	public void setSelected(int value) {
		super.setSelected(value);
		ParameterFigure parameterFigure = (ParameterFigure) getFigure();
		if (value != EditPart.SELECTED_NONE) {
			parameterFigure.setSelected(true);
		}
		else {
			parameterFigure.setSelected(false);
		}
		parameterFigure.repaint();
	}

	@Override
	public void performRequest(Request req) {
		if (req.getType().equals(RequestConstants.REQ_OPEN)) {
			System.out.println("Double clicked on packet");
			// FIXME this is a test - use commands and make a decent dialog.
			SimPacketDesign packetDesign = ((PacketDesignEditPart) getParent().getParent()).getPacketDesign();
			ParameterEditDialog dialog = new ParameterEditDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), getParameterModel());
			dialog.open();
		}
		super.performRequest(req);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getNewValue().equals(evt.getOldValue())) {
			return;
		}

		if (evt.getPropertyName().equals("name")) {
			paramFigure.setParameterName((String) evt.getNewValue());
		}
		getParent().refresh();
	}

}

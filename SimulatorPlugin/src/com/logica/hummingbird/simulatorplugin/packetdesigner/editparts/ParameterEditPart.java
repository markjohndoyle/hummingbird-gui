package com.logica.hummingbird.simulatorplugin.packetdesigner.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.logica.hummingbird.simulatorplugin.packetdesigner.figures.ParameterFigure;
import com.logica.hummingbird.simulatorplugin.packetdesigner.policies.ParameterComponentEditPolicy;
import com.logica.hummingbird.simulatorplugin.packetdesigner.policies.ParameterLayoutEditPolicy;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

public class ParameterEditPart extends AbstractGraphicalEditPart {

	private final ParameterFigure paramFigure = new ParameterFigure();

	public ParameterEditPart(HummingbirdParameter parameter) {
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
	}

	protected void refreshVisuals() {
		System.out.println("ParameterEditPart refreshing visuals");
	}

	public final HummingbirdParameter getParameterModel() {
		return (HummingbirdParameter) getModel();
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

}

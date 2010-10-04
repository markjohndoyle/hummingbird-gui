package com.logica.hummingbird.simulatorplugin.packetdesigner.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.SelectionManager;

/**
 * Defined the Figure which represents the Parameter.
 * 
 * @author Mark Doyle
 * 
 */
public class ParameterFigure extends Figure {

	private final EditableLabel parameterNameLabel = new EditableLabel();
	private final EditableLabel parameterTypeLabel = new EditableLabel();
	private final EditableLabel parameterValueLabel = new EditableLabel();

	public ParameterFigure() {
		ToolbarLayout layout = new ToolbarLayout(ToolbarLayout.VERTICAL);
		layout.setStretchMinorAxis(true);
		setLayoutManager(layout);

		setBackgroundColor(ColorConstants.tooltipBackground);
		setForegroundColor(ColorConstants.blue);

		setOpaque(true);

		setBorder(new CompoundBorder(new LineBorder(), new MarginBorder(2, 4, 2, 4)));

		add(parameterNameLabel);
		add(parameterTypeLabel);
		add(parameterValueLabel);
	}

	/**
	 * Sets the Figure to selected mode. This method is called by the superclasses and other GEF classes such as
	 * {@link SelectionManager}.
	 * 
	 * @param isSelected
	 */
	public void setSelected(boolean isSelected) {
		CompoundBorder border = (CompoundBorder) getBorder();
		LineBorder lineBorder = (LineBorder) border.getOuterBorder();
		if (isSelected) {
			lineBorder.setWidth(2);
		}
		else {
			lineBorder.setWidth(1);
		}
	}

	public final void setParameterName(String parameterName) {
		System.out.println("Setting Parameter name label on figure");
		this.parameterNameLabel.setText(parameterName);
	}

	public final void setParameterType(String parameterType) {
		this.parameterTypeLabel.setText(parameterType);
	}

	public final void setParameterValue(String parameterValue) {
		this.parameterValueLabel.setText(parameterValue);
	}
}

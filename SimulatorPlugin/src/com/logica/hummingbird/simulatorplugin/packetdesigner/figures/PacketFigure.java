package com.logica.hummingbird.simulatorplugin.packetdesigner.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Color;

public class PacketFigure extends Figure {

	public static Color packetColor = new Color(null, 255, 255, 206);

	private final EditableLabel packetNameLabel = new EditableLabel();
	private final ParameterFigureContainer parameterContainer = new ParameterFigureContainer();

	public PacketFigure() {
		GridLayout layout = new GridLayout();
		setLayoutManager(layout);

		setOpaque(true);
		setBorder(new LineBorder(ColorConstants.black, 1));
		setBackgroundColor(packetColor);
		setForegroundColor(ColorConstants.black);

		packetNameLabel.setLabelAlignment(PositionConstants.CENTER);
		packetNameLabel.setForegroundColor(ColorConstants.black);
		packetNameLabel.setBackgroundColor(ColorConstants.listBackground);

		add(packetNameLabel, ToolbarLayout.ALIGN_CENTER);
		add(parameterContainer);
	}

	/**
	 * Sets Figure related attributes based upon the select state.
	 * 
	 * @param isSelected
	 */
	public void setSelected(boolean isSelected) {
		LineBorder lineBorder = (LineBorder) getBorder();
		if (isSelected) {
			lineBorder.setWidth(2);
		}
		else {
			lineBorder.setWidth(1);
		}
	}

	public final GridLayout getGridLayout() {
		return (GridLayout) this.getLayoutManager();
	}

	/**
	 * @return the parameterContainer
	 */
	public ParameterFigureContainer getParameterContainer() {
		return parameterContainer;
	}

	public final void setPacketName(String packetName) {
		this.packetNameLabel.setText(packetName);
	}

}

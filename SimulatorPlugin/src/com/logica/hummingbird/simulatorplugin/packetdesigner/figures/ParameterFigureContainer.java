package com.logica.hummingbird.simulatorplugin.packetdesigner.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.ToolbarLayout;

public class ParameterFigureContainer extends Figure {

	private final ToolbarLayout layout = new ToolbarLayout(ToolbarLayout.HORIZONTAL);

	public ParameterFigureContainer() {
		setLayoutManager(layout);
	}
	
	
	

	// public void setNumCols(int numCols) {
	// layout.numColumns = numCols;
	// }
}

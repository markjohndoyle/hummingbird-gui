package com.logica.hummingbird.simulatorplugin.persepctives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class SimulatorPerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addView("com.logica.hummingbird.simulatorplugin.views.SpaceSystemParametersView",
						IPageLayout.LEFT, IPageLayout.DEFAULT_VIEW_RATIO,
						IPageLayout.ID_EDITOR_AREA);
	}

}

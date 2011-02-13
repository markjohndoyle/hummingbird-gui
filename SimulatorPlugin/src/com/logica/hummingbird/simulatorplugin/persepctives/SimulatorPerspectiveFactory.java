package com.logica.hummingbird.simulatorplugin.persepctives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class SimulatorPerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addView(IConsoleConstants.ID_CONSOLE_VIEW, IPageLayout.BOTTOM, 0.68f, IPageLayout.ID_EDITOR_AREA);
		layout.addView("org.eclipse.ui.views.PropertySheet", IPageLayout.RIGHT, 0.7f, IPageLayout.ID_EDITOR_AREA);
	}

}

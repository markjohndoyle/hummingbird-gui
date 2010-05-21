package com.logica.hummingbird.framebrokerviewer.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class FrameViewerPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addView("com.logica.hummingbird.framebrokerviewer.views.FrameView", IPageLayout.TOP, IPageLayout.DEFAULT_VIEW_RATIO, IPageLayout.ID_EDITOR_AREA);
		layout.addView(IConsoleConstants.ID_CONSOLE_VIEW, IPageLayout.BOTTOM, .5f, IPageLayout.ID_EDITOR_AREA);
	}
}

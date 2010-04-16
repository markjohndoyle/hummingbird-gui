package com.logica.hummingbird.framebrokerviewer.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class DefaultPerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addView("com.logica.hummingbird.framebrokerviewer.views.FrameView", IPageLayout.LEFT, IPageLayout.DEFAULT_VIEW_RATIO, IPageLayout.ID_EDITOR_AREA);
	}

}

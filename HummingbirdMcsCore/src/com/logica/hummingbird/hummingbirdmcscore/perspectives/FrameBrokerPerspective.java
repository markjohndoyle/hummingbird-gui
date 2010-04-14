package com.logica.hummingbird.hummingbirdmcscore.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class FrameBrokerPerspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addView("com.logica.hummingbird.framebrokerviewer.views.ProviderDetailsView", IPageLayout.RIGHT, IPageLayout.RATIO_MIN, IPageLayout.ID_EDITOR_AREA);
		layout.addView("com.logica.hummingbird.framebrokerviewer.views.FrameView", IPageLayout.LEFT, IPageLayout.DEFAULT_VIEW_RATIO, IPageLayout.ID_EDITOR_AREA);
	}
}

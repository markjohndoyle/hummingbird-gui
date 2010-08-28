package com.logica.hummingbird.packetbrokerviewer.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class PacketBrokerPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addView("com.logica.hummingbird.packetbrokerviewer.views.PacketBrokerView",
						IPageLayout.TOP, IPageLayout.DEFAULT_VIEW_RATIO,
						IPageLayout.ID_EDITOR_AREA);
	}

}

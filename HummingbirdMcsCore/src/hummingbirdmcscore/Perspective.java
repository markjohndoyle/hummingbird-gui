package hummingbirdmcscore;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.addView("framebroker.views.FrameViewer", IPageLayout.LEFT, IPageLayout.RATIO_MAX, IPageLayout.ID_EDITOR_AREA);
	}
}

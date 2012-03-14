/**
 *
 */
package org.hbird.rcpgui.telemetrychart.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.hbird.rcpgui.telemetrychart.views.ChartView;

/**
 * @author Mark Doyle
 *
 */
public class ChartPerspective implements IPerspectiveFactory {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	@Override
	public void createInitialLayout(final IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addView(ChartView.ID, IPageLayout.LEFT, 0.25f, layout.getEditorArea());
	}

}

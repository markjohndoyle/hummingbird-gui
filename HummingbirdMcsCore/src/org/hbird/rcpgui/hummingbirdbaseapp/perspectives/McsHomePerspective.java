/**
 * 
 */
package org.hbird.rcpgui.hummingbirdbaseapp.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * @author doylemr
 * 
 */
public class McsHomePerspective implements IPerspectiveFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	@Override
	public void createInitialLayout(final IPageLayout layout) {
		addFastViews(layout);
		layout.setEditorAreaVisible(false);
	}

	private void addFastViews(final IPageLayout layout) {
	}
}

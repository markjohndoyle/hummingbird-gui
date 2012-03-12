/**
 *
 */
package org.hbird.rcpgui.hummingbirdbaseapp.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * @author Mark Doyle
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
		layout.setEditorAreaVisible(true);
	}

}

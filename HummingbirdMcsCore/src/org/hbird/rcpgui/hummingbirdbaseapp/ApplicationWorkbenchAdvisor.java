package org.hbird.rcpgui.hummingbirdbaseapp;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String DEFAULT_PERSPECTIVE_ID = "org.hbird.rcpgui.hummingbirdbaseapp.perspectives.McsHomePerspective";

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return DEFAULT_PERSPECTIVE_ID;
	}
}

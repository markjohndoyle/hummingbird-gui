package com.logica.hummingbird.hummingbirdmcscore;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String DEFAULT_PERSPECTIVE_ID = "com.logica.hummingbird.hummingbirdmcscore.perspectives.McsHomePerspective";

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return DEFAULT_PERSPECTIVE_ID;
	}
}

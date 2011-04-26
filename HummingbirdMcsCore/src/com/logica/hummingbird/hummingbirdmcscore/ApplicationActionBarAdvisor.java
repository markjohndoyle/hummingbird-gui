package com.logica.hummingbird.hummingbirdmcscore;

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * FIXME Migrate to commands completely.
 * 
 * @author Mark Doyle
 * 
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IWorkbenchAction aboutAction = null;
	private IWorkbenchAction introAction = null;

	public ApplicationActionBarAdvisor(final IActionBarConfigurer configurer) {
		super(configurer);
	}

	@Override
	protected void makeActions(final IWorkbenchWindow window) {
		aboutAction = ActionFactory.ABOUT.create(window);
		register(aboutAction);

		if (window.getWorkbench().getIntroManager().hasIntro()) {
			introAction = ActionFactory.INTRO.create(window);
			register(introAction);
		}
		else {
			System.out.println("no intro detected");
		}
	}

}

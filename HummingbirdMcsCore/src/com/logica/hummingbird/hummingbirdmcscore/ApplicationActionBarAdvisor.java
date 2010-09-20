package com.logica.hummingbird.hummingbirdmcscore;

import org.eclipse.jface.action.IMenuManager;
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

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	protected void makeActions(IWorkbenchWindow window) {
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

	protected void fillMenuBar(IMenuManager menuBar) {

		// MIGRATING FROM ACTIONS TO COMMANDS
		// MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
		// helpMenu.add(aboutAction);
		// if (introAction != null) {
		// helpMenu.add(introAction);
		// }
		//
		// menuBar.add(helpMenu);
	}

}

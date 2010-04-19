package com.logica.hummingbird.hummingbirdmcscore;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IWorkbenchAction exitAction = null;
	private IWorkbenchAction aboutAction = null;
	private IWorkbenchAction introAction = null;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	protected void makeActions(IWorkbenchWindow window) {
		exitAction = ActionFactory.QUIT.create(window);
		register(exitAction);

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
		MenuManager hummingbirdMenu = new MenuManager("&Hummingbird", "hummingbird");
		hummingbirdMenu.add(exitAction);

		MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
		helpMenu.add(aboutAction);
		if(introAction != null) {
			helpMenu.add(introAction);
		}

		menuBar.add(hummingbirdMenu);
		menuBar.add(helpMenu);
	}

}

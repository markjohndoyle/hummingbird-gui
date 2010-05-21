/**
 * 
 */
package com.logica.hummingbird.framebrokerviewer.console;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleFactory;

/**
 * @author Mark Doyle
 * 
 */
public class FrameBrokerConsoleFactory implements IConsoleFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.console.IConsoleFactory#openConsole()
	 */
	@Override
	public void openConsole() {
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { new FrameBrokerConsole() });
	}

}

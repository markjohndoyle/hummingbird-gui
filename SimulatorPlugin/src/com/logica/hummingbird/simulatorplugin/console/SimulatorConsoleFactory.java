/**
 * 
 */
package com.logica.hummingbird.simulatorplugin.console;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleFactory;

/**
 * @author Mark Doyle
 * 
 */
public class SimulatorConsoleFactory implements IConsoleFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.console.IConsoleFactory#openConsole()
	 */
	@Override
	public void openConsole() {
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { new SimulatorConsole() });
	}

}

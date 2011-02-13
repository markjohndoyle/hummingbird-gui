/**
 * 
 */
package com.logica.hummingbird.simulatorplugin.console;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import com.logica.hummingbird.simulatorplugin.SimulatorPlugin;
import com.swtdesigner.ResourceManager;

/**
 * @author Mark Doyle
 * 
 *         TODO add listeners to the Simulator components.
 * 
 */
public class SimulatorConsole extends MessageConsole {
	public static final String ID = "com.logica.hummingbird.simulatorplugin.console.SimulatorConsole";

	private MessageConsoleStream outMessageStream;
	private MessageConsoleStream inMessageStream;

	public SimulatorConsole() {
		super("Simulator Console", ResourceManager.getPluginImageDescriptor(SimulatorPlugin.getDefault(), "icons/cog_go.png"));

		outMessageStream = newMessageStream();
		outMessageStream.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_BLUE));

		inMessageStream = newMessageStream();
		inMessageStream.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
		
		
	}

	/**
	 * @return the outMessageStream
	 */
	public MessageConsoleStream getOutMessageStream() {
		return outMessageStream;
	}

	/**
	 * @return the inMessageStream
	 */
	public MessageConsoleStream getInMessageStream() {
		return inMessageStream;
	}
}

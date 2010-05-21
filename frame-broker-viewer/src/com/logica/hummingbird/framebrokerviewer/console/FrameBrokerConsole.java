/**
 * 
 */
package com.logica.hummingbird.framebrokerviewer.console;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import com.logica.hummingbird.framebrokerviewer.FrameBrokerViewerPlugin;
import com.swtdesigner.ResourceManager;

/**
 * @author Mark Doyle
 * 
 * TODO add listeners to the Frame broker models..
 * 
 */
public class FrameBrokerConsole extends MessageConsole {
	public static final String ID = "com.logica.hummingbird.framebrokerviewer.console.FrameBrokerConsole";

	private MessageConsoleStream outMessageStream;
	private MessageConsoleStream inMessageStream;

	public FrameBrokerConsole() {
		super("Frame Broker Console", ResourceManager.getPluginImageDescriptor(FrameBrokerViewerPlugin.getDefault(), "icons/transmit.png"));
		
		outMessageStream = newMessageStream();
		outMessageStream.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_BLUE));
		
		inMessageStream = newMessageStream();
		inMessageStream.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
	}

}

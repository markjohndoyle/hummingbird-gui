package com.logica.hummingbird.simulatorplugin.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class OpenSsm extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public OpenSsm() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		
		FileDialog openSsmDialog = new FileDialog(shell, SWT.OPEN);
		openSsmDialog.setFilterExtensions(new String[] {"*.xml"});
		openSsmDialog.setText("Select a space system model to load");
		String filePath = openSsmDialog.open();
		
		return filePath;
//		ContainerFactory ssmFactory = null;
//		try {
//			ssmFactory = new XtceModelFactory(filePath);
//		}
//		catch (InvalidXtceFileException e) {
//			ErrorDialog.openError(shell, "Error opening space system model", "Invalid XTCE file or location", Status.OK_STATUS);
//		}
//		
//		System.out.println("Loaded SSM - Detected " + ssmFactory.getAllParameters().size() + " parameters");
//		return ssmFactory;
	}
}

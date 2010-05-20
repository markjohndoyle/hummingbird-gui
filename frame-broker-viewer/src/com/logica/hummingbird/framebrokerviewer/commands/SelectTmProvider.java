/**
 * 
 */
package com.logica.hummingbird.framebrokerviewer.commands;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.util.tracker.ServiceTracker;

import com.logica.hummingbird.framebrokerviewer.FrameBrokerViewerPlugin;
import com.logica.hummingbird.framebrokerviewer.views.FrameView;
import com.logica.hummingbird.tmframeprovider.IFrameProvider;

/**
 * @author doylemr
 *
 */
public class SelectTmProvider extends AbstractHandler {

	public SelectTmProvider() {
	}


	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("exectuting...");

		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new LabelProvider());
		
		ServiceTracker serviceTracker = FrameBrokerViewerPlugin.getFrameProviderServices();
		Object[] availableServices = serviceTracker.getServices();
		Map<String, IFrameProvider> services = new HashMap<String, IFrameProvider>(availableServices.length);
		for(Object provider : availableServices) {
			IFrameProvider iFrameProvider = (IFrameProvider)provider;
			String serviceName = iFrameProvider.getFrameProviderName();
			services.put(serviceName, iFrameProvider);
		}
		
		dialog.setElements(services.keySet().toArray(new String[services.size()]));
		dialog.setTitle("Select which telemetry source so you wish to use.");
		dialog.setMultipleSelection(false);
		dialog.setIgnoreCase(true);
		dialog.open();
		Object[] results = dialog.getResult();
		if(results.length > 1) {
			System.out.println("We have a problem, there can be only one!!!  Ahem, yeah I set false for multiple selection.");
		}
		
		String selection = (String)results[0];
		
		// Get the view
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();
		FrameView view = (FrameView) page.findView(FrameView.VIEW_ID);
		
		String curProvider = view.getFrameProvider().getFrameProviderName();
		System.out.println("Current provider = " + curProvider);
		
		if(curProvider.equals(selection)) {
			System.out.println("Provider already being used");
		}
		else {
			view.setFrameProvider(services.get(selection));
		}
		
		return null;
	}

}

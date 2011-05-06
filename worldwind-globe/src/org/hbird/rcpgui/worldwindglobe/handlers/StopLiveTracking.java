package org.hbird.rcpgui.worldwindglobe.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.hbird.rcpgui.worldwindglobe.views.MainGlobeView;

public class StopLiveTracking extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
		final IWorkbenchPart part = page.getActivePart();

		if (part instanceof MainGlobeView) {
			MainGlobeView view = (MainGlobeView) part;
			try {
				view.getTelemetryIn().stopLiveProvision();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}


}

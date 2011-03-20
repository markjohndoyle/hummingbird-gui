package org.hbird.rcpgui.telemetry.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.hbird.rcpgui.telemetry.views.TelemetryView;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class StopLiveTmProvision extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public StopLiveTmProvision() {
	}

	/**
	 * the command has been executed, so extract extract the needed information from the application context.
	 */
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		final IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
		final IWorkbenchPart part = page.getActivePart();

		if (part instanceof TelemetryView) {
			final TelemetryView view = (TelemetryView) part;
			try {
				view.getParametersModel().stopLiveProvision();
			}
			catch (final Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}

package org.hbird.rcpgui.telemetrychart.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.hbird.rcpgui.telemetrychart.editors.Chart;
import org.hbird.rcpgui.telemetrychart.editors.ParameterChartEditorInput;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 *
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class NewChartEditorHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public NewChartEditorHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information from the application context.
	 */
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		System.out.println("called");
		// Get the view
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();

//		View view = (View) page.findView(View.ID);

		// Get the selection
//		ISelection selection = view.getSite().getSelectionProvider().getSelection();
//		if (selection != null && selection instanceof IStructuredSelection) {
//			Object obj = ((IStructuredSelection) selection).getFirstElement();
			// If we had a selection lets open the editor
//			if (obj != null) {
				List<String> params = new ArrayList<String>();
				params.add("test");
				ParameterChartEditorInput input = new ParameterChartEditorInput(params);
				try {
					page.openEditor(input, Chart.ID);
				}
				catch (PartInitException e) {
					throw new RuntimeException(e);
				}
//			}
//		}
		return null;
	}
}

package org.hbird.rcpgui.telemetrychart.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.telemetrychart.editors.ChartEditorPart;
import org.hbird.rcpgui.telemetrychart.editors.ParameterChartEditorInput;
import org.hbird.rcpgui.telemetrychart.views.ChartView;

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

		ChartView view = (ChartView) page.findView(ChartView.ID);

		// Get the selection
		ISelection selection = view.getSite().getSelectionProvider().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			Object obj = ((IStructuredSelection) selection).getFirstElement();
			if (obj != null && obj instanceof Parameter<?>) {
				Parameter<?> parameter = (Parameter<?>) obj;
				List<String> params = new ArrayList<String>();
				params.add(parameter.getQualifiedName());
				ParameterChartEditorInput input = new ParameterChartEditorInput(params);
				try {
					page.openEditor(input, ChartEditorPart.ID);
				}
				catch (PartInitException e) {
					throw new RuntimeException(e);
				}
			}
		}
		return null;
	}
}

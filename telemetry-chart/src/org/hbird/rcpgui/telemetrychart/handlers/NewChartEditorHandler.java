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
import org.hbird.rcpgui.telemetrychart.editors.ArchivedChartEditorPart;
import org.hbird.rcpgui.telemetrychart.editors.ArchivedParameterChartEditorInput;
import org.hbird.rcpgui.telemetrychart.editors.LiveChartEditorPart;
import org.hbird.rcpgui.telemetrychart.editors.LiveParameterChartEditorInput;
import org.hbird.rcpgui.telemetrychart.model.FilterFormModel;
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
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		final IWorkbenchPage page = window.getActivePage();

		final ChartView view = (ChartView) page.findView(ChartView.ID);
		final FilterFormModel formModel = view.getFormModel();
		boolean archiveModel = formModel.isAnyFilterSelected();

		// Get the selection
		final ISelection selection = view.getSite().getSelectionProvider().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			// Object obj = ((IStructuredSelection) selection).getFirstElement();
			final List<Object> allSelected = ((IStructuredSelection) selection).toList();
			System.out.println("All selected = " + allSelected.size());
			if (allSelected != null) {
				LiveParameterChartEditorInput input = null;
				final List<String> parameterNames = new ArrayList<String>();
				final List<String> shortParameterNames = new ArrayList<String>();
				for (final Object obj : allSelected) {
					if (obj instanceof Parameter<?>) {
						final Parameter<?> parameter = (Parameter<?>) obj;
						System.out.println("Adding param " + parameter.getQualifiedName() + " to input list arg");
						parameterNames.add(parameter.getQualifiedName());
						shortParameterNames.add(parameter.getName());
						if (archiveModel) {
							input = new ArchivedParameterChartEditorInput(parameterNames, shortParameterNames, formModel);
						}
						else {
							input = new LiveParameterChartEditorInput(parameterNames, shortParameterNames);
						}
					}
				}

				if (input != null) {
					try {
						System.out.println("input contains " + input.getParameterNames().size());
						if (archiveModel) {
							page.openEditor(input, ArchivedChartEditorPart.ID);
						}
						else {
							page.openEditor(input, LiveChartEditorPart.ID);
						}
					}
					catch (final PartInitException e) {
						throw new RuntimeException(e);
					}
				}
			}
		}
		return null;
	}
}

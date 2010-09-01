package com.logica.hummingbird.simulatorplugin.views;

import java.util.Collection;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import com.logica.hummingbird.simulatorplugin.SimDock;
import com.logica.hummingbird.simulatorplugin.SimulatorObserver;
import com.logica.hummingbird.spacesystemmodel.ContainerFactory;
import com.logica.hummingbird.spacesystemmodel.parameters.ParameterContainer;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view shows data obtained from the model. The
 * sample creates a dummy model on the fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be presented in the view. Each view can present the
 * same model objects using different labels and icons, if needed. Alternatively, a single label provider can be shared
 * between views in order to ensure that objects of the same type are presented in the same way everywhere.
 * <p>
 */

public class SpaceSystemParametersView extends ViewPart implements SimulatorObserver {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.logica.hummingbird.simulatorplugin.views.SpaceSystemParametersView";

	private TableViewer parameterTable;

	/*
	 * The content provider class is responsible for providing objects to the view. It can wrap existing objects in
	 * adapters or simply return objects as-is. These objects may be sensitive to the current input of the view, or
	 * ignore it and always show the same content (like Task List, for example).
	 */
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			System.out.println("input changed");
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			Collection<ParameterContainer> params = SimDock.getInstance().getAllParameters();
			if (params != null) {
				return params.toArray();
			}
			else {
				return new String[] { "No parameters to display" };
			}
		}
	}

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			if (obj instanceof ParameterContainer) {
				return ((ParameterContainer) obj).getName();
			}
			else {
				return obj.toString();
			}
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public SpaceSystemParametersView() {
		SimDock.getInstance().addObserver(this);
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		parameterTable = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		parameterTable.setContentProvider(new ViewContentProvider());
		parameterTable.setLabelProvider(new ViewLabelProvider());
		parameterTable.setSorter(new NameSorter());
		parameterTable.setInput(getViewSite());

		// Set up the table
	    Table table = parameterTable.getTable();
	    new TableColumn(table, SWT.LEFT).setText("Parameter");
	    new TableColumn(table, SWT.RIGHT).setText("Value");
	    table.setHeaderVisible(true);

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parameterTable.getControl(), "com.logica.hummingbird.SimulatorPlugin.viewer");

		// Pack the columns
	    for (int i = 0, n = table.getColumnCount(); i < n; i++) {
	      table.getColumn(i).pack();
	    }
	    
		hookContextMenu();
		initializeToolBar();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				SpaceSystemParametersView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(parameterTable.getControl());
		parameterTable.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, parameterTable);
	}

	private void fillContextMenu(IMenuManager manager) {
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(parameterTable.getControl().getShell(), "Space System Parameters View", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		parameterTable.getControl().setFocus();
	}

	@Override
	public void spaceSystemUpdated(ContainerFactory spaceSystemModel) {
		parameterTable.refresh();
	}
	private void initializeToolBar() {
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
	}
}
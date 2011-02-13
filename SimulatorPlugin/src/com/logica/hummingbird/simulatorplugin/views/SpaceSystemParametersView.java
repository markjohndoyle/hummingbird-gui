package com.logica.hummingbird.simulatorplugin.views;

import java.util.Collection;
import java.util.List;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
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
import com.logica.hummingbird.spacesystemmodel.Container;
import com.logica.hummingbird.spacesystemmodel.ContainerFactory;
import com.logica.hummingbird.spacesystemmodel.parameters.ParameterContainer;

/**
 * 
 * @author Mark Doyle
 * 
 */
public class SpaceSystemParametersView extends ViewPart implements SimulatorObserver {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.logica.hummingbird.simulatorplugin.views.SpaceSystemParametersView";

	private TableViewer parameterTableViewer;

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
			Collection<ParameterContainer> containers = SimDock.getInstance().getAllParameters();
			if (containers != null) {
				return containers.toArray();
			}
			else {
				return new String[] { "No parameters to display" };
			}
		}
	}

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			StringBuffer text = new StringBuffer();
			switch (index) {
			case 0:
				if (obj instanceof Container) {
					text.append(((Container) obj).getName());
					break;
				}
			case 1:
				if (obj instanceof Container) {
					List<Container> parents = ((Container) obj).getParents();
					if (parents != null) {
						for (Container p : parents) {
							text.append(p.getName() + " ");
						}
						break;
					}
					else {
						text.append("N/A");
						break;
					}
				}
			default:
				text.append(obj.toString());
			}
			System.out.println("Returning " + text + " for column index " + index);
			return text.toString();
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
	 * This is a callback that will allow us to create the viewer and initialise it.
	 */
	public void createPartControl(Composite parent) {
		parameterTableViewer = new TableViewer(parent, SWT.MULTI);
		parameterTableViewer.setColumnProperties(new String[] {});

		// Set up the table
		Table table = parameterTableViewer.getTable();

		TableLayout layout = new TableLayout();
		layout.addColumnData(new ColumnWeightData(33, true));
		layout.addColumnData(new ColumnWeightData(33, true));
		table.setLayout(layout);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		parameterTableViewer.setContentProvider(new ViewContentProvider());
		parameterTableViewer.setLabelProvider(new ViewLabelProvider());
		parameterTableViewer.setSorter(new NameSorter());
		parameterTableViewer.setInput(getViewSite());

		TableColumn paramCol = new TableColumn(table, SWT.LEFT);
		paramCol.setText("Parameter");
		TableColumn parentCol = new TableColumn(table, SWT.LEFT);
		parentCol.setText("Parent");

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parameterTableViewer.getControl(), "com.logica.hummingbird.SimulatorPlugin.viewer");

		hookContextMenu();

		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				SpaceSystemParametersView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(parameterTableViewer.getControl());
		parameterTableViewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, parameterTableViewer);
	}

	private void fillContextMenu(IMenuManager manager) {
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(parameterTableViewer.getControl().getShell(), "Space System Parameters View", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		parameterTableViewer.getControl().setFocus();
	}

	@Override
	public void spaceSystemUpdated(ContainerFactory spaceSystemModel) {
		parameterTableViewer.refresh();
	}
}
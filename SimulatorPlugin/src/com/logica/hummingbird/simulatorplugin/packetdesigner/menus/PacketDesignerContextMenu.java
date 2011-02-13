package com.logica.hummingbird.simulatorplugin.packetdesigner.menus;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;

/**
 * Sets up the context menu for the Packet Design editor
 * 
 * @author Mark Doyle
 * 
 */
public class PacketDesignerContextMenu extends ContextMenuProvider {

	private ActionRegistry actionRegistry;

	public PacketDesignerContextMenu(EditPartViewer viewer, ActionRegistry registry) {
		super(viewer);
		actionRegistry = registry;
	}

	private ActionRegistry getActionRegistry() {
		return actionRegistry;
	}

	@Override
	public void buildContextMenu(IMenuManager menu) {
		// add GEF menu groups, such as undo, edit, save, etc.
		GEFActionConstants.addStandardActionGroups(menu);

		IAction action;
		action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);

		action = getActionRegistry().getAction(ActionFactory.REDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);

		action = getActionRegistry().getAction(ActionFactory.DELETE.getId());
		// System.out.println("enabled: " + action.isEnabled() + ". handled: " + action.isHandled());

		if (action.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
			action = getActionRegistry().getAction(ActionFactory.SAVE.getId());
			if (action.isEnabled()) {
				menu.appendToGroup(GEFActionConstants.GROUP_SAVE, action);
			}
		}
	}
}

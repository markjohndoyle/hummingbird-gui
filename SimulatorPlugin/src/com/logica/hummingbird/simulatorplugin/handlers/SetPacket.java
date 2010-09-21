package com.logica.hummingbird.simulatorplugin.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.handlers.HandlerUtil;

import com.logica.hummingbird.simulatorplugin.packetdesigner.editors.PacketDesignEditorInput;

public class SetPacket extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
		if (page == null) {
			return null;
		}

		IEditorPart editor = page.getActiveEditor();
		if (editor == null) {
			return null;
		}
		IEditorInput input = editor.getEditorInput();

		PacketDesignEditorInput pdEditorInput = null;
		if (input instanceof PacketDesignEditorInput) {
			pdEditorInput = (PacketDesignEditorInput) input;
		}
		else {
			return null;
		}

		// TODO Prompt new packet dialog/wizard

		System.out.println("Not yet implemented - needs a wizard or dialog");

		return null;
	}
}

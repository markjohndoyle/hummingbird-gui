package com.logica.hummingbird.simulatorplugin.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.handlers.HandlerUtil;

import com.logica.hummingbird.simulatorplugin.packetdesigner.editors.PacketDesignEditorInput;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesign;
import com.logica.hummingbird.telemetry.Packet;
import com.logica.hummingbird.telemetry.Parameter;

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

		Packet newPacket = new Packet("Test Packet 2");
		newPacket.addParameter(new Parameter("Apid", Integer.class, 555));
		newPacket.addParameter(new Parameter("Laser Temp", Double.class, 5685));
		newPacket.addParameter(new Parameter("PilotName", String.class, "CrocodileShoes"));

		PacketDesign pd = pdEditorInput.getPacketDesign();
		if (pd != null) {
			pd.setPacket(newPacket);
		}
		else {
			System.err.println("Packet design empty - Probably not started a new one yet");
		}

		// PacketDesign.getInstance().setPacket(newPacket);
		// input.setPacketDesign(PacketDesign.getInstance());

		// IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();

		// try {
		// page.openEditor(input, PacketDesignerEditor.ID);
		// }
		// catch (PartInitException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		return null;
	}
}

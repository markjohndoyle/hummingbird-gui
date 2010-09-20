package com.logica.hummingbird.simulatorplugin.packetdesigner.editors;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesign;

public class PacketDesignEditorInput implements IEditorInput {

	private PacketDesign design;

	public PacketDesignEditorInput() {
	}

	public void setPacketDesign(PacketDesign design) {
		this.design = design;
	}

	public PacketDesign getPacketDesign() {
		return design;
	}

	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return "Packet Design";
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		return "Packet Design";
	}

}

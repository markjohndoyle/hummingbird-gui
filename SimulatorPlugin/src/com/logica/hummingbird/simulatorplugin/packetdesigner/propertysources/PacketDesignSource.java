package com.logica.hummingbird.simulatorplugin.packetdesigner.propertysources;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesign;

public class PacketDesignSource implements IPropertySource {

	private PacketDesign packetDesign;

	public PacketDesignSource(PacketDesign packetDesign) {
		this.packetDesign = packetDesign;
	}

	@Override
	public Object getEditableValue() {
		// Can't edit a Packet Design
		return null;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPropertyValue(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPropertySet(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		// TODO Auto-generated method stub

	}

}

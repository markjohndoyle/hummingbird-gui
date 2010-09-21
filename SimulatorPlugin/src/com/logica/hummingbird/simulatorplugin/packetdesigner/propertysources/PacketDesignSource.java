package com.logica.hummingbird.simulatorplugin.packetdesigner.propertysources;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign;

public class PacketDesignSource implements IPropertySource {

	private SimPacketDesign packetDesign;

	public PacketDesignSource(SimPacketDesign packetDesign) {
		this.packetDesign = packetDesign;
	}

	@Override
	public Object getEditableValue() {
		// Can't edit a Packet Design
		return null;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		List<IPropertyDescriptor> props = new ArrayList<IPropertyDescriptor>();
		props.add(new PropertyDescriptor(SimPacketDesign.PACKET_PROPERTY, "Packet"));

		return props.toArray(new IPropertyDescriptor[0]);
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

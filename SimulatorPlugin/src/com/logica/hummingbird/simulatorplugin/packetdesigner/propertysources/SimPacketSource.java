package com.logica.hummingbird.simulatorplugin.packetdesigner.propertysources;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacket;

public class SimPacketSource implements IPropertySource {

	private SimPacket packet;

	public SimPacketSource(SimPacket packet) {
		super();
		this.packet = packet;
	}

	@Override
	public Object getEditableValue() {
		return packet;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		List<IPropertyDescriptor> props = new ArrayList<IPropertyDescriptor>();

		props.add(new PropertyDescriptor(SimPacket.NAME_PROPERTY, "Packet Name"));
		props.add(new PropertyDescriptor(SimPacket.NUMBER_OF_PARAMETERS_PROPERTY, "Number of parameters"));

		return props.toArray(new IPropertyDescriptor[0]);
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (SimPacket.NAME_PROPERTY.equals(id)) {
			return packet.getName();
		}
		if (SimPacket.NUMBER_OF_PARAMETERS_PROPERTY.equals(id)) {
			return packet.getParameters().size();
		}
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
		if (SimPacket.NAME_PROPERTY.equals(id)) {
			packet.setName((String) value);
		}
	}

}

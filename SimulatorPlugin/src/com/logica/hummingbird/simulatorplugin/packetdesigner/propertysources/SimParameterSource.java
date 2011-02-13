package com.logica.hummingbird.simulatorplugin.packetdesigner.propertysources;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimParameter;

public class SimParameterSource implements IPropertySource {

	private SimParameter parameter;

	public SimParameterSource(SimParameter parameter) {
		super();
		this.parameter = parameter;
	}

	@Override
	public Object getEditableValue() {
		return parameter;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		List<IPropertyDescriptor> props = new ArrayList<IPropertyDescriptor>();

		props.add(new PropertyDescriptor(SimParameter.NAME_PROPERTY, "Name"));
		props.add(new PropertyDescriptor(SimParameter.SHORT_DESCRIPTION_PROPERTY, "Short description"));
		props.add(new PropertyDescriptor(SimParameter.LONG_DESCRIPTION_PROPERTY, "Long description"));
		props.add(new PropertyDescriptor(SimParameter.CLASS_TYPE_PROPERTY, "Type"));
		props.add(new PropertyDescriptor(SimParameter.VALUE_PROPERTY, "Value"));

		return props.toArray(new IPropertyDescriptor[0]);
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (SimParameter.NAME_PROPERTY.equals(id)) {
			return parameter.getName();
		}
		if (SimParameter.SHORT_DESCRIPTION_PROPERTY.equals(id)) {
			return parameter.getShortDescription();
		}
		if (SimParameter.LONG_DESCRIPTION_PROPERTY.equals(id)) {
			return parameter.getLongDescription();
		}
		if (SimParameter.CLASS_TYPE_PROPERTY.equals(id)) {
			return parameter.getClassType();
		}
		if (SimParameter.VALUE_PROPERTY.equals(id)) {
			return parameter.getValue();
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
		System.out.println("setting property for " + id + " = " + value);
		if (SimParameter.NAME_PROPERTY.equals(id)) {
			parameter.setName((String) value);
		}
	}

}

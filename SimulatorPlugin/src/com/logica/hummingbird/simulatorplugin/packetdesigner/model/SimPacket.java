package com.logica.hummingbird.simulatorplugin.packetdesigner.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.views.properties.IPropertySource;

import com.logica.hummingbird.simulatorplugin.packetdesigner.propertysources.SimPacketSource;
import com.logica.hummingbird.telemetry.HummingbirdPacket;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

/**
 * New HummingbirdPacket implementation that allows us to add RCP and GEF additions, such as IAdaptable interfaces and
 * location data. This would not be appropriate for the Hummingbird core Tele classes. We will generate a Hummingbird
 * packet object from this for passing to the Simulator when it is run.
 * 
 * @author Mark Doyle
 * 
 */
public class SimPacket implements HummingbirdPacket, IAdaptable {

	private String name;
	private List<HummingbirdParameter> parameters = new ArrayList<HummingbirdParameter>(0);

	/** Used for the properties views */
	private IPropertySource propertySource = null;

	public static final String NAME_PROPERTY = "Packet name";
	public static final String NUMBER_OF_PARAMETERS_PROPERTY = "Number of Parameters";

	public SimPacket(String name) {
		super();
		this.name = name;
	}

	@Override
	public Object getAdapter(Class adapter) {
		if (adapter == IPropertySource.class) {
			if (propertySource == null) {
				propertySource = new SimPacketSource(this);
			}
			return propertySource;
		}
		return null;
	}

	@Override
	public void addParameter(HummingbirdParameter parameter) {
		this.parameters.add(parameter);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public HummingbirdParameter getParameter(String parameter) {
		HummingbirdParameter found = null;
		for (HummingbirdParameter param : this.parameters) {
			if (param.getName().equals(name)) {
				found = param;
			}
		}
		return found;
	}

	@Override
	public List<HummingbirdParameter> getParameters() {
		return this.parameters;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}

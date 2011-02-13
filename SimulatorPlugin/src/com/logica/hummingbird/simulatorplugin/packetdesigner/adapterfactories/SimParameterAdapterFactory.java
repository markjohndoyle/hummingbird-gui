package com.logica.hummingbird.simulatorplugin.packetdesigner.adapterfactories;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.views.properties.IPropertySource;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimParameter;
import com.logica.hummingbird.simulatorplugin.packetdesigner.propertysources.SimParameterSource;

/**
 * Provides a PropertySource for SimParameter when requested by an adapter client. Basically, something in Eclipse or a
 * plugin will want to use the PropertySource interface for SimParaemter, if so the framework will end up here and this
 * factory will create the required PropertySource implementation.
 * 
 * This factory can actually be used to adapt SimParameter to anything. Feel free to add to this as required.
 * 
 * @author Mark Doyle
 * 
 */
public class SimParameterAdapterFactory implements IAdapterFactory {

	IPropertySource simParameterPropSource;

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		System.out.println("SimParameterAdapterFactory - getting adapter");
		if (adapterType == IPropertySource.class) {
			if (simParameterPropSource == null) {
				simParameterPropSource = new SimParameterSource((SimParameter) adaptableObject);
			}
			return simParameterPropSource;
		}
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return new Class[] { IPropertySource.class };
	}

}

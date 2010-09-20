package com.logica.hummingbird.simulatorplugin.packetdesigner.editparts;

import org.eclipse.gef.requests.CreationFactory;

import com.logica.hummingbird.telemetry.HummingbirdParameter;

/**
 * TODO  
 * 
 * @author Mark Doyle
 *
 */
public class ParameterCreationFactory implements CreationFactory {

	private final Class<? extends HummingbirdParameter> parameter;

	public ParameterCreationFactory(Class<? extends HummingbirdParameter> parameter) {
		this.parameter = parameter;
	}

	@Override
	public Object getNewObject() {
		return parameter;
	}

	@Override
	public Object getObjectType() {
		return parameter;
	}

}

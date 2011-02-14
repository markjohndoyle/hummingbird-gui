package org.hbird.rcpgui.telemetry.model;

import java.util.List;
import java.util.Map;

import org.hbird.rcpgui.parameterprovider.ParameterObserver;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.model.Parameter;
import org.hbird.rcpgui.telemetry.TelemetryActivator;

public class ModelCreator implements ParameterObserver {

	List<TelemetryParameter> parameters;

	private final ParameterProvider parameterProvider;

	public ModelCreator() {
		parameterProvider = (ParameterProvider) TelemetryActivator.getParameterProviderServices().getService();
		parameterProvider.addObserver(this);
	}

	@Override
	public void paramterRecieved(Parameter parameter) {
		System.out.println("Telemetry view received a parameter");
		System.out.println(parameter.toString());
		createTelemetryParameter(parameter);
	}

	private void createTelemetryParameter(Parameter parameter) {
		Map<String, Object> properties = parameter.getParameterProperties();

	}


}

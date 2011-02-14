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
		try {
			parameterProvider.start();
		}
		catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void paramterRecieved(final Parameter parameter) {
		System.out.println("Telemetry view received a parameter");
		System.out.println(parameter.toString());
		parameters.add(createTelemetryParameter(parameter));
	}

	private TelemetryParameter createTelemetryParameter(final Parameter parameter) {
		final Map<String, Object> properties = parameter.getParameterProperties();
		final Object value = parameter.getValue();
		return new TelemetryParameter(properties, value);
	}

	/**
	 * @return the parameters
	 */
	public List<TelemetryParameter> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters
	 *            the parameters to set
	 */
	public void setParameters(final List<TelemetryParameter> parameters) {
		this.parameters = parameters;
	}

}

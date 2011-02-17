package org.hbird.rcpgui.telemetry.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hbird.rcpgui.parameterprovider.ParameterObserver;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.model.Parameter;
import org.hbird.rcpgui.telemetry.TelemetryActivator;

public class ParameterSource extends AbstractPropChangeModelObject implements ParameterObserver {

	private Map<String, TelemetryParameter> liveParameters = new HashMap<String, TelemetryParameter>();
	private List<TelemetryParameter> liveParameterList = new ArrayList<TelemetryParameter>();


	private final ParameterProvider parameterProvider;

	public ParameterSource() {
		parameterProvider = (ParameterProvider) TelemetryActivator.getParameterProviderServices().getService();
		parameterProvider.addObserver(this);
	}

	@Override
	public void parameterRecieved(final Parameter parameter) {
		System.out.println("Telemetry view received a parameter");
		System.out.println(parameter.toString());
		final Object oldLiveParameterList = liveParameterList;
		final TelemetryParameter param = createTelemetryParameter(parameter);
		liveParameters.put(param.getName(), param);
		liveParameterList = new ArrayList<TelemetryParameter>(liveParameters.values());
		firePropertyChange("liveParameterList", oldLiveParameterList, liveParameterList);
	}


	private TelemetryParameter createTelemetryParameter(final Parameter parameter) {
		final Map<String, Object> properties = parameter.getParameterProperties();
		final Object value = parameter.getValue();
		return new TelemetryParameter(properties, value);
	}

	/**
	 * @return the liveParameterList
	 */
	public List<TelemetryParameter> getLiveParameterList() {
		return liveParameterList;
	}

	public final void stopLiveProvision() throws Exception {
		parameterProvider.stopTelemetryProvision();
	}

	public final void startLiveProvision() throws Exception {
		parameterProvider.startTelemetryProvision();
	}

}

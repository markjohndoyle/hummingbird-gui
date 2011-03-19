package org.hbird.rcpgui.telemetryprovision.source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hbird.rcpgui.parameterprovider.ParameterObserver;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.model.Parameter;
import org.hbird.rcpgui.telemetryprovision.TelemetryActivator;
import org.hbird.rcpgui.telemetryprovision.model.AbstractPropChangeModelObject;
import org.hbird.rcpgui.telemetryprovision.model.TelemetryParameter;

public class ParameterSource extends AbstractPropChangeModelObject implements ParameterObserver {


	private final Map<String, TelemetryParameter> liveParameters = new HashMap<String, TelemetryParameter>();
	private List<TelemetryParameter> liveParameterList = new ArrayList<TelemetryParameter>();

	private final ParameterProvider parameterProvider;
	private final boolean requestAll;
	private List<String> interestList;
	private boolean provisionActive = false;

	public ParameterSource(boolean requestAll) {
		this.requestAll = requestAll;
		parameterProvider = (ParameterProvider) TelemetryActivator.getParameterProviderServices().getService();
		parameterProvider.addObserver(this);
	}

	@Override
	public void parameterRecieved(final Parameter parameter) {
		System.out.println("Parameter Source received a parameter");
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

	public final String getProviderName() {
		return parameterProvider.getProviderName();
	}

	public final void stopLiveProvision() throws Exception {
		parameterProvider.stopTelemetryProvision();
		this.setProvisionActive(false);
	}

	public final void startLiveProvision() throws Exception {
		parameterProvider.startTelemetryProvision();
		this.setProvisionActive(true);
	}

	@Override
	public List<String> getInterestList() {
		return interestList;
	}

	@Override
	public boolean isRequestingAllParameters() {
		return requestAll;
	}

	public void setInterestList(List<String> interestList) {
		this.interestList = interestList;
	}

	public boolean getProvisionActive() {
		return this.provisionActive;
	}

	public void setProvisionActive(boolean provisionActive) {
		boolean oldVal = this.provisionActive;
		this.provisionActive = provisionActive;
		firePropertyChange("provisionActive", oldVal, provisionActive);
	}

}

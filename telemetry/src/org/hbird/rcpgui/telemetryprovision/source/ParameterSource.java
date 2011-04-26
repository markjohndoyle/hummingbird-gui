package org.hbird.rcpgui.telemetryprovision.source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hbird.rcpgui.parameterprovider.ParameterObserver;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.model.Parameter;
import org.hbird.rcpgui.telemetryprovision.TelemetryProvisionActivator;
import org.hbird.rcpgui.telemetryprovision.model.AbstractPropChangeModelObject;
import org.hbird.rcpgui.telemetryprovision.model.TelemetryParameter;

public class ParameterSource extends AbstractPropChangeModelObject implements ParameterObserver {

	/** Current {@link ParameterProvider} service **/
	private ParameterProvider parameterProvider;

	/** List of all available {@linkplain ParameterProvider} services **/
	private List<ParameterProvider> parameterProviderServices = new ArrayList<ParameterProvider>();


	/** TODO don't like this dual map/list thing. It only exists because I didn't understand Jface binding! FIX PLEASE! **/
	private final Map<String, TelemetryParameter> liveParameters = new HashMap<String, TelemetryParameter>();
	private List<TelemetryParameter> liveParameterList = new ArrayList<TelemetryParameter>();

	private boolean provisionActive = false;


	public ParameterSource() {
		final Object[] serviceObjects = TelemetryProvisionActivator.getParameterProviderServices().getServices();
		if (serviceObjects.length > 0) {
			for (final Object o : serviceObjects) {
				parameterProviderServices.add((ParameterProvider) o);
			}
		}

		// Use the first service by default
		parameterProvider = parameterProviderServices.get(0);
		parameterProvider.addObserver(this);
	}

	public void addNameFilter(final String paramName) {
		parameterProvider.addParameterNameFitler(paramName);
	}


	public final void addNamesFilter(final Set<String> parameterNames) {
		this.parameterProvider.addParameterNamesFitler(parameterNames);
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

	public ParameterProvider getParameterProvider() {
		return parameterProvider;
	}

	public List<ParameterProvider> getParameterProviderServices() {
		return parameterProviderServices;
	}

	public final String getProviderName() {
		System.out.println("Getting provider name");
		return parameterProvider.getProviderName();
	}

	public boolean getProvisionActive() {
		return this.provisionActive;
	}

	@Override
	public void parameterRecieved(final Parameter parameter) {
		// System.out.println("Parameter Source received a parameter");
		// System.out.println(parameter.toString());
		final Object oldLiveParameterList = liveParameterList;
		final TelemetryParameter param = createTelemetryParameter(parameter);
		liveParameters.put(param.getName(), param);
		liveParameterList = new ArrayList<TelemetryParameter>(liveParameters.values());
		firePropertyChange("liveParameterList", oldLiveParameterList, liveParameterList);
	}

	public final void removeParameterNameFilter(final String name) {
		parameterProvider.removeParameterNameFilter(name);
	}

	public void setParameterProvider(final ParameterProvider parameterProvider) {
		this.parameterProvider = parameterProvider;
	}

	public void setParameterProviderServices(final List<ParameterProvider> parameterProviderServices) {
		this.parameterProviderServices = parameterProviderServices;
	}

	public void setProvisionActive(final boolean provisionActive) {
		boolean oldVal = this.provisionActive;
		this.provisionActive = provisionActive;
		firePropertyChange("provisionActive", oldVal, provisionActive);
	}

	public final void startLiveProvision() throws Exception {
		parameterProvider.startTelemetryProvision();
		this.setProvisionActive(true);
	}

	public final void stopLiveProvision() throws Exception {
		parameterProvider.stopTelemetryProvision();
		this.setProvisionActive(false);
	}

}

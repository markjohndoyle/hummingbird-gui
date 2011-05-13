package org.hbird.rcpgui.telemetryprovision.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

import org.hbird.rcpgui.parameterprovider.ParameterObserver;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.exceptions.NoParameterNameFiltererSetException;
import org.hbird.rcpgui.parameterprovider.model.Parameter;
import org.hbird.transport.commons.collections.CircularFifoQueue;

/**
 * FIXME Split model and behaviour (starting stopping TM)
 * 
 * 
 * @author Mark Doyle
 * 
 */
public class ParameterSource extends AbstractPropChangeModelObject implements ParameterObserver {

	/** Current {@link ParameterProvider} service **/
	private ParameterProvider parameterProvider;

	/** List of all available {@linkplain ParameterProvider} services **/
	private List<ParameterProvider> parameterProviderServices = new ArrayList<ParameterProvider>();

	/** TODO don't like this dual map/list thing. It only exists because I didn't understand Jface binding! FIX PLEASE! **/
	private Map<String, TelemetryParameter> liveUniqueParameters = new HashMap<String, TelemetryParameter>();
	private List<TelemetryParameter> liveParameterList = new ArrayList<TelemetryParameter>();

	private final CircularFifoQueue<TelemetryParameter> liveParameterQueue = new CircularFifoQueue<TelemetryParameter>(
			new ArrayBlockingQueue<TelemetryParameter>(50, true));

	private boolean provisionActive = false;

	public ParameterSource(final ParameterProvider parameterProvider) {
		this.parameterProvider = parameterProvider;
		this.parameterProvider.addObserver(this);
	}

	public void addNameFilter(final String paramName) throws NoParameterNameFiltererSetException {
		parameterProvider.addParameterNameFitler(paramName);
	}

	public final void addNamesFilter(final Set<String> parameterNames) throws NoParameterNameFiltererSetException {
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
		return parameterProvider.getProviderName();
	}

	public boolean getProvisionActive() {
		return this.provisionActive;
	}

	@Override
	public synchronized void parameterRecieved(final Parameter parameter) {
		final List<TelemetryParameter> oldLiveParameterList = liveParameterList;
		final Map<String, TelemetryParameter> oldLiveUniqueParameters = liveUniqueParameters;

		final TelemetryParameter param = createTelemetryParameter(parameter);

		liveUniqueParameters.put(param.getName(), param);

		try {
			liveParameterQueue.put(param);
			// TODO Have to recreate the list because the PropertyChange library checks for if list = this which means
			// added elements don't trigger a change event.
			liveParameterList = new ArrayList<TelemetryParameter>(liveParameterQueue);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		firePropertyChange("liveParameterList", oldLiveParameterList, liveParameterList);

		// FIXME Will not trigger if the map isn't recreated completely.
		firePropertyChange("liveUniqueParameters", oldLiveUniqueParameters, liveUniqueParameters);
	}

	public final void removeParameterNameFilter(final String name) throws NoParameterNameFiltererSetException {
		parameterProvider.removeParameterNameFilter(name);
	}

	public void setParameterProvider(final ParameterProvider parameterProvider) {
		this.parameterProvider = parameterProvider;
	}

	public void setParameterProviderServices(final List<ParameterProvider> parameterProviderServices) {
		this.parameterProviderServices = parameterProviderServices;
	}

	private void setProvisionActive(final boolean provisionActive) {
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

	public Map<String, TelemetryParameter> getLiveParameters() {
		return liveUniqueParameters;
	}

	public void setLiveParameters(final Map<String, TelemetryParameter> liveParameters) {
		this.liveUniqueParameters = liveParameters;
	}

	public CircularFifoQueue<TelemetryParameter> getLiveParameterQueue() {
		return liveParameterQueue;
	}

}
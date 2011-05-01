package org.hbird.rcpgui.camelparameterprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Message;
import org.hbird.rcpgui.parameterprovider.ParameterObserver;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.exceptions.NoParameterNameFiltererSetException;
import org.hbird.rcpgui.parameterprovider.model.Parameter;

/**
 * @author Mark Doyle
 * 
 */
public class CamelParameterProvider implements ParameterProvider, CamelContextAware {

	private static final String PROVIDER_NAME = "Camel";
	private CamelContext camelContext;
	private List<ParameterObserver> observers;
	private ParameterNameFilterer parameterNameFilter;

	public CamelParameterProvider() {
		System.out.println("Constructing new camel provider");
	}

	@Override
	public void addObserver(final ParameterObserver po) {
		if (observers == null) {
			observers = new ArrayList<ParameterObserver>(1);
		}
		observers.add(po);
	}


	@Override
	public void addParameterNameFitler(final String parameterName) throws NoParameterNameFiltererSetException {
		checkForFilter();
		parameterNameFilter.addParameterNameFitler(parameterName);
	}

	@Override
	public void addParameterNamesFitler(final Set<String> parameterNames) throws NoParameterNameFiltererSetException {
		checkForFilter();

		if (parameterNames == null) {
			parameterNameFilter.setParameterNames(parameterNames);
		}
		else {
			for (String newFilter : parameterNames) {
				parameterNameFilter.addParameterNameFitler(newFilter);
			}
		}
	}

	private void checkForFilter() throws NoParameterNameFiltererSetException {
		if (parameterNameFilter == null) {
			throw new NoParameterNameFiltererSetException();
		}
	}

	@Override
	public String getProviderName() {
		return PROVIDER_NAME;
	}

	/**
	 * Notifies all parameter observers of the new parameter.
	 * 
	 * @param parameter
	 */
	private void notifyObservers(final Parameter parameter) {
		// System.out.println("Notifying " + observers.size() + " observers");s
		if (observers != null) {
			for (final ParameterObserver po : observers) {
				po.parameterRecieved(parameter);
			}
		}
	}

	/**
	 * TODO Remove camel dependency. Saying that annotations are just as much a dependency.
	 * 
	 * @param parameterMsg
	 */
	public void parameterIn(final Message parameterMsg) {
		final Map<String, Object> headers = parameterMsg.getHeaders();
		final Object parameterValue = parameterMsg.getBody();

		// Create basic parameter object
		final Parameter parameter = new Parameter();
		parameter.setValue(parameterValue);
		parameter.setParameterProperties(headers);

		notifyObservers(parameter);
	}

	@Override
	public void removeAllParameterNameFilters() throws NoParameterNameFiltererSetException {
		checkForFilter();
		parameterNameFilter.removeAllParameterNameFilters();
	}

	@Override
	public void removeParameterNameFilter(final String parameterName) throws NoParameterNameFiltererSetException {
		checkForFilter();
		parameterNameFilter.removeParameterNameFilter(parameterName);
	}

	@Override
	public void startTelemetryProvision() throws Exception {
		getCamelContext().startRoute("fromJmsProcessedParametersOut");
		boolean provisionActive = true;
	}

	@Override
	public void stopTelemetryProvision() throws Exception {
		getCamelContext().stopRoute("fromJmsProcessedParametersOut");
		boolean provisionActive = false;
	}

	@Override
	public CamelContext getCamelContext() {
		return camelContext;
	}

	@Override
	public void setCamelContext(final CamelContext arg0) {
		this.camelContext = arg0;
	}

	public void setParameterNameFilter(final ParameterNameFilterer parameterNameFilter) {
		this.parameterNameFilter = parameterNameFilter;
	}

	public ParameterNameFilterer getParameterNameFilter() {
		return parameterNameFilter;
	}

}

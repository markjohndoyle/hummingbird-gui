package org.hbird.rcpgui.camelparameterprovider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.camel.CamelContext;
import org.apache.camel.Message;
import org.apache.camel.Route;
import org.apache.camel.builder.RouteBuilder;
import org.apache.commons.lang.StringUtils;
import org.hbird.rcpgui.parameterprovider.ParameterObserver;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.exceptions.NoParameterNameFiltererSetException;
import org.hbird.rcpgui.parameterprovider.model.Parameter;

/**
 * @author Mark Doyle
 * 
 */
public class CamelParameterProvider implements ParameterProvider {

	// FIXME Push to service factory to externalise (facotry is spring bean)
	private String processParametersSource = "fromJmsProcessedParametersOut";

	private static final String PROVIDER_NAME = "Camel";
	private CamelContext camelContext;
	private ParameterNameFilterer parameterNameFilter;

	private List<ParameterObserver> observers;
	private final String consumerServiceID;

	public CamelParameterProvider(final String bundleUID) {
		System.out.println("Constructing new camel provider for bundle " + bundleUID);
		consumerServiceID = bundleUID;
	}

	private class ParmeterRouter extends RouteBuilder {

		private final CamelParameterProvider destination;
		private final String routeName;
		private final String methodName;

		public ParmeterRouter(final String routeName, final CamelParameterProvider destination, final String methodName) {
			this.destination = destination;
			this.methodName = methodName;
			this.routeName = routeName;
		}

		@Override
		public void configure() throws Exception {
			System.out.println("Adding initial route with id " + consumerServiceID);
			//@formatter:off
			from("jms:topic:processedParametersOut").
				routeId(routeName).
				noAutoStartup().
			filter().
				method(parameterNameFilter).
			bean(destination, methodName);
			//@formatter:on
		}

	}

	/**
	 * @param routeName
	 * 
	 */
	public void addUnfilteredParameterRoute(final String routeName) {
		try {
			getCamelContext().addRoutes(new ParmeterRouter(routeName, this, "parameterIn"));
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void addObserver(final ParameterObserver po) {
		System.out.println("Adding observer to provider " + this.hashCode());
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
		// System.out.println("Notifying " + observers.size() + " observers");
		if (observers != null) {
			for (final ParameterObserver po : observers) {
				po.parameterRecieved(parameter);
			}
		}
	}

	/**
	 * TODO Remove camel dependency.
	 * 
	 * @param parameterMsg
	 */
	public void parameterIn(final Message parameterMsg) {
		System.out.println("Received on provider " + this.hashCode());

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
		System.out.println("Adding route to " + consumerServiceID + " specific service ");

		Iterator<Route> it = getCamelContext().getRoutes().iterator();
		boolean routeAlreadyPresent = false;
		while (it.hasNext()) {
			if (StringUtils.equals(it.next().getId(), consumerServiceID)) {
				routeAlreadyPresent = true;
				break;
			}
		}

		if (!routeAlreadyPresent) {
			addUnfilteredParameterRoute(consumerServiceID);
		}

		System.out.println("No. routes = " + getCamelContext().getRoutes().size());
		getCamelContext().startRoute(consumerServiceID);
	}

	@Override
	public void stopTelemetryProvision() throws Exception {
		getCamelContext().stopRoute(processParametersSource);
	}

	public CamelContext getCamelContext() {
		return camelContext;
	}

	public void setCamelContext(final CamelContext arg0) {
		System.out.println("Set camel context called");
		this.camelContext = arg0;
	}

	public void setParameterNameFilter(final ParameterNameFilterer parameterNameFilter) {
		this.parameterNameFilter = parameterNameFilter;
	}

	public ParameterNameFilterer getParameterNameFilter() {
		return parameterNameFilter;
	}

	public String getProcessParametersSource() {
		return this.processParametersSource;
	}

	public void setProcessParametersSource(final String processParametersSource) {
		this.processParametersSource = processParametersSource;
	}

}

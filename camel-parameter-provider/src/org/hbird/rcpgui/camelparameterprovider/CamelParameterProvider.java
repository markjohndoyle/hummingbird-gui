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
 * Implements the {@link ParameterProvider} interface which is registered as a service using Spring DM.
 * 
 * The Spring files are located in META-INF/spring as is the convention.
 * 
 * @author Mark Doyle
 * 
 */
public class CamelParameterProvider implements ParameterProvider {

	private String parameterSourceUri;

	private static final String PROVIDER_NAME = "Camel";
	private final CamelContext camelContext;
	private ParameterNameFilterer parameterNameFilter;

	private List<ParameterObserver> observers;
	private final String consumerServiceID;

	public CamelParameterProvider(final CamelContext camelContext, final String bundleUID, final String parameterSourceUri) {
		System.out.println("Constructing new camel provider for bundle " + bundleUID);
		this.consumerServiceID = bundleUID;
		this.parameterSourceUri = parameterSourceUri;
		this.camelContext = camelContext;
	}

	/**
	 * Adds this providers route to the camel context.
	 * 
	 * @param routeName
	 * 
	 */
	private void addUnfilteredParameterRoute(final String routeName) {
		try {
			getCamelContext().addRoutes(new ParametersRouter(routeName, this, "parameterIn"));
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	/**
	 * Checks if a {@link ParameterNameFilterer} has been set on this. If not the route cannot be filtered.
	 * 
	 * FIXME Drop the exception and log it here? Can't fix it in a higher layer as it would be an installation issue.
	 * 
	 * @throws NoParameterNameFiltererSetException
	 */
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

		getCamelContext().startRoute(consumerServiceID);
	}

	@Override
	public void stopTelemetryProvision() throws Exception {
		getCamelContext().stopRoute(consumerServiceID);
	}

	public CamelContext getCamelContext() {
		return camelContext;
	}

	public void setParameterNameFilter(final ParameterNameFilterer parameterNameFilter) {
		this.parameterNameFilter = parameterNameFilter;
	}

	public ParameterNameFilterer getParameterNameFilter() {
		return parameterNameFilter;
	}

	public String getParameterSourceUri() {
		return parameterSourceUri;
	}

	public void setParameterSourceUri(final String parameterSourceUri) {
		this.parameterSourceUri = parameterSourceUri;
	}

	/**
	 * This specialised {@link RouteBuilder} configures a route that collects parameter messages from
	 * processParamterSource through a default name filter to the instance of the enclosing class (
	 * {@link CamelParameterProvider}).
	 * 
	 * 
	 * @author Mark Doyle
	 * 
	 */
	private class ParametersRouter extends RouteBuilder {

		private final CamelParameterProvider destination;
		private final String routeName;
		private final String methodName;

		public ParametersRouter(final String routeName, final CamelParameterProvider destination, final String methodName) {
			this.destination = destination;
			this.methodName = methodName;
			this.routeName = routeName;
		}

		@Override
		public void configure() throws Exception {
			System.out.println("Adding initial route with id " + consumerServiceID);
			//@formatter:off
			from(parameterSourceUri).
				routeId(routeName).
				noAutoStartup().
			filter().
				expression(bean(parameterNameFilter, "isParameterNameFiltered")).
			bean(destination, methodName);
			//@formatter:on
		}

	}

}

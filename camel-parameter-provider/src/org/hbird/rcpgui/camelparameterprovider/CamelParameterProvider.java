package org.hbird.rcpgui.camelparameterprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.hbird.rcpgui.parameterprovider.ParameterObserver;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.exceptions.NoParameterNameFiltererSetException;
import org.hbird.rcpgui.parameterprovider.model.Parameter;

/**
 * @author Mark Doyle
 * 
 */
public class CamelParameterProvider implements ParameterProvider, CamelContextAware {

	private String processParametersSource;
	private static final String PROVIDER_NAME = "Camel";
	private CamelContext camelContext;
	private List<ParameterObserver> observers;
	private ParameterNameFilterer parameterNameFilter;

	public CamelParameterProvider() {
		System.out.println("Constructing new camel provider");
	}

	/**
	 * @param routeName
	 * 
	 */
	public void addInitialRoute(final String routeName) {
		try {
			getCamelContext().addRoutes(new RouteBuilder() {
				// <from uri="jms:topic:processedParametersOut" />
				// <camel:filter>
				// <camel:method bean="parameterFilterer"></camel:method>
				// <to uri="bean:camelParameterProvider?method=parameterIn" />
				// </camel:filter>
				@Override
				public void configure() throws Exception {
					System.out.println("Adding initial route");
					from("jms:topic:processedParametersOut").routeId(routeName).noAutoStartup().filter().method(parameterNameFilter)
							.to("bean:camelParameterProvider");
				}
			});
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
		if (getCamelContext().getRoutes().size() == 0) {
			addInitialRoute(processParametersSource + this.hashCode());
		}
		getCamelContext().startRoute(processParametersSource);
		boolean provisionActive = true;
	}

	@Override
	public void stopTelemetryProvision() throws Exception {
		getCamelContext().stopRoute(processParametersSource);
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

	public String getProcessParametersSource() {
		return this.processParametersSource;
	}

	public void setProcessParametersSource(final String processParametersSource) {
		this.processParametersSource = processParametersSource;
	}

}

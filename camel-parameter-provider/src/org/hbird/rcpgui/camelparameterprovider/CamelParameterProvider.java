package org.hbird.rcpgui.camelparameterprovider;

import java.util.Iterator;
import java.util.Set;

import org.apache.camel.CamelContext;
import org.apache.camel.Route;
import org.apache.camel.builder.RouteBuilder;
import org.apache.commons.lang.StringUtils;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.core.commons.tmtc.ParameterGroup;
import org.hbird.osgi.whiteboard.servicevisiting.Visitor;
import org.hbird.osgi.whiteboard.servicevisiting.WhiteboardServiceTracker;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.exceptions.NoParameterNameFiltererSetException;
import org.hbird.rcpgui.parameterprovider.interfaces.NewParameterListener;
import org.osgi.framework.BundleContext;
import org.springframework.osgi.context.BundleContextAware;

/**
 * Implements the {@link ParameterProvider} interface which is registered as a service using Spring DM.
 *
 * The Spring files are located in META-INF/spring as is the convention.
 *
 * BundleContext aware allows Spring to inject a reference to the osgi context which is required by
 * the whiteboard tracker. Using Spring allows to to avoid depending upon an OSGI util libs.
 *
 * @author Mark Doyle
 *
 */
public class CamelParameterProvider implements ParameterProvider, BundleContextAware {

	private String parameterSourceUri;

	private final WhiteboardServiceTracker<NewParameterListener> newParameterListenerServiceWhiteboard;

	private static final String PROVIDER_NAME = "Camel";
	private final CamelContext camelContext;
	private ParameterNameFilterer parameterNameFilter;

	private final String consumerServiceID;

	private BundleContext osgiBundleContext;

	public CamelParameterProvider(final CamelContext camelContext, final String bundleUID, final String parameterSourceUri) {
		System.out.println("Constructing new camel provider for bundle " + bundleUID);
		this.consumerServiceID = bundleUID;
		this.parameterSourceUri = parameterSourceUri;
		this.camelContext = camelContext;

		this.newParameterListenerServiceWhiteboard = new WhiteboardServiceTracker<NewParameterListener>(osgiBundleContext, NewParameterListener.class);
	}


	@Override
	public String getProviderName() {
		return PROVIDER_NAME;
	}


	public void parameterIn(final ParameterGroup parametergroup) {
		if (parametergroup == null) {
			System.out.println("[WARN] - Received null parameter");
			return;
		}

		// For every parameter received, create a visitor and send to all registered
		// newParameterListener services, i.e, those on the "whiteboard".
		for (final Parameter<?> parameter : parametergroup.getAllParameters().values()) {
			Visitor<NewParameterListener> newParameterListenerVisitor = new Visitor<NewParameterListener>() {
				@Override
				public void visit(final NewParameterListener newParameterListener) {
					newParameterListener.newParameter(parameter);
				}
			};
			this.newParameterListenerServiceWhiteboard.accept(newParameterListenerVisitor);
		}
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
				System.out.println("Route already exists for this client, using existing route.");
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
	 * processParamterSource and pipes it through a default name filter to the instance of the enclosing class (
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

	@Override
	public void setBundleContext(final BundleContext arg0) {
		this.osgiBundleContext = arg0;
	}

}

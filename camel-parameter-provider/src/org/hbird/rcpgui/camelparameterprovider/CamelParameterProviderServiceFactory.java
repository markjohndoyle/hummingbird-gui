package org.hbird.rcpgui.camelparameterprovider;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.hbird.rcpgui.parameterprovider.interfaces.ParameterProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;

/**
 * {@link ServiceFactory} that creates a {@link CamelParameterProvider} to satisfy the {@link ParameterProvider} OSGi
 * service interface.
 * 
 * The Factory creates a unique id from the consumer bundle name and version which is used by the
 * {@link CamelParameterProvider} to identify their own routes in the shared {@link CamelContext}.
 * 
 * @author Mark Doyle
 * 
 */
public class CamelParameterProviderServiceFactory implements ServiceFactory, CamelContextAware {

	/** {@link CamelContext} which is injected into this class via Spring */
	private CamelContext camel;

	/**
	 * The source of the parameters. This is passed to the instantiated {@link CamelParameterProvider}s and used by them
	 * as the source of their routes.
	 */
	private String parameterSourceUri;

	@Override
	public Object getService(final Bundle bundle, final ServiceRegistration registration) {
		System.out.println("ServiceFactory is producing");
		String bundleUID = new String(bundle.getSymbolicName() + ":" + bundle.getVersion());
		CamelParameterProvider camelParameterProvider = new CamelParameterProvider(camel, bundleUID, parameterSourceUri);
		camelParameterProvider.setParameterNameFilter(new ParameterNameFilterer());
		return camelParameterProvider;
	}

	@Override
	public void ungetService(final Bundle bundle, final ServiceRegistration registration, final Object service) {
		// Nothing necessary
	}

	@Override
	public CamelContext getCamelContext() {
		return camel;
	}

	@Override
	public void setCamelContext(final CamelContext arg0) {
		this.camel = arg0;
	}

	public void setParameterSourceUri(final String parameterSourceUri) {
		this.parameterSourceUri = parameterSourceUri;
	}

	public String getParameterSourceUri() {
		return parameterSourceUri;
	}

}

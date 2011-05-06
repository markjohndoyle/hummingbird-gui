package org.hbird.rcpgui.camelparameterprovider;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;

/**
 * {@link ServiceFactory} that creates a {@link CamelParameterProvider} to satisfy the {@link ParameterProvider} service
 * interface.
 * 
 * The Factory creates a unique id from the consumer bundle name and version which is used by the
 * {@link CamelParameterProvider}.
 * 
 * @author Mark Doyle
 * 
 */
public class CamelParameterProviderServiceFactory implements ServiceFactory, CamelContextAware {

	private CamelContext camel;

	@Override
	public Object getService(final Bundle bundle, final ServiceRegistration registration) {
		System.out.println("ServiceFactory is producing");
		CamelParameterProvider camelParameterProvider = new CamelParameterProvider(new String(bundle.getSymbolicName() + ":" + bundle.getVersion()));
		camelParameterProvider.setCamelContext(camel);
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

}

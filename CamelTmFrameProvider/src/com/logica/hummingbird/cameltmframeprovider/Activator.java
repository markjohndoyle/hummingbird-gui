package com.logica.hummingbird.cameltmframeprovider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.logica.hummingbird.tmframeprovider.IFrameProvider;

public class Activator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		// Register our implementation as a service so any other OSGi modules can use us.
		context.registerService(IFrameProvider.class.getName(), new CamelTmFrameProvider(), null);
		System.out.println("Camel tm frame provider activated");
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Camel tm frame provider deactivated");
	}

}

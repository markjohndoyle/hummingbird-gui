package com.logica.hummingbird.camelpacketprovider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class CamelPacketProviderActivator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("Camel Packet Provider activated - Spring DM should register the provider services");
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Camel Packet Provider deactivated");
	}

}

package com.logica.hummingbird.packetbrokerviewer;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import com.logica.hummingbird.packetprovider.PacketProvider;

/**
 * The activator class controls the plug-in life cycle
 */
public class PacketBrokerViewerActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "PacketBrokerViewer"; //$NON-NLS-1$

	// The shared instance
	private static PacketBrokerViewerActivator plugin;

	private static volatile ServiceTracker packetProviderServices;
	
	/**
	 * The constructor
	 */
	public PacketBrokerViewerActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		setPacketProviderServices(new ServiceTracker(context, PacketProvider.class.getName(), null));
		getPacketProviderServices().open();
		System.out.println("Bundle activation stage: PacketProvider services tracking count = " + packetProviderServices.getTrackingCount());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static PacketBrokerViewerActivator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	public static void setPacketProviderServices(ServiceTracker frameProviderServices) {
		PacketBrokerViewerActivator.packetProviderServices = frameProviderServices;
	}

	public static ServiceTracker getPacketProviderServices() {
		return packetProviderServices;
	}
}

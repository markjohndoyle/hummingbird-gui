package com.logica.hummingbird.framebrokerviewer;

import java.util.logging.Logger;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import com.logica.hummingbird.tmframeprovider.IFrameProvider;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.logica.hummingbird.framebrokerviewer";

	// The shared instance
	private static Activator plugin;
	
	private final static Logger LOG = Logger.getLogger(Activator.class.getName());

	private volatile static ServiceTracker frameProviderServices;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		// Create a service tracker for IFrameProviders.  Used by the Frame viewer to stream in frame data.
		setFrameProviderServices(new ServiceTracker(context, IFrameProvider.class.getName(), null));
		getFrameProviderServices().open();
		System.out.println("Bundle activation stage: frameProviderServices tracking count = " + frameProviderServices.getTrackingCount());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		frameProviderServices.close();
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
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

	public static void setFrameProviderServices(ServiceTracker frameProviderServices) {
		Activator.frameProviderServices = frameProviderServices;
	}

	public static ServiceTracker getFrameProviderServices() {
		return frameProviderServices;
	}
}

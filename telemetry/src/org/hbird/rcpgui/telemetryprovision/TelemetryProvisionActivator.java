package org.hbird.rcpgui.telemetryprovision;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The activator class controls the plug-in life cycle
 */
public class TelemetryProvisionActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.hbird.rcpgui.telemetry"; //$NON-NLS-1$

	// The shared instance
	private static TelemetryProvisionActivator plugin;

	private static volatile ServiceTracker parameterProviderServiceTracker;

	/**
	 * The constructor
	 */
	public TelemetryProvisionActivator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		// Register
		// parameterProviderServiceTracker = new ServiceTracker(context, ParameterProvider.class.getName(), null);
		// parameterProviderServiceTracker.open();
		// System.out.println("Bundle activation stage (telemetry provision): ParameterProvider services tracking count = "
		// + parameterProviderServiceTracker.getTrackingCount());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static ServiceTracker getParameterProviderServices() {
		return parameterProviderServiceTracker;
	}

	public static void setParameterProviderServices(final ServiceTracker frameProviderServices) {
		TelemetryProvisionActivator.parameterProviderServiceTracker = frameProviderServices;
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static TelemetryProvisionActivator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(final String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}

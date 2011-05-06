package org.hbird.rcpgui.worldwindglobe;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The activator class controls the plug-in life cycle
 */
public class WorldwindGlobeActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.hbird.rcpgui.worldwind-globe"; //$NON-NLS-1$

	// The shared instance
	private static WorldwindGlobeActivator plugin;

	private static ServiceTracker parameterProviderServiceTracker;

	/**
	 * The constructor
	 */
	public WorldwindGlobeActivator() {
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

		parameterProviderServiceTracker = new ServiceTracker(context, ParameterProvider.class.getName(), null);
		parameterProviderServiceTracker.open();
		System.out
				.println("Bundle activation stage (globe): ParameterProvider services tracking count = " + parameterProviderServiceTracker.getTrackingCount());
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

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static WorldwindGlobeActivator getDefault() {
		return plugin;
	}

	public static ServiceTracker getParameterProviderServiceTracker() {
		return WorldwindGlobeActivator.parameterProviderServiceTracker;
	}

}

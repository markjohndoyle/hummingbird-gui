package org.hbird.rcpgui.telemetry;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ViewersTelemetryActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "rg.hbird.rcpgui.viewers.telemetry"; //$NON-NLS-1$

	// The shared instance
	private static ViewersTelemetryActivator plugin;

	/**
	 * The constructor
	 */
	public ViewersTelemetryActivator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static ViewersTelemetryActivator getDefault() {
		return plugin;
	}

}

package org.hbird.rcpgui.telemetryprovision.services;

import org.hbird.rcpgui.telemetryprovision.TelemetryActivator;

public class TelemetryProviderServiceFactory {

	public static final Object[] getServices() {
		final Object[] serviceObjects = TelemetryActivator.getParameterProviderServices().getServices();
		return serviceObjects;
	}
}

package org.hbird.rcpgui.telemetryprovision.services;

import org.hbird.rcpgui.telemetryprovision.TelemetryProvisionActivator;

public class TelemetryProviderServiceFactory {

	public static final Object[] getServices() {
		final Object[] serviceObjects = TelemetryProvisionActivator.getParameterProviderServices().getServices();
		return serviceObjects;
	}
}

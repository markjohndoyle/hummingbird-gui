package org.hbird.rcpgui.tmcontrol.model;

import java.util.List;

import org.osgi.framework.ServiceReference;

public class ParameterProvidersModel {

	List<ServiceReference> parameterProviderServices;

	public ParameterProvidersModel() {
	}

	public List<ServiceReference> getParameterProviderServices() {
		return parameterProviderServices;
	}

	public void setParameterProviderServices(final List<ServiceReference> parameterProviderServices) {
		this.parameterProviderServices = parameterProviderServices;
	}

}

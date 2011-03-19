package org.hbird.rcpgui.camelparameterprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.Message;
import org.apache.camel.spring.SpringCamelContext;
import org.hbird.rcpgui.parameterprovider.ParameterObserver;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.model.Parameter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Mark Doyle
 * 
 */
public class CamelParameterProvider implements ParameterProvider, ApplicationContextAware {

	private static final String PROVIDER_NAME = "Camel provider";
	private ApplicationContext ac = null;
	private List<ParameterObserver> observers;

	public CamelParameterProvider() {
		System.out.println("Constructing new camel provider");
	}

	@Override
	public void addObserver(final ParameterObserver po) {
		if (observers == null) {
			observers = new ArrayList<ParameterObserver>(1);
		}
		observers.add(po);
	}


	public void parameterIn(final Message parameterMsg) {
		final Map<String, Object> headers = parameterMsg.getHeaders();
		final Object parameterValue = parameterMsg.getBody();

		// Create basic parameter object
		final Parameter parameter = new Parameter();
		parameter.setValue(parameterValue);
		parameter.setParameterProperties(headers);

		notifyObservers(parameter);
	}


	/**
	 * Notifies all parameter observers of the new parameter.
	 * 
	 * @param parameter
	 */
	private void notifyObservers(final Parameter parameter) {
		System.out.println("Notifying " + observers.size() + " observers");
		if (observers != null) {
			for (final ParameterObserver po : observers) {
				if (po.isRequestingAllParameters()) {
					po.parameterRecieved(parameter);
				}
				else {
					List<String> pnames = po.getInterestList();
					String paramName = (String) parameter.getParameterProperties().get("ParameterName");
					if (pnames.contains(paramName)) {
						po.parameterRecieved(parameter);
					}
				}
			}
		}
	}

	@Override
	public void startTelemetryProvision() throws Exception {
		final SpringCamelContext camel = (SpringCamelContext) ac.getBean("camelContextBean");
		camel.startRoute("fromJmsProcessedParametersOut");
		boolean provisionActive = true;
	}

	@Override
	public void stopTelemetryProvision() throws Exception {
		final SpringCamelContext camel = (SpringCamelContext) ac.getBean("camelContextBean");
		camel.stopRoute("fromJmsProcessedParametersOut");
		boolean provisionActive = false;
	}

	@Override
	public void setApplicationContext(final ApplicationContext actx) throws BeansException {
		this.ac = actx;
	}

	@Override
	public String getProviderName() {
		return PROVIDER_NAME;
	}

}

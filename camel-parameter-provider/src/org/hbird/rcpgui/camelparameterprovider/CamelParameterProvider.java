package org.hbird.rcpgui.camelparameterprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.Message;
import org.hbird.rcpgui.parameterprovider.ParameterObserver;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.model.Parameter;

public class CamelParameterProvider implements ParameterProvider {

	List<ParameterObserver> observers;

	public CamelParameterProvider() {
		System.out.println("CamelParameterProvider constructed");
	}

	@Override
	public void addObserver(ParameterObserver po) {
		if (observers == null) {
			observers = new ArrayList<ParameterObserver>(1);
		}
		observers.add(po);
	}


	public void parameterIn(Message parameterMsg) {
		Map<String, Object> headers = parameterMsg.getHeaders();
		Object parameterValue = parameterMsg.getBody();

		// Create basic parameter object
		Parameter parameter = new Parameter();
		parameter.setValue(parameterValue);
		parameter.setParameterProperties(headers);

		notifyObservers(parameter);
	}


	/**
	 * Notifies all parameter observers of the new parameter.
	 * 
	 * @param parameter
	 */
	private void notifyObservers(Parameter parameter) {
		for (ParameterObserver po : observers) {
			po.paramterRecieved(parameter);
		}
	}

}

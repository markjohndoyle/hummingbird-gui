package org.hbird.rcpgui.commons.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.parameterlistener.serviceinterfaces.NewParameterListener;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class LiveParametersModel extends PropertyChangeModel implements LiveParameterModel {

	private List<Parameter<?>> parameters = new ArrayList<Parameter<?>>();

	private final Map<String, Parameter<?>> uniqueParameters = new HashMap<String, Parameter<?>>();

	private volatile ServiceRegistration modelListenerServiceReg;

	public LiveParametersModel(final BundleContext context) {
		registerModelListenerService(context);
	}

	public void registerModelListenerService(final BundleContext context) {
		modelListenerServiceReg = context.registerService(NewParameterListener.class.getName(), this, null);
	}

	public void unregisterModelListenerService() {
		if (modelListenerServiceReg == null) {
			throw new IllegalStateException();
		}
		else {
			modelListenerServiceReg.unregister();
		}
	}

	@Override
	public synchronized void newParameter(final Parameter<?> newParameter) {
		uniqueParameters.put(newParameter.getQualifiedName(), newParameter);
		parameters = new ArrayList<Parameter<?>>(uniqueParameters.values());
		propChangeSupport.firePropertyChange("parameters", null, parameters);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.hbird.rcpgui.tvtable.model.ParameterModel#getParameters()
	 */
	@Override
	public List<Parameter<?>> getParameters() {
		return parameters;
	}

}

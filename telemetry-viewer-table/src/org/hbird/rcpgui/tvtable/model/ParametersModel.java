package org.hbird.rcpgui.tvtable.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.parameterlistener.serviceinterfaces.NewParameterListener;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ParametersModel implements NewParameterListener {

	private final PropertyChangeSupport propChangeSupport = new PropertyChangeSupport(this);

	// TODO move to configuration
	private final int defaultCapacity = 500;

	private final Queue<Parameter<?>> parameterQueue = new ArrayBlockingQueue<Parameter<?>>(defaultCapacity);

	private volatile ServiceRegistration modelListenerServiceReg;

	private List<Parameter<?>> parameters;

	@SuppressWarnings("unused")
	// private, only construct with BundleContext
	private ParametersModel() {
	}

	public ParametersModel(final BundleContext context) {
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
		if (!parameterQueue.offer(newParameter)) {
			parameterQueue.poll();
		}
		parameterQueue.add(newParameter);
		parameters = new ArrayList<Parameter<?>>(parameterQueue);
		propChangeSupport.firePropertyChange("parameters", null, parameters);
	}


	public List<Parameter<?>> getParameters() {
		return parameters;
	}

	public void addPropertyChangeListener(final PropertyChangeListener listener) {
		this.propChangeSupport.addPropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		this.propChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(final PropertyChangeListener listener) {
		this.propChangeSupport.removePropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		this.propChangeSupport.removePropertyChangeListener(propertyName, listener);
	}



}

package org.hbird.rcpgui.parameterlistener.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.parameterlistener.interfaces.NewParameterListener;

public class DefaultQueueParameterModel implements NewParameterListener {
	private final PropertyChangeSupport propChangeSupport = new PropertyChangeSupport(this);

	// TODO move to configuration
	private final int defaultCapacity = 500;

	private final Queue<Parameter<?>> parameterQueue = new ArrayBlockingQueue<Parameter<?>>(defaultCapacity);


	private List<Parameter<?>> parameters;

	@Override
	public synchronized void newParameter(final Parameter<?> newParameter) {
		System.out.println("Parameter received: " + newParameter.getName());
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

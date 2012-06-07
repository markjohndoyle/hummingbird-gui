package org.hbird.rcpgui.commons.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.parameterlistener.serviceinterfaces.NewParameterListener;

public class CappedQueueParameterModel extends PropertyChangeModel implements NewParameterListener {
	// TODO move to configuration
	private final int defaultCapacity = 500;

	private final Queue<Parameter<?>> parameterQueue = new ArrayBlockingQueue<Parameter<?>>(defaultCapacity);

	private List<Parameter<?>> parameters;

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

}

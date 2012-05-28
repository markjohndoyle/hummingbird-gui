package org.hbird.rcpgui.tvtable.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.parameterlistener.serviceinterfaces.NewParameterListener;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class LiveParametersModel extends PropertyChangeModel implements NewParameterListener, ParameterModel {

	// TODO move to configuration
	private final int defaultCapacity = 500;

	private final Queue<Parameter<?>> parameterQueue = new ArrayBlockingQueue<Parameter<?>>(defaultCapacity);

	private volatile ServiceRegistration modelListenerServiceReg;

	private List<Parameter<?>> parameters;

	@SuppressWarnings("unused") // private, only construct with BundleContext
	private LiveParametersModel() {
	}

	public LiveParametersModel(final BundleContext context) {
		registerModelListenerService(context);
	}

	public void registerModelListenerService(final BundleContext context) {
		final Properties metadata = new Properties();
		metadata.setProperty("tmType", "Live");
		modelListenerServiceReg = context.registerService(NewParameterListener.class.getName(), this, metadata);
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


	/* (non-Javadoc)
	 * @see org.hbird.rcpgui.tvtable.model.ParameterModel#getParameters()
	 */
	@Override
	public List<Parameter<?>> getParameters() {
		return parameters;
	}


}

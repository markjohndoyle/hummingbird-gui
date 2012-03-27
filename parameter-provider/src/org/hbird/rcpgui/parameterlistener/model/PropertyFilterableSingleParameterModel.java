package org.hbird.rcpgui.parameterlistener.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.parameterlistener.serviceinterfaces.NewParameterListener;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * Stores the last parameter received and fire property change events to listeners.
 * Supports property based filtering on the incoming Parameter<?> object.
 *
 * @author Mark Doyle
 *
 */
public class PropertyFilterableSingleParameterModel extends PropertyChangeModel implements PropertyFilterableNewParameterListener {

	/** Last parameter received that passed the filter check */
	private Parameter<?> latestParameter = null;

	/** A Map of pojo property filters keyed to multiple filter value objects */
	Map<String, List<Object>> filters;

	private ServiceRegistration modelListenerServiceReg;

	/**
	 * Simply constructs the model. This allows developers to use a framework such
	 * as Spring DM to register and manage the mdoel as an OSGi service. The model
	 * could also be used as a pojo.
	 */
	public PropertyFilterableSingleParameterModel() {
	}

	/**
	 * Constructs and registers the mode with the OGSi container.
	 *
	 * TODO consider leaving this service management to the client class. Does it need to register itself?
	 * Ok it could be considered convenient but the class is beginning to violate SRP!
	 * @param context
	 */
	public PropertyFilterableSingleParameterModel(final BundleContext context) {
		registerService(context);
	}

	// TODO can go private?
	public void registerService(final BundleContext context) {
		modelListenerServiceReg = context.registerService(NewParameterListener.class.getName(), this, null);
	}

	// Can go private?
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
		boolean accept = true;

		if (filters != null && filters.size() > 0) {
			accept = false;
			for (String property : filters.keySet()) {
				try {
					List<Object> filterValues = filters.get(property);
					property = WordUtils.capitalize(property);
					Method method = Parameter.class.getMethod("get" + property, null);
					Object newValue = method.invoke(newParameter, null);
					for (Object filterValue : filterValues) {
						if (newValue.equals(filterValue)) {
							accept = true;
						}
					}
				}
				catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		if (accept) {
			this.latestParameter = newParameter;
			propChangeSupport.firePropertyChange("latestParameter", null, latestParameter);
		}
	}

	@Override
	public final void addFilter(final String property, final Object value) {
		if (filters == null) {
			filters = new HashMap<String, List<Object>>();
		}
		if (filters.get(property) != null) {
			filters.get(property).add(value);
		}
		else {
			ArrayList<Object> firstAddition = new ArrayList<Object>();
			firstAddition.add(value);
			filters.put(property, firstAddition);
		}
	}

	public Parameter<?> getLatestParameter() {
		return latestParameter;
	}
}

package org.hbird.rcpgui.parameterlistener.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.parameterlistener.serviceinterfaces.NewParameterListener;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PropertyFilterableSingleParameterModel extends PropertyChangeModel implements PropertyFilterableNewParameterListener {

	private Parameter<?> latestParameter = null;

	Map<String, Object> filters;

	private ServiceRegistration modelListenerServiceReg;

	public PropertyFilterableSingleParameterModel() {
	}

	public PropertyFilterableSingleParameterModel(final BundleContext context) {
		registerService(context);
	}

	public void registerService(final BundleContext context) {
		modelListenerServiceReg = context.registerService(NewParameterListener.class.getName(), this, null);
		System.out.println("Service registered");
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
		boolean accept = true;

		if(filters != null && filters.size() > 0) {
			accept = false;
			for(String property : filters.keySet()) {
				try {
					Object filterValue = filters.get(property);
					property = WordUtils.capitalize(property);
					Method method = Parameter.class.getMethod("get" + property, null);
					Object newValue = method.invoke(newParameter, null);
					if(newValue.equals(filterValue)) {
						accept = true;
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

		if(accept) {
			this.latestParameter = newParameter;
			propChangeSupport.firePropertyChange("latestParameter", null, latestParameter);
		}
	}

	@Override
	public final void addFilter(final String property, final Object value) {
		if(filters == null) {
			filters = new HashMap<String, Object>();
		}
		filters.put(property, value);
	}

	public Parameter<?> getLatestParameter() {
		return latestParameter;
	}
}

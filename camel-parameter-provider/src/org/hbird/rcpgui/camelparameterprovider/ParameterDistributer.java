package org.hbird.rcpgui.camelparameterprovider;

import java.util.Iterator;
import java.util.List;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.core.commons.tmtc.ParameterGroup;
import org.hbird.rcpgui.parameterlistener.interfaces.NewParameterListener;

/**
 * Receives new {@link Parameter}s contained in {@link ParameterGroup}s and distributes
 * them to 0..* {@link NewParameterListener}s registered in the OSGi context.
 * <p>
 * The Spring files are located in META-INF/spring as is the convention.
 *
 * @author Mark Doyle
 */
public class ParameterDistributer {
	/**
	 * The new parameter whiteboard. All new parameter listener services registered
	 * in the OSGi registry. This is injected and kept up to date by Spring DM.
	 */
	List<NewParameterListener> newParameterListenerServices;

	public void parameterIn(final ParameterGroup parametergroup) {
		if (parametergroup == null) {
			System.out.println("[WARN] - Received null parameter");
			return;
		}

		// For every parameter received, create a visitor and send to all registered
		// newParameterListener services, i.e, those on the "whiteboard".
		for (final Parameter<?> parameter : parametergroup.getAllParameters().values()) {
			Iterator<NewParameterListener> listeners = newParameterListenerServices.iterator();
			while(listeners.hasNext()) {
				listeners.next().newParameter(parameter);
			}
		}
	}

	/**
	 * Used by Spring DM to inject and update the list of registered {@link NewParameterListener}
	 * services, i.e., the listener whiteboard.
	 *
	 * @param newParameterListenerServices
	 */
	public void setNewParameterListenerServices(final List<NewParameterListener> newParameterListenerServices) {
		this.newParameterListenerServices = newParameterListenerServices;
	}
}

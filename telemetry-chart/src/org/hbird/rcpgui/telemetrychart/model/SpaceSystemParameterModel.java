package org.hbird.rcpgui.telemetrychart.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.core.commons.tmtc.ParameterGroup;
import org.hbird.rcpgui.ssprequester.interfaces.SpaceSystemPublisherRequester;

public class SpaceSystemParameterModel {

	private final PropertyChangeSupport propChangeSupport = new PropertyChangeSupport(this);

	private SpaceSystemPublisherRequester sspRequester;

	private final Set<Parameter<?>> parameters = new HashSet<Parameter<?>>();

	public Set<Parameter<?>> getParameters() {
		return parameters;
	}

	public void syncWithSpaceSystemPublisher() {
		List<ParameterGroup> parameterGroups = sspRequester.requestParameterGroups();
		for(ParameterGroup pg : parameterGroups) {
			for(Parameter<?> parameter : pg.getAllParameters().values()) {
				parameters.add(parameter);
			}
		}
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

	public void setSspRequester(final SpaceSystemPublisherRequester sspRequester) {
		this.sspRequester = sspRequester;
	}
}

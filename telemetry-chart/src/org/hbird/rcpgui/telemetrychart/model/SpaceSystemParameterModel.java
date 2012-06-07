package org.hbird.rcpgui.telemetrychart.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.core.commons.tmtc.ParameterGroup;
import org.hbird.rcpgui.commons.model.PropertyChangeModel;
import org.hbird.rcpgui.ssprequester.interfaces.AsyncPublisherRequestListener;
import org.hbird.rcpgui.ssprequester.interfaces.SpaceSystemPublisherRequester;
import org.springframework.beans.factory.annotation.Autowired;

public class SpaceSystemParameterModel extends PropertyChangeModel implements AsyncPublisherRequestListener {

	@Autowired
	private SpaceSystemPublisherRequester sspRequester;

	private final Set<Parameter<?>> parameters = new HashSet<Parameter<?>>();

	public Set<Parameter<?>> getParameters() {
		return parameters;
	}

	public void syncWithSpaceSystemPublisher() {
		sspRequester.asyncRequestParameterGroups(this);
	}

	@Override
	public void publisherRequestComplete(final Object requestResult) {
		System.out.println("Request complete");
		@SuppressWarnings("unchecked")
		List<ParameterGroup> parameterGroups = (List<ParameterGroup>) requestResult;
		for (ParameterGroup pg : parameterGroups) {
			for (Parameter<?> parameter : pg.getAllParameters().values()) {
				parameters.add(parameter);
			}
		}
		this.propChangeSupport.firePropertyChange("parameters", null, parameters);
	}

	@Override
	public void publisherRequestFailed() {
		System.out.println("Request Failed - TODO set boolean and let gui act as required");
	}

	public void setSspRequester(final SpaceSystemPublisherRequester sspRequester) {
		this.sspRequester = sspRequester;
	}
}

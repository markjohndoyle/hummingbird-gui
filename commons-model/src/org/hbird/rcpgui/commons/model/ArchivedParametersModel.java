package org.hbird.rcpgui.commons.model;

import java.util.List;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.archivedparameterprovider.interfaces.ArchivedParameterProvider;
import org.joda.time.DateTime;

public class ArchivedParametersModel extends PropertyChangeModel implements ParameterModel {

	private ArchivedParameterProvider archivedParameterRetrievalService;

	private List<Parameter<?>> parameters;

	@SuppressWarnings({ "unchecked", "rawtypes" }) // type erasure issues stemming from type erasure problem up at the mongodb template.
	public void getParametersByQualifiedName(final String qualifiedName, final int numberOfParameters) {
		List<Parameter> results = archivedParameterRetrievalService.getParametersByQualifiedName(qualifiedName, numberOfParameters);
		parameters = (List)results;
	}

	public void getParametersByReceivedTime(final DateTime startTime, final DateTime endTime, final int numberOfParameters) {
	}

	@Override
	public List<Parameter<?>> getParameters() {
		return parameters;
	}

	public void setArchivedParameterRetrievalService(final ArchivedParameterProvider archivedParameterRetrievalService) {
		this.archivedParameterRetrievalService = archivedParameterRetrievalService;
	}

}

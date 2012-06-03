package org.hbird.rcpgui.commons.model;

import java.util.List;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.archivedparameterprovider.interfaces.ArchivedParameterProvider;
import org.joda.time.DateTime;

public class ArchivedParametersModel extends PropertyChangeModel implements ParameterModel, ArchiveModel {

	private ArchivedParameterProvider archivedParameterRetrievalService;

	private ArchiveParameterFilterSettings filters;

	private List<Parameter<?>> parameters;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	// type erasure issues stemming from type erasure problem up at the mongodb template.
	public void getParametersByQualifiedName(final String qualifiedName, final int numberOfParameters) {
		final List<Parameter> results = archivedParameterRetrievalService.getParametersByQualifiedName(qualifiedName, numberOfParameters);
		parameters = (List) results;
	}

	public void getParametersByReceivedTime(final DateTime startTime, final DateTime endTime, final int numberOfParameters) {
	}

	// type erasure issues stemming from type erasure problem up at the mongodb template.
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void findByReceivedTimeBetween(final DateTime startTime, final DateTime endTime, final int numberOfParameters) {
		final List<Parameter> results = archivedParameterRetrievalService.findByReceivedTimeBetween(startTime.getMillis(), endTime.getMillis(), 0, 100);
		parameters = (List) results;
		propChangeSupport.firePropertyChange("parameters", null, parameters);
	}

	private void updateFromArchive() {
		if (filters.useTimefilter) {
			System.out.println("Requesting parameters by time range");
			findByReceivedTimeBetween(filters.fromTime, filters.toTime, 1000);
		}
	}

	@Override
	public void updateFilters(final ArchiveParameterFilterSettings newFilters) {
		filters = newFilters;
		updateFromArchive();
	}

	@Override
	public List<Parameter<?>> getParameters() {
		return parameters;
	}

	public void setArchivedParameterRetrievalService(final ArchivedParameterProvider archivedParameterRetrievalService) {
		this.archivedParameterRetrievalService = archivedParameterRetrievalService;
	}
}

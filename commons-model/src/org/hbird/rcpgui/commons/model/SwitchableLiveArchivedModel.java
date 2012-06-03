/**
 *
 */
package org.hbird.rcpgui.commons.model;

import java.util.List;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.archivedparameterprovider.interfaces.ArchivedParameterProvider;
import org.joda.time.DateTime;
import org.osgi.framework.BundleContext;

/**
 * @author Mark Doyle
 *
 */
public class SwitchableLiveArchivedModel extends LiveParametersModel implements LiveArchivedSwitchableModel {

	private ArchivedParameterProvider archivedParameterRetrievalService;

	private List<Parameter<?>> parameters;

	private boolean archiveMode = false;

	private ArchiveParameterFilterSettings filters;

	public SwitchableLiveArchivedModel(final BundleContext context) {
		super(context);
	}

	// type erasure issues stemming from type erasure problem up at the mongodb template.
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void updateParametersByQualifiedName(final String qualifiedName, final int numberOfParameters) {
		List<Parameter> results = archivedParameterRetrievalService.getParametersByQualifiedName(qualifiedName, numberOfParameters);
		parameters = (List) results;
		propChangeSupport.firePropertyChange("parameters", null, parameters);
	}

	// type erasure issues stemming from type erasure problem up at the mongodb template.
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void updateParametersByReceivedTime(final DateTime startTime, final DateTime endTime, final int numberOfParameters) {
		// List<Parameter> results = archivedParameterRetrievalService.getParametersByReceivedTime(startTime, endTime,
		// numberOfParameters);
		List<Parameter> results = archivedParameterRetrievalService.findByReceivedTimeBetween(startTime.getMillis(), endTime.getMillis(), 0, 100);
		parameters = (List) results;
		propChangeSupport.firePropertyChange("parameters", null, parameters);
	}

	@Override
	public List<Parameter<?>> getParameters() {
		if (archiveMode) {
			System.out.println("returning archived parameters");
			return parameters;
		}
		else {
			System.out.println("returning live parameters");
			return super.getParameters();
		}
	}

	public void setArchivedParameterRetrievalService(final ArchivedParameterProvider archivedParameterRetrievalService) {
		this.archivedParameterRetrievalService = archivedParameterRetrievalService;
	}

	public void setArchiveMode(final boolean archiveMode) {
		this.archiveMode = archiveMode;
	}

	@Override
	public void switchModel(final MODEL model) {
		switch (model) {
			case LIVE:
				archiveMode = false;
				propChangeSupport.firePropertyChange("parameters", null, parameters);
				break;
			case ARCHIVE:
				archiveMode = true;
				propChangeSupport.firePropertyChange("parameters", null, parameters);
				break;
			default:
				propChangeSupport.firePropertyChange("parameters", null, parameters);
				archiveMode = false;
		}
	}

	private void updateFromArchive() {
		if (filters.useTimefilter) {
			System.out.println("Requesting parameters by time range");
			updateParametersByReceivedTime(filters.fromTime, filters.toTime, 1000);
		}
	}

	@Override
	public void updateFilters(final ArchiveParameterFilterSettings newFilters) {
		filters = newFilters;
		updateFromArchive();
	}

}

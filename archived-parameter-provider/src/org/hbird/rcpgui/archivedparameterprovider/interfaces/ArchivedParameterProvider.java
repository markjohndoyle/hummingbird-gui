package org.hbird.rcpgui.archivedparameterprovider.interfaces;

import java.util.List;

import org.hbird.core.commons.tmtc.Parameter;
import org.joda.time.DateTime;

public interface ArchivedParameterProvider {

	List<Parameter> getParametersByQualifiedName(String QualifiedName, int numberOfParameters);

	List<Parameter> getParametersByDescription(String description, int numberOfParameters);

	List<Parameter> getParametersByReceivedTime(DateTime startTime, DateTime endTime, int numberOfParameters);

	List<Parameter> findByReceivedTimeBetween(long startDate, long endDate, int page, int numberOfParameters);
}

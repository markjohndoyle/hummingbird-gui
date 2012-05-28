package org.hbird.rcpgui.archivedparameterprovider.provided;

import java.util.List;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.archivedparameterprovider.interfaces.ArchivedParameterProvider;
import org.joda.time.DateTime;

public class ConfigurableArchivedParameterProvider implements ArchivedParameterProvider {

	@Produce(uri = "activemq:requestArchivedParametersByQualifiedName?exchangePattern=InOut")
	ProducerTemplate archivedParameterServiceByQualifiedName;

	@Produce(uri = "activemq:requestArchivedParametersByReceivedTime?exchangePattern=InOut")
	ProducerTemplate archivedParameterServiceByReceivedTime;

	@SuppressWarnings({ "rawtypes", "unchecked" }) // Unavoidable type erasure issues.
	@Override
	public List<Parameter> getParametersByQualifiedName(final String qualifiedName, final int numberOfParameters) {
		List<Parameter> results;

		final Object args = qualifiedName;
		results = archivedParameterServiceByQualifiedName.requestBody(args, List.class);

		return results;
	}

	@SuppressWarnings({ "rawtypes" }) // Unavoidable type erasure issues.
	@Override
	public List<Parameter> getParametersByDescription(final String description, final int numberOfParameters) {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" }) // Unavoidable type erasure issues.
	@Override
	public List<Parameter> getParametersByReceivedTime(final DateTime startTime, final DateTime endTime, final int numberOfParameters) {
		final Object[] args = null;
		args[0] = startTime;
		args[1] = endTime;

		List<Parameter> results;

		results = archivedParameterServiceByReceivedTime.requestBody(args, List.class);

		return results;
	}

}

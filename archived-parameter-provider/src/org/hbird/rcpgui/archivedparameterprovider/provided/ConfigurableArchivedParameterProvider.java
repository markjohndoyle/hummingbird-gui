package org.hbird.rcpgui.archivedparameterprovider.provided;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.archivedparameterprovider.interfaces.ArchivedParameterProvider;
import org.joda.time.DateTime;

public class ConfigurableArchivedParameterProvider implements ArchivedParameterProvider {

	@Produce(uri = "activemq:requestArchivedParametersByQualifiedName?exchangePattern=InOut&replyToDeliveryPersistent=false")
	ProducerTemplate archivedParameterServiceByQualifiedName;

	@Produce(uri = "activemq:requestArchivedParametersByReceivedTime?exchangePattern=InOut&replyToDeliveryPersistent=false")
	ProducerTemplate archivedParameterServiceByReceivedTime;

	@Produce(uri = "activemq:findByReceivedTimeBetween?exchangePattern=InOut&replyToDeliveryPersistent=false")
	ProducerTemplate findByReceivedTimeBetweenService;

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
		System.out.println("Sending request to archive service");
		final Date[] args = new Date[2];
		args[0] = startTime.toDate();
		args[1] = endTime.toDate();
		List<Parameter> results;
		results = archivedParameterServiceByReceivedTime.requestBody(args, List.class);
		return results;
	}

	@Override
	public List<Parameter> findByReceivedTimeBetween(final long startDate, final long endDate, final int page, final int numberOfParameters) {
		System.out.println("Sending request to archive service - " + page + ":" + numberOfParameters);
		List<Object> args = new ArrayList<Object>();
		args.add(startDate);
		args.add(endDate);
		args.add(page);
		args.add(numberOfParameters);
		List<Parameter> results;
		results = findByReceivedTimeBetweenService.requestBody(args, List.class);
		return results;
	}

}

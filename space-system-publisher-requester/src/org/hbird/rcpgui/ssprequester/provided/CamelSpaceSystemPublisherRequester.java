package org.hbird.rcpgui.ssprequester.provided;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.CamelExecutionException;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.hbird.core.commons.tmtc.ParameterGroup;
import org.hbird.rcpgui.ssprequester.interfaces.SpaceSystemPublisherRequester;

/**
 * Camel implementation of the {@link SpaceSystemPublisherRequester} interface.
 *
 * Producer template can be injected by Camel as long as this POJO is created by your
 * IOC framework, e.g. Spring.
 *
 * TODO more detail.
 *
 * @author Mark Doyle
 *
 */
public class CamelSpaceSystemPublisherRequester implements SpaceSystemPublisherRequester {

	@Produce(uri = "activemq:requestParameterGroups?exchangePattern=InOut")
	ProducerTemplate requestParameterGroupsProducerTemplate;

	@SuppressWarnings("unchecked") // JMS returns object for objectMessage so cast is necessary. Service guarantees type.
	@Override
	public List<ParameterGroup> requestParameterGroups() {
		List<ParameterGroup> parameterGroups;
		try {
			parameterGroups = (List<ParameterGroup>) requestParameterGroupsProducerTemplate.requestBody(null);
		}
		catch (CamelExecutionException e) {
			System.err.println("Could not retrieve a list of telemetry parameters from the space system model publisher");
			parameterGroups = new ArrayList<ParameterGroup>(0);
		}
		return parameterGroups;
	}

}

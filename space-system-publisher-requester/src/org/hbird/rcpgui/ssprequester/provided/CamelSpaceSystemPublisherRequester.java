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
 * Producer template will be injected by Camel as long as this POJO is created by your
 * IOC framework, e.g. Spring.
 *
 * TODO more detail.
 *
 * @author Mark Doyle
 *
 */
public class CamelSpaceSystemPublisherRequester implements SpaceSystemPublisherRequester {

	// TODO move to configuration, plugin preferences/config
	@Produce(uri = "activemq:requestParameterGroups?exchangePattern=InOut")
	ProducerTemplate requestParameterGroupsProducerTemplate;

	// TODO move to configuration, plugin preferences/config
	@Produce(uri = "activemq:requestCommands?exchangePattern=InOut")
	ProducerTemplate requestCommandsProducerTemplate;

	/**
	 * Calls the getParameterGroups service on the space system model. This is achieved via a request response
	 * exchange set up as a ProducerTemplate. The ProduceTemplate wire to connect to where ever the
	 * space system publisher listens for requests. Completely decoupled!
	 */
	@Override
	@SuppressWarnings("unchecked") // JMS returns object for objectMessage so cast is necessary. Service guarantees type.
	public List<ParameterGroup> requestParameterGroups() {
		List<ParameterGroup> parameterGroups;
		try {
			parameterGroups = (List<ParameterGroup>) requestParameterGroupsProducerTemplate.requestBody(null);
		}
		catch (final CamelExecutionException e) {
			System.err.println("Could not retrieve a list of telemetry parameters from the space system model publisher");
			parameterGroups = new ArrayList<ParameterGroup>(0);
		}
		return parameterGroups;
	}

	@Override
	@SuppressWarnings("unchecked") // JMS returns object for objectMessage so cast is necessary. Service guarantees type.
	public List<ParameterGroup> requestCommands() {
		List<ParameterGroup> parameterGroups;
		try {
			parameterGroups = (List<ParameterGroup>) requestCommandsProducerTemplate.requestBody(null);
		}
		catch (final CamelExecutionException e) {
			System.err.println("Could not retrieve a list of telemetry parameters from the space system model publisher");
			parameterGroups = new ArrayList<ParameterGroup>(0);
		}
		return parameterGroups;
	}

}

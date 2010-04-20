/**
 * 
 */
package com.logica.hummingbird.cameltmframeprovider;

import java.util.List;

import javax.jms.ConnectionFactory;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

import com.logica.hummingbird.framebroker.IContainer;
import com.logica.hummingbird.tmframeprovider.IFrameProvider;

/**
 * @author Mark Doyle
 * TODO implement camel context and route to get messages from a camel supported location.
 *
 */
public class CamelTmFrameProvider implements IFrameProvider {
	
	ConnectionFactory connectionFactory;
	CamelContext camelContext;
	
	public CamelTmFrameProvider() {
	}

	
	public CamelTmFrameProvider(String activeMqBrokerUrl) {
		camelContext = new DefaultCamelContext();
//		connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
		
	}
	


	/* (non-Javadoc)
	 * @see com.logica.hummingbird.tmframeprovider.IFrameProvider#getTmMessages()
	 */
	@Override
	public List<Object> getTmMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFrameProviderName() {
		return "Camel";
	}

	@Override
	public IContainer getFrame() {
		// TODO Auto-generated method stub
		return null;
	}

}

/**
 * 
 */
package com.logica.hummingbird.cameltmframeprovider;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;

import com.logica.hummingbird.framebroker.IContainer;
import com.logica.hummingbird.tmframeprovider.IFrameProvider;

/**
 * @author Mark Doyle TODO implement camel context and route to get messages
 *         from a camel supported location.
 * 
 */
public class CamelTmFrameProvider implements IFrameProvider {
	
	List<IContainer> receivedFrames;

	public CamelTmFrameProvider() {
		System.out.println("Constructing camel provider class - Spring container must be alive!");
	}

	public void frameIn(Exchange ex) {
		System.out.println("Message received!");
		if(receivedFrames == null) {
			this.receivedFrames = new ArrayList<IContainer>();
		}
		
		System.out.println(ex.toString());
	}

	@Override
	public String getFrameProviderName() {
		return "Camel";
	}

	@Override
	public IContainer getLatestFrame() {
		// TODO Auto-generated method stub
		return null;
	}

}

/**
 * 
 */
package com.logica.hummingbird.framebrokerviewer;

import java.util.List;

import com.logica.hummingbird.cameltmframeprovider.CamelTmFrameProvider;
import com.logica.hummingbird.tmframeprovider.IFrameProvider;

/**
 * @author Mark Doyle
 *
 */
public class TmFrameReceiver  {
	
	IFrameProvider frameProvider;

	public TmFrameReceiver(IFrameProvider provider) {
		this.frameProvider = provider;
		IFrameProvider prov = new CamelTmFrameProvider();
		System.out.println(prov.getFrameProviderName());
	}
	
	public List<Object> getTmMessages() {
		return frameProvider.getTmMessages();
	}

}

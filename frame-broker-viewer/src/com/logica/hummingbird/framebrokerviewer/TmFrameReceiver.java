/**
 * TODO Class is pointless so far.  This could act as a proxy to give multiple views access to the same provider...
 * I'll have to think on it.  
 */
package com.logica.hummingbird.framebrokerviewer;

import java.util.List;

import com.logica.hummingbird.tmframeprovider.IFrameProvider;

/**
 * @author Mark Doyle
 *
 */
public class TmFrameReceiver  {
	
	IFrameProvider frameProvider;

	public TmFrameReceiver() {
//		this.frameProvider = provider;
		
		
		
		
	}
	
	public List<Object> getTmMessages() {
		return frameProvider.getTmMessages();
	}

}

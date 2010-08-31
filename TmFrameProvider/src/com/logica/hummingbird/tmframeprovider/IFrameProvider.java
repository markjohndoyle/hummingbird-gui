package com.logica.hummingbird.tmframeprovider;

import com.logica.hummingbird.spacesystemmodel.Container;

// FIXME Change to event driven model. Scrap existing interface.
public interface IFrameProvider {
	
	String getFrameProviderName();
	
	Container getLatestFrame();
}

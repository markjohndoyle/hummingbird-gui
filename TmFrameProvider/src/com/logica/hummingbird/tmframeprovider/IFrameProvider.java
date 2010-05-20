package com.logica.hummingbird.tmframeprovider;

import com.logica.hummingbird.framebroker.IContainer;

public interface IFrameProvider {
	
	String getFrameProviderName();
	
	IContainer getLatestFrame();
}

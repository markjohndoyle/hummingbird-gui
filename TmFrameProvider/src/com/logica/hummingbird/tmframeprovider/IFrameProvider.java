package com.logica.hummingbird.tmframeprovider;

import java.util.List;

import com.logica.hummingbird.framebroker.IContainer;

public interface IFrameProvider {
	
	String getFrameProviderName();
	
	List<Object> getTmMessages();
	
	IContainer getFrame();
}

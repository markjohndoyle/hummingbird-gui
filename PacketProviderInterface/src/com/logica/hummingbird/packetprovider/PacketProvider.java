package com.logica.hummingbird.packetprovider;

import com.logica.hummingbird.packetprovider.PacketProviderObserver;


public interface PacketProvider {

	void addObserver(PacketProviderObserver observer);
}

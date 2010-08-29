package com.logica.hummingbird.packetprovider;

import com.logica.hummingbird.telemetry.HummingbirdPacket;

public interface PacketProvider {
	
	HummingbirdPacket getPacket();
}

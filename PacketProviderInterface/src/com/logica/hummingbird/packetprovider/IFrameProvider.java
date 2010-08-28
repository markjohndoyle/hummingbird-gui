package com.logica.hummingbird.packetprovider;

import com.logica.hummingbird.telemetry.HummingbirdPacket;

public interface IFrameProvider {
	
	HummingbirdPacket getPacket();
}

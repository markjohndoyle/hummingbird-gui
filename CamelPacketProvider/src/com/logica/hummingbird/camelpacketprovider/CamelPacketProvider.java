package com.logica.hummingbird.camelpacketprovider;

import java.util.Observable;

import org.apache.camel.Exchange;

import com.logica.hummingbird.telemetry.HummingbirdPacket;
import com.logica.hummingbird.telemetry.Packet;


public class CamelPacketProvider extends Observable {

	public void packetIn(Exchange ex) {
		
		HummingbirdPacket packet = new Packet();
	
		notifyObservers(ex.getIn().getBody());
	}

}

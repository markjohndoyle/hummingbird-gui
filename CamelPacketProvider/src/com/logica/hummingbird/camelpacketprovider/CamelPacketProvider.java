package com.logica.hummingbird.camelpacketprovider;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;

import com.logica.hummingbird.packetprovider.PacketProvider;
import com.logica.hummingbird.packetprovider.PacketProviderObserver;
import com.logica.hummingbird.telemetry.HummingbirdPacket;
import com.logica.hummingbird.telemetry.Packet;
import com.logica.hummingbird.util.BytesUtility;

public class CamelPacketProvider implements PacketProvider {
	
	List<PacketProviderObserver> observers = new ArrayList<PacketProviderObserver>(1);

	public void packetIn(Exchange ex) {
		byte[] inPacket = (byte[]) (ex.getIn().getBody());
		System.out.println("Received byte array " + BytesUtility.decimalDump(inPacket));
		HummingbirdPacket packet = new Packet();
		packet.setName("Testing Camel packet");
		notifyObservers(packet);
	}

	private void notifyObservers(HummingbirdPacket packet) {
		for(PacketProviderObserver o : observers) {
			o.packetReceived(packet);
		}
	}

	@Override
	public void addObserver(PacketProviderObserver observer) {
		observers.add(observer);
	}

}

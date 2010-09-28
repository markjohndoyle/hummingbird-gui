package com.logica.hummingbird.camelpacketprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.apache.camel.Exchange;

import com.logica.hummingbird.packetprovider.PacketProvider;
import com.logica.hummingbird.packetprovider.PacketProviderObserver;
import com.logica.hummingbird.telemetry.DefaultSpacePacket;
import com.logica.hummingbird.telemetry.HummingbirdPacket;


public class CamelPacketProvider implements PacketProvider {
	
	List<PacketProviderObserver> observers = new ArrayList<PacketProviderObserver>(1);
	Stack<HummingbirdPacket> packetBuffer = new Stack<HummingbirdPacket>();

	public void packetIn(Exchange ex) {
		HummingbirdPacket packet = new DefaultSpacePacket();

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

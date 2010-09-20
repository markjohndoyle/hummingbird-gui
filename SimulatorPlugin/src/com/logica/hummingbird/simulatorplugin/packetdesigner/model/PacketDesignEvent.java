package com.logica.hummingbird.simulatorplugin.packetdesigner.model;

import com.logica.hummingbird.telemetry.HummingbirdPacket;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

/**
 * 
 * @author Mark Doyle
 * 
 */
public class PacketDesignEvent {

	public enum EventType {
		PACKET_CHANGED, PARAMETER_ADDED, PARAMETER_REMOVED
	};

	private EventType type;
	private HummingbirdPacket packet = null;
	private HummingbirdParameter changedParameter = null;

	public PacketDesignEvent(EventType type, HummingbirdPacket packet) {
		this.type = type;
		this.packet = packet;
	}

	public PacketDesignEvent(EventType type, HummingbirdParameter parameter) {
		this.type = type;
		this.changedParameter = parameter;
	}

	public PacketDesignEvent(EventType type, HummingbirdPacket packet, HummingbirdParameter parameter) {
		this.type = type;
		this.changedParameter = parameter;
	}

	/**
	 * @return the packet
	 */
	public HummingbirdPacket getPacket() {
		return packet;
	}

	public HummingbirdParameter getChangedParameter() {
		return changedParameter;
	}

	public EventType getType() {
		return type;
	}

}

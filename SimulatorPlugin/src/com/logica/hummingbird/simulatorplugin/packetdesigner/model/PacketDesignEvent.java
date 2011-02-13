package com.logica.hummingbird.simulatorplugin.packetdesigner.model;

/**
 * 
 * @author Mark Doyle
 * 
 */
public class PacketDesignEvent {

	public enum EventType {
		PACKET_CHANGED, PARAMETER_ADDED, PARAMETER_REMOVED, PACKET_ADDED
	};

	private EventType type;
	private SimPacket packet = null;
	private SimParameter changedParameter = null;

	public PacketDesignEvent(EventType type, SimPacket newPacket) {
		this.type = type;
		this.packet = newPacket;
	}

	public PacketDesignEvent(EventType type, SimParameter parameter) {
		this.type = type;
		this.changedParameter = parameter;
	}

	public PacketDesignEvent(EventType type, SimPacket packet, SimParameter parameter) {
		this.type = type;
		this.changedParameter = parameter;
	}

	/**
	 * @return the packet
	 */
	public SimPacket getPacket() {
		return packet;
	}

	public SimParameter getChangedParameter() {
		return changedParameter;
	}

	public EventType getType() {
		return type;
	}

}

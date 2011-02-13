package com.logica.hummingbird.simulatorplugin.packetdesigner.model;

/**
 * This interface defines the contract any listener/observer of the {@link SimPacketDesign} model must implement.
 * 
 * @author Mark Doyle
 * 
 */
public interface PacketDesignListener {
	/**
	 * Called by the {@link SimPacketDesign} when it's Packet has changed.
	 * 
	 * The alteration is described by {@link PacketDesignEvent}
	 * 
	 * @param event
	 */
	public void packetChanged(PacketDesignEvent event);
}

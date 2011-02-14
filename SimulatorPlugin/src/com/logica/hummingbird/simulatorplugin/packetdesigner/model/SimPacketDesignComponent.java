package com.logica.hummingbird.simulatorplugin.packetdesigner.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable packet design component.
 * 
 * @author Mark Doyle
 * 
 */
public class SimPacketDesignComponent {

	private List<PacketDesignListener> observers = new ArrayList<PacketDesignListener>();

	public SimPacketDesignComponent() {
		super();
	}

	public final void addObserver(PacketDesignListener observer) {
		this.observers.add(observer);
	}

	public final void removeObserver(PacketDesignListener observer) {
		this.observers.remove(observer);
	}

	protected void notifyObservers(PacketDesignEvent event) {
		for (PacketDesignListener l : observers) {
			l.packetChanged(event);
		}
	}

}
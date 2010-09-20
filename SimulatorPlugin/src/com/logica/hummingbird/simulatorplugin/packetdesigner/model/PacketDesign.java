package com.logica.hummingbird.simulatorplugin.packetdesigner.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.views.properties.IPropertySource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesignEvent.EventType;
import com.logica.hummingbird.simulatorplugin.packetdesigner.propertysources.PacketDesignSource;
import com.logica.hummingbird.telemetry.HummingbirdPacket;
import com.logica.hummingbird.telemetry.HummingbirdParameter;

/**
 * Simply a wrapper around the HummingbirdPacket which is being designed, a Packet Design if you will.
 * 
 * This will eventually be upgraded to store layout/location info etc do commands will not have to reference the
 * EditParts directly.
 * 
 * @author Mark Doyle
 * 
 */
public class PacketDesign implements IAdaptable {

	private static PacketDesign instance = null;

	private HummingbirdPacket packet;

	private List<PacketDesignListener> observers = new ArrayList<PacketDesignListener>();

	private Gson gson;

	private IPropertySource propertySource = null;

	/**
	 * Private - Singleton
	 */
	private PacketDesign() {
	}

	public final void addObserver(PacketDesignListener observer) {
		this.observers.add(observer);
	}

	public final void removeObserver(PacketDesignListener observer) {
		this.observers.remove(observer);
	}

	public final static PacketDesign getInstance() {
		if (instance == null) {
			instance = new PacketDesign();
		}
		return instance;
	}

	public void setPacket(HummingbirdPacket packet) {
		this.packet = packet;
		notifyObservers(new PacketDesignEvent(EventType.PACKET_CHANGED, packet));
	}

	private void notifyObservers(PacketDesignEvent event) {
		for (PacketDesignListener l : observers) {
			l.packetChanged(event);
		}
	}

	public final void addParameter(HummingbirdParameter parameter) {
		this.packet.addParameter(parameter);
		notifyObservers(new PacketDesignEvent(EventType.PARAMETER_ADDED, packet, parameter));
		System.out.println(this.serialise());
	}

	public final void removeParameter(HummingbirdParameter parameter) {
		if (this.packet.getParameters().remove(parameter)) {
			notifyObservers(new PacketDesignEvent(EventType.PARAMETER_REMOVED, packet, parameter));
		}
		else {
			System.err.println("Parameter " + parameter.getName() + " does not exist in this packet");
		}
	}

	public HummingbirdPacket getPacket() {
		return packet;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Singleton!
		throw new CloneNotSupportedException("PacketDesign is a singleton - use getInstance for a reference");
	}

	/**
	 * TODO GSON not capable of serialising dynamically assigned classes, i.e. concrete implementations of interfaces .
	 * * @return
	 */
	public String serialise() {
		if (gson == null) {
			gson = new GsonBuilder().setPrettyPrinting().create();
		}
		return gson.toJson(this.packet);
	}

	@Override
	public Object getAdapter(Class adapter) {
		if(adapter == IPropertySource.class) {
			if(propertySource  == null) {
				propertySource = new PacketDesignSource(this);
			}
			return propertySource;
		}
		return null;
	}
}

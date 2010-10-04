package com.logica.hummingbird.simulatorplugin.packetdesigner.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.ui.views.properties.IPropertySource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.logica.hummingbird.simulatorplugin.SimulatorPlugin;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.PacketDesignEvent.EventType;
import com.logica.hummingbird.simulatorplugin.packetdesigner.propertysources.PacketDesignSource;
import com.logica.hummingbird.telemetry.HummingbirdPacket;

/**
 * Simply a wrapper around the HummingbirdPacket which is being designed, a Packet Design if you will.
 * 
 * This will eventually be upgraded to store layout/location info etc do commands will not have to reference the
 * EditParts directly.
 * 
 * @author Mark Doyle
 * 
 */
public class SimPacketDesign implements IAdaptable {

	public static final QualifiedName PACKET_PROPKEY = new QualifiedName(SimulatorPlugin.PLUGIN_ID, "packet");
	public static final String PACKET_PROPERTY = "Packet";

	private SimPacket packet;
	private List<SimParameter> parameters;

	private List<PacketDesignListener> observers = new ArrayList<PacketDesignListener>();

	private Gson gson;

	private IPropertySource propertySource = null;

	public final void addObserver(PacketDesignListener observer) {
		this.observers.add(observer);
	}

	public final void removeObserver(PacketDesignListener observer) {
		this.observers.remove(observer);
	}

	private void notifyObservers(PacketDesignEvent event) {
		for (PacketDesignListener l : observers) {
			l.packetChanged(event);
		}
	}

	public final String getPacketName() {
		return this.packet.getName();
	}

	public final void setPacketName(String name) {
		this.packet.setName(name);
		notifyObservers(new PacketDesignEvent(EventType.PACKET_CHANGED, packet));
	}

	public final void addParameter(SimParameter parameter) {
		this.packet.addParameter(parameter);
		notifyObservers(new PacketDesignEvent(EventType.PARAMETER_ADDED, packet, parameter));
		System.out.println(this.serialise());
	}

	public final void removeParameter(SimParameter parameter) {
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

	public void setPacket(SimPacket packet) {
		this.packet = packet;
//		setParameters(packet.getParameters());
		notifyObservers(new PacketDesignEvent(EventType.PACKET_CHANGED, packet));
	}

	public final void setParameters(List<SimParameter> parameters) {
		this.parameters = parameters;
	}

	public final List<SimParameter> getParameters() {
		return this.parameters;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	// @Override
	// protected Object clone() throws CloneNotSupportedException {
	// // Singleton!
	// throw new CloneNotSupportedException("PacketDesign is a singleton - use getInstance for a reference");
	// }

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
		if (adapter == IPropertySource.class) {
			if (propertySource == null) {
				propertySource = new PacketDesignSource(this);
			}
			return propertySource;
		}
		return null;
	}
}

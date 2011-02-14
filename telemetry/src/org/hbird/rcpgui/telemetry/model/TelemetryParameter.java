package org.hbird.rcpgui.telemetry.model;

import java.util.Date;

public class TelemetryParameter {

	String name;
	String shortDescription;
	String longDescription;
	Date spacecraftTimestamp;
	Object value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Date getSpacecraftTimestamp() {
		return spacecraftTimestamp;
	}

	public void setSpacecraftTimestamp(Date spacecraftTimestamp) {
		this.spacecraftTimestamp = spacecraftTimestamp;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}

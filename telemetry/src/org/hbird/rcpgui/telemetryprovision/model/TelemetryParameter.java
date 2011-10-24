package org.hbird.rcpgui.telemetryprovision.model;

import java.util.Date;
import java.util.Map;

public class TelemetryParameter {

	String name;
	String shortDescription;
	String longDescription;
	Date spacecraftTimestamp;
	String value;

	public TelemetryParameter(final Map<String, Object> properties, final Object value) {
		this.value = value.toString();
		this.name = (String) properties.get("ParameterName");
		this.shortDescription = (String) properties.get("ParameterShortDescription");
		this.longDescription = (String) properties.get("ParameterLongDescription");
	}

	public String getName() {
		return name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public Date getSpacecraftTimestamp() {
		return spacecraftTimestamp;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "TelemetryParameter [name=" + name + ", shortDescription=" + shortDescription + ", longDescription=" + longDescription
				+ ", spacecraftTimestamp=" + spacecraftTimestamp + ", value=" + value + "]";
	}

}

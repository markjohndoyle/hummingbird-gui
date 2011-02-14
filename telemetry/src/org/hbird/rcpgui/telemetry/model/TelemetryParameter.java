package org.hbird.rcpgui.telemetry.model;

import java.util.Date;
import java.util.Map;

public class TelemetryParameter {

	String name;
	String shortDescription;
	String longDescription;
	Date spacecraftTimestamp;
	Object value;
	Class<? extends Object> valueType;

	public TelemetryParameter(final Map<String, Object> properties, final Object value) {
		this.value = value;

		this.name = (String) properties.get("ParameterName");
		this.shortDescription = (String) properties.get("ParameterShortDescription");
		this.longDescription = (String) properties.get("ParameterLongDescription");
		this.valueType = (Class<? extends Object>) properties.get("ValueType");
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(final String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(final String longDescription) {
		this.longDescription = longDescription;
	}

	public Date getSpacecraftTimestamp() {
		return spacecraftTimestamp;
	}

	public void setSpacecraftTimestamp(final Date spacecraftTimestamp) {
		this.spacecraftTimestamp = spacecraftTimestamp;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(final Object value) {
		this.value = value;
	}

	/**
	 * @return the valueType
	 */
	public Class<? extends Object> getValueType() {
		return valueType;
	}

	/**
	 * @param valueType
	 *            the valueType to set
	 */
	public void setValueType(final Class<? extends Object> valueType) {
		this.valueType = valueType;
	}

}

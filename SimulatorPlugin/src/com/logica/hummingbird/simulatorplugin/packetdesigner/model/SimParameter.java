package com.logica.hummingbird.simulatorplugin.packetdesigner.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import com.logica.hummingbird.telemetry.HummingbirdParameter;

public class SimParameter implements HummingbirdParameter {

	// ----------------------------------------------------------------------
	// Model fields
	private String name;
	private Class<?> classType;
	private Object value;
	private String shortDescription = null;
	private String longDescription = null;

	public static final String NAME_PROPERTY = "name";
	public static final String CLASS_TYPE_PROPERTY = "classType";
	public static final String VALUE_PROPERTY = "value";
	public static final String SHORT_DESCRIPTION_PROPERTY = "shortDescription";
	public static final String LONG_DESCRIPTION_PROPERTY = "longDescription";

	PropertyChangeSupport propertyChangeSupport;

	public SimParameter(String name, Class<?> clazz, Object value) {
		this.name = name;
		this.classType = clazz;
		this.value = value;
		this.shortDescription = "No description";
		this.longDescription = "No description";

		propertyChangeSupport = new PropertyChangeSupport(this);
	}

	public SimParameter(String name, Class<?> classType, Object value, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.classType = classType;
		this.value = value;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;

		propertyChangeSupport = new PropertyChangeSupport(this);
	}

	public SimParameter(HummingbirdParameter hParameter) {
		this.name = hParameter.getName();
		this.classType = hParameter.getClassType();
		this.value = hParameter.getValue();
		this.shortDescription = hParameter.getShortDescription();
		this.longDescription = hParameter.getLongDescription();

		propertyChangeSupport = new PropertyChangeSupport(this);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		this.propertyChangeSupport.removePropertyChangeListener(listener);
	}


	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * @param shortDescription
	 *            the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @param longDescription
	 *            the longDescription to set
	 */
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	@Override
	public String getLongDescription() {
		return longDescription;
	}

	@Override
	public Class<? extends Object> getClassType() {
		return classType;
	}

	/**
	 * @param classType
	 *            the classType to set
	 */
	public void setClassType(Class<?> classType) {
		this.classType = classType;
	}

	@Override
	public String getName() {
		return name;
	}
	
	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		String oldValue = this.name;
		this.name = name;
		propertyChangeSupport.firePropertyChange("name", oldValue, this.name);
	}

	@Override
	public String getShortDescription() {
		return shortDescription;
	}

	@Override
	public Object getValue() {
		return value;
	}

}

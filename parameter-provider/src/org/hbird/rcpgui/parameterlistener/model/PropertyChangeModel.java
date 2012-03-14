package org.hbird.rcpgui.parameterlistener.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeModel {
	protected final PropertyChangeSupport propChangeSupport = new PropertyChangeSupport(this);

	public void addPropertyChangeListener(final PropertyChangeListener listener) {
		this.propChangeSupport.addPropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		this.propChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(final PropertyChangeListener listener) {
		this.propChangeSupport.removePropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		this.propChangeSupport.removePropertyChangeListener(propertyName, listener);
	}
}

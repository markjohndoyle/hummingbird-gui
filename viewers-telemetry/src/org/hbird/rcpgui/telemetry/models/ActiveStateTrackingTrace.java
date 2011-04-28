package org.hbird.rcpgui.telemetry.models;

import info.monitorenter.gui.chart.ITrace2D;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ActiveStateTrackingTrace {

	/** Provides property change detection support */
	private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	/** The trace which is being tracked */
	private final ITrace2D trace;

	/** Whether the trace is active or not */
	private boolean active;

	public ActiveStateTrackingTrace(final ITrace2D trace, final boolean active) {
		this.trace = trace;
		this.active = active;
	}

	public ITrace2D getTrace() {
		return trace;
	}

	public void setActive(final boolean active) {
		this.active = active;
	}

	public boolean isActive() {
		return active;
	}

	// Property change functionality ------------------------------------------------------
	public void addPropertyChangeListener(final PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(final PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
	}

	protected void firePropertyChange(final String propertyName, final Object oldValue, final Object newValue) {
		propertyChangeSupport.firePropertyChange(propertyName, oldValue, newValue);
	}
	// Property change functionality ------------------------------------------------------

}

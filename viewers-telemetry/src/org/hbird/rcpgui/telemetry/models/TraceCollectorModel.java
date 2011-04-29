package org.hbird.rcpgui.telemetry.models;

import info.monitorenter.gui.chart.ITrace2D;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

import org.hbird.rcpgui.telemetry.charting.ParameterDataCollector;
import org.hbird.rcpgui.telemetryprovision.model.AbstractPropChangeModelObject;
import org.hbird.rcpgui.telemetryprovision.model.ParameterSource;

public class TraceCollectorModel extends AbstractPropChangeModelObject {

	private SortedSet<ITrace2D> existingTraces;

	private Set<ParameterDataCollector> collectors = new HashSet<ParameterDataCollector>();

	public void setExistingTraces(final SortedSet<ITrace2D> existingTraces) {
		SortedSet<ITrace2D> oldValue = this.existingTraces;
		this.existingTraces = existingTraces;
		firePropertyChange("existingTraces", oldValue, this.existingTraces);
	}

	public SortedSet<ITrace2D> getExistingTraces() {
		return existingTraces;
	}

	public void setCollectors(final Set<ParameterDataCollector> collectors) {
		Set<ParameterDataCollector> oldValue = this.collectors;
		this.collectors = collectors;
		firePropertyChange("collectors", oldValue, this.collectors);
	}

	public Set<ParameterDataCollector> getCollectors() {
		return collectors;
	}

	public void addNewCollector(final ITrace2D trace, final int latency, final ParameterSource parameterSource, final String parameterName) {
		Set<ParameterDataCollector> oldValue = this.collectors;

		Set<ParameterDataCollector> newSet = new HashSet<ParameterDataCollector>(this.collectors);
		newSet.add(new ParameterDataCollector(trace, latency, parameterSource, parameterName));
		this.collectors = newSet;

		firePropertyChange("collectors", oldValue, this.collectors);
	}
}

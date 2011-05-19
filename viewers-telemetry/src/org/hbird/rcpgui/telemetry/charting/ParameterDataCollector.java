package org.hbird.rcpgui.telemetry.charting;

import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.ITracePoint2D;
import info.monitorenter.gui.chart.TracePoint2D;

import java.util.Map;

import org.hbird.rcpgui.telemetryprovision.model.ParameterSource;
import org.hbird.rcpgui.telemetryprovision.model.TelemetryParameter;

/**
 * Collects data from the parameter source for a specific parameter based upon it's name.
 * 
 * @author Mark Doyle
 * 
 */
public class ParameterDataCollector extends PropertyChange {
	private int counter = 0;
	private final String parameterName;
	private final ParameterSource parameterSource;
	private TracePoint2D lastTracePoint;
	private boolean tracing;

	public ParameterDataCollector(final ITrace2D trace, final long latency, final ParameterSource parameterSource, final String parameterName) {
		super(trace, latency);
		this.parameterName = parameterName;
		this.parameterSource = parameterSource;
	}

	@Override
	public ITracePoint2D collectData() {
		Map<String, TelemetryParameter> parameters = parameterSource.getLiveUniqueParametersMap();

		TelemetryParameter parameter = parameters.get(parameterName);

		TracePoint2D tracePoint;
		if (parameter == null) {
			if (lastTracePoint != null) {
				tracePoint = lastTracePoint;
			}
			else {
				tracePoint = new TracePoint2D(0, 0);
			}
		}
		else if (parameter.getSpacecraftTimestamp() == null) {
			tracePoint = new TracePoint2D(++counter, Double.parseDouble(parameter.getValue()));
		}
		else {
			tracePoint = new TracePoint2D(parameter.getSpacecraftTimestamp().getTime(), Double.parseDouble(parameter.getValue()));
		}

		lastTracePoint = tracePoint;
		return tracePoint;
	}

	@Override
	public void start() {
		boolean oldValue = this.isRunning();
		super.start();
		this.tracing = true;
		firePropertyChange("tracing", oldValue, this.tracing);
	}

	@Override
	public void stop() {
		boolean oldValue = this.isRunning();
		super.stop();
		this.tracing = false;
		firePropertyChange("tracing", oldValue, this.tracing);
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setTracing(final boolean tracing) {
		if (tracing) {
			this.start();
		}
		else {
			this.start();
		}
	}

	public boolean isTracing() {
		return tracing;
	}
}

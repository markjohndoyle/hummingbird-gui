package org.hbird.rcpgui.telemetry.views;

import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.ITracePoint2D;
import info.monitorenter.gui.chart.TracePoint2D;
import info.monitorenter.gui.chart.ZoomableChart;
import info.monitorenter.gui.chart.io.ADataCollector;
import info.monitorenter.gui.chart.traces.Trace2DLtd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;

import javax.swing.JRootPane;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.hbird.rcpgui.telemetryprovision.model.ParameterSource;
import org.hbird.rcpgui.telemetryprovision.model.TelemetryParameter;

/**
 * A chart view that can track multiple parameters on the same chart in Real time (effectively).
 * 
 * @author Mark Doyle
 * 
 */
public class ParameterChart extends ViewPart {
	protected static final String ID = "org.hbird.rcpgui.telemetry.views.ParameterChart"; //$NON-NLS-1$

	/** The parameter names that are being charted */
	private Set<String> parameterNames = new HashSet<String>();

	/** Source of telemetered parameters */
	private final ParameterSource parameterSource;

	/** All the collectors for each trace, all parameters being charted have a collector to retrieve the data */
	private final Set<ParameterDataCollector> collectors;

	/** Flag to indicate whether the chart is loaded on construction */
	private final boolean loadWithChart;

	/** The chart component. This is a Swing component bridged into SWT so use AWT classes for things like Color */
	private ZoomableChart chart;

	private SortedSet<ITrace2D> existingTraces;

	/**
	 * @wbp.parser.constructor
	 */
	public ParameterChart() {
		this.parameterSource = new ParameterSource();
		this.collectors = new HashSet<ParameterDataCollector>();
		loadWithChart = false;
	}

	public ParameterChart(final Set<String> parameterNames, final ParameterSource parameterSource) {
		this.parameterNames = parameterNames;
		this.parameterSource = parameterSource;
		collectors = new HashSet<ParameterDataCollector>(parameterNames.size());
		loadWithChart = true;
	}

	/**
	 * Creates all traces (one per parameter) for the chart.
	 */
	private void createTraces() {
		// If there are no parameters to chart we can simply return.
		if (this.parameterNames == null) {
			return;
		}
		if (this.parameterNames.size() == 0) {
			return;
		}

		existingTraces = chart.getTraces();

		// for every parameter to chart - create a trace and data collector and add them to the chart.
		for (String parameterName : parameterNames) {
			boolean traceAlreadyExists = false;
			// Check if trace already exists first.
			if (existingTraces != null) {
				for (ITrace2D trace : existingTraces) {
					if (StringUtils.equals(trace.getName(), parameterName)) {
						// trace already exists for parameter.
						traceAlreadyExists = true;
						break;
					}
				}
			}

			// If the trace doesn't already exist
			if (!traceAlreadyExists) {
				// Create an ITrace:
				// Note that dynamic charts need limited amount of values - 200 in this case. TODO make this
				// configurable.
				ITrace2D trace = new Trace2DLtd(500, parameterName);

				// Assign is a random colour
				trace.setColor(createRandomAwtColor());

				// Add the trace to the chart.
				chart.addTrace(trace);

				// TODO make latency configurable
				ParameterDataCollector collector = new ParameterDataCollector(trace, 50, parameterName);
				this.collectors.add(collector);

			}
		}
	}

	/**
	 * Starts a specific parameters collector. Each parameter has a collector to provide data to the trace.
	 * 
	 * @param parameterName
	 */
	private final void startCollector(final String parameterName) {
		for (ParameterDataCollector collector : collectors) {
			if (StringUtils.equals(collector.getParameterName(), parameterName)) {
				collector.start();
			}
		}
	}

	private final void startAllCollectors() {
		for (ADataCollector collector : collectors) {
			collector.start();
		}
	}

	private final void stopAllCollectors() {
		for (ADataCollector collector : collectors) {
			collector.stop();
		}
	}

	@Override
	public void createPartControl(final Composite parent) {
		parent.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(final DisposeEvent e) {
				stopAllCollectors();
			}
		});
		parent.setLayout(new GridLayout(1, false));
		createTraces();
		// Component create
		Composite chartComposite = new Composite(parent, SWT.EMBEDDED);
		chartComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		chartComposite.setLayout(new FillLayout(SWT.HORIZONTAL));

		SashForm sashChartList = new SashForm(chartComposite, SWT.SMOOTH);

		Composite awtSwtBridgeComposite = new Composite(sashChartList, SWT.EMBEDDED);
		awtSwtBridgeComposite.setLayout(new FillLayout(SWT.HORIZONTAL));

		Frame frameChart = SWT_AWT.new_Frame(awtSwtBridgeComposite);

		Panel panelChart = new Panel();
		frameChart.add(panelChart);
		panelChart.setLayout(new BorderLayout(0, 0));

		JRootPane rootPaneChart = new JRootPane();
		panelChart.add(rootPaneChart);

		chart = new ZoomableChart();
		rootPaneChart.getContentPane().add(chart, BorderLayout.CENTER);
		sashChartList.setWeights(new int[] { 411 });
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

	/**
	 * Create a random colour where the hue and saturation is random.
	 * 
	 * @return
	 */
	private final java.awt.Color createRandomAwtColor() {
		Random random = new Random();
		final float hue = random.nextFloat();
		final float saturation = random.nextFloat();
		final float luminance = 0.9f;
		return new Color(Color.HSBtoRGB(hue, saturation, luminance));
	}

	public Set<String> getParameterNames() {
		return parameterNames;
	}

	public void setParameterNames(final Set<String> parameterNames) {
		this.parameterNames = parameterNames;
	}

	public void addParameter(final String parameterName) {
		if (this.parameterNames == null) {
			this.parameterNames = new HashSet<String>(1);
		}
		this.parameterNames.add(parameterName);
		createTraces();
		startCollector(parameterName);
	}

	/**
	 * Collects data from the parameter source for a specific parameter based upon it's name.
	 * 
	 * @author Mark Doyle
	 * 
	 */
	private class ParameterDataCollector extends ADataCollector {
		int counter = 0;
		TracePoint2D lastTracePoint;
		private final String parameterName;

		public ParameterDataCollector(final ITrace2D trace, final long latency, final String parameterName) {
			super(trace, latency);
			this.parameterName = parameterName;
		}

		@Override
		public ITracePoint2D collectData() {
			System.out.println(parameterSource);

			Map<String, TelemetryParameter> parameters = parameterSource.getLiveParameters();

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

		public String getParameterName() {
			return parameterName;
		}
	}
}

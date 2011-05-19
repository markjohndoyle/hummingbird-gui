package org.hbird.rcpgui.telemetry.views;

import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.ZoomableChart;
import info.monitorenter.gui.chart.io.ADataCollector;
import info.monitorenter.gui.chart.traces.Trace2DLtd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.JRootPane;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableSetContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.telemetry.ViewersTelemetryActivator;
import org.hbird.rcpgui.telemetry.charting.ParameterDataCollector;
import org.hbird.rcpgui.telemetry.models.TraceCollectorModel;
import org.hbird.rcpgui.telemetryprovision.model.ParameterSource;
import org.hbird.rcpgui.telemetryprovision.model.TelemetryParameter;

/**
 * A chart view that can track multiple parameters on the same chart in Real time (effectively).
 * 
 * @author Mark Doyle
 * 
 */
public class ParameterChart extends ViewPart {

	private DataBindingContext m_bindingContext;
	protected static final String ID = "org.hbird.rcpgui.telemetry.views.ParameterChart"; //$NON-NLS-1$

	private final TraceCollectorModel traceCollectorModel = new TraceCollectorModel();

	/** The parameter names that are being charted */
	private Set<String> parameterNames = new HashSet<String>();

	/** Source of telemetered parameters */
	private final ParameterSource parameterSource;

	/** The chart component. This is a Swing component bridged into SWT so use AWT classes for things like Color */
	private ZoomableChart chart;

	private Table table;
	private TableViewer tableViewer;
	private Table activeTraceTable;
	private TableViewer activeTraceTableViewer;
	private TableViewerColumn tableViewerColumn_3;
	private List<ParameterProvider> parameterProviderServices;

	/**
	 * @wbp.parser.constructor
	 */
	public ParameterChart() {
		final Object[] serviceObjects = ViewersTelemetryActivator.getParameterProviderServiceTracker().getServices();
		if (serviceObjects.length > 0) {
			this.parameterProviderServices = new ArrayList<ParameterProvider>(serviceObjects.length);
			for (final Object o : serviceObjects) {
				parameterProviderServices.add((ParameterProvider) o);
			}
		}

		this.parameterSource = new ParameterSource(parameterProviderServices.get(0));
	}

	/**
	 * Instantiating a chart with parameters - not used yet.
	 * 
	 * @param parameterNames
	 * @param parameterSource
	 */
	public ParameterChart(final Set<String> parameterNames, final ParameterSource parameterSource) {
		this.parameterNames = parameterNames;
		this.parameterSource = parameterSource;
	}

	/**
	 * Creates all traces (one per parameter) for the chart.
	 */
	private void updateTraces() {
		// If there are no parameters to chart we can simply return.
		if (this.parameterNames == null) {
			return;
		}
		if (this.parameterNames.size() == 0) {
			return;
		}

		traceCollectorModel.setExistingTraces(chart.getTraces());

		// for every parameter to chart - create a trace and data collector and add them to the chart.
		for (String parameterName : parameterNames) {
			boolean traceAlreadyExists = false;
			// Check if trace already exists first.
			if (traceCollectorModel.getExistingTraces() != null) {
				for (ITrace2D trace : traceCollectorModel.getExistingTraces()) {
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

				this.traceCollectorModel.addNewCollector(trace, 50, parameterSource, parameterName);
			}
		}
	}

	/**
	 * Starts a specific parameters collector. Each parameter has a collector to provide data to the trace.
	 * 
	 * @param parameterName
	 */
	private final void startCollector(final String parameterName) {
		for (ParameterDataCollector collector : traceCollectorModel.getCollectors()) {
			if (StringUtils.equals(collector.getParameterName(), parameterName)) {
				collector.start();
			}
		}
	}

	private final void startAllCollectors() {
		for (ADataCollector collector : traceCollectorModel.getCollectors()) {
			collector.start();
		}
	}

	private final void stopAllCollectors() {
		for (ADataCollector collector : traceCollectorModel.getCollectors()) {
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
		updateTraces();
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
		chart.setUseAntialiasing(true);
		chart.setDoubleBuffered(true);
		rootPaneChart.getContentPane().add(chart, BorderLayout.CENTER);

		Composite composite = new Composite(sashChartList, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));

		ExpandBar expandBar = new ExpandBar(composite, SWT.NONE);
		expandBar.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		expandBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		ExpandItem xpndtmCurrentValue = new ExpandItem(expandBar, SWT.NONE);
		xpndtmCurrentValue.setExpanded(true);
		xpndtmCurrentValue.setText("Current value");

		tableViewer = new TableViewer(expandBar, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		xpndtmCurrentValue.setControl(table);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnParameterNameColumn = tableViewerColumn.getColumn();
		tblclmnParameterNameColumn.setWidth(100);
		tblclmnParameterNameColumn.setText("Name");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnParameterValueColumn = tableViewerColumn_1.getColumn();
		tblclmnParameterValueColumn.setWidth(100);
		tblclmnParameterValueColumn.setText("Value");
		xpndtmCurrentValue.setHeight(200);

		ExpandItem xpndtmNewExpanditem = new ExpandItem(expandBar, SWT.NONE);
		xpndtmNewExpanditem.setExpanded(true);
		xpndtmNewExpanditem.setText("Active traces");

		activeTraceTableViewer = new TableViewer(expandBar, SWT.BORDER | SWT.FULL_SELECTION);
		activeTraceTable = activeTraceTableViewer.getTable();
		activeTraceTable.setHeaderVisible(true);
		xpndtmNewExpanditem.setControl(activeTraceTable);

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(activeTraceTableViewer, SWT.NONE);
		TableColumn tblclmnName = tableViewerColumn_2.getColumn();
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");

		tableViewerColumn_3 = new TableViewerColumn(activeTraceTableViewer, SWT.NONE);
		TableColumn tblclmnActive = tableViewerColumn_3.getColumn();
		tblclmnActive.setWidth(100);
		tblclmnActive.setText("Active");
		xpndtmNewExpanditem.setHeight(200);
		sashChartList.setWeights(new int[] { 441, 140 });
		m_bindingContext = initDataBindings();
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
		updateTraces();
		startCollector(parameterName);
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		tableViewer.setContentProvider(listContentProvider);
		//
		IObservableMap[] observeMaps = PojoObservables.observeMaps(listContentProvider.getKnownElements(), TelemetryParameter.class, new String[] { "name",
				"value" });
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		//
		IObservableList parameterSourceLiveParameterListObserveList = BeansObservables.observeList(Realm.getDefault(), parameterSource,
				"liveUniqueParameterList");
		tableViewer.setInput(parameterSourceLiveParameterListObserveList);
		//
		ObservableSetContentProvider setContentProvider = new ObservableSetContentProvider();
		activeTraceTableViewer.setContentProvider(setContentProvider);
		//
		IObservableMap[] observeMaps_1 = BeansObservables.observeMaps(setContentProvider.getKnownElements(), ParameterDataCollector.class, new String[] {
				"parameterName", "tracing" });
		activeTraceTableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps_1));
		//
		IObservableSet traceCollectorModelCollectorsObserveSet = BeansObservables.observeSet(Realm.getDefault(), traceCollectorModel, "collectors");
		activeTraceTableViewer.setInput(traceCollectorModelCollectorsObserveSet);
		//

		return bindingContext;
	}
}

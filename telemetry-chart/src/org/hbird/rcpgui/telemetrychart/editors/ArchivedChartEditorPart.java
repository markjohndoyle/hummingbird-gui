package org.hbird.rcpgui.telemetrychart.editors;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.JRootPane;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.commons.model.ArchiveModel;
import org.hbird.rcpgui.commons.model.ArchiveParameterFilterSettings;
import org.hbird.rcpgui.telemetrychart.model.FilterFormModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.joda.time.DateTime;

/**
 *
 * @author Mark Doyle
 *
 */
public class ArchivedChartEditorPart extends EditorPart implements PropertyChangeListener {

	public static final String ID = "org.hbird.rcpgui.telemetrychart.editors.ArchivedChartEditorPart"; //$NON-NLS-1$

	private LiveParameterChartEditorInput input;

	private ArchiveModel model;

	private TimeSeriesCollection dataset;

	private boolean legend;

	private boolean tooltips;

	private boolean urls;

	public ArchivedChartEditorPart() {
	}

	/**
	 * Create contents of the editor part.
	 *
	 * @param parent
	 */
	@Override
	public void createPartControl(final Composite parent) {
		final Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));

		final Composite composite = new Composite(container, SWT.EMBEDDED);

		final Frame frame = SWT_AWT.new_Frame(composite);

		final Panel panel = new Panel();
		frame.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		final JRootPane rootPane = new JRootPane();
		panel.add(rootPane);

		final ChartPanel chartPanel = new ChartPanel(createChart());
		rootPane.getContentPane().add(chartPanel, BorderLayout.CENTER);
	}

	private final JFreeChart createChart() {
		dataset = createDataset();
		final JFreeChart chart = ChartFactory.createTimeSeriesChart(generateChartName(), "time", "value", dataset, legend, tooltips, urls);
		chart.setAntiAlias(true);
		chart.setBackgroundPaint(Color.WHITE);

		return chart;
	}

	private TimeSeriesCollection createDataset() {
		final TimeSeriesCollection dataset = new TimeSeriesCollection();

		ArchivedParameterChartEditorInput input = (ArchivedParameterChartEditorInput) this.getEditorInput();
		FilterFormModel inputFilterModel = input.getFilterModel();
		ArchiveParameterFilterSettings newFilters = new ArchiveParameterFilterSettings();
		newFilters.fromTime = inputFilterModel.getCalculatedFromDate();
		newFilters.toTime = inputFilterModel.getCalculatedToDate();
		newFilters.useTimefilter = true;

		model.updateFilters(newFilters);
		List<Parameter<?>> parameters = model.getParameters();

		for (final String name : input.getShortParameterNames()) {
			final TimeSeries series = new TimeSeries(name);
			dataset.addSeries(series);

		}

		for (Parameter<?> p : parameters) {
			for (final String name : input.getParameterNames()) {
				if (StringUtils.equals(p.getQualifiedName(), name)) {
					final TimeSeries series = dataset.getSeries(p.getName());
					final DateTime time = new DateTime(p.getReceivedTime());
					final Millisecond ms = new Millisecond(time.toDate());
					series.addOrUpdate(ms, (Integer) p.getValue());
				}
			}
		}

		return dataset;
	}

	/**
	 * Currently uses editor input name, i.e. file name.
	 *
	 * @return
	 */
	private String generateChartName() {
		return input.getName();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public void doSave(final IProgressMonitor monitor) {
		// Do the Save operation
	}

	@Override
	public void doSaveAs() {
		// Do the Save As operation
	}

	@Override
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		if (!(input instanceof ArchivedParameterChartEditorInput)) {
			throw new RuntimeException("Wrong input");
		}

		this.input = (ArchivedParameterChartEditorInput) input;
		setSite(site);
		setInput(input);
		setPartName("Parameter plot");

		// TODO populate model from archive service here?
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void propertyChange(final PropertyChangeEvent evt) {
		final Object newValue = evt.getNewValue();
		if (newValue instanceof Parameter<?>) {
			final Parameter<?> newParameter = (Parameter<?>) newValue;
			if (dataset != null) {
				// XYSeries series = dataset.getSeries(newParameter.getQualifiedName());
				final TimeSeries series = dataset.getSeries(newParameter.getQualifiedName());
				final DateTime time = new DateTime(newParameter.getReceivedTime());
				final Millisecond ms = new Millisecond(time.toDate());
				series.add(ms, (Integer) newParameter.getValue());
			}
		}
	}

	public void setModel(final ArchiveModel model) {
		this.model = model;
	}

}

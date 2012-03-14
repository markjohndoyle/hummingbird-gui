package org.hbird.rcpgui.telemetrychart.editors;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JRootPane;

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
import org.hbird.rcpgui.parameterlistener.model.PropertyFilterableSingleParameterModel;
import org.hbird.rcpgui.telemetrychart.Activator;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.osgi.framework.ServiceRegistration;

public class ChartEditorPart extends EditorPart implements PropertyChangeListener {

	public static final String ID = "org.hbird.rcpgui.telemetrychart.editors.ChartEditorPart"; //$NON-NLS-1$

	private ParameterChartEditorInput input;

	// TODO concrete class.
	private final PropertyFilterableSingleParameterModel model;

	private ServiceRegistration modelListenerServiceReg;

	private XYSeriesCollection dataset;

	private boolean legend;

	private boolean tooltips;

	private boolean urls;

	public ChartEditorPart() {
		this.model = new PropertyFilterableSingleParameterModel(Activator.getDefault().getBundle().getBundleContext());
		this.model.addPropertyChangeListener("latestParameter", this);
	}

	/**
	 * Create contents of the editor part.
	 *
	 * @param parent
	 */
	@Override
	public void createPartControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite composite = new Composite(container, SWT.EMBEDDED);

		Frame frame = SWT_AWT.new_Frame(composite);

		Panel panel = new Panel();
		frame.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JRootPane rootPane = new JRootPane();
		panel.add(rootPane);

		ChartPanel chartPanel = new ChartPanel(createChart());
		rootPane.getContentPane().add(chartPanel, BorderLayout.CENTER);
	}

	private final JFreeChart createChart() {
		dataset = createDataset();
		JFreeChart chart = ChartFactory.createXYLineChart(generateChartName(), "time", "value", dataset, PlotOrientation.VERTICAL, legend, tooltips, urls);
		return chart;
	}

	private XYSeriesCollection createDataset() {
		XYSeriesCollection dataset = new XYSeriesCollection();
		for(String name : input.getParameterNames()) {
			XYSeries series = new XYSeries(name);
			dataset.addSeries(series);
		}
		return dataset;
	}

	/**
	 * Currently uses editor input name, i.e. file name.
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
		if (!(input instanceof ParameterChartEditorInput)) {
			throw new RuntimeException("Wrong input");
		}

		ParameterChartEditorInput new_name = (ParameterChartEditorInput) input;
		this.input = (ParameterChartEditorInput) input;
		setSite(site);
		setInput(input);

		// Set parameter name filter on model
		for(String name : this.input.getParameterNames()) {
			model.addFilter("qualifiedName", name);
		}
		setPartName("Parameter plot");
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
		Object newValue = evt.getNewValue();
		if(newValue instanceof Parameter<?>) {
			Parameter<?> newParameter = (Parameter<?>) newValue;
			XYSeries series = dataset.getSeries(newParameter.getQualifiedName());
			series.add(newParameter.getReceivedTime(), (Integer) newParameter.getValue());
		}
	}


}

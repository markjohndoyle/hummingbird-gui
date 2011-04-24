package org.hbird.rcpgui.telemetry.views;

import info.monitorenter.gui.chart.Chart2D;
import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.io.ADataCollector;
import info.monitorenter.gui.chart.io.RandomDataCollectorOffset;
import info.monitorenter.gui.chart.traces.Trace2DLtd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JRootPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class ParameterChart extends ViewPart {

	public ParameterChart() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(final Composite parent) {
		// Component create
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		// Component create
		Composite composite_1 = new Composite(composite, SWT.EMBEDDED);
		// Component create
		Frame frame = SWT_AWT.new_Frame(composite_1);

		Panel panel = new Panel();
		frame.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JRootPane rootPane = new JRootPane();
		panel.add(rootPane);

		// Create a chart:
		Chart2D chart = new Chart2D();
		// Create an ITrace:
		// Note that dynamic charts need limited amount of values!!!
		ITrace2D trace = new Trace2DLtd(200);
		trace.setColor(Color.RED);

		// Add the trace to the chart. This has to be done before adding points (deadlock prevention):
		chart.addTrace(trace);

		rootPane.getContentPane().add(chart, BorderLayout.CENTER);


		// Every 50 milliseconds a new value is collected.
		ADataCollector collector = new RandomDataCollectorOffset(trace, 1000);
		// Start an internal Thread that adds the values:
		collector.start();

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
}

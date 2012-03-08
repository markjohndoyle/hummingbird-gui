package org.hbird.rcpgui.telemetrychart.views;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.util.Random;

import javax.swing.JRootPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.controllers.ControllerType;
import org.jzy3d.chart.controllers.mouse.ChartMouseController;
import org.jzy3d.chart.controllers.thread.ChartThreadController;
import org.jzy3d.colors.Color;
import org.jzy3d.events.ControllerEvent;
import org.jzy3d.events.ControllerEventListener;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.Scatter;
import org.jzy3d.plot3d.rendering.view.Renderer2d;

public class ChartView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.hbird.rcpgui.telemetrychart.views.ChartView";

	private ChartMouseController mouseMotion;

	/**
	 * The constructor.
	 */
	public ChartView() {
		generateData();
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(final Composite parent) {

		Composite composite = new Composite(parent, SWT.EMBEDDED);

		Frame frame = SWT_AWT.new_Frame(composite);

		Panel panel = new Panel();
		frame.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JRootPane rootPane = new JRootPane();
		panel.add(rootPane);

		rootPane.getContentPane().add((Component) getChart().getCanvas());
	}

	public Chart getChart() {
		// Create a chart
		Chart chart = new Chart();
		chart.getScene().add(dots);
        chart.addRenderer(new Renderer2d() {
            @Override
			public void paint(final Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(4.0f));
                g2d.setColor(java.awt.Color.BLACK);
                g2d.drawRect(10, 50, 100, 100);
            }
        });

        mouseMotion = new ChartMouseController();
        ChartThreadController thread = new ChartThreadController();
        mouseMotion.addSlaveThreadController(thread);
        mouseMotion.addControllerEventListener(new ControllerEventListener() {
            @Override
			public void controllerEventFired(final ControllerEvent e) {
                if (e.getType() == ControllerType.ROTATE) {
                }
            }
        });
        chart.addController(mouseMotion);
        chart.addController(thread);
		return chart;
	}

	int npt = 500;
	Coord3d[] points;
	Color[] colors;
	Chart chart;
	Scatter dots;

	protected void generateData() {
		Random rng = new Random();

		points = new Coord3d[npt];
		colors = new Color[npt];
		for (int i = 0; i < npt; i++) {
			colors[i] = new Color(0f, 0f, 0f, 0.5f);

			float x = rng.nextFloat();
			float y = rng.nextFloat();
			float z = rng.nextFloat();

			points[i] = new Coord3d(x, y, z);
		}
		dots = new Scatter(points, colors);
		dots.setWidth(4);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
	}
}
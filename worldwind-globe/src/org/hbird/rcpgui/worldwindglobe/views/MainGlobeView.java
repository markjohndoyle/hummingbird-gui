package org.hbird.rcpgui.worldwindglobe.views;

import gov.nasa.worldwind.Model;
import gov.nasa.worldwind.WorldWind;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.awt.WorldWindowGLCanvas;
import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.layers.IconLayer;
import gov.nasa.worldwind.render.UserFacingIcon;
import gov.nasa.worldwind.render.WWIcon;

import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.hbird.rcpgui.telemetry.model.ParameterSource;
import org.hbird.rcpgui.telemetry.model.TelemetryParameter;

public class MainGlobeView extends ViewPart implements PropertyChangeListener {

	public static final String ID = "org.hbird.rcpgui.worldwindglobe.views.MainGlobe";
	final static WorldWindowGLCanvas worldCanvas = new WorldWindowGLCanvas();
	private final ParameterSource telemetryIn;
	private WWIcon satelliteIcon;

	// Initialize the default WW layers
	static {
		initWorldWindLayerModel();
	}

	// Initialize WW model with default layers
	static void initWorldWindLayerModel() {
		Model model = (Model) WorldWind.createConfigurationComponent(AVKey.MODEL_CLASS_NAME);
		worldCanvas.setModel(model);
	}


	public MainGlobeView() {
		telemetryIn = new ParameterSource(false);

		List<String> interestList = new ArrayList<String>();
		interestList.add("LONGITUDE");
		interestList.add("LATITUDE");
		telemetryIn.setInterestList(interestList);
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		// GUI: an SWT composite on top
		Composite top = new Composite(parent, SWT.EMBEDDED);
		top.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		top.setLayout(new FillLayout(SWT.HORIZONTAL));
		// top.setLayoutData(new GridData(GridData.FILL_BOTH));

		// Swing Frame and Panel
		final java.awt.Frame worldFrame = SWT_AWT.new_Frame(top);
		java.awt.Panel panel = new java.awt.Panel(new java.awt.BorderLayout());

		worldFrame.add(panel);

		// Add the WWJ 3D OpenGL Canvas to the Swing Panel
		panel.add(worldCanvas, BorderLayout.CENTER);

		parent.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblLatitude = new Label(composite, SWT.NONE);
		lblLatitude.setText("New Label");

		Label lblLongitude = new Label(composite, SWT.NONE);
		lblLongitude.setText("New Label");

		// Testing
		IconLayer iconLayer = new IconLayer();
		satelliteIcon = new UserFacingIcon("icons/satellite_48_hot.png", new Position(LatLon.fromDegrees(49.872098, 8.63534), 40000.00));
		iconLayer.addIcon(satelliteIcon);
		worldCanvas.getModel().getLayers().add(iconLayer);

		initBindingToTmSource();

	}

	private final void moveSatellite(Angle lat, Angle lon) {
		Position currPos = this.satelliteIcon.getPosition();

		if (lat == null) {
			lat = currPos.getLatitude();
		}
		if (lon == null) {
			lon = currPos.getLongitude();
		}

		this.satelliteIcon.setPosition(new Position(lat, lon, currPos.getAltitude()));

		worldCanvas.redraw();


	}

	private final void initBindingToTmSource() {
		this.telemetryIn.addPropertyChangeListener("liveParameterList", this);
	}


	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}


	public ParameterSource getTelemetryIn() {
		return telemetryIn;
	}


	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		List<TelemetryParameter> newTmList = (List<TelemetryParameter>) evt.getNewValue();
		Angle lon = null;
		Angle lat = null;
		for (TelemetryParameter param : newTmList) {
			if (param.getName().equals("LONGITUDE")) {
				lon = Angle.fromDegrees(Double.parseDouble(param.getValue()));
			}
			else if (param.getName().equals("LONGITUDE")) {
				lat = Angle.fromDegrees(Double.parseDouble(param.getValue()));
			}
		}
		moveSatellite(lat, lon);
	}
}

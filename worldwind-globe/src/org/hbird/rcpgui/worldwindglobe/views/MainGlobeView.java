package org.hbird.rcpgui.worldwindglobe.views;

import gov.nasa.worldwind.Model;
import gov.nasa.worldwind.WorldWind;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.awt.WorldWindowGLCanvas;
import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.layers.IconLayer;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.render.Polyline;
import gov.nasa.worldwind.render.UserFacingIcon;
import gov.nasa.worldwind.render.WWIcon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.hbird.rcpgui.telemetryprovision.model.TelemetryParameter;
import org.hbird.rcpgui.telemetryprovision.source.ParameterSource;
import org.hbird.rcpgui.worldwindglobe.opengl.groundassets.EstrackStations;
import org.hbird.rcpgui.worldwindglobe.opengl.groundassets.GroundStation;

public class MainGlobeView extends ViewPart implements PropertyChangeListener {
	private DataBindingContext m_bindingContext;

	public static final String ID = "org.hbird.rcpgui.worldwindglobe.views.MainGlobe";
	final static WorldWindowGLCanvas worldCanvas = new WorldWindowGLCanvas();
	private final ParameterSource telemetryIn;
	private WWIcon satelliteIcon;
	private final List<Position> trailPositions = new ArrayList<Position>();
	private Polyline trailLine;

	private final List<GroundStation> groundStations = new ArrayList<GroundStation>();
	private Label lblLatitude;

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

		Set<String> parameterNameFilterSet = new HashSet<String>();
		parameterNameFilterSet.add("LONGITUDE");
		parameterNameFilterSet.add("LATITUDE");
		telemetryIn.addNamesFilter(parameterNameFilterSet);
	}

	@Override
	public void createPartControl(final Composite parent) {
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
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblLatitude = new Label(composite, SWT.NONE);
		lblLatitude.setText("false");


		initBindingToTmSource();

		loadSat();

		loadGroundStations();
		m_bindingContext = initDataBindings();

	}

	public ParameterSource getTelemetryIn() {
		return telemetryIn;
	}

	private final void initBindingToTmSource() {
		this.telemetryIn.addPropertyChangeListener("liveParameterList", this);
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue lblLatitudeObserveTextObserveWidget = SWTObservables.observeText(lblLatitude);
		IObservableValue telemetryInProvisionActiveObserveValue = BeansObservables.observeValue(telemetryIn, "provisionActive");
		bindingContext.bindValue(lblLatitudeObserveTextObserveWidget, telemetryInProvisionActiveObserveValue, null, null);
		//
		return bindingContext;
	}

	private void loadGroundStations() {
		RenderableLayer groundStationLayer = new RenderableLayer();
		groundStationLayer.addRenderable(EstrackStations.REDU_STATION);

		worldCanvas.getModel().getLayers().add(groundStationLayer);
	}


	private final void loadSat() {
		// Testing
		IconLayer iconLayer = new IconLayer();
		satelliteIcon = new UserFacingIcon("icons/satellite_48_hot.png", new Position(LatLon.fromDegrees(49.872098, 8.63534), 40000.00));
		iconLayer.addIcon(satelliteIcon);

		RenderableLayer trailLayer = new RenderableLayer();
		trailLine = new Polyline();
		trailLine.setPathType(Polyline.GREAT_CIRCLE);
		trailLine.setColor(Color.MAGENTA);
		trailLayer.addRenderable(trailLine);

		worldCanvas.getModel().getLayers().add(iconLayer);
		worldCanvas.getModel().getLayers().add(trailLayer);
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
		synchronized (trailPositions) {
			trailPositions.add(new Position(lat, lon, currPos.getAltitude()));
		}
		trailLine.setPositions(trailPositions);
		worldCanvas.redraw();
	}


	@Override
	public void propertyChange(final PropertyChangeEvent evt) {
		List<TelemetryParameter> newTmList = (List<TelemetryParameter>) evt.getNewValue();
		Angle lon = null;
		Angle lat = null;
		for (TelemetryParameter param : newTmList) {
			if (param.getName().equals("LONGITUDE")) {
				lon = Angle.fromDegrees(Double.parseDouble(param.getValue()));
			}
			else if (param.getName().equals("LATITUDE")) {
				lat = Angle.fromDegrees(Double.parseDouble(param.getValue()));
			}
		}
		moveSatellite(lat, lon);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}
}

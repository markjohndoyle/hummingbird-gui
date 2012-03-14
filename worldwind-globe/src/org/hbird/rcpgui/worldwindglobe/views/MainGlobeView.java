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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.hbird.rcpgui.parameterlistener.model.CappedQueueParameterModel;
import org.hbird.rcpgui.worldwindglobe.WorldwindGlobeActivator;
import org.hbird.rcpgui.worldwindglobe.opengl.groundassets.EstrackStations;
import org.hbird.rcpgui.worldwindglobe.opengl.groundassets.GroundStation;
import org.hbird.rcpgui.worldwindglobe.preferences.PreferenceConstants;

public class MainGlobeView extends ViewPart {
	private DataBindingContext m_bindingContext;

	public static final String ID = "org.hbird.rcpgui.worldwindglobe.views.MainGlobe";
	final static WorldWindowGLCanvas worldCanvas = new WorldWindowGLCanvas();
	private WWIcon satelliteIcon;
	private final List<Position> trailPositions = new ArrayList<Position>();
	private Polyline trailLine;

	private final List<GroundStation> groundStations = new ArrayList<GroundStation>();
	private Label lblLatitude;

	private CappedQueueParameterModel model;
	private String latParamName;
	private String lonParamName;

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

		setPreferencesListener();

		loadSat();

		loadGroundStations();
		m_bindingContext = initDataBindings();

	}

	private void setPreferencesListener() {
		WorldwindGlobeActivator.getDefault().getPreferenceStore().addPropertyChangeListener(new IPropertyChangeListener() {
			@Override
			public void propertyChange(final PropertyChangeEvent event) {
				if (event.getProperty() == PreferenceConstants.LAT_TM_PARAMETER) {
					latParamName = event.getNewValue().toString();
				}
				else if (event.getProperty() == PreferenceConstants.LON_TM_PARAMETER) {
					lonParamName = event.getNewValue().toString();
				}
			}
		});
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

	private final void moveSatellite(Angle lat, Angle lon, Double altitude) {
		Position currPos = this.satelliteIcon.getPosition();

		if (lat == null) {
			lat = currPos.getLatitude();
		}
		if (lon == null) {
			lon = currPos.getLongitude();
		}
		if (altitude == null) {
			altitude = currPos.getAltitude();
		}

		this.satelliteIcon.setPosition(new Position(lat, lon, altitude));
		synchronized (trailPositions) {
			trailPositions.add(new Position(lat, lon, currPos.getAltitude()));
		}
		trailLine.setPositions(trailPositions);
		worldCanvas.redraw();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		//
		return bindingContext;
	}

	public void setModel(final CappedQueueParameterModel model) {
		this.model = model;
	}
}

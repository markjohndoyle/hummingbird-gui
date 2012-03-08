package org.hbird.rcpgui.worldwindglobe.opengl.shapes;

import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.Vec4;
import gov.nasa.worldwind.render.DrawContext;
import gov.nasa.worldwind.render.Renderable;

import java.awt.Color;


public class Cone implements Renderable {

	private final Angle lat;
	private final Angle lon;
	// private final Globe globe;
	private final Angle orientation; // degrees tilted counterclockwise from due East
	private final Angle elevation; // degrees tilted up from the surface
	private final double groundRange;// radius of cone base
	private final Color color;
	private final double ceiling;// length from cone tip to center of base
	private Vec4 topCenter;// point at center of cylinder base


	public Cone(final double lat, final double lon, final double groundRange, final double ceiling, final Angle orientation, final Angle elevation, final Color theColor) {
		this.lat = Angle.fromDegreesLatitude(lat);
		this.lon = Angle.fromDegreesLongitude(lon);
		// this.globe = globe;
		// this.topCenter = globe.computePointFromPosition(this.lat, this.lon, 0.0);
		this.orientation = orientation;
		this.elevation = elevation;
		this.groundRange = groundRange;
		this.ceiling = ceiling;
		this.color = theColor;

	}

	@Override
	public void render(final DrawContext dc) {
	}

}

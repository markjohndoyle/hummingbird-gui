package org.hbird.rcpgui.worldwindglobe.opengl.shapes;

import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.geom.Vec4;
import gov.nasa.worldwind.render.DrawContext;
import gov.nasa.worldwind.render.Renderable;

import java.awt.Color;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;


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


	public Cone(double lat, double lon, double groundRange, double ceiling, Angle orientation, Angle elevation, Color theColor) {
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
	public void render(DrawContext dc) {
		this.topCenter = dc.getGlobe().computePointFromPosition(new LatLon(this.lat, this.lon), 0.0);
		// System.out.println("top center = " + topCenter);
		Position pos = dc.getGlobe().computePositionFromPoint(this.topCenter);
		// System.out.println("position = " + pos);
		// Position p = globe.computePositionFromPoint(this.topCenter);

		javax.media.opengl.GL gl = dc.getGL();

		gl.glPushAttrib(javax.media.opengl.GL.GL_TEXTURE_BIT | javax.media.opengl.GL.GL_ENABLE_BIT | javax.media.opengl.GL.GL_CURRENT_BIT);
		gl.glDisable(javax.media.opengl.GL.GL_TEXTURE_2D);

		gl.glEnable(GL.GL_BLEND);
		gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
		gl.glColor4ub((byte) color.getRed(), (byte) color.getGreen(), (byte) color.getBlue(), (byte) color.getAlpha());

		gl.glEnable(javax.media.opengl.GL.GL_DEPTH_TEST);
		gl.glMatrixMode(javax.media.opengl.GL.GL_MODELVIEW);
		gl.glPushMatrix();

		gl.glTranslated(this.topCenter.x, this.topCenter.y, this.topCenter.z);

		dc.getGL().glRotated(90 + pos.getLongitude().getDegrees(), 0, 1, 0);
		dc.getGL().glRotated(orientation.getDegrees(), -1, 0, 0);
		dc.getGL().glRotated(pos.getLatitude().getDegrees() * orientation.sin(), 0, 1, 0);
		dc.getGL().glRotated(elevation.getDegrees(), 0, -1, 0);
		dc.getGL().glRotated(pos.getLatitude().getDegrees() * elevation.sin(), -1, 0, 0);

		GLUquadric quadric = dc.getGLU().gluNewQuadric();
		dc.getGLU().gluQuadricDrawStyle(quadric, GLU.GLU_FILL);

		dc.getGLU().gluCylinder(quadric, 0, this.groundRange, this.ceiling, 30, 30);
		dc.getGL().glTranslated(0, 0, this.ceiling);
		dc.getGLU().gluDisk(quadric, 0d, this.groundRange, 30, 30);
		dc.getGLU().gluDeleteQuadric(quadric);

		gl.glPopMatrix();
		gl.glPopAttrib();
	}

}

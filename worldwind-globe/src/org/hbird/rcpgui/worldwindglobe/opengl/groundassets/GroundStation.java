package org.hbird.rcpgui.worldwindglobe.opengl.groundassets;

import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.geom.Vec4;
import gov.nasa.worldwind.render.DrawContext;
import gov.nasa.worldwind.render.Renderable;

import java.util.ArrayList;
import java.util.List;

import javax.media.opengl.GL;


public class GroundStation extends GroundAsset implements Renderable {

	private List<Antenna> antennas = new ArrayList<Antenna>(0);

	public GroundStation(String name, double latDegrees, double lonDegrees) {
		super(name, latDegrees, lonDegrees);
	}

	public GroundStation(String name, double latDegrees, double lonDegrees, Antenna... antennas) {
		super(name, latDegrees, lonDegrees);
		for (Antenna a : antennas) {
			this.antennas.add(a);
		}
	}

	public GroundStation(String name, double latDegrees, double lonDegrees, List<Antenna> antennas) {
		super(name, latDegrees, lonDegrees);
		this.antennas = antennas;
	}

	public final void addAntena(Antenna antenna) {
		this.antennas.add(antenna);
	}

	public List<Antenna> getAntenna() {
		return antennas;
	}

	@Override
	public void render(DrawContext dc) {
		GL gl = dc.getGL();
		Vec4 posVector = dc.getGlobe().computePointFromPosition(Angle.fromDegrees(latitudeDegrees), Angle.fromDegrees(longitudeDegrees), 0.0);
		Position p = dc.getGlobe().computePositionFromPoint(posVector);
		gl.glBegin(GL.GL_TRIANGLES);
		gl.glEnd();

		for (Antenna a : antennas) {
			a.getCoverage().render(dc);
		}
	}
}

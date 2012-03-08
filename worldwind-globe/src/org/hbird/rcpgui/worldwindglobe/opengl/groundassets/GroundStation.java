package org.hbird.rcpgui.worldwindglobe.opengl.groundassets;

import gov.nasa.worldwind.render.DrawContext;
import gov.nasa.worldwind.render.Renderable;

import java.util.ArrayList;
import java.util.List;



public class GroundStation extends GroundAsset implements Renderable {

	private List<Antenna> antennas = new ArrayList<Antenna>(0);

	public GroundStation(final String name, final double latDegrees, final double lonDegrees) {
		super(name, latDegrees, lonDegrees);
	}

	public GroundStation(final String name, final double latDegrees, final double lonDegrees, final Antenna... antennas) {
		super(name, latDegrees, lonDegrees);
		for (Antenna a : antennas) {
			this.antennas.add(a);
		}
	}

	public GroundStation(final String name, final double latDegrees, final double lonDegrees, final List<Antenna> antennas) {
		super(name, latDegrees, lonDegrees);
		this.antennas = antennas;
	}

	public final void addAntena(final Antenna antenna) {
		this.antennas.add(antenna);
	}

	public List<Antenna> getAntenna() {
		return antennas;
	}

	@Override
	public void render(final DrawContext dc) {
	}
}

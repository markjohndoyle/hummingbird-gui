package org.hbird.rcpgui.worldwindglobe.opengl.groundassets;

import gov.nasa.worldwind.geom.Angle;

import java.awt.Color;

import org.hbird.rcpgui.worldwindglobe.opengl.shapes.Cone;

public class Antenna extends GroundAsset {

	/** TODO Could be any shape I guess? */
	private Cone coverage;

	/**
	 * 
	 * @param globe
	 * @param name
	 * @param latitudeDegrees
	 * @param longitudeDegrees
	 * @param ceiling
	 * @param groundRange
	 * @param orientation
	 * @param elevation
	 * @param theColor
	 * 
	 */
	public Antenna(String name, double latitudeDegrees, double longitudeDegrees) {
		super(name, latitudeDegrees, longitudeDegrees);
		Color coverageColour = new Color(255, 255, 255, 70);
		this.coverage = new Cone(this.latitudeDegrees, this.longitudeDegrees, 0.0, 40000.0, Angle.fromDegrees(5.0), Angle.fromDegrees(80.0), coverageColour);
	}

	public Cone getCoverage() {
		return coverage;
	}

	public void setCoverage(Cone coverage) {
		this.coverage = coverage;
	}


}

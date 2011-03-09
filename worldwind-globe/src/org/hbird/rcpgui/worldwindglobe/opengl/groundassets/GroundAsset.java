package org.hbird.rcpgui.worldwindglobe.opengl.groundassets;



public class GroundAsset {

	protected final String name;
	protected final double latitudeDegrees;
	protected final double longitudeDegrees;

	public GroundAsset(String name, double latitudeDegrees, double longitudeDegrees) {
		this.name = name;
		this.latitudeDegrees = latitudeDegrees;
		this.longitudeDegrees = longitudeDegrees;
	}

	public String getName() {
		return name;
	}

	public double getLatitudeDegrees() {
		return latitudeDegrees;
	}

	public double getLongitudeDegrees() {
		return longitudeDegrees;
	}
}

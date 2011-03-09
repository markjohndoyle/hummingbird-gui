package org.hbird.rcpgui.worldwindglobe.opengl.groundassets;


public class EstrackStations {

	public static GroundStation REDU_STATION;

	/**
	 * Redu station provides ESTRACK tracking capabilities in S- and Ka-band, and supports in-orbit testing (IOT) of
	 * telecommunication satellites. Redu supports ESA's Artemis and Integral missions as well as Proba. The site hosts
	 * multiple tracking antennas operating in a variety of frequency bands, and is located in the Ardennes region of
	 * Belgium.
	 * 
	 * The co-ordinates of the TMS-1 antenna are 5.14518047°E longitude, 50.00205516°N latitude.
	 * 
	 * Location || 50.001°N, 5.145°E
	 * 
	 */
	// public final static GroundStation REDU_STATION;

	static {
		REDU_STATION = new GroundStation("Redu", 50.000456, 5.145344, new Antenna("TMS-1", 50.00205516, 5.14518047));
	}
}

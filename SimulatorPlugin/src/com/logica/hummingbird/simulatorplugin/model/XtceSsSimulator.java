package com.logica.hummingbird.simulatorplugin.model;

import com.logica.hummingbird.simulator.SimulatorSSM;
import com.logica.hummingbird.spacesystemmodel.ContainerFactory;
import com.logica.hummingbird.spacesystemmodel.exceptions.UnknownContainerNameException;

public class XtceSsSimulator {

	static XtceSsSimulator instance;
	SimulatorSSM ssm;

	private XtceSsSimulator() {
	}

	public final static XtceSsSimulator getInstance() {
		if (instance == null) {
			instance = new XtceSsSimulator();
		}
		return instance;
	}

	public final void loadSpaceSystemModel(ContainerFactory spaceSystemModelFactory, String packetName) throws UnknownContainerNameException {
		ssm = new SimulatorSSM(spaceSystemModelFactory, packetName);
		System.out.println("Loaded SSM.  Detected " + spaceSystemModelFactory.getAllParameters().keySet().size() + " parameters");
	}

	public final SimulatorSSM getSpaceSystemModel() {
		return ssm;
	}
}

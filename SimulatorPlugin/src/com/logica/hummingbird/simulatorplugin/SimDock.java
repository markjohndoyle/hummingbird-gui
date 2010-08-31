package com.logica.hummingbird.simulatorplugin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.logica.hummingbird.simulator.SimulatorSSM;
import com.logica.hummingbird.spacesystemmodel.ContainerFactory;
import com.logica.hummingbird.spacesystemmodel.exceptions.UnknownContainerNameException;
import com.logica.hummingbird.spacesystemmodel.parameters.ParameterContainer;

public class SimDock implements SimulatorDock {

	static SimDock instance;
	SimulatorSSM ssm;
	List<SimulatorObserver> observers;

	private SimDock() {
	}

	public final static SimDock getInstance() {
		if (instance == null) {
			instance = new SimDock();
		}
		return instance;
	}

	public final void loadSpaceSystemModel(ContainerFactory spaceSystemModelFactory, String packetName) throws UnknownContainerNameException {
		ssm = new SimulatorSSM(spaceSystemModelFactory, packetName);
		System.out.println("Loaded SSM.  Detected " + spaceSystemModelFactory.getAllParameters().keySet().size() + " parameters");
		
		for(SimulatorObserver ob : observers) {
			ob.spaceSystemUpdated(spaceSystemModelFactory);
		}
	}

	public Collection<ParameterContainer> getAllParameters() {
		if (ssm != null) {
			return ssm.getAllParameters();
		}
		else {
			return null;
		}
	}

	public final SimulatorSSM getSpaceSystemModel() {
		return ssm;
	}

	/**
	 * @return the ssm
	 */
	public SimulatorSSM getSsm() {
		return ssm;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	@Override
	public void addObserver(SimulatorObserver ob) {
		if(observers == null) {
			observers = new ArrayList<SimulatorObserver>();
		}
		observers.add(ob);
	}

}

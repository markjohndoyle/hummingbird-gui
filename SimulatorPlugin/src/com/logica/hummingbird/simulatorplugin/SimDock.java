package com.logica.hummingbird.simulatorplugin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.FutureTask;

import com.google.gson.Gson;
import com.logica.hummingbird.simulator.SimulatorSSM;
import com.logica.hummingbird.spacesystemmodel.Container;
import com.logica.hummingbird.spacesystemmodel.ContainerFactory;
import com.logica.hummingbird.spacesystemmodel.exceptions.UnknownContainerNameException;
import com.logica.hummingbird.spacesystemmodel.parameters.ParameterContainer;

public class SimDock implements SimulatorDock {

	static SimDock instance;
	SimulatorSSM ssm;
	List<SimulatorObserver> observers;
	Gson gson;
	List<FutureTask> simThreads;

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

		if (observers != null) {
			for (SimulatorObserver ob : observers) {
				ob.spaceSystemUpdated(spaceSystemModelFactory);
			}
		}
	}

	public List<ParameterContainer> getAllParameters() {
		if (ssm != null) {
			System.out.println("Getting all parameters form the simdocks ssm simulator");
			return new ArrayList<ParameterContainer>(ssm.getAllParameters());
		}
		else {
			return null;
		}
	}

	public final SimulatorSSM getSpaceSystemModel() {
		return ssm;
	}

	public final void runSim() {
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
		if (observers == null) {
			observers = new ArrayList<SimulatorObserver>();
		}
		observers.add(ob);
	}

	public Collection<Container> getAllContainers() {
		if (ssm != null) {
			return ssm.getAllContainers();
		}
		else {
			return null;
		}
	}

}

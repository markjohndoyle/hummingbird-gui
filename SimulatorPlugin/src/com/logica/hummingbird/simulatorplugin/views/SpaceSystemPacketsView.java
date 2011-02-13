package com.logica.hummingbird.simulatorplugin.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.logica.hummingbird.simulatorplugin.SimDock;
import com.logica.hummingbird.simulatorplugin.SimulatorObserver;
import com.logica.hummingbird.spacesystemmodel.ContainerFactory;

public class SpaceSystemPacketsView extends ViewPart implements SimulatorObserver {
	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.logica.hummingbird.simulatorplugin.views.SpaceSystemPacketsView";

	public SpaceSystemPacketsView() {
		SimDock.getInstance().addObserver(this);
	}

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void spaceSystemUpdated(ContainerFactory spaceSystemModel) {
		// TODO Auto-generated method stub
		
	}

}

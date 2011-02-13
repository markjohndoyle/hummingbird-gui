package com.logica.hummingbird.simulatorplugin;

import com.logica.hummingbird.spacesystemmodel.ContainerFactory;

public interface SimulatorObserver {
	
	void spaceSystemUpdated(ContainerFactory spaceSystemModel);
}

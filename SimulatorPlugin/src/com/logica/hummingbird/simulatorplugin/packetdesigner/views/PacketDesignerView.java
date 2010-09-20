package com.logica.hummingbird.simulatorplugin.packetdesigner.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.logica.hummingbird.simulator.SimulatorSSM;
import com.logica.hummingbird.simulatorplugin.SimDock;

public class PacketDesignerView extends ViewPart {

	public static final String ID = "com.logica.hummingbird.simulatorplugin.views.packetdesigner";

	private SimulatorSSM sim = SimDock.getInstance().getSsm();

	public PacketDesignerView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		
//		graphicalViewer = createGraphicalViewer(parent);
	}

	@Override
	public void setFocus() {
//		graphicalViewer.getControl().setFocus();
	}

}
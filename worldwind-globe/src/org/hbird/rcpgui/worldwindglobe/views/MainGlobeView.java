package org.hbird.rcpgui.worldwindglobe.views;

import gov.nasa.worldwind.Model;
import gov.nasa.worldwind.WorldWind;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.awt.WorldWindowGLCanvas;

import java.awt.BorderLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class MainGlobeView extends ViewPart {

	public static final String ID = "org.hbird.rcpgui.worldwindglobe.views.MainGlobe";
	final static WorldWindowGLCanvas world = new WorldWindowGLCanvas();

	// Initialize the default WW layers
	static {
		initWorldWindLayerModel();
	}

	// Initialize WW model with default layers
	static void initWorldWindLayerModel() {
		Model model = (Model) WorldWind.createConfigurationComponent(AVKey.MODEL_CLASS_NAME);
		world.setModel(model);
	}


	public MainGlobeView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// GUI: an SWT composite on top
		Composite top = new Composite(parent, SWT.EMBEDDED);
		// top.setLayoutData(new GridData(GridData.FILL_BOTH));

		// Swing Frame and Panel
		java.awt.Frame worldFrame = SWT_AWT.new_Frame(top);
		java.awt.Panel panel = new java.awt.Panel(new java.awt.BorderLayout());

		worldFrame.add(panel);

		// Add the WWJ 3D OpenGL Canvas to the Swing Panel
		panel.add(world, BorderLayout.CENTER);

		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

}

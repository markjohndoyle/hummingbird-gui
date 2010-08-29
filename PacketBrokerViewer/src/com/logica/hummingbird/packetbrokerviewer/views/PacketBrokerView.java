package com.logica.hummingbird.packetbrokerviewer.views;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.ViewPart;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view shows data obtained from the model. The
 * sample creates a dummy model on the fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be presented in the view. Each view can present the
 * same model objects using different labels and icons, if needed. Alternatively, a single label provider can be shared
 * between views in order to ensure that objects of the same type are presented in the same way everywhere.
 * <p>
 */

public class PacketBrokerView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "packetbrokerviewer.views.PacketBrokerView";

	  static byte[] srcData = { (byte) 0x11, (byte) 0x11, (byte) 0x11, (byte) 0x00, (byte) 0x00,
	      (byte) 0x11, (byte) 0x11, (byte) 0x11, (byte) 0x11, (byte) 0x10, (byte) 0x00, (byte) 0x01,
	      (byte) 0x10, (byte) 0x00, (byte) 0x01, (byte) 0x11, (byte) 0x11, (byte) 0x00, (byte) 0x22,
	      (byte) 0x01, (byte) 0x10, (byte) 0x33, (byte) 0x00, (byte) 0x11, (byte) 0x10, (byte) 0x02,
	      (byte) 0x22, (byte) 0x01, (byte) 0x10, (byte) 0x33, (byte) 0x30, (byte) 0x01, (byte) 0x10,
	      (byte) 0x22, (byte) 0x22, (byte) 0x01, (byte) 0x10, (byte) 0x33, (byte) 0x33, (byte) 0x01,
	      (byte) 0x10, (byte) 0x22, (byte) 0x22, (byte) 0x01, (byte) 0x10, (byte) 0x33, (byte) 0x33,
	      (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
	      (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x11, (byte) 0x11, (byte) 0x01, (byte) 0x10,
	      (byte) 0x11, (byte) 0x11, (byte) 0x10, (byte) 0x01, (byte) 0x11, (byte) 0x11, (byte) 0x01,
	      (byte) 0x10, (byte) 0x11, (byte) 0x11, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x00,
	      (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x10, (byte) 0x44,
	      (byte) 0x44, (byte) 0x01, (byte) 0x10, (byte) 0x55, (byte) 0x55, (byte) 0x01, (byte) 0x10,
	      (byte) 0x44, (byte) 0x44, (byte) 0x01, (byte) 0x10, (byte) 0x55, (byte) 0x55, (byte) 0x01,
	      (byte) 0x10, (byte) 0x04, (byte) 0x44, (byte) 0x01, (byte) 0x10, (byte) 0x55, (byte) 0x50,
	      (byte) 0x01, (byte) 0x11, (byte) 0x00, (byte) 0x44, (byte) 0x01, (byte) 0x10, (byte) 0x55,
	      (byte) 0x00, (byte) 0x11, (byte) 0x11, (byte) 0x10, (byte) 0x00, (byte) 0x01, (byte) 0x10,
	      (byte) 0x00, (byte) 0x01, (byte) 0x11, (byte) 0x11, (byte) 0x11, (byte) 0x11, (byte) 0x00,
	      (byte) 0x00, (byte) 0x11, (byte) 0x11, (byte) 0x11, };
	
	
	/*
	 * The content provider class is responsible for providing objects to the view. It can wrap existing objects in
	 * adapters or simply return objects as-is. These objects may be sensitive to the current input of the view, or
	 * ignore it and always show the same content (like Task List, for example).
	 */


	

	/**
	 * The constructor.
	 */
	public PacketBrokerView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {

		// Create the help context id for the viewer's control
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
//		this.showView("org.eclipse.ui.console.ConsoleView");
		
		
		
		Display display = parent.getDisplay();
		
	    Color white = display.getSystemColor(SWT.COLOR_WHITE);
	    Color black = display.getSystemColor(SWT.COLOR_BLACK);
	    Color yellow = display.getSystemColor(SWT.COLOR_YELLOW);
	    Color red = display.getSystemColor(SWT.COLOR_RED);
	    Color green = display.getSystemColor(SWT.COLOR_GREEN);
	    Color blue = display.getSystemColor(SWT.COLOR_BLUE);

	    // Create a source ImageData of depth 4
	    PaletteData palette = new PaletteData(new RGB[] { black.getRGB(), white.getRGB(),
	        yellow.getRGB(), red.getRGB(), blue.getRGB(), green.getRGB() });
	    ImageData sourceData = new ImageData(16, 16, 4, palette, 1, srcData);
	    

	    Shell shell = parent.getShell();
	    final Image source = new Image(display, sourceData);
	    
	    Label label = new Label(parent,SWT.CENTER);
	    label.setImage(source);
	    
	    
//	    shell.addPaintListener(new PaintListener() {
//	      public void paintControl(PaintEvent e) {
//	        GC gc = e.gc;
//	        gc.drawImage(source, 20, 20);
//	      }
//	    });
//	    shell.setSize(150, 150);
//	    shell.open();

//	    while (!shell.isDisposed()) {
//	      if (!display.readAndDispatch())
//	        display.sleep();
//	    }
//	    source.dispose();
//	    display.dispose();
	    
	  }
	

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				PacketBrokerView.this.fillContextMenu(manager);
			}
		});
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
	}

	private void fillContextMenu(IMenuManager manager) {
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
	}

	private void makeActions() {
	}

	private void hookDoubleClickAction() {
	}

	private void showMessage(String message) {
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
	}
}
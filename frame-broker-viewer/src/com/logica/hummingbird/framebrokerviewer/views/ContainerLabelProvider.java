/**
 * 
 */
package com.logica.hummingbird.framebrokerviewer.views;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com.logica.hummingbird.framebroker.Container;
import com.logica.hummingbird.framebroker.IContainer;
import com.logica.hummingbird.framebroker.parameters.IParameter;
import com.logica.hummingbird.framebrokerviewer.FrameBrokerViewerPlugin;
import com.swtdesigner.ResourceManager;

/**
 * @author Mark Doyle
 * 
 */
public class ContainerLabelProvider implements ILabelProvider {

	@Override
	public Image getImage(Object element) {
		if (element instanceof IParameter) {
			return ResourceManager.getPluginImage(FrameBrokerViewerPlugin.getDefault(), "icons/transmit.png");
		}
		else if (element instanceof Container) {
			return ResourceManager.getPluginImage(FrameBrokerViewerPlugin.getDefault(), "icons/transmit_blue.png");
		}
		else {
			return null;
		}
	}

	@Override
	public String getText(Object element) {
		if (element instanceof IContainer) {
			return ((Container) element).getName();
		}
		else {
			return "Unknown IContainer type";
		}
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

}

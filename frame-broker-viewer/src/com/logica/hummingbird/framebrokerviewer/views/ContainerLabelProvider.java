/**
 * 
 */
package com.logica.hummingbird.framebrokerviewer.views;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com.logica.hummingbird.framebrokerviewer.FrameBrokerViewerPlugin;
import com.logica.hummingbird.spacesystemmodel.Container;
import com.logica.hummingbird.spacesystemmodel.ContainerImpl;
import com.logica.hummingbird.spacesystemmodel.parameters.Parameter;
import com.swtdesigner.ResourceManager;

/**
 * @author Mark Doyle
 * 
 */
public class ContainerLabelProvider implements ILabelProvider {

	@Override
	public Image getImage(Object element) {
		if (element instanceof Parameter) {
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
		if (element instanceof ContainerImpl) {
			return ((ContainerImpl)element).getName();
		}
		else {
			return "Unknown Container type";
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

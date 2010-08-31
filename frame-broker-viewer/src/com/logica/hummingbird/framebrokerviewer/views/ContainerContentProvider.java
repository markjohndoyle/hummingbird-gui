/**
 * 
 */
package com.logica.hummingbird.framebrokerviewer.views;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.logica.hummingbird.spacesystemmodel.Container;


/**
 * @author Mark Doyle
 * 
 */
public class ContainerContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getChildren(Object parentElement) {
		return toObjectArray(((Container)parentElement).getSubContainers());
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return ((Container)element).getSubContainers().size() > 0;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return toObjectArray(((Container)inputElement).getSubContainers());
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	private Object[] toObjectArray(List<Container> containers) {
		Object[] array = new Object[containers.size()];
		int count = 0;
		for(Container container : containers) {
			array[count] = container;
			count++;
		}
		return array;
	}

}

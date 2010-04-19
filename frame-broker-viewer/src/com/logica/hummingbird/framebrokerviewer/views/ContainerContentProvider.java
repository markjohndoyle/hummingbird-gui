/**
 * 
 */
package com.logica.hummingbird.framebrokerviewer.views;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.logica.hummingbird.framebroker.IContainer;

/**
 * @author Mark Doyle
 * 
 */
public class ContainerContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getChildren(Object parentElement) {
		return toObjectArray(((IContainer)parentElement).getSubContainers());
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return ((IContainer)element).getSubContainers().size() > 0;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return toObjectArray(((IContainer)inputElement).getSubContainers());
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	private Object[] toObjectArray(List<IContainer> containers) {
		Object[] array = new Object[containers.size()];
		int count = 0;
		for(IContainer container : containers) {
			array[count] = container;
			count++;
		}
		return array;
	}

}

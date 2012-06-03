/**
 *
 */
package org.hbird.rcpgui.tvtable.views;

import java.util.Iterator;

import org.eclipse.jface.databinding.viewers.IViewerUpdater;
import org.eclipse.jface.util.Util;
import org.eclipse.jface.viewers.AbstractTableViewer;
import org.eclipse.jface.viewers.IElementComparer;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * @author mark
 *
 */
public class RefreshAfterViewerUpdater implements IViewerUpdater {
	private final AbstractTableViewer viewer;

	/**
	 * Constructs a ViewerUpdater for updating the specified viewer.
	 *
	 * @param viewer
	 *            the viewer which will be updated through this instance.
	 */
	protected RefreshAfterViewerUpdater(final AbstractTableViewer viewer) {
		this.viewer = viewer;
	}

	@Override
	public void replace(final Object oldElement, final Object newElement, final int position) {
		viewer.getControl().setRedraw(false);
		remove(oldElement, position);
		insert(newElement, position);
		viewer.getControl().setRedraw(false);
	}

	@Override
	public void move(final Object element, final int oldPosition, final int newPosition) {
		viewer.getControl().setRedraw(false);
		if (isElementOrderPreserved()) {
			IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();

			remove(element, oldPosition);
			insert(element, newPosition);

			// Preserve selection
			if (selectionContains(selection, element)) {
				viewer.setSelection(selection);
			}
		}
		viewer.getControl().setRedraw(true);
	}

	boolean isElementOrderPreserved() {
		viewer.getControl().setRedraw(false);
		return viewer.getComparator() == null && viewer.getFilters().length == 0;
	}

	private boolean selectionContains(final IStructuredSelection selection, final Object element) {
		viewer.getControl().setRedraw(false);
		if (!selection.isEmpty()) {
			IElementComparer comparer = viewer.getComparer();
			for (Iterator iter = selection.iterator(); iter.hasNext();) {
				Object selectionElement = iter.next();
				if (comparer == null ? Util.equals(element, selectionElement) : comparer.equals(element, selectionElement)) {
					viewer.getControl().setRedraw(true);
					return true;
				}
			}
		}
		viewer.getControl().setRedraw(true);
		return false;
	}

	@Override
	public void insert(final Object element, final int position) {
		viewer.getControl().setRedraw(false);
		viewer.insert(element, position);
		viewer.getControl().setRedraw(true);
	}

	@Override
	public void remove(final Object element, final int position) {
		viewer.getControl().setRedraw(false);
		viewer.remove(element);
		viewer.getControl().setRedraw(true);
	}

	@Override
	public void add(final Object[] elements) {
		viewer.getControl().setRedraw(false);
		viewer.add(elements);
		viewer.getControl().setRedraw(true);
	}

	@Override
	public void remove(final Object[] elements) {
		viewer.getControl().setRedraw(false);
		viewer.remove(elements);
		viewer.getControl().setRedraw(true);
	}
}

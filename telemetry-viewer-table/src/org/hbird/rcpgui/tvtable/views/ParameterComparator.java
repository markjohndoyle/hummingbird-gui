package org.hbird.rcpgui.tvtable.views;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.hbird.core.commons.tmtc.Parameter;

/**
 * Thanks to Lars Vogel!
 *
 * @author Mark Doyle
 *
 */
public class ParameterComparator extends ViewerComparator {

	private int propertyIndex;
	private static final int DESCENDING = 1;
	private int direction = DESCENDING;

	public ParameterComparator() {
		this.propertyIndex = 0;
		direction = DESCENDING;
	}

	public int getDirection() {
		return direction == 1 ? SWT.DOWN : SWT.UP;
	}

	public void setColumn(final int column) {
		if (column == this.propertyIndex) {
			// Same column as last sort; toggle the direction
			direction = 1 - direction;
		}
		else {
			// New column; do an ascending sort
			this.propertyIndex = column;
			direction = DESCENDING;
		}
	}

	@Override
	public int compare(final Viewer viewer, final Object e1, final Object e2) {
		if(e1 == null || e2 == null) {
			return 0;
		}

		Parameter<?> p1 = (Parameter<?>) e1;
		Parameter<?> p2 = (Parameter<?>) e2;

		int rc = 0;

		switch (propertyIndex) {
			case 0:
				rc = p1.getName().compareTo(p2.getName());
				break;
			case 1:
				break;
			case 2:
				Long p1Stamp = p1.getReceivedTime();
				Long p2Stamp = p2.getReceivedTime();
				rc = p1Stamp.compareTo(p2Stamp);
				break;
			default:
				rc = 0;
		}
		// If descending order, flip the direction
		if (direction == DESCENDING) {
			rc = -rc;
		}
		return rc;
	}
}

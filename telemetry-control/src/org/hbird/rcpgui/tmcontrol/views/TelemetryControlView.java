package org.hbird.rcpgui.tmcontrol.views;

import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.part.ViewPart;

public class TelemetryControlView extends ViewPart {
	private Table table;

	public TelemetryControlView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(final Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new TableColumnLayout());

		TableViewer tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
	}

	@Override
	public void setFocus() {
	}

}

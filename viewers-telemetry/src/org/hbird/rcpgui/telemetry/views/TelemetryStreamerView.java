package org.hbird.rcpgui.telemetry.views;

import java.util.ArrayList;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.telemetry.ViewersTelemetryActivator;
import org.hbird.rcpgui.telemetryprovision.model.ParameterSource;

public class TelemetryStreamerView extends ViewPart {
	private class TableLabelProvider extends LabelProvider implements ITableLabelProvider {
		@Override
		public Image getColumnImage(final Object element, final int columnIndex) {
			return null;
		}

		@Override
		public String getColumnText(final Object element, final int columnIndex) {
			return element.toString();
		}
	}

	private ParameterSource parameterSource;
	private ArrayList<ParameterProvider> parameterProviderServices;
	private Table table;
	private TableViewer tableViewer;

	public TelemetryStreamerView() {
		final Object[] serviceObjects = ViewersTelemetryActivator.getParameterProviderServiceTracker().getServices();
		if (serviceObjects.length > 0) {
			this.parameterProviderServices = new ArrayList<ParameterProvider>(serviceObjects.length);
			for (final Object o : serviceObjects) {
				parameterProviderServices.add((ParameterProvider) o);
			}
		}
		this.setParameterSource(new ParameterSource(parameterProviderServices.get(0)));
	}

	@Override
	public void createPartControl(final Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		TableColumnLayout tcl_composite = new TableColumnLayout();
		composite.setLayout(tcl_composite);

		tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION | SWT.VIRTUAL);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnName = tableViewerColumn.getColumn();
		tcl_composite.setColumnData(tblclmnName, new ColumnPixelData(150, true, true));
		tblclmnName.setText("Name");

		initDataBindings();

	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();

		tableViewer.setContentProvider(new ArrayContentProvider());

		IObservableSet liveParamObserver = BeansObservables.observeSet(parameterSource, "liveParameterQueue");
		tableViewer.setInput(liveParamObserver);

		tableViewer.setLabelProvider(new TableLabelProvider());

		return bindingContext;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public void setParameterSource(final ParameterSource parameterSource) {
		this.parameterSource = parameterSource;
	}

	public ParameterSource getParameterSource() {
		return parameterSource;
	}

}

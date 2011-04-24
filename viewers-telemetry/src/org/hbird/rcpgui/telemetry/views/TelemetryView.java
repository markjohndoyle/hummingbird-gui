package org.hbird.rcpgui.telemetry.views;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.ResourceManager;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.telemetryprovision.model.TelemetryParameter;
import org.hbird.rcpgui.telemetryprovision.source.ParameterSource;

/**
 * Simple telemetry viewer
 * 
 * TODO retrieval mode
 * 
 * TODO different update methodologies
 * 
 * @author Mark Doyle
 * 
 */
public class TelemetryView extends ViewPart {

	/**
	 * Label provider that is aware of the quickfilter and will adjust the label based upon whether the parameter is
	 * being updated or not.
	 * 
	 * @author Mark Doyle
	 * 
	 */
	private class FilterAwareObservableMapLabelProvider extends ObservableMapLabelProvider implements IColorProvider {
		public FilterAwareObservableMapLabelProvider(final IObservableMap attributeMap) {
			super(attributeMap);
		}

		public FilterAwareObservableMapLabelProvider(final IObservableMap[] attributeMaps) {
			super(attributeMaps);
		}

		@Override
		public Color getBackground(final Object element) {
			return null;
		}

		@Override
		public Color getForeground(final Object element) {
			String parameterName = ((TelemetryParameter) element).getName();
			if (quickFilterEnabled) {
				if (StringUtils.equals(getCurrentQuickfilter(), parameterName)) {
					return ResourceManager.getColor(70, 130, 180);
				}
				else {
					return ResourceManager.getColor(248, 48, 48);
				}
			}
			else {
				return null;
			}
		}
	}

	private static final String QUICK_FILTER_DEFAULT_TEXT = "Quick filter on Parameter name";

	private DataBindingContext m_bindingContext;
	public static final String ID = "org.hbird.rcpgui.telemetry.views.TelemetryView"; //$NON-NLS-1$
	private Table telemetryTable;
	private final ParameterSource parametersSource;
	private TableViewer tableViewer;

	private TableColumn tblclmnNameColumn;
	private ComboViewer comboViewer;
	private Text quickFilter;

	private String currentQuickfilter;
	private boolean quickFilterEnabled = false;

	private Button btnClearQuickFilter;

	public TelemetryView() {
		parametersSource = new ParameterSource(true);
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(final Composite parent) {
		final Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		{
			final Composite composite = new Composite(container, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			composite.setLayout(new GridLayout(2, false));
			{
				final Label lblTmProvider = new Label(composite, SWT.NONE);
				lblTmProvider.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
				lblTmProvider.setText("TM provider");
			}
			{
				comboViewer = new ComboViewer(composite, SWT.NONE);
				final Combo combo = comboViewer.getCombo();
				combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
			}
		}
		{
			final Composite telemetryTableComposite = new Composite(container, SWT.NONE);
			telemetryTableComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			final TableColumnLayout tcl_telemetryTableComposite = new TableColumnLayout();
			telemetryTableComposite.setLayout(tcl_telemetryTableComposite);
			{
				tableViewer = new TableViewer(telemetryTableComposite, SWT.BORDER | SWT.FULL_SELECTION);
				tableViewer.setColumnProperties(new String[] {});
				telemetryTable = tableViewer.getTable();
				telemetryTable.setHeaderVisible(true);
				telemetryTable.setLinesVisible(true);
				{
					final TableViewerColumn tableViewerColumnParameterName = new TableViewerColumn(tableViewer, SWT.NONE);
					tblclmnNameColumn = tableViewerColumnParameterName.getColumn();
					tcl_telemetryTableComposite.setColumnData(tblclmnNameColumn, new ColumnPixelData(150, true, true));
					tblclmnNameColumn.setText("Parameter Name");
				}
				{
					final TableViewerColumn tableViewerColumnValue = new TableViewerColumn(tableViewer, SWT.NONE);
					final TableColumn tblclmnValueColumn = tableViewerColumnValue.getColumn();
					tcl_telemetryTableComposite.setColumnData(tblclmnValueColumn, new ColumnPixelData(150, true, true));
					tblclmnValueColumn.setText("Value");
				}
				{
					final TableViewerColumn tableViewerColumnScTime = new TableViewerColumn(tableViewer, SWT.NONE);
					final TableColumn tblclmnSpacecraftTimestampColumn = tableViewerColumnScTime.getColumn();
					tcl_telemetryTableComposite.setColumnData(tblclmnSpacecraftTimestampColumn, new ColumnPixelData(150, true, true));
					tblclmnSpacecraftTimestampColumn.setText("Spacecraft Timestamp");
				}
			}
		}
		{
			Composite quickFilterComposite = new Composite(container, SWT.NONE);
			quickFilterComposite.setLayout(new GridLayout(2, false));
			{
				quickFilter = new Text(quickFilterComposite, SWT.BORDER | SWT.H_SCROLL | SWT.SEARCH | SWT.CANCEL);
				quickFilter.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(final KeyEvent e) {
						if (e.keyCode == '\r') {
							quickFilter();
						}
					}
				});
				quickFilter.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(final FocusEvent e) {
						if (!quickFilterEnabled) {
							quickFilter.setText("");
						}
					}

					@Override
					public void focusLost(final FocusEvent e) {
						if (StringUtils.isEmpty(quickFilter.getText())) {
							resetQuickFiltering();
						}
					}

				});
				quickFilter.setToolTipText("Filter the telemetry table using a keyword, for example parameter name.");
				quickFilter.setText(QUICK_FILTER_DEFAULT_TEXT);
			}
			{
				btnClearQuickFilter = new Button(quickFilterComposite, SWT.NONE);
				btnClearQuickFilter.setToolTipText("Reset the filter");
				btnClearQuickFilter.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseUp(final MouseEvent e) {
						resetQuickFiltering();
					}
				});
				btnClearQuickFilter.setImage(ResourceManager.getPluginImage("rg.hbird.rcpgui.viewers.telemetry", "icons/cross-script.png"));
			}
		}
		m_bindingContext = initDataBindings();
	}

	public String getCurrentQuickfilter() {
		return currentQuickfilter;
	}

	/**
	 * @return the parametersModel
	 */
	public ParameterSource getParametersModel() {
		return parametersSource;
	}


	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		tableViewer.setContentProvider(listContentProvider);
		//
		IObservableMap[] observeMaps = PojoObservables.observeMaps(listContentProvider.getKnownElements(), TelemetryParameter.class, new String[] { "name",
				"value", "spacecraftTimestamp", "shortDescription", "longDescription" });
		tableViewer.setLabelProvider(new FilterAwareObservableMapLabelProvider(observeMaps));
		//
		IObservableList parametersModelLiveParameterListObserveList = BeansObservables.observeList(Realm.getDefault(), parametersSource, "liveParameterList");
		tableViewer.setInput(parametersModelLiveParameterListObserveList);
		//
		ObservableListContentProvider listContentProvider_1 = new ObservableListContentProvider();
		comboViewer.setContentProvider(listContentProvider_1);
		//
		IObservableMap observeMap = PojoObservables.observeMap(listContentProvider_1.getKnownElements(), ParameterProvider.class, "providerName");
		comboViewer.setLabelProvider(new ObservableMapLabelProvider(observeMap));
		//
		WritableList writableList = new WritableList(parametersSource.getParameterProviderServices(), ParameterProvider.class);
		comboViewer.setInput(writableList);
		//
		IObservableValue comboViewerObserveSingleSelection = ViewersObservables.observeSingleSelection(comboViewer);
		IObservableValue parameterSourceCurrentParameterProviderValue = BeansObservables.observeValue(parametersSource, "parameterProvider");
		bindingContext.bindValue(comboViewerObserveSingleSelection, parameterSourceCurrentParameterProviderValue, null, null);
		//
		return bindingContext;
	}

	/**
	 * Applies a quick parameter name filter to the parameter source. Only one quick filter can be active so the
	 * existing filter is removed first.
	 */
	private void quickFilter() {
		// If the current filter is not the same as the new filter...
		if (!StringUtils.equals(currentQuickfilter, quickFilter.getText())) {
			// remove the old filter (only one quick filter at a time)
			parametersSource.removeParameterNameFilter(currentQuickfilter);
		}

		if (!StringUtils.isBlank(quickFilter.getText())) {
			// set the new filter to the current filter
			currentQuickfilter = quickFilter.getText();
			// add the new filter to the parameter source to restrict what TM parameters we receive.
			parametersSource.addNameFilter(currentQuickfilter);
			quickFilterEnabled = true;
		}
		else {
			quickFilterEnabled = false;
		}

		tableViewer.refresh();
	}

	/**
	 * Reset consists of changing the text field to the default text, setting the quickFiltering flag to false, removing
	 * the existing filter (if present), and setting the current filter to null.
	 */
	private void resetQuickFiltering() {
		quickFilter.setText(QUICK_FILTER_DEFAULT_TEXT);
		quickFilterEnabled = false;
		if (currentQuickfilter != null) {
			parametersSource.removeParameterNameFilter(currentQuickfilter);
		}
		currentQuickfilter = null;
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	public void setQuickFilterForeground(final Color foreground) {
		quickFilter.setForeground(foreground);
	}
}

package org.hbird.rcpgui.telemetrychart.views;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableSetContentProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.telemetrychart.converters.DateToJodaDateTime;
import org.hbird.rcpgui.telemetrychart.converters.DateToMilliseconds;
import org.hbird.rcpgui.telemetrychart.filter.ParameterNameFilter;
import org.hbird.rcpgui.telemetrychart.model.FilterFormModel;
import org.hbird.rcpgui.telemetrychart.model.SpaceSystemParameterModel;

public class ChartView extends ViewPart {
	/** The ID of the view as specified by the extension. */
	public static final String ID = "org.hbird.rcpgui.telemetrychart.views.ChartView";

	private DataBindingContext m_bindingContext;

	private SpaceSystemParameterModel spaceSystemParametersModel;

	private final FilterFormModel formModel = new FilterFormModel();

	private ListViewer listViewer;

	private final ParameterNameFilter nameFilter = new ParameterNameFilter("");
	private DateTime fromDate;
	private DateTime fromTime;
	private DateTime toDate;
	private DateTime toTime;
	private Button btnUseTimeFilter;

	/**
	 * The constructor.
	 */
	public ChartView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(final Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		final Composite composite_1 = new Composite(parent, SWT.NONE);
		composite_1.setLayout(new RowLayout(SWT.HORIZONTAL));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		final StyledText lblFilter = new StyledText(composite_1, SWT.BORDER | SWT.SHADOW_IN);
		lblFilter.setLayoutData(new RowData(188, SWT.DEFAULT));
		lblFilter.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(final ModifyEvent e) {
				System.out.println(lblFilter.getText());
				nameFilter.setName(lblFilter.getText());
				listViewer.addFilter(nameFilter);
			}
		});
		lblFilter.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));
		lblFilter.setDoubleClickEnabled(false);
		lblFilter.setToolTipText("Filter parameter list below");
		lblFilter.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		// FIXME The view is now coupled to setting up the model. Also, make this async.
		spaceSystemParametersModel.syncWithSpaceSystemPublisher();

		final Composite sashForm = new Composite(parent, SWT.SMOOTH);
		sashForm.setLayout(new GridLayout(2, false));
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		final Composite composite_3 = new Composite(sashForm, SWT.NONE);
		composite_3.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, true, 1, 1));
		composite_3.setLayout(new GridLayout(1, false));

		Label lblFrom = new Label(composite_3, SWT.NONE);
		lblFrom.setText("From");

		fromDate = new DateTime(composite_3, SWT.BORDER | SWT.DROP_DOWN);

		fromTime = new DateTime(composite_3, SWT.BORDER | SWT.TIME);
		fromTime.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

		Label lblTo = new Label(composite_3, SWT.NONE);
		lblTo.setText("To");

		toDate = new DateTime(composite_3, SWT.BORDER | SWT.DROP_DOWN);

		toTime = new DateTime(composite_3, SWT.BORDER | SWT.TIME);
		toTime.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

		btnUseTimeFilter = new Button(composite_3, SWT.CHECK);
		btnUseTimeFilter.setText("use time filter");

		final Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));

		listViewer = new ListViewer(composite, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);

		getSite().setSelectionProvider(listViewer);

		m_bindingContext = initDataBindings();
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
	}

	public SpaceSystemParameterModel getSpaceSystemParametersModel() {
		return spaceSystemParametersModel;
	}

	public void setSpaceSystemParametersModel(final SpaceSystemParameterModel spaceSystemParametersModel) {
		this.spaceSystemParametersModel = spaceSystemParametersModel;
	}

	public ListViewer getListViewer() {
		return listViewer;
	}

	public FilterFormModel getFormModel() {
		return formModel;
	}

	protected DataBindingContext initDataBindings() {
		final DataBindingContext bindingContext = new DataBindingContext();
		//
		final ObservableSetContentProvider setContentProvider = new ObservableSetContentProvider();
		final IObservableMap observeMap = PojoObservables.observeMap(setContentProvider.getKnownElements(), Parameter.class, "name");
		listViewer.setLabelProvider(new ObservableMapLabelProvider(observeMap));
		listViewer.setContentProvider(setContentProvider);
		//
		final IObservableSet spaceSystemParametersModelParametersObserveSet = BeansObservables.observeSet(Realm.getDefault(), spaceSystemParametersModel,
				"parameters");
		listViewer.setInput(spaceSystemParametersModelParametersObserveSet);
		//
		final IObservableValue dateTimeObserveSelectionObserveWidget_1 = SWTObservables.observeSelection(fromDate);
		final IObservableValue formModelFromDateObserveValue = PojoObservables.observeValue(formModel, "fromDate");
		final UpdateValueStrategy strategy_2 = new UpdateValueStrategy();
		strategy_2.setConverter(new DateToJodaDateTime());
		bindingContext.bindValue(dateTimeObserveSelectionObserveWidget_1, formModelFromDateObserveValue, strategy_2, null);
		//
		final IObservableValue dateTime_1ObserveSelectionObserveWidget = SWTObservables.observeSelection(fromTime);
		final IObservableValue formModelFromTimeObserveValue = PojoObservables.observeValue(formModel, "fromTime");
		final UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new DateToMilliseconds());
		bindingContext.bindValue(dateTime_1ObserveSelectionObserveWidget, formModelFromTimeObserveValue, strategy, null);
		//
		final IObservableValue dateTime_2ObserveSelectionObserveWidget = SWTObservables.observeSelection(toDate);
		final IObservableValue formModelToDateObserveValue = PojoObservables.observeValue(formModel, "toDate");
		final UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new DateToJodaDateTime());
		bindingContext.bindValue(dateTime_2ObserveSelectionObserveWidget, formModelToDateObserveValue, strategy_1, null);
		//
		final IObservableValue dateTime_3ObserveSelectionObserveWidget = SWTObservables.observeSelection(toTime);
		final IObservableValue formModelToTimeObserveValue = PojoObservables.observeValue(formModel, "toTime");
		final UpdateValueStrategy strategy_3 = new UpdateValueStrategy();
		strategy_3.setConverter(new DateToMilliseconds());
		bindingContext.bindValue(dateTime_3ObserveSelectionObserveWidget, formModelToTimeObserveValue, strategy_3, null);
		//
		final IObservableValue btnUseTimeFilterObserveSelectionObserveWidget = SWTObservables.observeSelection(btnUseTimeFilter);
		final IObservableValue formModelUseTimeObserveValue = PojoObservables.observeValue(formModel, "useTime");
		bindingContext.bindValue(btnUseTimeFilterObserveSelectionObserveWidget, formModelUseTimeObserveValue, null, null);
		//
		return bindingContext;
	}
}
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
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
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

	private final FilterFormModel formModel=  new FilterFormModel();

	private ListViewer listViewer;

	private final ParameterNameFilter nameFilter = new ParameterNameFilter("");
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private DateTime dateTime;
	private DateTime dateTime_1;
	private DateTime dateTime_2;
	private DateTime dateTime_3;
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

		final SashForm sashForm = new SashForm(parent, SWT.SMOOTH);
		sashForm.setSashWidth(5);
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		final Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));

		listViewer = new ListViewer(composite, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);

		getSite().setSelectionProvider(listViewer);

		final Composite composite_2 = new Composite(sashForm, SWT.BORDER);
		composite_2.setLayout(new GridLayout(1, false));

		final ScrolledForm scrldfrmNewScrolledform = formToolkit.createScrolledForm(composite_2);
		scrldfrmNewScrolledform.getBody().setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		scrldfrmNewScrolledform.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.paintBordersFor(scrldfrmNewScrolledform);
		scrldfrmNewScrolledform.setText("Filters");
		scrldfrmNewScrolledform.getBody().setLayout(null);

		final ExpandableComposite xpndblcmpstDateTime = formToolkit.createExpandableComposite(scrldfrmNewScrolledform.getBody(), ExpandableComposite.TWISTIE);
		xpndblcmpstDateTime.setBounds(0, 0, 279, 98);
		formToolkit.paintBordersFor(xpndblcmpstDateTime);
		xpndblcmpstDateTime.setText("Date time");
		xpndblcmpstDateTime.setExpanded(true);

		final Composite composite_3 = formToolkit.createComposite(xpndblcmpstDateTime, SWT.NONE);
		composite_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		formToolkit.paintBordersFor(composite_3);
		xpndblcmpstDateTime.setClient(composite_3);
		composite_3.setLayout(new FormLayout());

		final Label lblFrom = formToolkit.createLabel(composite_3, "From", SWT.NONE);
		final FormData fd_lblFrom = new FormData();
		fd_lblFrom.top = new FormAttachment(0, 21);
		fd_lblFrom.left = new FormAttachment(0, 10);
		lblFrom.setLayoutData(fd_lblFrom);

		dateTime = new DateTime(composite_3, SWT.BORDER | SWT.DROP_DOWN);
		final FormData fd_dateTime = new FormData();
		fd_dateTime.top = new FormAttachment(0, 1);
		fd_dateTime.left = new FormAttachment(0, 44);
		dateTime.setLayoutData(fd_dateTime);
		formToolkit.adapt(dateTime);
		formToolkit.paintBordersFor(dateTime);

		dateTime_1 = new DateTime(composite_3, SWT.BORDER | SWT.TIME);
		final FormData fd_dateTime_1 = new FormData();
		fd_dateTime_1.right = new FormAttachment(0, 139);
		fd_dateTime_1.top = new FormAttachment(0, 31);
		fd_dateTime_1.left = new FormAttachment(0, 44);
		dateTime_1.setLayoutData(fd_dateTime_1);
		formToolkit.adapt(dateTime_1);
		formToolkit.paintBordersFor(dateTime_1);

		final Label lblTo = new Label(composite_3, SWT.NONE);
		final FormData fd_lblTo = new FormData();
		fd_lblTo.top = new FormAttachment(0, 21);
		fd_lblTo.left = new FormAttachment(0, 155);
		lblTo.setLayoutData(fd_lblTo);
		formToolkit.adapt(lblTo, true, true);
		lblTo.setText("to");

		dateTime_2 = new DateTime(composite_3, SWT.BORDER | SWT.DROP_DOWN);
		final FormData fd_dateTime_2 = new FormData();
		fd_dateTime_2.top = new FormAttachment(dateTime, 0, SWT.TOP);
		fd_dateTime_2.left = new FormAttachment(lblTo, 18);
		dateTime_2.setLayoutData(fd_dateTime_2);
		formToolkit.adapt(dateTime_2);
		formToolkit.paintBordersFor(dateTime_2);

		dateTime_3 = new DateTime(composite_3, SWT.BORDER | SWT.TIME);
		final FormData fd_dateTime_3 = new FormData();
		fd_dateTime_3.bottom = new FormAttachment(dateTime_1, 0, SWT.BOTTOM);
		fd_dateTime_3.left = new FormAttachment(lblTo, 18);
		fd_dateTime_3.right = new FormAttachment(dateTime_2, 0, SWT.RIGHT);
		dateTime_3.setLayoutData(fd_dateTime_3);
		formToolkit.adapt(dateTime_3);
		formToolkit.paintBordersFor(dateTime_3);

		btnUseTimeFilter = new Button(composite_3, SWT.FLAT | SWT.CHECK);
		final FormData fd_btnUseTimeFilter = new FormData();
		fd_btnUseTimeFilter.left = new FormAttachment(lblFrom, 0, SWT.LEFT);
		fd_btnUseTimeFilter.top = new FormAttachment(dateTime_1, 9);
		btnUseTimeFilter.setLayoutData(fd_btnUseTimeFilter);
		formToolkit.adapt(btnUseTimeFilter, true, true);
		btnUseTimeFilter.setText("use time filter");
		sashForm.setWeights(new int[] {224, 357});

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
		final IObservableSet spaceSystemParametersModelParametersObserveSet = BeansObservables.observeSet(Realm.getDefault(), spaceSystemParametersModel, "parameters");
		listViewer.setInput(spaceSystemParametersModelParametersObserveSet);
		//
		final IObservableValue dateTimeObserveSelectionObserveWidget_1 = SWTObservables.observeSelection(dateTime);
		final IObservableValue formModelFromDateObserveValue = PojoObservables.observeValue(formModel, "fromDate");
		final UpdateValueStrategy strategy_2 = new UpdateValueStrategy();
		strategy_2.setConverter(new DateToJodaDateTime());
		bindingContext.bindValue(dateTimeObserveSelectionObserveWidget_1, formModelFromDateObserveValue, strategy_2, null);
		//
		final IObservableValue dateTime_1ObserveSelectionObserveWidget = SWTObservables.observeSelection(dateTime_1);
		final IObservableValue formModelFromTimeObserveValue = PojoObservables.observeValue(formModel, "fromTime");
		final UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new DateToMilliseconds());
		bindingContext.bindValue(dateTime_1ObserveSelectionObserveWidget, formModelFromTimeObserveValue, strategy, null);
		//
		final IObservableValue dateTime_2ObserveSelectionObserveWidget = SWTObservables.observeSelection(dateTime_2);
		final IObservableValue formModelToDateObserveValue = PojoObservables.observeValue(formModel, "toDate");
		final UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new DateToJodaDateTime());
		bindingContext.bindValue(dateTime_2ObserveSelectionObserveWidget, formModelToDateObserveValue, strategy_1, null);
		//
		final IObservableValue dateTime_3ObserveSelectionObserveWidget = SWTObservables.observeSelection(dateTime_3);
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
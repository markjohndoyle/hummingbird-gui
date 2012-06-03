package org.hbird.rcpgui.telemetrychart.views;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableSetContentProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.telemetrychart.filter.ParameterNameFilter;
import org.hbird.rcpgui.telemetrychart.model.ParameterModel;

public class ChartView extends ViewPart {
	/** The ID of the view as specified by the extension. */
	public static final String ID = "org.hbird.rcpgui.telemetrychart.views.ChartView";

	private DataBindingContext m_bindingContext;

	private ParameterModel spaceSystemParametersModel;

	private ListViewer listViewer;

	private final ParameterNameFilter nameFilter = new ParameterNameFilter("");

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

		Composite composite_1 = new Composite(parent, SWT.NONE);
		composite_1.setLayout(new FormLayout());
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		final StyledText lblFilter = new StyledText(composite_1, SWT.BORDER | SWT.SHADOW_IN);
		lblFilter.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(final ModifyEvent e) {
				System.out.println(lblFilter.getText());
				nameFilter.setName(lblFilter.getText());
				listViewer.addFilter(nameFilter);
			}
		});
		FormData fd_lblFilter = new FormData();
		fd_lblFilter.top = new FormAttachment(0, 1);
		fd_lblFilter.right = new FormAttachment(100);
		fd_lblFilter.left = new FormAttachment(100, -162);
		lblFilter.setLayoutData(fd_lblFilter);
		lblFilter.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));
		lblFilter.setDoubleClickEnabled(false);
		lblFilter.setToolTipText("Filter parameter list below");
		lblFilter.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		listViewer = new ListViewer(composite, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);

		// FIXME not nice. The view is now coupled to setting up the model.
		spaceSystemParametersModel.syncWithSpaceSystemPublisher();

		getSite().setSelectionProvider(listViewer);

		m_bindingContext = initDataBindings();
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
	}

	public ParameterModel getSpaceSystemParametersModel() {
		return spaceSystemParametersModel;
	}

	public void setSpaceSystemParametersModel(final ParameterModel spaceSystemParametersModel) {
		this.spaceSystemParametersModel = spaceSystemParametersModel;
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableSetContentProvider setContentProvider = new ObservableSetContentProvider();
		IObservableMap observeMap = PojoObservables.observeMap(setContentProvider.getKnownElements(), Parameter.class, "name");
		listViewer.setLabelProvider(new ObservableMapLabelProvider(observeMap));
		listViewer.setContentProvider(setContentProvider);
		//
		IObservableSet spaceSystemParametersModelParametersObserveSet = BeansObservables.observeSet(Realm.getDefault(), spaceSystemParametersModel, "parameters");
		listViewer.setInput(spaceSystemParametersModelParametersObserveSet);
		//
		return bindingContext;
	}

	public ListViewer getListViewer() {
		return listViewer;
	}
}
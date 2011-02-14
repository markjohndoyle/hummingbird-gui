package org.hbird.rcpgui.telemetry.views;


import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.hbird.rcpgui.telemetry.model.ModelCreator;
import org.hbird.rcpgui.telemetry.model.TelemetryParameter;


/**
 * This sample class demonstrates how to plug-in a new workbench view. The view shows data obtained from the model. The
 * sample creates a dummy model on the fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be presented in the view. Each view can present the
 * same model objects using different labels and icons, if needed. Alternatively, a single label provider can be shared
 * between views in order to ensure that objects of the same type are presented in the same way everywhere.
 * <p>
 */
public class TelemetryTable extends ViewPart {
	private DataBindingContext m_bindingContext;

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.hbird.rcpgui.telemetry.views.TelemetryTable";

	private TableViewer viewer;

	private ModelCreator parametersModel = new ModelCreator();

	/**
	 * The constructor.
	 */
	public TelemetryTable() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(final Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		final GridData gd_composite = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_composite.heightHint = 27;
		composite.setLayoutData(gd_composite);

		final Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText("New Label");

		final Label parameterReceivedLabel = new Label(composite, SWT.NONE);
		parameterReceivedLabel.setText("New Label");
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		final Table table = viewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.hbird.rcpgui.telemetry.viewer");
		makeActions();
		hookContextMenu();
		contributeToActionBars();
		m_bindingContext = initDataBindings();
	}

	private void hookContextMenu() {
		final MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			@Override
			public void menuAboutToShow(final IMenuManager manager) {
				TelemetryTable.this.fillContextMenu(manager);
			}
		});
		final Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		final IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(final IMenuManager manager) {
		manager.add(new Separator());
	}

	private void fillContextMenu(final IMenuManager manager) {
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(final IToolBarManager manager) {
	}

	private void makeActions() {
	}


	private void showMessage(final String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(), "TelemetryTable", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	protected DataBindingContext initDataBindings() {
		final DataBindingContext bindingContext = new DataBindingContext();
		//
		final ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		viewer.setContentProvider(listContentProvider);
		//
		final IObservableMap[] observeMaps = PojoObservables.observeMaps(listContentProvider.getKnownElements(), TelemetryParameter.class, new String[] {
			"longDescription", "name", "shortDescription" });
		viewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		//
		final IObservableList parametersModelParametersObserveList = PojoObservables.observeList(Realm.getDefault(), parametersModel, "parameters");
		viewer.setInput(parametersModelParametersObserveList);
		//
		return bindingContext;
	}
}
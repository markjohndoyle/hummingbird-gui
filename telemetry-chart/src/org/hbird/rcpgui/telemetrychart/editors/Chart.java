package org.hbird.rcpgui.telemetrychart.editors;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.parameterlistener.interfaces.NewParameterListener;
import org.hbird.rcpgui.parameterlistener.model.DefaultQueueParameterModel;
import org.hbird.rcpgui.telemetrychart.Activator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Chart extends EditorPart {

	public static final String ID = "org.hbird.rcpgui.telemetrychart.editors.Chart"; //$NON-NLS-1$

	private ParameterChartEditorInput input;
	private final DefaultQueueParameterModel model = new DefaultQueueParameterModel();

	private ServiceRegistration modelListenerServiceReg;

	public Chart() {
		registerModelListenerService(Activator.getDefault().getBundle().getBundleContext());
	}

	public void registerModelListenerService(final BundleContext context) {
		modelListenerServiceReg = context.registerService(NewParameterListener.class.getName(), model, null);
	}

	public void unregisterModelListenerService() {
		if (modelListenerServiceReg == null) {
			throw new IllegalStateException();
		}
		else {
			modelListenerServiceReg.unregister();
		}
	}

	/**
	 * Create contents of the editor part.
	 * @param parent
	 */
	@Override
	public void createPartControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		Label lblBlah = new Label(container, SWT.NONE);
		lblBlah.setBounds(138, 173, 55, 15);
		lblBlah.setText("blah");

	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public void doSave(final IProgressMonitor monitor) {
		// Do the Save operation
	}

	@Override
	public void doSaveAs() {
		// Do the Save As operation
	}

	@Override
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		if (!(input instanceof ParameterChartEditorInput)) {
			throw new RuntimeException("Wrong input");
		}

		ParameterChartEditorInput new_name = (ParameterChartEditorInput) input;
		this.input = (ParameterChartEditorInput) input;
		setSite(site);
		setInput(input);

		// TODO filter by names
//		(this.input.getParameterNames());
		List<Parameter<?>> parameters = model.getParameters();
		setPartName("Parameter plot");
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
}

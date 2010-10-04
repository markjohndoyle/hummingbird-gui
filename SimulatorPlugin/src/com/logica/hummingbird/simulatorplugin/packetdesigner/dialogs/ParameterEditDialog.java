package com.logica.hummingbird.simulatorplugin.packetdesigner.dialogs;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimParameter;
import com.logica.hummingbird.telemetry.HummingbirdParameter;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.core.databinding.beans.BeansObservables;

public class ParameterEditDialog extends Dialog {

	private DataBindingContext m_bindingContext;
	private SimParameter parameter;
	private Text text;
	private Text text_1;
	private Text txtObjectIsUnbindable;
	private Text text_3;
	private StyledText styledText;

	/**
	 * @wbp.parser.constructor
	 */
	public ParameterEditDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE);
	}

	public ParameterEditDialog(Shell parentShell, SimParameter simParameter) {
		super(parentShell);
		setSimParameter(simParameter, false);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		final GridLayout gridLayout = (GridLayout) container.getLayout();
		gridLayout.numColumns = 2;
		gridLayout.marginLeft = 4;
		gridLayout.marginLeft = 2;
		gridLayout.marginLeft = 1;
		container.setLayout(new GridLayout(2, false));
		// Component creation
		final Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Name");
		// Component creation
		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		// Component creation
		final Label lblType = new Label(container, SWT.NONE);
		lblType.setText("Type");
		// Component creation
		text_1 = new Text(container, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		// Component creation
		final Label lblValue = new Label(container, SWT.NONE);
		lblValue.setText("Value");
		// Component creation
		txtObjectIsUnbindable = new Text(container, SWT.BORDER);
		txtObjectIsUnbindable.setEnabled(false);
		txtObjectIsUnbindable.setText("Dynamically allocated Object is unbindable - I am working on this!");
		txtObjectIsUnbindable.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		// Component creation
		final Label lblShortDescription = new Label(container, SWT.NONE);
		GridData gd_lblShortDescription = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblShortDescription.widthHint = 109;
		lblShortDescription.setLayoutData(gd_lblShortDescription);
		lblShortDescription.setText("Short description");
		// Component creation
		text_3 = new Text(container, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		// Component creation
		final Group grpTest = new Group(container, SWT.NONE);
		grpTest.setText("Long description");
		grpTest.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 2, 1));
		grpTest.setLayout(new GridLayout(1, false));
		// Component creation
		TextViewer textViewer = new TextViewer(grpTest, SWT.BORDER);
		styledText = textViewer.getTextWidget();
		styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		if (parameter != null) {
			m_bindingContext = initDataBindings();
		}
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button button = createButton(parent, IDialogConstants.OK_ID, "Finish", true);
		button.setText("Finish");
		m_bindingContext = initDataBindings();
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}

	public HummingbirdParameter getSimPacketDesign() {
		return parameter;
	}

	public void setSimPacketDesign(SimParameter simParameter) {
		setSimParameter(simParameter, true);
	}

	public void setSimParameter(SimParameter simParameter, boolean update) {
		parameter = simParameter;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (parameter != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue textObserveTextObserveWidget_1 = SWTObservables.observeText(text, SWT.Modify);
		IObservableValue parameterNameObserveValue = BeansObservables.observeValue(parameter, "name");
		bindingContext.bindValue(textObserveTextObserveWidget_1, parameterNameObserveValue, null, null);
		//
		IObservableValue text_1ObserveTextObserveWidget = SWTObservables.observeText(text_1, SWT.Modify);
		IObservableValue parametergetClassTypeCanonicalNameObserveValue = PojoObservables.observeValue(parameter.getClassType(), "canonicalName");
		bindingContext.bindValue(text_1ObserveTextObserveWidget, parametergetClassTypeCanonicalNameObserveValue, null, null);
		//
		IObservableValue text_3ObserveTextObserveWidget = SWTObservables.observeText(text_3, SWT.Modify);
		IObservableValue parameterShortDescriptionObserveValue = BeansObservables.observeValue(parameter, "shortDescription");
		bindingContext.bindValue(text_3ObserveTextObserveWidget, parameterShortDescriptionObserveValue, null, null);
		//
		IObservableValue styledTextObserveTextObserveWidget = SWTObservables.observeText(styledText, SWT.Modify);
		IObservableValue parameterLongDescriptionObserveValue = BeansObservables.observeValue(parameter, "longDescription");
		bindingContext.bindValue(styledTextObserveTextObserveWidget, parameterLongDescriptionObserveValue, null, null);
		//
		return bindingContext;
	}
}

package com.logica.hummingbird.simulatorplugin.packetdesigner.wizards.pages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class NewOrExisting extends WizardPage {

	/**
	 * Create the wizard.
	 */
	public NewOrExisting() {
		super("wizardPage");
		setTitle("New parameter wizard");
		setDescription("Select parameter creation type");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		Button btnCreateANew = new Button(container, SWT.RADIO);
		btnCreateANew.setText("Create a new parameter");
		
		Button btnUseAnExisting = new Button(container, SWT.RADIO);
		btnUseAnExisting.setText("Use an existing parameter");
	}
}

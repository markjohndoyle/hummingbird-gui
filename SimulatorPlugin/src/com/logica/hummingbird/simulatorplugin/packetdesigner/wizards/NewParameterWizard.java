package com.logica.hummingbird.simulatorplugin.packetdesigner.wizards;

import org.eclipse.jface.wizard.Wizard;

import com.logica.hummingbird.simulatorplugin.packetdesigner.wizards.pages.NewOrExisting;

public class NewParameterWizard extends Wizard {

	public NewParameterWizard() {
		setWindowTitle("New Wizard");
	}

	@Override
	public void addPages() {
		addPage(new NewOrExisting());
	}

	@Override
	public boolean performFinish() {
		return false;
	}

}

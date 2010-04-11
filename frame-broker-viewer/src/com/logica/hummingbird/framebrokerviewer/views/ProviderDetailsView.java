package com.logica.hummingbird.framebrokerviewer.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class ProviderDetailsView extends ViewPart {
	
	Text providerName;

	public ProviderDetailsView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		providerName = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

}

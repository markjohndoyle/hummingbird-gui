package com.logica.hummingbird.simulatorplugin.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class SpaceSystemXmlEditor extends TextEditor {

	private ColorManager colorManager;

	public SpaceSystemXmlEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}

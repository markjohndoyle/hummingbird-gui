package org.hbird.rcpgui.worldwindglobe.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.hbird.rcpgui.worldwindglobe.WorldwindGlobeActivator;

/**
 */
public class GlobePreferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public GlobePreferences() {
		super(GRID);
		setPreferenceStore(WorldwindGlobeActivator.getDefault().getPreferenceStore());
		setDescription("3D globe preferences");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common GUI blocks needed to manipulate various
	 * types of preferences. Each field editor knows how to save and restore itself.
	 */
	@Override
	public void createFieldEditors() {
		addField(new StringFieldEditor(PreferenceConstants.LAT_TM_PARAMETER, "L&atitude parameter:", getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.LON_TM_PARAMETER, "L&ongitude parameter", getFieldEditorParent()));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(final IWorkbench workbench) {
	}

}
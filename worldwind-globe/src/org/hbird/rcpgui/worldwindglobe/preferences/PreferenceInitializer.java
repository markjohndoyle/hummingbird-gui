package org.hbird.rcpgui.worldwindglobe.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.hbird.rcpgui.worldwindglobe.WorldwindGlobeActivator;

/**
 * Class used to initialise default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = WorldwindGlobeActivator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.LAT_TM_PARAMETER, "Latitude");
		store.setDefault(PreferenceConstants.LON_TM_PARAMETER, "Longitude");
	}

}

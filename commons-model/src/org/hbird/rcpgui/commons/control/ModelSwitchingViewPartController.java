package org.hbird.rcpgui.commons.control;

import org.hbird.rcpgui.commons.model.ArchiveParameterFilterSettings;
import org.hbird.rcpgui.commons.model.LiveArchivedSwitchableModel;
import org.hbird.rcpgui.commons.model.LiveArchivedSwitchableModel.MODEL;

/**
 *
 * @author Mark Doyle
 *
 */
public class ModelSwitchingViewPartController implements ViewPartObserver {

	private LiveArchivedSwitchableModel model;

	@Override
	public void updatedFilterSettings(final ArchiveParameterFilterSettings newSettings) {
		model.updateFilters(newSettings);
	}

	@Override
	public void switchModel(final MODEL modelType) {
		model.switchModel(modelType);
	}

	public void setModel(final LiveArchivedSwitchableModel model) {
		this.model = model;
	}
}

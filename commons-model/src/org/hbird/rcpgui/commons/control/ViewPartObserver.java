package org.hbird.rcpgui.commons.control;

import org.hbird.rcpgui.commons.model.ArchiveParameterFilterSettings;
import org.hbird.rcpgui.commons.model.LiveArchivedSwitchableModel;

public interface ViewPartObserver {
	void switchModel(LiveArchivedSwitchableModel.MODEL modelType);

	void updatedFilterSettings(ArchiveParameterFilterSettings newSettings);
}

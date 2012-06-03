package org.hbird.rcpgui.commons.model;

public interface LiveArchivedSwitchableModel extends ArchiveModel {
	enum MODEL { LIVE, ARCHIVE };

	void switchModel(MODEL mode);
}

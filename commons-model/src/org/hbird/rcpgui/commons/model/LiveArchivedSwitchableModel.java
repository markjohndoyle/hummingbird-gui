package org.hbird.rcpgui.commons.model;

public interface LiveArchivedSwitchableModel {
	enum MODEL { LIVE, ARCHIVE };

	void switchModel(MODEL mode);

	void updateFilters(ArchiveParameterFilterSettings newFilters);
}

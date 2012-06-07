package org.hbird.rcpgui.ssprequester.interfaces;

import java.util.List;

import org.hbird.core.commons.tmtc.ParameterGroup;

public interface SpaceSystemPublisherRequester {
	List<ParameterGroup> requestParameterGroups();
	List<ParameterGroup> requestCommands();

	void asyncRequestParameterGroups(AsyncPublisherRequestListener l);
	void asyncRequestCommands(AsyncPublisherRequestListener l);
}

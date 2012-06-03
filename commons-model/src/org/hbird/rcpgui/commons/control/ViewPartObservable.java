package org.hbird.rcpgui.commons.control;

public interface ViewPartObservable {
	void addObserver(ViewPartObserver o);

	void removeObserver(ViewPartObserver o);
}

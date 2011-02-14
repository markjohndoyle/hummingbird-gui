package org.hbird.rcpgui.parameterprovider;

public interface ParameterProvider {
	void start() throws Exception;

	void stop();
	void addObserver(ParameterObserver po);
}

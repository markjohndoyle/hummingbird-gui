package org.hbird.rcpgui.parameterprovider;

import org.hbird.rcpgui.parameterprovider.model.GuiParameter;

public interface ParameterObserver {

	/**
	 * Called by the parameter provider whenever it receives a new Parameter
	 * 
	 * @param parameter
	 */
	void parameterRecieved(GuiParameter parameter);
}

package org.hbird.rcpgui.parameterprovider;

import org.hbird.rcpgui.parameterprovider.model.Parameter;

public interface ParameterObserver {

	/**
	 * Called by the parameter provider whenever it receives a new Parameter
	 * 
	 * @param parameter
	 */
	void parameterRecieved(Parameter parameter);

	// /**
	// * return a list of parameter names that this observer is interested in.
	// *
	// * @return
	// */
	// List<String> getInterestList();
	//
	// /**
	// * return a boolean if interested in all parameters. Any interest list will be ignored if this is true.
	// *
	// * @return
	// */
	// boolean isRequestingAllParameters();
}

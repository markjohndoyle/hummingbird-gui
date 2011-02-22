package org.hbird.rcpgui.parameterprovider;

import java.util.List;

import org.hbird.rcpgui.parameterprovider.model.Parameter;

public interface ParameterObserver {

	void parameterRecieved(Parameter parameter);

	/**
	 * return a list of parameter names that this observer is interested in.
	 * 
	 * @return
	 */
	List<String> getInterestList();

	/**
	 * return a boolean if interested in all parameters. Any interest list will be ignored is this is true.
	 * 
	 * @return
	 */
	boolean isRequestingAllParameters();
}

package org.hbird.rcp.tvtable.model;

import java.util.ArrayList;
import java.util.List;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.parameterprovider.interfaces.NewParameterListener;

public class ParametersModel implements NewParameterListener{

	private final List<Parameter<?>> parameters = new ArrayList<Parameter<?>>();

	public List<Parameter<?>> getParameters() {
		return parameters;
	}

	@Override
	public void newParameter(final Parameter<?> newParameter) {
		parameters.add(newParameter);
	}


}

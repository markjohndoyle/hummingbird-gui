package org.hbird.rcpgui.commons.model;

import org.hbird.rcpgui.parameterlistener.serviceinterfaces.NewParameterListener;

public interface PropertyFilterableNewParameterListener extends NewParameterListener {

	void addFilter(final String property, final Object value);

}

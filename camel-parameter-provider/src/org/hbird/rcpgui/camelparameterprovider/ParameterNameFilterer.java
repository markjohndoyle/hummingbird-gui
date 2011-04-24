package org.hbird.rcpgui.camelparameterprovider;

import java.util.HashSet;
import java.util.Set;

import org.apache.camel.Header;
import org.apache.commons.lang.StringUtils;

/**
 * Filters a route based upon a header called ParameterName. This filter bean can filter on multiple values, that is,
 * multiple ParameterNames.
 * 
 * @author Mark Doyle
 * 
 */
public class ParameterNameFilterer {

	Set<String> parameterNames = null;

	public void addParameterNameFitler(final String parameterName) {
		if (this.parameterNames == null) {
			this.parameterNames = new HashSet<String>(1);
		}
		this.parameterNames.add(parameterName);
	}

	public Set<String> getParameterNames() {
		return parameterNames;
	}

	public final boolean matches(@Header("ParameterName") final String headerParameterName) {
		boolean result = false;

		if (parameterNames == null) {
			result = true;
		}
		else if (parameterNames.size() > 0) {
			for (String parameterName : parameterNames) {
				// if the filter name matches the parameter in this message header
				if (StringUtils.equals(parameterName, headerParameterName)) {
					result = true;
				}
			}
		}
		else {
			// Parameter filters are empty so we return all messages.
			result = true;
		}

		return result;
	}

	public void removeAllParameterNameFilters() {
		this.parameterNames = null;
	}

	public void removeParameterNameFilter(final String parameterName) {
		if (this.parameterNames != null) {
			parameterNames.remove(parameterName);
		}
	}

	public void setParameterNames(final Set<String> parameterName) {
		this.parameterNames = parameterName;
	}

}

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

	/** The {@link Set} of parameter names that will be used to filter the parameter route */
	Set<String> parameterNames = null;

	/**
	 * Add a new parameter name to be filtered on.
	 * 
	 * @param parameterName
	 */
	public void addParameterNameFitler(final String parameterName) {
		if (this.parameterNames == null) {
			this.parameterNames = new HashSet<String>(1);
		}
		this.parameterNames.add(parameterName);
	}

	/**
	 * Return all parameter filter names.
	 * 
	 * @return
	 */
	public Set<String> getParameterNames() {
		return parameterNames;
	}

	/**
	 * Method that determines whether a Parameter message should be routed.
	 * 
	 * If there are no parameter names set, all parameter messages will be routed.
	 * 
	 * @param headerParameterName
	 * @return
	 */
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

	/**
	 * Remove all parameter filters. Essentially a filter reset.
	 */
	public void removeAllParameterNameFilters() {
		this.parameterNames = null;
	}

	/**
	 * Remove a specific filter.
	 * 
	 * @param parameterName
	 */
	public void removeParameterNameFilter(final String parameterName) {
		if (this.parameterNames != null) {
			parameterNames.remove(parameterName);
		}
	}

	/**
	 * Set a complete set of parameter name filters. Thsi will replace the existing filters.
	 * 
	 * TODO Remove this method? May cause devs a headache with unexpected useage.
	 * 
	 * @param parameterName
	 */
	public void setParameterNames(final Set<String> parameterName) {
		this.parameterNames = parameterName;
	}

}

package org.hbird.rcpgui.camelparameterprovider;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Header;
import org.apache.commons.lang.StringUtils;


public class ParameterFilterer {

	List<String> parameterNames = new ArrayList<String>(0);

	public final boolean filter(@Header("ParameterName") String headerParameterName) {
		System.out.println("Filtering on " + parameterNames.size() + " names");
		boolean result = true;

		if (parameterNames.size() > 0) {
			result = false;
			for (String parameterName : parameterNames) {
				// if the filter name matches the parameter in this message header
				if (StringUtils.equals(parameterName, headerParameterName)) {
					result = true;
				}
			}
		}

		return result;
	}

	public List<String> getParameterNames() {
		return parameterNames;
	}

	public void setParameterNames(List<String> parameterName) {
		this.parameterNames = parameterName;
	}

}

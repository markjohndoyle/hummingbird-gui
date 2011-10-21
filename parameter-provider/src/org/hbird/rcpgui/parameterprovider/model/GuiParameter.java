package org.hbird.rcpgui.parameterprovider.model;

import java.util.Map;

/**
 * Simple pojo representing a parameter for this gui.
 * 
 * Messages retrieved by the packet provider implementation must create one of this from the input.
 * 
 * @author Mark Doyle
 * 
 */
public class GuiParameter {

	private Map<String, Object> parameterProperties;
	private Object value;


	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public void setParameterProperties(Map<String, Object> parameterProperties) {
		this.parameterProperties = parameterProperties;
	}

	public Map<String, Object> getParameterProperties() {
		return parameterProperties;
	}

	@Override
	public String toString() {
		return "Parameter [parameterProperties=" + parameterProperties + ", value=" + value + "]";
	}


}

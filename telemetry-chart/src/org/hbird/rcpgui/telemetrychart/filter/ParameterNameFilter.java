package org.hbird.rcpgui.telemetrychart.filter;

import java.util.regex.Pattern;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.hbird.core.commons.tmtc.Parameter;

public class ParameterNameFilter extends ViewerFilter {

	private String name;

	public ParameterNameFilter(final String name) {
		this.name = name;
	}

	@Override
	public boolean select(final Viewer viewer, final Object parentElement, final Object element) {
		if(element instanceof Parameter<?>) {
			Parameter<?> p = (Parameter<?>) element;
			String paramName = p.getName();
			return Pattern.compile(Pattern.quote(name), Pattern.CASE_INSENSITIVE).matcher(paramName).find();
		}
		else {
			return false;
		}
	}

	public void setName(final String name) {
		this.name = name;
	}

}

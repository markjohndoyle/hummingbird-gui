package org.hbird.rcpgui.telemetrychart.editors;

import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class LiveParameterChartEditorInput implements IEditorInput {

	private final List<String> parameterNames;

	public LiveParameterChartEditorInput(final List<String> parameterNames) {
		System.out.println("Input created for " + parameterNames.size());
		this.parameterNames = parameterNames;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		final StringBuilder builder = new StringBuilder();
		int count = 1;
		for (final String name : parameterNames) {
			if (count == parameterNames.size()) {
				builder.append(name);
			}
			else {
				builder.append(name + ", ");
			}
			count++;
		}
		return builder.toString();
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return "Parameter ChartEditorPart";
	}

	public List<String> getParameterNames() {
		return parameterNames;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parameterNames == null) ? 0 : parameterNames.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final LiveParameterChartEditorInput other = (LiveParameterChartEditorInput) obj;
		if (parameterNames == null) {
			if (other.parameterNames != null) {
				return false;
			}
		}
		else if (!parameterNames.equals(other.parameterNames)) {
			return false;
		}
		return true;
	}

}

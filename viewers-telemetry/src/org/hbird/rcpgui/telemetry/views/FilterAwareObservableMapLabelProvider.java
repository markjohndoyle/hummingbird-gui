package org.hbird.rcpgui.telemetry.views;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.wb.swt.ResourceManager;
import org.hbird.rcpgui.telemetryprovision.model.TelemetryParameter;

/**
 * Label provider that is aware of the quickfilter and will adjust the label based upon whether the parameter is being
 * updated or not.
 * 
 * This is used by the TableViewer as it's LabelProvider. This means when rendering a TelemetryParameter the label
 * provider will check the name against the current quick filter.
 * 
 * @author Mark Doyle
 * 
 */
public class FilterAwareObservableMapLabelProvider extends ObservableMapLabelProvider implements IColorProvider {

	QuickFilterable quickFilterable;

	public FilterAwareObservableMapLabelProvider(final IObservableMap attributeMap) {
		super(attributeMap);
	}

	public FilterAwareObservableMapLabelProvider(final QuickFilterable quickFilterable, final IObservableMap[] attributeMaps) {
		super(attributeMaps);
		this.quickFilterable = quickFilterable;
	}

	@Override
	public Color getBackground(final Object element) {
		return null;
	}

	@Override
	public Color getForeground(final Object element) {
		String parameterName = ((TelemetryParameter) element).getName();
		if (quickFilterable.isQuickFilterEnabled()) {
			if (StringUtils.equals(quickFilterable.getCurrentQuickfilter(), parameterName)) {
				return ResourceManager.getColor(70, 130, 180);
			}
			else {
				return ResourceManager.getColor(248, 48, 48);
			}
		}
		else {
			return null;
		}
	}
}
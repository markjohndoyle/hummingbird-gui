package org.hbird.rcpgui.tvtable.views;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.hbird.core.commons.tmtc.Parameter;
import org.joda.time.format.ISODateTimeFormat;

public class ParameterMapLabelProvider extends ObservableMapLabelProvider {

	public ParameterMapLabelProvider(final IObservableMap[] attributeMaps) {
		super(attributeMaps);
	}

	@Override
	public String getColumnText(final Object element, final int columnIndex) {
		Parameter<?> parameter = (Parameter<?>) element;
		if(columnIndex == 2) {
			return ISODateTimeFormat.dateTime().print(parameter.getReceivedTime());
		}
		else {
			return super.getColumnText(element, columnIndex);
		}
	}
}
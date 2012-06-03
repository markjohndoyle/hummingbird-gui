package org.hbird.rcpgui.telemetrychart.editors;

import java.util.List;

import org.hbird.rcpgui.telemetrychart.model.FilterFormModel;

public class ArchivedParameterChartEditorInput extends LiveParameterChartEditorInput {

	FilterFormModel filterModel;

	public ArchivedParameterChartEditorInput(final List<String> parameterNames, final FilterFormModel formModel) {
		super(parameterNames);
		this.filterModel = formModel;
	}

	public FilterFormModel getFilterModel() {
		return filterModel;
	}

}

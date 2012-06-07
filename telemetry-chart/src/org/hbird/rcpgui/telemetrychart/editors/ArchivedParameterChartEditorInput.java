package org.hbird.rcpgui.telemetrychart.editors;

import java.util.List;

import org.hbird.rcpgui.telemetrychart.model.FilterFormModel;

public class ArchivedParameterChartEditorInput extends LiveParameterChartEditorInput {

	FilterFormModel filterModel;

	public ArchivedParameterChartEditorInput(final List<String> parameterNames, final List<String> shortNames, final FilterFormModel formModel) {
		super(parameterNames, shortNames);
		this.filterModel = formModel;
	}

	public FilterFormModel getFilterModel() {
		return filterModel;
	}

}

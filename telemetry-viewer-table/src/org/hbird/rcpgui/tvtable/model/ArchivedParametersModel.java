package org.hbird.rcpgui.tvtable.model;

import java.util.List;
import java.util.Random;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.rcpgui.archivedparameterprovider.interfaces.ArchivedParameterProvider;
import org.joda.time.DateTime;

public class ArchivedParametersModel extends PropertyChangeModel {

	ArchivedParameterProvider archivedParameterService;

	private List<Parameter<?>> parameters;

	public ArchivedParametersModel() {
		parameters.add(new Parameter<Integer>() {

			@Override
			public String getQualifiedName() {
				return "test archived param";
			}

			@Override
			public String getShortDescription() {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getLongDescription() {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getName() {
				return "test archived param";
			}

			@Override
			public Integer getValue() {
				final Random rand = new Random(5);
				return rand.nextInt();
			}

			@Override
			public void setValue(final Integer value) {
				throw new UnsupportedOperationException();
			}

			@Override
			public long getReceivedTime() {
				return System.currentTimeMillis();
			}

			@Override
			public void setReceivedTime(final long timestamp) {
				throw new UnsupportedOperationException();
			}

		});
	}

	public void getParameters(final DateTime startTime, final DateTime endTime, final int numberOfParameters) {
	}

	public List<Parameter<?>> getParameters() {
		return parameters;
	}

}

package org.hbird.rcpgui.telemetrychart.model;

import org.joda.time.DateTime;

public class FilterFormModel {

	private DateTime fromDate;
	private DateTime toDate;
	private long fromTime;
	private long toTime;
	private boolean useTime;

	private Object value;
	private boolean useValue;

	public boolean isAnyFilterSelected() {
		return useTime || useValue;
	}

	public DateTime getToDate() {
		return toDate;
	}

	public void setToDate(final DateTime toDate) {
		this.toDate = toDate;
	}

	public long getFromTime() {
		return fromTime;
	}

	public void setFromTime(final long fromTime) {
		System.out.println("Setting from time to " + fromTime);
		this.fromTime = fromTime;
	}

	public long getToTime() {
		return toTime;
	}

	public void setToTime(final long toTime) {
		this.toTime = toTime;
	}

	public boolean isUseTime() {
		return useTime;
	}

	public void setUseTime(final boolean useTime) {
		this.useTime = useTime;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(final Object value) {
		this.value = value;
	}

	public boolean isUseValue() {
		return useValue;
	}

	public void setUseValue(final boolean useValue) {
		this.useValue = useValue;
	}

	public DateTime getFromDate() {
		return fromDate;
	}

	public void setFromDate(final DateTime fromDate) {
		this.fromDate = fromDate;
	}

}

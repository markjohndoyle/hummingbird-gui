package org.hbird.rcpgui.telemetrychart.model;

import org.joda.time.DateTime;

public class FilterFormModel {

	private DateTime fromDate = new DateTime();
	private DateTime toDate = new DateTime();
	private long fromTime = 0;
	private long toTime = 0;
	private boolean useTime = false;

	private Object value;
	private boolean useValue;

	public DateTime getCalculatedFromDate() {
		DateTime calcFrom = fromDate;
		DateTime time = new DateTime(fromTime);
		calcFrom = calcFrom.plus(fromTime);
		return calcFrom;
	}

	public DateTime getCalculatedToDate() {
		DateTime calcTo = toDate;
		calcTo = calcTo.plus(toTime);
		return calcTo;
	}

	public boolean isAnyFilterSelected() {
		return useTime || useValue;
	}

	public DateTime getToDate() {
		return toDate;
	}

	public DateTime getFromDate() {
		return fromDate;
	}

	public void setFromDate(final DateTime fromDate) {
		System.out.println("Setting from date: " + fromDate);
		this.fromDate = fromDate;
	}

	public void setToDate(final DateTime toDate) {
		System.out.println("Setting to date: " + toDate);
		this.toDate = toDate;
	}

	public long getFromTime() {
		return fromTime;
	}

	public void setFromTime(final long fromTime) {
		System.out.println("Setting from time: " + fromTime);
		this.fromTime = fromTime;
	}

	public long getToTime() {
		return toTime;
	}

	public void setToTime(final long toTime) {
		System.out.println("Setting to time: " + toTime);
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

}

/**
 * 
 */
package org.hbird.rcpgui.telemetrychart.converters;

import java.util.Date;
import java.util.TimeZone;

import org.eclipse.core.databinding.conversion.Converter;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * @author Mark Doyle
 * 
 */
public class DateToMilliseconds extends Converter {

	public DateToMilliseconds() {
		super(Date.class, Long.class);
	}

	@Override
	public Long convert(final Object fromObject) {
		if (fromObject instanceof Date) {
			System.out.println("converting date: " + fromObject);
			final Date date = (Date)fromObject;
			final DateTime joda = new DateTime(date, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
			//			final Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("CET"));
			//			cal.setTime(date);
			//			System.out.println("converted to " + cal.getTimeInMillis());
			System.out.println("converted to " + joda.getMillis());
			//			return cal.getTimeInMillis();
			return joda.getMillis();
		}
		else {
			throw new IllegalArgumentException("Unexpected from type (" + fromObject.getClass().getName()
					+ ") passed to DateToJodaDateTime converter. Expected java.lang.Date");
		}
	}

}

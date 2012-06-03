/**
 * 
 */
package org.hbird.rcpgui.telemetrychart.converters;

import java.util.Date;

import org.eclipse.core.databinding.conversion.Converter;
import org.joda.time.DateTime;

/**
 * @author Mark Doyle
 * 
 */
public class DateToJodaDateTime extends Converter {

	public DateToJodaDateTime() {
		super(Date.class, DateTime.class);
	}

	@Override
	public DateTime convert(final Object fromObject) {
		if (fromObject instanceof Date) {
			return new DateTime(fromObject);
		}
		else {
			throw new IllegalArgumentException("Unexpected from type (" + fromObject.getClass().getName()
					+ ") passed to DateToJodaDateTime converter. Expected java.lang.Date");
		}
	}

}

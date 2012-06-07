/**
 *
 */
package org.hbird.rcpgui.telemetrychart.converters;

import java.util.Date;

import org.eclipse.core.databinding.conversion.Converter;

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
			final Date date = (Date)fromObject;
			return date.getTime();
		}
		else {
			throw new IllegalArgumentException("Unexpected from type (" + fromObject.getClass().getName()
					+ ") passed to DateToJodaDateTime converter. Expected java.lang.Date");
		}
	}

}

package org.hbird.rcpgui.commons.model;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class ArchiveParameterFilterSettings {

	public boolean useTimefilter = false;

	public DateTime fromTime = new DateTime(DateTimeZone.UTC);

	public DateTime toTime = new DateTime(DateTimeZone.UTC);

	public boolean useQualifiedNamefilter = false;

	public String qualifiedName = null;

}

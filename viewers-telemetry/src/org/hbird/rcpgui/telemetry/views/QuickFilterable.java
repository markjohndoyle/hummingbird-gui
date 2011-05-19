package org.hbird.rcpgui.telemetry.views;

import org.eclipse.swt.graphics.Color;


public interface QuickFilterable {

	public abstract String getCurrentQuickfilter();

	public abstract void setQuickFilterForeground(final Color foreground);

	public abstract void setQuickFilterEnabled(boolean quickFilterEnabled);

	public abstract boolean isQuickFilterEnabled();

}
package org.hbird.rcpgui.parameterprovider;

import java.util.Set;


/**
 * 
 * @author Mark Doyle
 * 
 */
public interface ParameterProvider {

	/**
	 * Start live telemetry flow
	 * 
	 * @throws Exception
	 *             if there are exceptional circumstances...
	 */
	void startTelemetryProvision() throws Exception;


	/**
	 * Stop live telemetry flow
	 * 
	 * @throws Exception
	 *             if there are exceptional circumstances...
	 */
	void stopTelemetryProvision() throws Exception;

	/**
	 * Add a {@link ParameterObserver} to the observable list of this telemetry provider.
	 * 
	 * @param po
	 */
	void addObserver(ParameterObserver po);

	/**
	 * Adds a list of parameter names that the provider should allow. Anything not in this list will not be routed.
	 * 
	 * @param parameterNames
	 */
	void addParameterNamesFitler(Set<String> parameterNames);

	/**
	 * Add a parameter name filter. Any parameters not matching the filter list will not be routed. Any existing filter
	 * names added will be preserved.
	 * 
	 * @param parameterName
	 */
	void addParameterNameFitler(String parameterName);

	/**
	 * Removes all parameter name filters.
	 * 
	 * @param parameterName
	 */
	void removeAllParameterNameFilters();

	/**
	 * Remove a single parameter name filter.
	 * 
	 * @param parameterName
	 */
	void removeParameterNameFilter(String parameterName);

	/**
	 * Return the provider name. Useful for User interfaces where multiple providers are supported.
	 * 
	 * @return
	 */
	String getProviderName();

}

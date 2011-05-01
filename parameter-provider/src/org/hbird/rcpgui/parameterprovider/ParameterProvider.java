package org.hbird.rcpgui.parameterprovider;

import java.util.Set;

import org.hbird.rcpgui.parameterprovider.exceptions.NoParameterNameFiltererSetException;


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
	 * @throws NoParameterNameFiltererSetException
	 */
	void addParameterNamesFitler(Set<String> parameterNames) throws NoParameterNameFiltererSetException;

	/**
	 * Add a parameter name filter. Any parameters not matching the filter list will not be routed. Any existing filter
	 * names added will be preserved.
	 * 
	 * @param parameterName
	 * @throws NoParameterNameFiltererSetException
	 */
	void addParameterNameFitler(String parameterName) throws NoParameterNameFiltererSetException;

	/**
	 * Removes all parameter name filters.
	 * 
	 * @param parameterName
	 * @throws NoParameterNameFiltererSetException
	 */
	void removeAllParameterNameFilters() throws NoParameterNameFiltererSetException;

	/**
	 * Remove a single parameter name filter.
	 * 
	 * @param parameterName
	 * @throws NoParameterNameFiltererSetException
	 */
	void removeParameterNameFilter(String parameterName) throws NoParameterNameFiltererSetException;

	/**
	 * Return the provider name. Useful for User interfaces where multiple providers are supported.
	 * 
	 * @return
	 */
	String getProviderName();

}

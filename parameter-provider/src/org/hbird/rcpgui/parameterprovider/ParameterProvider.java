package org.hbird.rcpgui.parameterprovider;

import java.util.List;


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

	void addParameterNamesFitler(List<String> parameterNames);

	/**
	 * Return the provider name. Useful for User interfaces where multiple providers are supported.
	 * 
	 * @return
	 */
	String getProviderName();

}

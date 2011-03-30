package org.hbird.rcpgui.telemetryprovision.source;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hbird.rcpgui.parameterprovider.ParameterObserver;
import org.hbird.rcpgui.parameterprovider.ParameterProvider;
import org.hbird.rcpgui.parameterprovider.model.Parameter;
import org.hbird.rcpgui.telemetryprovision.TelemetryActivator;
import org.hbird.rcpgui.telemetryprovision.model.AbstractPropChangeModelObject;
import org.hbird.rcpgui.telemetryprovision.model.TelemetryParameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.icu.util.TimeUnit;

public class ParameterSource extends AbstractPropChangeModelObject implements ParameterObserver {
	private final static Logger LOG = LoggerFactory.getLogger(ParameterSource.class);

	private static final int EXPECTED_SERVICES = 1;

	private static final long MILLISECONDS_IN_A_SECOND = 1000;

	private final Map<String, TelemetryParameter> liveParameters = new HashMap<String, TelemetryParameter>();
	private List<TelemetryParameter> liveParameterList = new ArrayList<TelemetryParameter>();

	private List<ParameterProvider> parameterProviderServices = new ArrayList<ParameterProvider>(EXPECTED_SERVICES);
	private ParameterProvider parameterProvider;
	private final boolean requestAll;
	private List<String> interestList;
	private boolean provisionActive = false;
	private double tmRate;
	private Date tmStartTime;
	private long numParametersSinceStart = 0;
	private TmRateUpdater tmRateUpdater = new TmRateUpdater(3000);

	public ParameterSource(boolean requestAll) {
		this.requestAll = requestAll;
		Object[] test = TelemetryActivator.getParameterProviderServices().getServices();
		for (Object service : test) {
			if (service instanceof ParameterProvider) {
				System.out.println("Found ParameterProvider service");
				parameterProviderServices.add((ParameterProvider) service);
			}
			else {
				LOG.warn("Invalid service type registered with TelemetryActivator: " + service);
			}
		}
		parameterProvider = (ParameterProvider) TelemetryActivator.getParameterProviderServices().getService();
		parameterProvider.addObserver(this);

	}

	@Override
	public void parameterRecieved(final Parameter parameter) {
		System.out.println(parameter.toString());
		numParametersSinceStart++;
		final Object oldLiveParameterList = liveParameterList;
		final TelemetryParameter param = createTelemetryParameter(parameter);
		liveParameters.put(param.getName(), param);
		liveParameterList = new ArrayList<TelemetryParameter>(liveParameters.values());
		firePropertyChange("liveParameterList", oldLiveParameterList, liveParameterList);
	}

	private TelemetryParameter createTelemetryParameter(final Parameter parameter) {
		final Map<String, Object> properties = parameter.getParameterProperties();
		final Object value = parameter.getValue();
		return new TelemetryParameter(properties, value);
	}

	/**
	 * sets the parameter rate in parameters per second
	 */
	private void updateTmRate() {
		double oldTmRate = tmRate;
		long elapsedTime = new Date().getTime() - tmStartTime.getTime();
		tmRate = ( (double)numParametersSinceStart / elapsedTime) * MILLISECONDS_IN_A_SECOND;
		System.out.println(numParametersSinceStart + " | " + elapsedTime + " | " + tmRate);
		firePropertyChange("tmRate", oldTmRate, tmRate);
	}

	/**
	 * @return the liveParameterList
	 */
	public List<TelemetryParameter> getLiveParameterList() {
		return liveParameterList;
	}

	public final void stopLiveProvision() throws Exception {
		parameterProvider.stopTelemetryProvision();
		this.setProvisionActive(false);
		if (tmRateUpdater.isAlive()) {
			tmRateUpdater.setStop(true);
		}
	}

	public final void startLiveProvision() throws Exception {
		tmStartTime = new Date();
		parameterProvider.startTelemetryProvision();
		if (!tmRateUpdater.isAlive()) {
			tmRateUpdater.start();
		}
		this.setProvisionActive(true);
	}

	@Override
	public List<String> getInterestList() {
		return interestList;
	}

	@Override
	public boolean isRequestingAllParameters() {
		return requestAll;
	}

	public void setInterestList(List<String> interestList) {
		this.interestList = interestList;
	}

	public boolean getProvisionActive() {
		return this.provisionActive;
	}

	public void setProvisionActive(boolean provisionActive) {
		boolean oldVal = this.provisionActive;
		this.provisionActive = provisionActive;
		firePropertyChange("provisionActive", oldVal, provisionActive);
	}

	public ParameterProvider getParameterProvider() {
		return parameterProvider;
	}

	public void setParameterProvider(ParameterProvider parameterProvider) {
		try {
			this.parameterProvider.stopTelemetryProvision();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("Could not change provider as the existing provision could not be stopped");
			return;
		}

		this.parameterProvider = parameterProvider;

		try {
			this.parameterProvider.startTelemetryProvision();
		}
		catch (Exception e) {
			System.err.println("Could not start provision for the new provider");
			e.printStackTrace();
		}
	}

	public List<ParameterProvider> getParameterProviderServices() {
		return parameterProviderServices;
	}

	public void setParameterProviderServices(List<ParameterProvider> parameterProviderServices) {
		this.parameterProviderServices = parameterProviderServices;
	}

	public double getTmRate() {
		return tmRate;
	}

	class TmRateUpdater extends Thread {
		private int updateRate = 0;
		private boolean stop = false;

		public TmRateUpdater(int updateRate) {
			this.updateRate = updateRate;
		}

		public void setStop(boolean stop) {
			this.stop = stop;
		}

		@Override
		public void run() {
			while (!stop) {
				updateTmRate();
				try {
					sleep(updateRate);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

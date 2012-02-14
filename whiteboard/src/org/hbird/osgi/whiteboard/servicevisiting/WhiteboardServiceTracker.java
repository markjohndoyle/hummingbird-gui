package org.hbird.osgi.whiteboard.servicevisiting;

import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

public class WhiteboardServiceTracker<T> extends ServiceTracker {

	public WhiteboardServiceTracker(BundleContext context, Class<T> serviceClass) {
		super(context, serviceClass.getName(), null);
	}

	public void accept(Visitor<? super T> visitor) {
		// If the service tracker is closed (i.e. tracking count is -1) open it.
		if(getTrackingCount() == -1) {
			open();
		}

		// We have typed the class with a generic type T so we can be sure the service is of type T (see constructor)
		@SuppressWarnings("unchecked")
		T[] services = (T[]) getServices();

		if(services != null) { 
			for(T service : services) {
				visitor.visit(service);
			}
		}
	}
}

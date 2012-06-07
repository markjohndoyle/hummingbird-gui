package org.hbird.rcpgui.ssprequester.interfaces;


public interface AsyncPublisherRequestListener {

	void publisherRequestComplete(Object requestResult);

	void publisherRequestFailed();


}

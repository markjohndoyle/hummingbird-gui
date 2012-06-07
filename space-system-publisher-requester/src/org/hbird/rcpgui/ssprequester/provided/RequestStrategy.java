package org.hbird.rcpgui.ssprequester.provided;

import org.apache.camel.ProducerTemplate;

public class RequestStrategy {

	private final ProducerTemplate producer;
	private final String uri;

	public RequestStrategy(final ProducerTemplate producer, final String uri) {
		this.producer = producer;
		this.uri = uri;
	}

	public ProducerTemplate getProducer() {
		return producer;
	}

	public String getUri() {
		return uri;
	}

}

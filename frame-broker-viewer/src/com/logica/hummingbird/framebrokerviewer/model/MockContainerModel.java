package com.logica.hummingbird.framebrokerviewer.model;

import java.util.Map;

public class MockContainerModel {

	public class MockContainer {
		Map<String, MockContainer> subMockContainers;
		String name;
		
		public MockContainer(String name) {
			this.name = name;
		}

		public void addSubContainer(MockContainer sub) {
			this.subMockContainers.put(sub.name, sub);
		}
	}

	public class MockParameter extends MockContainer {
		int value;
		
		public MockParameter(String name, int value) {
			super(name);
			this.value = value;
		}
	}

	
	
	MockContainer container;
	
	public MockContainerModel() {
	}

	public MockContainer getContainer() {
		return container;
	}

	public void setContainer(MockContainer container) {
		this.container = container;
	}
	
	
}

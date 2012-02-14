package org.hbird.osgi.whiteboard.servicevisiting;

public interface Visitor<T> {
	
	void visit(T object);

}

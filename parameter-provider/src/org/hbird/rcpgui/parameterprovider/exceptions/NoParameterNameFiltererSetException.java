package org.hbird.rcpgui.parameterprovider.exceptions;

public class NoParameterNameFiltererSetException extends Exception {
	private static final long serialVersionUID = -9104005074071984382L;

	public NoParameterNameFiltererSetException() {
		super();
	}

	public NoParameterNameFiltererSetException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public NoParameterNameFiltererSetException(final String message) {
		super(message);
	}

	public NoParameterNameFiltererSetException(final Throwable cause) {
		super(cause);
	}

}

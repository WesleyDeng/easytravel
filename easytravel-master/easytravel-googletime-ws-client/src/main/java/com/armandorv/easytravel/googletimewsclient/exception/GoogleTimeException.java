package com.armandorv.easytravel.googletimewsclient.exception;

public class GoogleTimeException extends Exception {

	private static final long serialVersionUID = 7984207984825891341L;

	public GoogleTimeException() {
		super();
	}

	public GoogleTimeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GoogleTimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public GoogleTimeException(String message) {
		super(message);
	}

	public GoogleTimeException(Throwable cause) {
		super(cause);
	}

}
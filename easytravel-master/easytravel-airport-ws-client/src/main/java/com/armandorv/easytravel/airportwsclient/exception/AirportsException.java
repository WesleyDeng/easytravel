package com.armandorv.easytravel.airportwsclient.exception;

public class AirportsException extends Exception {

	private static final long serialVersionUID = -7133673153009254198L;

	public AirportsException() {
	}

	public AirportsException(String message) {
		super(message);
	}

	public AirportsException(Throwable cause) {
		super(cause);
	}

	public AirportsException(String message, Throwable cause) {
		super(message, cause);
	}

	public AirportsException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
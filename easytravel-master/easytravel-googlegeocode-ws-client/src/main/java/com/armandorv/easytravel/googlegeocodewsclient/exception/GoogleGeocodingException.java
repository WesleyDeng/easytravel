package com.armandorv.easytravel.googlegeocodewsclient.exception;

/**
 * Exception get thrown when system suffers a recoverable error.
 * 
 * @author armandorv
 * 
 */
public class GoogleGeocodingException extends Exception {

	/**
	 * Serial number.
	 */
	private static final long serialVersionUID = -6991777660142174060L;

	public GoogleGeocodingException() {
		super();
	}

	public GoogleGeocodingException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GoogleGeocodingException(String message, Throwable cause) {
		super(message, cause);
	}

	public GoogleGeocodingException(String message) {
		super(message);
	}

	public GoogleGeocodingException(Throwable cause) {
		super(cause);
	}

}
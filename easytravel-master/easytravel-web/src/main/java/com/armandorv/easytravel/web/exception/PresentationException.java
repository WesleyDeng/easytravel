package com.armandorv.easytravel.web.exception;

public class PresentationException extends Exception {

	private static final long serialVersionUID = -4731097126748172214L;

	public PresentationException() {
		
	}

	public PresentationException(String message) {
		super(message);
		
	}

	public PresentationException(Throwable cause) {
		super(cause);
		
	}

	public PresentationException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public PresentationException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}

package com.armandorv.easytravel.business.exception;

public class TravelsException extends BusinessException {

	private static final long serialVersionUID = -8008247435628175288L;

	public TravelsException() {

	}

	public TravelsException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public TravelsException(String message, Throwable cause) {
		super(message, cause);

	}

	public TravelsException(String message) {
		super(message);

	}

	public TravelsException(Throwable cause) {
		super(cause);

	}

}

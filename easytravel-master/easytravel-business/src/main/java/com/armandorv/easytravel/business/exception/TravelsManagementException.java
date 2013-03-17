package com.armandorv.easytravel.business.exception;

public class TravelsManagementException extends BusinessException {

	private static final long serialVersionUID = -8008247435628175288L;

	public TravelsManagementException() {

	}

	public TravelsManagementException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public TravelsManagementException(String message, Throwable cause) {
		super(message, cause);

	}

	public TravelsManagementException(String message) {
		super(message);

	}

	public TravelsManagementException(Throwable cause) {
		super(cause);

	}

}

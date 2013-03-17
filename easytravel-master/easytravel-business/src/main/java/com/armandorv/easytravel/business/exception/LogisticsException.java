package com.armandorv.easytravel.business.exception;

public class LogisticsException extends BusinessException {

	private static final long serialVersionUID = 5051149284508655976L;

	public LogisticsException() {
		super();

	}

	public LogisticsException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public LogisticsException(String message, Throwable cause) {
		super(message, cause);

	}

	public LogisticsException(String message) {
		super(message);

	}

	public LogisticsException(Throwable cause) {
		super(cause);

	}

}
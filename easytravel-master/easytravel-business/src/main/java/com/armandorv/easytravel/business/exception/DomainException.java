package com.armandorv.easytravel.business.exception;

public class DomainException extends BusinessException {

	private static final long serialVersionUID = -1878295139355361301L;

	public DomainException() {
		super();
		
	}

	public DomainException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public DomainException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public DomainException(String message) {
		super(message);
		
	}

	public DomainException(Throwable cause) {
		super(cause);
		
	}

}

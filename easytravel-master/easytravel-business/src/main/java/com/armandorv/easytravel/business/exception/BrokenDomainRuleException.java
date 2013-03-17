package com.armandorv.easytravel.business.exception;

public class BrokenDomainRuleException extends BusinessException {

	private static final long serialVersionUID = -1878295139355361301L;

	public BrokenDomainRuleException() {
		super();
		
	}

	public BrokenDomainRuleException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public BrokenDomainRuleException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public BrokenDomainRuleException(String message) {
		super(message);
		
	}

	public BrokenDomainRuleException(Throwable cause) {
		super(cause);
		
	}

}

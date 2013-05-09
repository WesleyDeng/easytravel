package com.armandorv.easytravel.travelsws.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "DestinyNotFoundException", targetNamespace = "http://armandorv.com/easytravel/travelsws/exception")
public class DestinyNotFoundException extends TravelsWsException {

	private static final long serialVersionUID = -5517382715070389885L;

	public DestinyNotFoundException() {
		super();
		
	}

	public DestinyNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public DestinyNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public DestinyNotFoundException(String message) {
		super(message);
		
	}

	public DestinyNotFoundException(Throwable cause) {
		super(cause);
		
	}
	
	

}

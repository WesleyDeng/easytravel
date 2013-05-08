package com.armandorv.easytravel.travelsws.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "UsersNotFoundException", targetNamespace = "http://armandorv.com/easytravel/travelsws/exception")
public class TravelNotFoundException extends TravelsWsException {

	private static final long serialVersionUID = -4261840469113536391L;

	public TravelNotFoundException() {
		super();
		
	}

	public TravelNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public TravelNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public TravelNotFoundException(String message) {
		super(message);
		
	}

	public TravelNotFoundException(Throwable cause) {
		super(cause);
		
	}
	
	

}

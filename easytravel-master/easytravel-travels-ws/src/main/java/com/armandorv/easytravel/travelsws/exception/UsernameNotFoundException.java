package com.armandorv.easytravel.travelsws.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "UsernameNotFoundException", targetNamespace = "http://armandorv.com/easytravel/travelsws/exception")
public class UsernameNotFoundException  extends TravelsWsException {

	private static final long serialVersionUID = 2379516347488652785L;

	public UsernameNotFoundException() {
		super();
		
	}

	public UsernameNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public UsernameNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public UsernameNotFoundException(String message) {
		super(message);
		
	}

	public UsernameNotFoundException(Throwable cause) {
		super(cause);
		
	}
	
	

}

package com.armandorv.easytravel.usersws.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "UsersNotFoundException", targetNamespace = "http://armandorv.com/easytravel/usersws/exception")
public class UserNotFoundException extends UsersWsException {

	private static final long serialVersionUID = -4261840469113536391L;

	public UserNotFoundException() {
		super();
		
	}

	public UserNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public UserNotFoundException(String message) {
		super(message);
		
	}

	public UserNotFoundException(Throwable cause) {
		super(cause);
		
	}
	
	

}

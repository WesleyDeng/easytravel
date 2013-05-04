package com.armandorv.easytravel.usersws.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "UsersWsException", targetNamespace = "http://armandorv.com/easytravel/usersws/exception")
public class UsersWsException extends Exception {

	private static final long serialVersionUID = 4563056757246974891L;

	public UsersWsException() {
		super();

	}

	public UsersWsException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public UsersWsException(String message, Throwable cause) {
		super(message, cause);

	}

	public UsersWsException(String message) {
		super(message);

	}

	public UsersWsException(Throwable cause) {
		super(cause);

	}

}

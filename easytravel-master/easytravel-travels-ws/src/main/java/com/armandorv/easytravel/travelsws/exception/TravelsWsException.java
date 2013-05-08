package com.armandorv.easytravel.travelsws.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "UsersWsException", targetNamespace = "http://armandorv.com/easytravel/travelsws/exception")
public class TravelsWsException extends Exception {

	private static final long serialVersionUID = 4563056757246974891L;

	public TravelsWsException() {
		super();

	}

	public TravelsWsException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public TravelsWsException(String message, Throwable cause) {
		super(message, cause);

	}

	public TravelsWsException(String message) {
		super(message);

	}

	public TravelsWsException(Throwable cause) {
		super(cause);

	}

}

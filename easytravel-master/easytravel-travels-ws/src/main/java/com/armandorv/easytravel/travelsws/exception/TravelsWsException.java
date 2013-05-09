package com.armandorv.easytravel.travelsws.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "TravelsWsException", targetNamespace = "http://armandorv.com/easytravel/travelsws/exception")
public class TravelsWsException extends Exception {

	private static final long serialVersionUID = 3767856088787627306L;

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

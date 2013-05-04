package com.armandorv.easytravel.userswsclient.exception;

public class UsersException extends Exception {

	private static final long serialVersionUID = -2013945867755628031L;

	public UsersException() {
	}

	public UsersException(String message) {
		super(message);
	}

	public UsersException(Throwable cause) {
		super(cause);
	}

	public UsersException(String message, Throwable cause) {
		super(message, cause);
	}

	public UsersException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

package com.armandorv.easytravel.usersws.security;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.log4j.Logger;
import org.apache.ws.security.WSPasswordCallback;

public class PasswordCallbackHandler implements CallbackHandler {

	private static Logger logger = Logger
			.getLogger(PasswordCallbackHandler.class);

	private String username;

	private String password;

	/**
	 * It only works when wss4j version is higher than 1.6
	 */
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {

		logger.debug("Handling ws security callback on user " + username);

		for (Callback callback : callbacks) {
			WSPasswordCallback pwcb = (WSPasswordCallback) callback;
			if (pwcb.getIdentifier().equals(username)) {
				pwcb.setPassword(password);
				return;
			} else {
				throw new UnsupportedCallbackException(pwcb,
						"Wrong user or password");
			}

		}
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

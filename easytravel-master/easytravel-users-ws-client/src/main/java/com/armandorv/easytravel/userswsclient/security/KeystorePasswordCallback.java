package com.armandorv.easytravel.userswsclient.security;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class KeystorePasswordCallback implements CallbackHandler {

	private Map<String, String> passwords = new HashMap<String, String>();

	public KeystorePasswordCallback() {
		passwords.put("myclientkey", "ckpass");
	}

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {

		for (int i = 0; i < callbacks.length; i++) {

			WSPasswordCallback pwcb = (WSPasswordCallback) callbacks[i];

			String pass = passwords.get(pwcb.getIdentifier());
			int usage = pwcb.getUsage();
			if ((usage == WSPasswordCallback.DECRYPT || usage == WSPasswordCallback.SIGNATURE)
					&& pass != null) {
				pwcb.setPassword(pass);
				return;

			}
			if (usage == WSPasswordCallback.USERNAME_TOKEN) {
				pwcb.setPassword("secret");
			}
		}
	}
}

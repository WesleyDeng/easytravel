package com.armandorv.easytravel.web.security;

public class GoogleOpenIdAttributes {

	private String userLocalIdentifier;
	private String emailAddress;
	private String fullName;
	private String loginReplacement;

	public GoogleOpenIdAttributes(String userLocalIdentifier,
			String emailAddress, String fullName, String loginReplacement) {
		this.userLocalIdentifier = userLocalIdentifier;
		this.emailAddress = emailAddress;
		this.fullName = fullName;
		this.loginReplacement = loginReplacement;
	}

	public String getUserLocalIdentifier() {
		return userLocalIdentifier;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getFullName() {
		return fullName;
	}

	public String getLoginReplacement() {
		return loginReplacement;
	}
}

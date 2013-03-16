package com.armandorv.easytravel.googlegeocodewsclient.parser;

import com.armandorv.easytravel.googlegeocodewsclient.model.Address;

class AddressBuilder {

	private String fullText = null;

	private String postalCode = null;

	private String locality = null;

	private String state = null;

	private String sublocality = null;

	private String streetNumber = null;

	private String street = null;

	private String country = null;

	public AddressBuilder postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	public AddressBuilder locality(String locality) {
		this.locality = locality;
		return this;
	}

	public AddressBuilder street(String street) {
		this.street = street;
		return this;
	}
	
	public AddressBuilder streetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
		return this;
	}
	
	
	public AddressBuilder fullText(String fullText) {
		this.fullText = fullText;
		return this;
	}

	public AddressBuilder country(String country) {
		this.country = country;
		return this;
	}

	public AddressBuilder sublocality(String sublocality) {
		this.sublocality = sublocality;
		return this;
	}

	public AddressBuilder state(String state) {
		this.state = state;
		return this;
	}

	public Address build() {
		return new Address(postalCode, state, locality, sublocality,
				streetNumber, street, country, fullText);
	}
}

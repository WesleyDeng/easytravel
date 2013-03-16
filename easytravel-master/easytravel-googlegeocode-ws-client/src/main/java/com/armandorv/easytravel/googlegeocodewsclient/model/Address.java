package com.armandorv.easytravel.googlegeocodewsclient.model;

/**
 * Immutable object which model address.It could has some fields to null. If a
 * field value is null, this field is unknown.
 * 
 * @author armandorv
 * 
 */
public class Address {

	private String postalCode = null;

	private String state = null;

	private String locality = null;

	private String sublocality = null;

	private String streetNumber = null;

	private String street = null;

	private String country = null;

	private String fullText = null;

	public Address(String postalCode, String state, String locality,
			String sublocality, String streetNumber, String street,
			String country, String fullText) {

		this.postalCode = postalCode;
		this.state = state;
		this.locality = locality;
		this.sublocality = sublocality;
		this.streetNumber = streetNumber;
		this.street = street;
		this.country = country;
		this.fullText = fullText;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getState() {
		return state;
	}

	public String getLocality() {
		return locality;
	}

	public String getSublocality() {
		return sublocality;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public String getStreet() {
		return street;
	}

	public String getCountry() {
		return country;
	}

	public String getFullText() {
		return fullText;
	}

	@Override
	public String toString() {
		return "Address [postalCode=" + postalCode + ", state=" + state
				+ ", locality=" + locality + ", sublocality=" + sublocality
				+ ", streetNumber=" + streetNumber + ", street=" + street
				+ ", country=" + country + ", fullText=" + fullText + "]";
	}

}

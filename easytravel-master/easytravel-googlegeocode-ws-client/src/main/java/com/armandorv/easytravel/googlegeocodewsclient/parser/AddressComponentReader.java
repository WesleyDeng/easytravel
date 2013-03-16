package com.armandorv.easytravel.googlegeocodewsclient.parser;

import java.util.List;

import com.armandorv.easytravel.googlegeocodewsclient.jaxb.inverse.GeocodeResponse.Result.AddressComponent;

class AddressComponentReader {

	private static final String STREET_NUMBER_TYPE = "street_number";

	private static final String STREET_TYPE = "route";

	private static final String SUUB_LOCALITY_TYPE = "sublocality";

	private static final String LOCALITY_TYPE = "locality";

	private static final String STATE_TYPE = "administrative_area_level_1";

	private static final String COUNTRY_TYPE = "country";

	private static final String POSTAL_CODE_TYPE = "postal_code";

	private List<AddressComponent> components;

	public AddressComponentReader(List<AddressComponent> components) {
		super();
		this.components = components;
	}

	public String readCountry() {
		return readFor(COUNTRY_TYPE);
	}

	public String readState() {
		return readFor(STATE_TYPE);
	}

	public String readLocality() {
		return readFor(LOCALITY_TYPE);
	}

	public String readSubLocalityNumber() {
		return readFor(SUUB_LOCALITY_TYPE);
	}

	public String readPostalCode() {
		return readFor(POSTAL_CODE_TYPE);
	}

	public String readStreet() {
		return readFor(STREET_TYPE);
	}

	public String readStreetNumber() {
		return readFor(STREET_NUMBER_TYPE);
	}

	private String readFor(String type) {
		for (AddressComponent component : components) {
			if (component.getType().contains(type)) {
				return component.getLongName();
			}
		}
		return null;
	}

}

package com.armandorv.easytravel.airportwsclient;

import net.restfulwebservices.datacontracts._2008._01.Airport;

class AirportBuilder {

	private String ICAO = "";

	private String name = "";

	private String city = "";

	private String country = "";

	private float lattitude = 0.0F;

	private float longitude = 0.0F;

	private Airport airport;

	public AirportBuilder(Airport airport) {
		this.airport = airport;
	}

	public AirportBuilder icao() {
		if (airport != null) {
			ICAO = airport.getIcao().getValue();
		}
		return this;
	}

	public AirportBuilder name() {
		if (airport != null) {
			name = airport.getAirportName().getValue();
		}
		return this;
	}

	public AirportBuilder city() {
		if (airport != null) {
			city = airport.getCity().getValue();
		}
		return this;
	}

	public AirportBuilder country() {
		if (airport != null) {
			country = airport.getCountry().getValue();
		}
		return this;
	}

	public AirportBuilder lattitude() {
		if (airport != null) {
			Integer lat = airport.getLatitudeDegrees().getValue();
			lattitude = lat != null ? new Float(lat) : 0.0F;
		}
		return this;
	}

	public AirportBuilder longitude() {
		if (airport != null) {
			Integer lng = airport.getLongitudeDegrees().getValue();
			longitude = lng != null ? new Float(lng) : 0.0F;
		}
		return this;
	}

	public com.armandorv.easytravel.airportwsclient.model.Airport build() {
		return new com.armandorv.easytravel.airportwsclient.model.Airport(ICAO,
				name, city, country, lattitude, longitude);
	}
}

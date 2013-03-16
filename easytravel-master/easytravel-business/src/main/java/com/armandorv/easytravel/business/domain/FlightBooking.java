package com.armandorv.easytravel.business.domain;


public class FlightBooking {
	
	private Long id;
	
	private Destiny departureDestiny;

	public Destiny getDepartureDestiny() {
		return departureDestiny;
	}

	public void setDepartureDestiny(Destiny departureDestiny) {
		this.departureDestiny = departureDestiny;
	}

	public Long getId() {
		return id;
	}
	
	
}

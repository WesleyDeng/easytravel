package com.armandorv.easytravel.flightswsclient.flightstats;

import java.util.Date;

import com.armandorv.easytravel.flightswsclient.model.Flight;
import com.conducivetech.cache.flighthistory.api_internal.v2.AirportV1;
import com.conducivetech.cache.flighthistory.api_internal.v2.FlightStatusV2;

public class FlightBuilder {

	private Flight flight = new Flight();

	public FlightBuilder(FlightStatusV2 status) {

		flight.setId(status.getFlightId() + "");

		// All flights are today
		flight.setDepartureTime(new Date());
		flight.setArrivalTime(new Date());
	}

	public FlightBuilder destinationAirport(AirportV1 destiny) {
		flight.setDestinationAirportICAO(destiny != null ? destiny.getIcao()
				: "");
		flight.setDestinationAirportName(destiny != null ? destiny.getName()
				: "");
		return this;
	}

	public FlightBuilder destinationCitty(AirportV1 destiny) {
		flight.setDestinationCity(destiny != null ? destiny.getCity() : "");
		return this;
	}

	public FlightBuilder originAirport(AirportV1 origin) {
		flight.setOriginAirportICAO(origin != null ? origin.getIcao() : "");
		flight.setOriginAirportName(origin != null ? origin.getCity() : "");
		return this;
	}

	public FlightBuilder originCity(AirportV1 origin) {
		flight.setOriginCity(origin != null ? origin.getName() : "");
		return this;
	}

	public Flight build() {
		return flight;
	}
}

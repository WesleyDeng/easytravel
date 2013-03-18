package com.armandorv.easytravel.flightxml2wsclient;

import java.util.List;

import com.armandorv.easytravel.flightxml2wsclient.exception.FlightsException;
import com.armandorv.easytravel.flightxml2wsclient.model.Flight;

public interface FlightsService {

	/**
	 * @operation AirlineFlightSchedules
	 * @price 0.0120$
	 * 
	 * @return
	 * @throws FlightsException
	 */
	List<Flight> findFlights(String ICAO) throws FlightsException;
}

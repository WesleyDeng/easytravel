package com.armandorv.easytravel.flightswsclient;

import java.util.List;

import com.armandorv.easytravel.flightswsclient.exception.FlightsException;
import com.armandorv.easytravel.flightswsclient.model.Flight;

public interface FlightsService {

	/**
	 * 
	 * @return A list of flights.
	 * @throws FlightsException
	 */
	List<Flight> findFlights(String ICAO) throws FlightsException;
}

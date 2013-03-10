package com.armandorv.easytravel.flightxml2wsclient;

import java.util.List;
import java.util.Set;

import com.armandorv.easytravel.flightxml2wsclient.exception.FlightsException;
import com.armandorv.easytravel.flightxml2wsclient.model.Flight;
import com.flightaware.flightxml.soap.flightxml2.ScheduledFlightStruct;

public interface FlightsService {

	/**
	 * @operation AirlineFlightSchedules
	 * @price 0.0120$
	 * 
	 * @return
	 * @throws FlightsException
	 */
	List<ScheduledFlightStruct>  findFlights(String Airpotcode) throws FlightsException;
}

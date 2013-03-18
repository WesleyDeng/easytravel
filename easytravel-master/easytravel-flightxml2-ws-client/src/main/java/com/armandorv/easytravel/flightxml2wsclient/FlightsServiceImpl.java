package com.armandorv.easytravel.flightxml2wsclient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.ws.soap.SOAPFaultException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.flightxml2wsclient.exception.FlightsException;
import com.armandorv.easytravel.flightxml2wsclient.model.Flight;
import com.flightaware.flightxml.soap.flightxml2.FlightXML2Soap;
import com.flightaware.flightxml.soap.flightxml2.ScheduledFlightStruct;
import com.flightaware.flightxml.soap.flightxml2.ScheduledRequest;
import com.flightaware.flightxml.soap.flightxml2.ScheduledResults;

@Component
class FlightsServiceImpl implements FlightsService {

	private static Logger log = Logger.getLogger(FlightsServiceImpl.class);

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private FlightXML2Soap port;

	public List<Flight> findFlights(String ICAO) throws FlightsException {
		try {
			ScheduledResults results = port.scheduled(request(ICAO));

			if (results == null || results.getScheduledResult() == null) {
				throw new FlightsException("There was not results.");
			}

			return flights(results.getScheduledResult().getScheduled());

		} catch (SOAPFaultException e) {
			log.error("Error invoking flight xml ws :" + e.getMessage(), e);
			throw new FlightsException("Error invoking flight xml ws :"
					+ e.getMessage(), e);
		}
	}

	private ScheduledRequest request(String ICAO) {
		ScheduledRequest request = new ScheduledRequest();
		request.setAirport(ICAO);
		request.setFilter("");
		request.setHowMany(15);
		request.setOffset(0);
		return request;
	}

	private List<Flight> flights(List<ScheduledFlightStruct> wsFlights) {
		List<Flight> flights = new ArrayList<>();
		for (ScheduledFlightStruct flightStruct : wsFlights) {
			flights.add(flight(flightStruct));
		}
		return flights;
	}

	private Flight flight(ScheduledFlightStruct flightStruct) {
		Flight flight = new Flight();

		flight.setId(flightStruct.getIdent());

		flight.setDestinationAirportICAO(flightStruct.getDestination());
		flight.setDestinationCity(flightStruct.getDestinationCity());
		flight.setDestinationAirportName(flightStruct.getDestinationName());

		flight.setOriginAirportICAO(flightStruct.getOrigin());
		flight.setOriginAirportName(flightStruct.getOriginName());
		flight.setOriginCity(flightStruct.getOriginCity());

		flight.setDepartureTime(new Date(flightStruct.getEstimatedarrivaltime()));
		flight.setArrivalTime(new Date(flightStruct.getEstimatedarrivaltime()));

		return flight;
	}

}
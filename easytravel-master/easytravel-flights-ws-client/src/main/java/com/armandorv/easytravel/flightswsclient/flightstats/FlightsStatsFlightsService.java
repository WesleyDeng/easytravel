package com.armandorv.easytravel.flightswsclient.flightstats;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.flightswsclient.FlightsService;
import com.armandorv.easytravel.flightswsclient.exception.FlightsException;
import com.armandorv.easytravel.flightswsclient.model.Flight;
import com.conducivetech.cache.flighthistory.api_internal.v2.APIException_Exception;
import com.conducivetech.cache.flighthistory.api_internal.v2.AirportService;
import com.conducivetech.cache.flighthistory.api_internal.v2.FlightStatusV2;
import com.conducivetech.cache.flighthistory.api_internal.v2.ResponseAirportStatus;

@Component
class FlightsStatsFlightsService implements FlightsService {

	private static Logger log = Logger
			.getLogger(FlightsStatsFlightsService.class);

	@Value("flightstats.appId")
	private String appId;

	@Value("flightstats.appKey")
	private String appKey;

	@Autowired
	private AirportService port;

	/**
	 * Get all flights between 10AM and 16PM for the given airport.
	 */
	public List<Flight> findFlights(String ICAO) throws FlightsException {

		try {

			DateTime today = new DateTime();
			int day = today.getDayOfMonth();
			int month = today.getMonthOfYear();
			int year = today.getYear();
			int hourOfDay = 9;

			log.debug("Invoking flight stats service.");

			ResponseAirportStatus response = port.airportStatusDep(appId,
					appKey, ICAO, year, month, day, hourOfDay, false, 6, null,
					"ICAO", null, null);

			return flights(response.getFlightStatuses().getFlightStatus());

		} catch (APIException_Exception e) {
			log.error("Error invoking flight stats service :" + e.getMessage(),
					e);
			throw new FlightsException("Error invoking flight stats service :"
					+ e.getMessage());
		}

	}

	private List<Flight> flights(List<FlightStatusV2> flightStatuses) {
		List<Flight> flights = new ArrayList<>();

		for (FlightStatusV2 flightStatus : flightStatuses) {
			flights.add(flight(flightStatus));
		}

		return flights;
	}

	private Flight flight(FlightStatusV2 flightStatus) {
		Flight flight = new Flight();

		flight.setId(flightStatus.getFlightId() + "");

		flight.setDestinationAirportICAO(flightStatus.getDepartureAirport()
				.getIcao());
		flight.setDestinationCity(flightStatus.getDepartureAirport().getCity());
		flight.setDestinationAirportName(flightStatus.getDepartureAirport()
				.getName());

		flight.setOriginAirportICAO(flightStatus.getArrivalAirport().getIcao());
		flight.setOriginAirportName(flightStatus.getArrivalAirport().getCity());
		flight.setOriginCity(flightStatus.getArrivalAirport().getName());

		// All flights have today
		flight.setDepartureTime(new Date());
		flight.setArrivalTime(new Date());

		return flight;
	}
}
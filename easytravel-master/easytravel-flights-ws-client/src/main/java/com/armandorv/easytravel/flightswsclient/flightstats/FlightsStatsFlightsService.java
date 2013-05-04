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
import com.conducivetech.cache.flighthistory.api_internal.v2.AirportV1;
import com.conducivetech.cache.flighthistory.api_internal.v2.FlightStatusV2;
import com.conducivetech.cache.flighthistory.api_internal.v2.ResponseAirportStatus;

@Component
class FlightsStatsFlightsService implements FlightsService {

	private static final String ICAO_TYPE = "ICAO";

	private static Logger log = Logger
			.getLogger(FlightsStatsFlightsService.class);

	private static final int HOUR_0 = 0;
	private static final int HOUR_7 = 7;
	private static final int HOUR_14 = 14;
	private static final int HOUR_20 = 20;

	@Value("$fli{flightstats.appId}")
	private String appId;

	@Value("$fli{flightstats.appKey}")
	private String appKey;

	@Autowired
	private AirportService port;

	/**
	 * Get all flights between 9AM and 3PM for the given airport.
	 */
	public List<Flight> findFlights(String ICAO) throws FlightsException {
		try {
			log.debug("Invoking flight stats service.");

			ResponseAirportStatus response = invoke(ICAO, HOUR_0);
			ResponseAirportStatus response2 = invoke(ICAO, HOUR_7);
			ResponseAirportStatus response3 = invoke(ICAO, HOUR_14);
			ResponseAirportStatus response4 = invoke(ICAO, HOUR_20);

			List<Flight> flights = flights(response);
			flights.addAll(flights(response2));
			flights.addAll(flights(response3));
			flights.addAll(flights(response4));

			return flights;

		} catch (APIException_Exception e) {
			log.error("Error invoking flight stats service :" + e.getMessage(),
					e);
			throw new FlightsException("Error invoking flight stats service :"
					+ e.getMessage());
		}

	}

	private ResponseAirportStatus invoke(String ICAO, int hourOfDay)
			throws APIException_Exception {

		DateTime today = new DateTime();
		int day = today.getDayOfMonth();
		int month = today.getMonthOfYear();
		int year = today.getYear();

		return port.airportStatusDep(appId, appKey, ICAO, year, month, day,
				hourOfDay, false, 6, null, ICAO_TYPE, null, null);
	}

	private List<Flight> flights(ResponseAirportStatus response) {
		List<Flight> flights = new ArrayList<>();

		List<FlightStatusV2> statuses = response.getFlightStatuses()
				.getFlightStatus();
		List<AirportV1> airports = response.getAppendix().getAirports()
				.getAirport();

		for (FlightStatusV2 status : statuses) {
			flights.add(flight(status, airports));
		}

		return flights;
	}

	/**
	 * Map a status and their airport to a flight.
	 * 
	 * @param status
	 * @param airports
	 *            list of airports that contains the flight airport.
	 */
	private Flight flight(FlightStatusV2 status, List<AirportV1> airports) {
		Flight flight = new Flight();

		AirportV1 destiny = findAirport(status.getArrivalAirportFsCode(),
				airports);
		AirportV1 origin = findAirport(status.getDepartureAirportFsCode(),
				airports);

		flight.setId(status.getFlightId() + "");

		flight.setDestinationAirportICAO(destiny != null ? destiny.getIcao()
				: "");
		flight.setDestinationCity(destiny != null ? destiny.getCity() : "");
		flight.setDestinationAirportName(destiny != null ? destiny.getName()
				: "");

		flight.setOriginAirportICAO(origin != null ? origin.getIcao() : "");
		flight.setOriginAirportName(origin != null ? origin.getCity() : "");
		flight.setOriginCity(origin != null ? origin.getName() : "");

		// All flights have today
		flight.setDepartureTime(new Date());
		flight.setArrivalTime(new Date());

		return flight;
	}

	/**
	 * Find an airport by fsCode in a given list.
	 */
	private AirportV1 findAirport(String fsCode, List<AirportV1> airports) {
		if (fsCode == null)
			return null;

		for (AirportV1 airport : airports) {
			if (fsCode.equals(airport.getFs()))
				return airport;
		}

		return null;
	}

}
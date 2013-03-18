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
import com.conducivetech.cache.flighthistory.api_internal.v2.FlightStatusesResponse.FlightStatuses;
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

	private List<AirportV1> airports = new ArrayList<>();

	/**
	 * Get all flights between 9AM and 3PM for the given airport.
	 */
	public List<Flight> findFlights(String ICAO) throws FlightsException {
		try {
			log.debug("Invoking flight stats service.");

			FlightStatuses response = invoke(ICAO, HOUR_0);
			FlightStatuses response2 = invoke(ICAO, HOUR_7);
			FlightStatuses response3 = invoke(ICAO, HOUR_14);
			FlightStatuses response4 = invoke(ICAO, HOUR_20);

			List<Flight> flights = flights(response.getFlightStatus());
			flights.addAll(flights(response2.getFlightStatus()));
			flights.addAll(flights(response3.getFlightStatus()));
			flights.addAll(flights(response4.getFlightStatus()));

			return flights;

		} catch (APIException_Exception e) {
			log.error("Error invoking flight stats service :" + e.getMessage(),
					e);
			throw new FlightsException("Error invoking flight stats service :"
					+ e.getMessage());
		}

	}

	private FlightStatuses invoke(String ICAO, int hourOfDay)
			throws APIException_Exception {

		DateTime today = new DateTime();
		int day = today.getDayOfMonth();
		int month = today.getMonthOfYear();
		int year = today.getYear();

		ResponseAirportStatus response = port.airportStatusDep(appId, appKey,
				ICAO, year, month, day, hourOfDay, false, 6, null, ICAO_TYPE,
				null, null);

		airports.addAll(response.getAppendix().getAirports().getAirport());
		return response.getFlightStatuses();
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

		AirportV1 destiny = findAirport(flightStatus.getArrivalAirportFsCode());
		AirportV1 origin = findAirport(flightStatus.getDepartureAirportFsCode());

		flight.setId(flightStatus.getFlightId() + "");

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

	private AirportV1 findAirport(String arrivalAirportFsCode) {
		if (arrivalAirportFsCode == null)
			return null;
		
		for (AirportV1 airport : airports) {
			if (arrivalAirportFsCode.equals(airport.getFs()))
				return airport;
		}

		return null;
	}

}
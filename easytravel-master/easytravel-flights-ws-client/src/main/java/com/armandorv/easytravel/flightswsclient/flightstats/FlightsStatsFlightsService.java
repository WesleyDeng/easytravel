package com.armandorv.easytravel.flightswsclient.flightstats;

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
	
	@Autowired
	private ResponseDigester digester;

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

			List<Flight> flights = digester.digest(response);
			flights.addAll(digester.digest(response2));
			flights.addAll(digester.digest(response3));
			flights.addAll(digester.digest(response4));

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

}
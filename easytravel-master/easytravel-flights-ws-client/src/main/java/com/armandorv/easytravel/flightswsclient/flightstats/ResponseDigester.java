package com.armandorv.easytravel.flightswsclient.flightstats;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.armandorv.easytravel.flightswsclient.model.Flight;
import com.conducivetech.cache.flighthistory.api_internal.v2.AirportV1;
import com.conducivetech.cache.flighthistory.api_internal.v2.Appendices;
import com.conducivetech.cache.flighthistory.api_internal.v2.FlightStatusV2;
import com.conducivetech.cache.flighthistory.api_internal.v2.FlightStatusesResponse.FlightStatuses;
import com.conducivetech.cache.flighthistory.api_internal.v2.ResponseAirportStatus;

@Component
class ResponseDigester {

	public List<Flight> digest(ResponseAirportStatus response) {

		List<Flight> flights = new ArrayList<>();
		List<FlightStatusV2> statusesList = responseStatusses(response);
		List<AirportV1> airports = responseAppendices(response);

		for (FlightStatusV2 status : statusesList) {
			flights.add(flight(status, airports));
		}
		return flights;
	}

	private List<FlightStatusV2> responseStatusses(
			ResponseAirportStatus response) {
		FlightStatuses statuses = response.getFlightStatuses();

		List<FlightStatusV2> statusesList = (statuses != null) ? statuses
				.getFlightStatus() : new ArrayList<FlightStatusV2>();
		return statusesList;
	}

	private List<AirportV1> responseAppendices(ResponseAirportStatus response) {
		Appendices appendices = response.getAppendix();
		List<AirportV1> airports = (appendices != null && appendices
				.getAirports() != null) ? appendices.getAirports().getAirport()
				: new ArrayList<AirportV1>();
		return airports;
	}

	/**
	 * Map a status and their airport to a flight.
	 * 
	 * @param status
	 * @param airports
	 *            list of airports that contains the flight airport.
	 */
	private Flight flight(FlightStatusV2 status, List<AirportV1> airports) {
		AirportV1 destiny = findAirport(status.getArrivalAirportFsCode(),
				airports);
		AirportV1 origin = findAirport(status.getDepartureAirportFsCode(),
				airports);
		return new FlightBuilder(status).originCity(origin)
				.originAirport(origin).destinationCitty(destiny)
				.destinationAirport(destiny).build();
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

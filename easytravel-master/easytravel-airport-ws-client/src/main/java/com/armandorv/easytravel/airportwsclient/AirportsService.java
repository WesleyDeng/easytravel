package com.armandorv.easytravel.airportwsclient;

import com.armandorv.easytravel.airportwsclient.exception.AirportsException;
import com.armandorv.easytravel.airportwsclient.model.Airport;

public interface AirportsService {

	Airport getAirportByICAO(String ICAO) throws AirportsException;

	Airport getAirportByCity(String city) throws AirportsException;

	Airport getAirportByName(String name) throws AirportsException;
}

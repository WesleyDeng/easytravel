package com.armandorv.easytravel.business.service;

import java.util.Collections;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.airportwsclient.AirportsService;
import com.armandorv.easytravel.airportwsclient.exception.AirportsException;
import com.armandorv.easytravel.airportwsclient.model.Airport;
import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.exception.LogisticsException;
import com.armandorv.easytravel.expediawsclient.HotelsService;
import com.armandorv.easytravel.flightxml2wsclient.FlightsService;
import com.armandorv.easytravel.flightxml2wsclient.exception.FlightsException;
import com.armandorv.easytravel.googlegeocodewsclient.GeocodingService;
import com.armandorv.easytravel.googlegeocodewsclient.exception.GoogleGeocodingException;
import com.armandorv.easytravel.googlegeocodewsclient.model.Address;
import com.armandorv.easytravel.googletimewsclient.GoogleTimeService;
import com.armandorv.easytravel.googletimewsclient.exception.GoogleTimeException;

@Component
class LogisticsManager {

	private static Logger log = Logger.getLogger(LogisticsManager.class);

	@Autowired
	private FlightsService flightsService;

	@Autowired
	private HotelsService hotelsService;

	@Autowired
	private GoogleTimeService googleTimeService;

	@Autowired
	private GeocodingService geocodingService;

	@Autowired
	private AirportsService airportsService;

	public String getTimeZone(float lattitude, float longitude)
			throws LogisticsException {
		try {
			return googleTimeService.getTimeZone(lattitude, longitude)
					.getName();
		} catch (GoogleTimeException e) {
			log.error("Error invoking  googleTimeService :" + e.getMessage(), e);
			throw new LogisticsException("Error invoking google time service.",
					e);
		}
	}

	public String getAddress(float lattitude, float longitude)
			throws LogisticsException {
		try {
			return geocodingService.getAddress(lattitude, longitude)
					.getFullText();
		} catch (GoogleGeocodingException e) {
			log.error("Error invoking geocodingService service :"
					+ e.getMessage());
			throw new LogisticsException(
					"Error invoking google geocoding service.", e);
		}
	}

	public Set<String> getFlights(Destiny destiny) throws LogisticsException {

		try {
			Address address = geocodingService.getAddress(
					destiny.getLattitude(), destiny.getLongitude());

			if ("".equals(address.getState())) {
				return Collections.emptySet();
			}

			Airport airport = airportsService.getAirportByCity(address
					.getState());

			if (airport == null) {
				return Collections.emptySet();
			}

			flightsService.findFlights(airport.getICAO());
			
			return null;

		} catch (GoogleGeocodingException | AirportsException
				| FlightsException e) {
			log.error(
					"Error invoking geocodingService service :"
							+ e.getMessage(), e);
			throw new LogisticsException("Error invoking service : "
					+ e.getMessage(), e);
		}

	}

}

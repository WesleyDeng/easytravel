package com.armandorv.easytravel.business.service.travel;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.airportwsclient.AirportsService;
import com.armandorv.easytravel.airportwsclient.exception.AirportsException;
import com.armandorv.easytravel.airportwsclient.model.Airport;
import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.exception.LogisticsException;
import com.armandorv.easytravel.business.service.mapper.MappersFactory;
import com.armandorv.easytravel.expediawsclient.HotelsService;
import com.armandorv.easytravel.expediawsclient.exception.HotelsException;
import com.armandorv.easytravel.expediawsclient.model.Hotel;
import com.armandorv.easytravel.flightxml2wsclient.FlightsService;
import com.armandorv.easytravel.flightxml2wsclient.exception.FlightsException;
import com.armandorv.easytravel.flightxml2wsclient.model.Flight;
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

	public Collection<HotelInfo> getHotels(Destiny destiny)
			throws LogisticsException {
		try {
			Address address = geocodingService.getAddress(
					destiny.getLattitude(), destiny.getLongitude());

			if ("".equals(address.getLocality())) {
				return Collections.emptySet();
			}

			Set<Hotel> hotels = hotelsService.findHotels(address.getLocality());
			return MappersFactory.hotelsMaper().map(hotels);

		} catch (HotelsException | GoogleGeocodingException e) {
			log.error("Error invoking service :" + e.getMessage(), e);
			throw new LogisticsException("Error invoking service : "
					+ e.getMessage(), e);
		}
	}

	public Collection<FlightInfo> getFlights(Destiny destiny)
			throws LogisticsException {

		try {
			Address address = geocodingService.getAddress(
					destiny.getLattitude(), destiny.getLongitude());

			if ("".equals(address.getLocality())) {
				return Collections.emptySet();
			}

			Airport airport = airportsService.getAirportByCity(address
					.getLocality());

			if (airport == null) {
				return Collections.emptySet();
			}

			List<Flight> flights = flightsService
					.findFlights(airport.getICAO());
			return MappersFactory.flightsMapper().map(flights);

		} catch (GoogleGeocodingException | AirportsException
				| FlightsException e) {
			log.error("Error invoking  service :" + e.getMessage(), e);
			throw new LogisticsException("Error invoking service : "
					+ e.getMessage(), e);
		}

	}

}

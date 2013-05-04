package com.armandorv.easytravel.business.service.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.armandorv.easytravel.airportwsclient.AirportsService;
import com.armandorv.easytravel.airportwsclient.exception.AirportsException;
import com.armandorv.easytravel.airportwsclient.model.Airport;
import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.exception.LogisticsException;
import com.armandorv.easytravel.business.service.LogisticsService;
import com.armandorv.easytravel.expediawsclient.HotelsService;
import com.armandorv.easytravel.expediawsclient.exception.HotelsException;
import com.armandorv.easytravel.expediawsclient.model.Hotel;
import com.armandorv.easytravel.flightswsclient.FlightsService;
import com.armandorv.easytravel.flightswsclient.exception.FlightsException;
import com.armandorv.easytravel.flightswsclient.model.Flight;
import com.armandorv.easytravel.googlegeocodewsclient.GeocodingService;
import com.armandorv.easytravel.googlegeocodewsclient.exception.GoogleGeocodingException;
import com.armandorv.easytravel.googlegeocodewsclient.model.Address;
import com.armandorv.easytravel.googletimewsclient.GoogleTimeService;
import com.armandorv.easytravel.googletimewsclient.exception.GoogleTimeException;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
class LogisticsServiceImpl implements LogisticsService {

	private static Logger log = Logger.getLogger(LogisticsServiceImpl.class);

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.armandorv.easytravel.business.service.travel.LogisticsService#getTimeZone
	 * (float, float)
	 */
	@Override
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.armandorv.easytravel.business.service.travel.LogisticsService#getAddress
	 * (float, float)
	 */
	@Override
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.armandorv.easytravel.business.service.travel.LogisticsService#getHotels
	 * (com.armandorv.easytravel.business.domain.Destiny)
	 */
	@Override
	public Collection<HotelInfo> getHotels(Destiny destiny)
			throws LogisticsException {
		try {
			Address address = geocodingService.getAddress(
					destiny.getLattitude(), destiny.getLongitude());

			if ("".equals(address.getLocality())
					|| "".equals(address.getCountry())) {
				return Collections.emptySet();
			}

			Set<Hotel> hotels = hotelsService.findHotels(address.getLocality(),
					address.getCountry());
			return MappersFactory.hotelsMaper().map(hotels);

		} catch (HotelsException | GoogleGeocodingException e) {
			log.error("Error invoking service :" + e.getMessage(), e);
			throw new LogisticsException("Error invoking service : "
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.armandorv.easytravel.business.service.travel.LogisticsService#getFlights
	 * (com.armandorv.easytravel.business.domain.Destiny)
	 */
	@Override
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

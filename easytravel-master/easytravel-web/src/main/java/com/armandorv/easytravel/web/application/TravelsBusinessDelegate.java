package com.armandorv.easytravel.web.application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.jboss.resteasy.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.business.domain.HotelBooking;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.service.LogisticsService;
import com.armandorv.easytravel.business.service.TravelsService;
import com.armandorv.easytravel.web.exception.PresentationException;
import com.armandorv.easytravel.web.util.SecurityContextUtils;

/**
 * The us of business delegate pattern allow us to mantain this layer decoupled
 * of business layer, and avoid business interfaces seralization.
 * 
 * @author armandorv
 * 
 */
@Component
public class TravelsBusinessDelegate implements Serializable {

	private static final long serialVersionUID = -2106390627682121856L;

	private static Logger log = Logger.getLogger(TravelsBusinessDelegate.class);

	@Autowired
	private transient LogisticsService logisticsService;

	@Autowired
	private transient TravelsService travelsService;

	@Value(value = "$easytravel{easytravel.load.timezone}")
	private String loadTimeStamp;

	@Value(value = "$easytravel{easytravel.load.address}")
	private String loadAddress;

	/**
	 * Get additional info for a incomplete destiny.
	 * 
	 * @throws PresentationException
	 */
	public Destiny setUpDestiny(String title, double lat, double lng)
			throws PresentationException {
		try {
			Destiny destiny = new Destiny();

			destiny.setName(title);
			destiny.setLattitude((float) lat);
			destiny.setLongitude((float) lng);
			destiny.setEstimatedDate(new Date());

			destiny.setTimeZone(timezone(lat, lng));
			destiny.setAddress(address(lat, lng));

			return destiny;
		} catch (BusinessException e) {
			log.error("Error reriving destiny information.");
			throw new PresentationException(
					"Error getting info for the new destiny :" + e.getMessage());
		}

	}

	private String address(double lat, double lng) throws BusinessException {
		if (!Boolean.parseBoolean(loadAddress)) {
			return "";
		}

		return logisticsService.getAddress((float) lat, (float) lng);
	}

	private String timezone(double lat, double lng) throws BusinessException {
		if (!Boolean.parseBoolean(loadTimeStamp)) {
			return "";
		}

		return logisticsService.getTimeZone((float) lat, (float) lng);
	}

	public Collection<FlightInfo> loadFlights(Destiny destiny)
			throws PresentationException {

		try {
			return logisticsService.getFlights(destiny);
		} catch (BusinessException e) {
			throw new PresentationException("Error loading flights :"
					+ e.getMessage());
		}

	}

	public Collection<HotelInfo> loadHotels(Destiny destiny)
			throws PresentationException {

		try {
			return logisticsService.getHotels(destiny);
		} catch (BusinessException e) {
			throw new PresentationException("Error loading hotels :"
					+ e.getMessage());
		}
	}

	public void addHotel(Destiny destiny, HotelInfo hotel) {
		HotelBooking booking = new HotelBooking();
		booking.setHotelInfo(hotel);
		booking.setPersons(1);
		destiny.addHotel(booking);
	}

	public void comfirmTravel(Travel travel, List<Destiny> destinies)
			throws PresentationException {
		try {
			String username = SecurityContextUtils.principal();
			travelsService.createTravel(username, travel, destinies);
		} catch (BusinessException e) {
			log.error("Error commiting travel.", e);
			throw new PresentationException("Error commiting travel."
					+ e.getMessage());
		}
	}

	public List<Travel> getPrincipalTravels() throws PresentationException {
		String username = SecurityContextUtils.principal();

		try {
			List<Travel> travels = new ArrayList<>();
			Iterable<Travel> domainTravels = travelsService
					.getTravels(username);

			for (Travel travel : domainTravels) {
				travels.add(travel);
			}
			return travels;

		} catch (BusinessException e) {
			log.error("Error getting travels for " + username, e);
			throw new PresentationException("Error commiting travel."
					+ e.getMessage());
		}

	}

	public void removeTravel(Travel selected) throws PresentationException {
		try {
			travelsService.removeTravel(selected);
		} catch (BusinessException e) {
			log.error("Error  deleting travel.", e);
			throw new PresentationException("Error deleting travel."
					+ e.getMessage());
		}
	}

	public void summarizeTravel(Travel selected) throws PresentationException {
		try {
			selected.markAsDone(); // It 's to be done within the persistence
									// context again.
			travelsService.summarizeTravel(selected);
		} catch (BusinessException e) {
			log.error("Error  deleting travel.", e);
			throw new PresentationException("Error deleting travel."
					+ e.getMessage());
		}
	}

	public List<Destiny> getDestinies(Travel selected)
			throws PresentationException {
		try {
			List<Destiny> destinies = new ArrayList<>();
			destinies.addAll(travelsService.getDestinies(selected.getId()));
			return destinies;
		} catch (BusinessException e) {
			log.error("Error  getting getDestinies.", e);
			throw new PresentationException("Error getDestinies."
					+ e.getMessage());
		}
	}
}
package com.armandorv.easytravel.web.application;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.service.TravelsService;
import com.armandorv.easytravel.web.exception.PresentationException;

@Component
public class TravelsBusinessDelegate {

	@Autowired
	private TravelsService travelsService;

	public Destiny setUpDestiny(String title, double lat, double lng)
			throws PresentationException {
		try {
			Destiny destiny = new Destiny();

			destiny.setName(title);
			destiny.setLattitude((float) lat);
			destiny.setLongitude((float) lng);
			destiny.setEstimatedDate(new Date());

			destiny.setTimeZone(travelsService.getTimeZone(lat, lng));
			destiny.setAddress(travelsService.getAddress(lat, lng));

			return destiny;
		} catch (BusinessException e) {
			throw new PresentationException(
					"Error getting info for the new destiny :" + e.getMessage());
		}

	}

	public Collection<String> loadTravels(Destiny destiny)
			throws PresentationException {

		try {
			return travelsService.getFlights(destiny);
		} catch (BusinessException e) {
			throw new PresentationException("Error loading travels :"
					+ e.getMessage());
		}

	}

	public Collection<HotelInfo> loadHotels(Destiny destiny)
			throws PresentationException {

		try {
			return travelsService.getHotels(destiny);
		} catch (BusinessException e) {
			throw new PresentationException("Error loading hotels :"
					+ e.getMessage());
		}
	}

}
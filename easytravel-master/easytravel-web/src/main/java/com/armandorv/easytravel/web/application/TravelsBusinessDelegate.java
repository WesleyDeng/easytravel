package com.armandorv.easytravel.web.application;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.service.TravelsService;
import com.armandorv.easytravel.web.exception.PresentationException;

@Component
public class TravelsBusinessDelegate {

	@Autowired
	private TravelsService travelsService;

	public Destiny prepareDestiny(String title, double lat, double lng)
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

}
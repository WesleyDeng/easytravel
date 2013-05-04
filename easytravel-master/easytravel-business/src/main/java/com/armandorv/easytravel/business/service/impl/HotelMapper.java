package com.armandorv.easytravel.business.service.impl;

import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.service.Mapper;
import com.armandorv.easytravel.expediawsclient.model.Hotel;

/**
 * Maps hotels of the ws client model to our business model.
 * 
 * @author armandorv
 * 
 */
class HotelMapper implements Mapper<Hotel, HotelInfo> {

	@Override
	public HotelInfo map(Hotel hotel) {
		
		HotelInfo info = new HotelInfo();
		
		info.setCity(hotel.getCity());
		info.setHighRate(hotel.getHighRate());
		info.setHotelId(hotel.getHotelId());
		info.setLocationDescription(hotel.getLocationDescription());
		info.setLowRate(hotel.getLowRate());
		info.setName(hotel.getName());
		info.setPhoneNumber(hotel.getPhoneNumber());
		info.setPostalCode(hotel.getPostalCode());
		info.setHotelRating(hotel.getHotelRating());
		
		return info;
	}

}
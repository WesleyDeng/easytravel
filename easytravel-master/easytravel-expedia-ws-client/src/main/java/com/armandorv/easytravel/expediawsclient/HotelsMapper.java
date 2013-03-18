package com.armandorv.easytravel.expediawsclient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.armandorv.easytravel.expediawsclient.model.Hotel;
import com.ean.wsapi.hotel.v3.HotelList;
import com.ean.wsapi.hotel.v3.HotelSummary;

class HotelsMapper {

	private Set<Hotel> hotels = new HashSet<>();

	private Collection<HotelSummary> hotelSummaries;

	public HotelsMapper(HotelList hotels) {
		this.hotelSummaries = hotels == null ? new ArrayList<HotelSummary>()
				: hotels.getHotelSummary();
	}

	public Set<Hotel> map() {

		for (HotelSummary hotelSummary : hotelSummaries) {
			hotels.add(map(hotelSummary));
		}

		return hotels;
	}

	private Hotel map(HotelSummary hotelSummary) {
		Hotel hotel = new Hotel();

		hotel.setId(hotelSummary.getHotelId());
		hotel.setName(hotelSummary.getName());
		hotel.setCity(hotelSummary.getCity());
		hotel.setPostalCode(hotelSummary.getPostalCode());
		hotel.setPhoneNumber(hotelSummary.getPhoneNumber());
		hotel.setHotelRating(hotelSummary.getHotelRating());
		hotel.setLowRate(hotelSummary.getLowRate());
		hotel.setHighRate(hotelSummary.getHighRate());
		hotel.setLocationDescription(hotelSummary.getLocationDescription());

		return hotel;
	}
}

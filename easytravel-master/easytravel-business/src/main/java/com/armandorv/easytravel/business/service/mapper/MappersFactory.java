package com.armandorv.easytravel.business.service.mapper;

import java.util.Collection;

import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.service.Mapper;
import com.armandorv.easytravel.expediawsclient.model.Hotel;
import com.armandorv.easytravel.flightxml2wsclient.model.Flight;

public class MappersFactory {

	private static Mapper<Hotel, HotelInfo> hotelMaper = new HotelMapper();

	private static Mapper<Flight, FlightInfo> flightMaper = new FlightMapper();

	private static Mapper<Collection<Hotel>, Collection<HotelInfo>> hotelsMaper = new CollectionMapper<Hotel, HotelInfo>(
			hotelMaper);

	private static Mapper<Collection<Flight>, Collection<FlightInfo>> flightsMaper = new CollectionMapper<Flight, FlightInfo>(
			flightMaper);

	private MappersFactory() {
	}

	public static Mapper<Hotel, HotelInfo> hotelMaper() {
		return hotelMaper;
	}

	public static Mapper<Collection<Hotel>, Collection<HotelInfo>> hotelsMaper() {
		return hotelsMaper;
	}

	public static Mapper<Flight, FlightInfo> flightMapper() {
		return flightMaper;
	}

	public static Mapper<Collection<Flight>, Collection<FlightInfo>> flightsMapper() {
		return flightsMaper;
	}

}
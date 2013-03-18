package com.armandorv.easytravel.business.service;

import java.util.Collection;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.exception.BusinessException;

public interface TravelsService {

	void createTravel(Travel travel) throws BusinessException;

	Iterable<Travel> getTravels(String userId) throws BusinessException;

	Collection<FlightInfo> getFlights(Destiny destiny) throws BusinessException;

	Collection<HotelInfo> getHotels(Destiny destiny) throws BusinessException;

	String getTimeZone(float lattiude, float longitude)
			throws BusinessException;

	String getTimeZone(double lattiude, double longitude)
			throws BusinessException;

	String getAddress(float lattiude, float longitude) throws BusinessException;

	String getAddress(double lattiude, double longitude)
			throws BusinessException;
}
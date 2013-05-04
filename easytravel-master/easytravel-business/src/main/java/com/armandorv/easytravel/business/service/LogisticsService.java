package com.armandorv.easytravel.business.service;

import java.util.Collection;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.exception.BusinessException;

public interface LogisticsService {

	String getTimeZone(float lattitude, float longitude)
			throws BusinessException;

	String getAddress(float lattitude, float longitude)
			throws BusinessException;

	Collection<HotelInfo> getHotels(Destiny destiny) throws BusinessException;

	Collection<FlightInfo> getFlights(Destiny destiny) throws BusinessException;

}
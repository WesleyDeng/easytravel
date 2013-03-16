package com.armandorv.easytravel.business.service;

import com.armandorv.easytravel.business.domain.Travel;

public interface TravelsService {

	void createTravel(Travel travel);

	Iterable<Travel> getTravels(String userId);

	String getTimeZone(long lattiude, long longitude);

	String getAddress(long lattiude, long longitude);
}

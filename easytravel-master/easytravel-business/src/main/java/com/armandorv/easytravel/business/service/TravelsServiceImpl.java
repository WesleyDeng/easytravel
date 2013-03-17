package com.armandorv.easytravel.business.service;

import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.exception.LogisticsException;

@Service
@Transactional
class TravelsServiceImpl implements TravelsService {

	private static Logger log = Logger.getLogger(TravelsServiceImpl.class);

	@Autowired
	private TravelsManager travelsManager;

	@Autowired
	private LogisticsManager logisticsManager;

	@Override
	public void createTravel(Travel travel) throws BusinessException {
		log.debug("Creating a new travel " + travel);
		travelsManager.createTravel(travel);

	}

	@Override
	public Iterable<Travel> getTravels(String userId) throws BusinessException {
		return travelsManager.getTravels(userId);
	}

	@Override
	public String getTimeZone(float lattiude, float longitude)
			throws BusinessException {
		return logisticsManager.getTimeZone(lattiude, longitude);
	}

	@Override
	public String getTimeZone(double lattiude, double longitude)
			throws BusinessException {
		return logisticsManager.getTimeZone((float) lattiude, (float) longitude);
	}

	@Override
	public String getAddress(float lattiude, float longitude)
			throws BusinessException {
		return logisticsManager.getAddress(lattiude, longitude);
	}

	@Override
	public String getAddress(double lattiude, double longitude)
			throws BusinessException {
		return logisticsManager.getAddress((float) lattiude, (float) longitude);
	}

	@Override
	public Set<String> getFlights(Destiny destiny) throws LogisticsException {
		return logisticsManager.getFlights(destiny);
	}

}

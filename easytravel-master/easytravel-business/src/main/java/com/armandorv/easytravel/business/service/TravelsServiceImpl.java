package com.armandorv.easytravel.business.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.armandorv.easytravel.business.domain.Travel;

@Service
@Transactional
public class TravelsServiceImpl implements TravelsService { 
	
	@Override
	public void createTravel(Travel travel) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterable<Travel> getTravels(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTimeZone(long lattiude, long longitude) {
		// TODO Auto-generated method stub
		return "time";
	}

	@Override
	public String getAddress(long lattiude, long longitude) {
		// TODO Auto-generated method stub
		return "address";
	}

}

package com.armandorv.easytravel.travelsws;

import java.util.Collection;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.service.TravelsService;
import com.armandorv.easytravel.business.service.UsersService;
import com.armandorv.easytravel.travelsws.exception.TravelsWsException;

@WebService(endpointInterface = "com.armandorv.easytravel.travelsws.TravelsWebService", serviceName = "TravelsWebService", portName = "TravelsWebService", targetNamespace = "http://armandorv.com/easytravel/travelsws")
public class TravelsWebServiceImpl implements TravelsWebService {

	@Autowired
	private TravelsService travelsService;

	@Autowired
	private UsersService usersService;

	@Override
	public Collection<Travel> getTravels(String term) throws TravelsWsException {
		return   travelsService .getTravelsByTerm(term);
	}

	@Override
	public boolean hasVisited(String username, String destinyName)
			throws TravelsWsException {
		return travelsService.hasUserVisited(username , destinyName);
	}

	@Override
	public int numberTravelsByDestination(String destinyName)
			throws TravelsWsException {
		return travelsService.getTravelsByDestination(destinyName);
	}

	@Override
	public Destiny mostVistedDestination() throws TravelsWsException {
		return travelsService.getMostVisitedDestination();
	}

	@Override
	@WebMethod(operationName = "mostVistedDestinations")
	public List<Destiny> mostVistedDestinations(int max)
			throws TravelsWsException {
		return travelsService.getMostVisitedDestinations(max);
	}

}

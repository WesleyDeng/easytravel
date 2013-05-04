package com.armandorv.easytravel.travelsws;

import java.util.Collection;
import java.util.LinkedList;

import javax.jws.WebService;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.service.TravelsService;

@WebService(endpointInterface = "com.armandorv.easytravel.travelsws.ravelsWebService", serviceName = "TravelsWebService", portName = "TravelsWebService", targetNamespace = "http://armandorv.com/easytravel/travelsws")
public class TravelsWebServiceImpl implements TravelsWebService {

	private TravelsService travelsService;

	@Override
	public Collection<Travel> getTravels(String term) {
		Collection<Travel> result = new LinkedList<>();
		try {
			Iterable<Travel> travels = travelsService.getTravels();

			for (Travel travel : travels) {
				if (travel.getName().contains(term)
						|| travel.getDescription().contains(term))
					result.add(travel);
			}

		} catch (BusinessException e) {
			e.printStackTrace();
			throw new RuntimeException("TODO tratar");
		}
		return result;
	}

	@Override
	public boolean isVisited(String destinyName) {
		return false;
	}

	@Override
	public int numberTravelsByDestination(String destinyName) {
		return 0;
	}

	@Override
	public Destiny mostVistedDestination() {
		return null;
	}

}

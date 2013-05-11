package com.armandorv.easytravel.business.service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.exception.BusinessException;

public interface TravelsService {

	void createTravel(String username, Travel travel, List<Destiny> destinies)
			throws BusinessException;

	Iterable<Travel> getTravels(String username) throws BusinessException;

	Iterable<Travel> getTravels() throws BusinessException;

	void removeTravel(Travel travel) throws BusinessException;

	void summarizeTravel(Travel travel) throws BusinessException;

	Set<Destiny> getDestinies(Long id) throws BusinessException;

	int getTravelsByDestination(String dstinyName);

	Destiny getMostVisitedDestination();

	List<Destiny> getMostVisitedDestinations(int max);

	Collection<Travel> getTravelsByTerm(String term);

	boolean hasUserVisited(String username, String destinyName);
}
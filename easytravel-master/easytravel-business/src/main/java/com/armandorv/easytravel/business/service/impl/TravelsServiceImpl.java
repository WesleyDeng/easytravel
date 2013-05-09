package com.armandorv.easytravel.business.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.domain.User;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.repository.DestinyRepository;
import com.armandorv.easytravel.business.repository.TravelRepository;
import com.armandorv.easytravel.business.repository.UserRepository;
import com.armandorv.easytravel.business.service.LogisticsService;
import com.armandorv.easytravel.business.service.TravelsService;
import com.armandorv.easytravel.business.util.IterableUtils;

@Service
@Transactional
class TravelsServiceImpl implements TravelsService {

	private static Logger log = Logger.getLogger(TravelsServiceImpl.class);

	@Autowired
	private LogisticsService logisticsManager;

	@Autowired
	private TravelRepository travelRepository;

	@Autowired
	private DestinyRepository destinyRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public void createTravel(String username, Travel travel,
			List<Destiny> destinies) throws BusinessException {
		log.debug("Creating a new travel " + travel);

		travel = travelRepository.save(travel);
		User user = user(username);
		user.addTravel(travel);

		Iterable<Destiny> persistentDestinies = destinyRepository
				.save(destinies);

		for (Destiny destiny : persistentDestinies) {
			travel.addDestiny(destiny);
		}
	}

	@Override
	public Iterable<Travel> getTravels(String username)
			throws BusinessException {
		User user = user(username);
		return travelRepository.findByUser(user);
	}

	@Override
	public Iterable<Travel> getTravels() throws BusinessException {
		return travelRepository.findAll();
	}

	@Override
	public void removeTravel(Travel travel) throws BusinessException {
		travelRepository.delete(travel.getId());
	}

	@Override
	public void summarizeTravel(Travel selected) throws BusinessException {
		Travel travel = travel(selected.getId());
		travel.setSummary(selected.getSummary());
		travel.markAsDone();
	}

	private User user(String username) throws BusinessException {
		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new BusinessException("The username is not in the system.");
		}
		return user;
	}

	private Travel travel(Long id) throws BusinessException {
		Travel travel = travelRepository.findOne(id);
		if (travel == null) {
			throw new BusinessException("The trave has been deleted.");
		}
		return travel;
	}

	@Override
	public Set<Destiny> getDestinies(Long id) throws BusinessException {
		Travel travel = travel(id);
		travel.getDestinies().size();
		return travel.getDestinies();
	}

	@Override
	public int getTravelsByDestination(String destinyName) {
		int count = 0;
		Iterable<Destiny> destinies = destinyRepository.findByName(destinyName);

		for (Destiny destiny : destinies) {
			Iterable<Travel> travels = travelRepository.findByDestiny(destiny);
			count += travels != null ? IterableUtils.size(travels) : 0;
		}
		return count;
	}

	@Override
	public Destiny getMostVisitedDestinations() {
		// FIXME optimize taking advantage of the RDBMS.
		Iterable<Destiny> all = destinyRepository.findAll();
		Destiny mostvVisited = null;
		int visits = 0;

		for (Destiny destiny : all) {
			Iterable<Travel> travels = travelRepository.findByDestiny(destiny);
			int visitsOfCurrent = travels != null ? IterableUtils.size(travels)
					: 0;
			if (visitsOfCurrent > visits) {
				visits = visitsOfCurrent;
				mostvVisited = destiny;
			}
		}

		return mostvVisited;
	}

	@Override
	public List<Destiny> getMostVisitedDestinations(int max) {
		return new ArrayList<>();
	}

}
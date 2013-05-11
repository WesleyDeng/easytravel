package com.armandorv.easytravel.business.service.impl.commands;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.repository.DestinyRepository;
import com.armandorv.easytravel.business.repository.TravelRepository;
import com.armandorv.easytravel.business.util.IterableUtils;

public class TravelsByDestinationCommand implements Command<String, Integer> {

	private TravelRepository travelRepository;
	
	private DestinyRepository destinyRepository;

	public TravelsByDestinationCommand(TravelRepository travelRepository,
			DestinyRepository destinyRepository) {
		super();
		this.travelRepository = travelRepository;
		this.destinyRepository = destinyRepository;
	}



	@Override
	public Integer execute(String param) {
		int count = 0;
		
		Iterable<Destiny> destinations = destinyRepository.findAll();
		
		for (Destiny destiny : destinations) {
			Iterable<Travel> travels = travelRepository.findByDestiny(destiny);
			count += travels != null ? IterableUtils.size(travels) : 0;
		}
		return count;
	}

}

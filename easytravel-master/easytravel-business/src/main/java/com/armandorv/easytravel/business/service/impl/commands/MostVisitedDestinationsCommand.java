package com.armandorv.easytravel.business.service.impl.commands;

import java.util.ArrayList;
import java.util.List;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.repository.DestinyRepository;
import com.armandorv.easytravel.business.repository.TravelRepository;
import com.armandorv.easytravel.business.util.IterableUtils;

public class MostVisitedDestinationsCommand implements Command<Integer, List<Destiny>>{

	private TravelRepository travelRepository;
	
	private DestinyRepository destinyRepository;
	
	public MostVisitedDestinationsCommand(TravelRepository travelRepository,
			DestinyRepository destinyRepository) {
		super();
		this.travelRepository = travelRepository;
		this.destinyRepository = destinyRepository;
	}

	@Override
	public List<Destiny> execute(Integer param) {
		
		Iterable<Destiny> all = destinyRepository.findAll();
		List<Destiny> destinations = new ArrayList<>();
		
		int size = IterableUtils.size(all);
		if(param > size ){
			param = size;
		}
		
		while (param> 0 ){
			Destiny destiny = mostVisited(all,destinations, size);
			if(destiny != null){
				destinations.add(destiny);
				param--;
			}
		}
		
		return destinations;
	}
	
	private Destiny mostVisited(Iterable<Destiny> all,List<Destiny> added , int size){
		
		Destiny mostvVisited = null;
		
		int visits = 0;

		for (Destiny destiny : all) {
			if(!added.contains(destiny)){
			
			Iterable<Travel> travels = travelRepository.findByDestiny(destiny);
			int visitsOfCurrent = visitsOfCurrent(travels);
			
			if (visitsOfCurrent > visits) {
				visits = visitsOfCurrent;
				mostvVisited = destiny;
			}
			}
		}

		return mostvVisited;
	}

	private int visitsOfCurrent(Iterable<Travel> travels) {
		int visitsOfCurrent = travels != null ? IterableUtils.size(travels)
				: 0;
		return visitsOfCurrent;
	}

}

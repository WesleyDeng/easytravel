package com.armandorv.easytravel.travelsws.commands;

import java.util.Collection;
import java.util.LinkedList;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightBooking;
import com.armandorv.easytravel.business.domain.HotelBooking;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.service.TravelsService;

public class FindByTermCommand implements Command<String, Collection<Travel>> {

	private TravelsService travelsService;

	public FindByTermCommand(TravelsService travelsService) {
		super();
		this.travelsService = travelsService;
	}

	public Collection<Travel> execute(String term) {

		Collection<Travel> result = new LinkedList<>();
		try {
			Iterable<Travel> travels = travelsService.getTravels();

			for (Travel travel : travels) {
				checkNameAndDescription(term, result, travel);
				
				for (Destiny destiny : travel.getDestinies()) {
					checkDestinyNameAndAddress(term, result, travel, destiny);
					checkFlights(term, travel, destiny, result);
					checkHotels(term, travel, destiny, result);
				}
			}

		} catch (BusinessException e) {
			e.printStackTrace();
			throw new RuntimeException("TODO tratar");
		}
		return result;
	}

	private void checkFlights(String term, Travel travel, Destiny destiny,
			Collection<Travel> result) {
		for (FlightBooking flight : destiny.getFlights()) {
			if (term.contains(flight.getFlightInfo()
					.getDestinationCity())) {
				if (!result.contains(travel))
					result.add(travel);
			}
		}
	}

	private void checkHotels(String term, Travel travel, Destiny destiny,
			Collection<Travel> result) {
		for (HotelBooking flight : destiny.getHotels()) {
			if (term.contains(flight.getHotelInfo().getName())) {
				if (!result.contains(travel))
					result.add(travel);
			}
		}
	}

	private void checkDestinyNameAndAddress(String term,
			Collection<Travel> result, Travel travel, Destiny destiny) {
		if (term.contains(destiny.getName())
				|| term.contains(destiny.getAddress())) {
			if (!result.contains(travel))
				result.add(travel);
		}
	}

	private void checkNameAndDescription(String term,
			Collection<Travel> result, Travel travel) {
		if (travel.getName().contains(term)
				|| travel.getDescription().contains(term)) {
			result.add(travel);
		}
	}
}

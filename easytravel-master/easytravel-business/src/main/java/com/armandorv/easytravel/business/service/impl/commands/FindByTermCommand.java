package com.armandorv.easytravel.business.service.impl.commands;

import java.util.Collection;
import java.util.LinkedList;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightBooking;
import com.armandorv.easytravel.business.domain.HotelBooking;
import com.armandorv.easytravel.business.domain.Travel;

public class FindByTermCommand implements Command<String, Collection<Travel>> {

	private Iterable<Travel> travels;

	public FindByTermCommand(Iterable<Travel> travels) {
		super();
		this.travels = travels;
	}

	public Collection<Travel> execute(String term) {

		Collection<Travel> result = new LinkedList<>();

		for (Travel travel : travels) {
			checkNameAndDescription(term, result, travel);

			for (Destiny destiny : travel.getDestinies()) {
				checkDestinyNameAndAddress(term, result, travel, destiny);
				checkFlights(term, travel, destiny, result);
				checkHotels(term, travel, destiny, result);
			}
		}
		return result;
	}

	private void checkFlights(String term, Travel travel, Destiny destiny,
			Collection<Travel> result) {

		for (FlightBooking flight : destiny.getFlights()) {

			if (flight.getFlightInfo() != null
					&& flight.getFlightInfo().getDestinationCity() != null
					&& contains(flight.getFlightInfo().getDestinationCity(),
							term)) {

				if (!result.contains(travel))
					result.add(travel);
			}
		}
	}

	private void checkHotels(String term, Travel travel, Destiny destiny,
			Collection<Travel> result) {

		for (HotelBooking hotel : destiny.getHotels()) {

			if (hotel.getHotelInfo() != null
					&& hotel.getHotelInfo().getName() != null
					&& contains(hotel.getHotelInfo().getName(), term)) {

				if (!result.contains(travel))
					result.add(travel);
			}
		}
	}

	private void checkDestinyNameAndAddress(String term,
			Collection<Travel> result, Travel travel, Destiny destiny) {

		if (contains(destiny.getName(), term)
				|| contains(destiny.getAddress(), term)) {

			if (!result.contains(travel))
				result.add(travel);
		}
	}

	private void checkNameAndDescription(String term,
			Collection<Travel> result, Travel travel) {
		if (travel.getName() != null && contains(travel.getName(), term)) {

			if (!result.contains(travel))
				result.add(travel);
		}

		if (travel.getDescription() != null
				&& contains(travel.getDescription(), term)) {

			if (!result.contains(travel))
				result.add(travel);
		}
	}

	private boolean contains(String a, String b) {
		return a.toLowerCase().contains(b.toLowerCase())
				|| b.toLowerCase().contains(a.toLowerCase());
	}
}

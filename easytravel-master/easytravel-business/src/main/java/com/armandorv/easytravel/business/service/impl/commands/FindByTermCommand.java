package com.armandorv.easytravel.business.service.impl.commands;

import java.util.Collection;
import java.util.LinkedList;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightBooking;
import com.armandorv.easytravel.business.domain.HotelBooking;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.util.StringUtils;

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
					&& StringUtils.contains(flight.getFlightInfo().getDestinationCity(),
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
					&& StringUtils.contains(hotel.getHotelInfo().getName(), term)) {

				if (!result.contains(travel))
					result.add(travel);
			}
		}
	}

	private void checkDestinyNameAndAddress(String term,
			Collection<Travel> result, Travel travel, Destiny destiny) {

		if (StringUtils.contains(destiny.getName(), term)
				|| StringUtils.contains(destiny.getAddress(), term)) {

			if (!result.contains(travel))
				result.add(travel);
		}
	}

	private void checkNameAndDescription(String term,
			Collection<Travel> result, Travel travel) {
		if (travel.getName() != null && StringUtils.contains(travel.getName(), term)) {

			if (!result.contains(travel))
				result.add(travel);
		}

		if (travel.getDescription() != null
				&& StringUtils.contains(travel.getDescription(), term)) {

			if (!result.contains(travel))
				result.add(travel);
		}
	}

}

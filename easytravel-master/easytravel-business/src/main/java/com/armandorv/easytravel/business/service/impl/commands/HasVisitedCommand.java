package com.armandorv.easytravel.business.service.impl.commands;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightBooking;
import com.armandorv.easytravel.business.domain.HotelBooking;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.util.StringUtils;

public class HasVisitedCommand implements Command<String, Boolean> {

	private Iterable<Travel> userTravels;

	public HasVisitedCommand(Iterable<Travel> userTravels) {
		super();
		this.userTravels = userTravels;
	}

	@Override
	public Boolean execute(String param) {

		for (Travel trvl : userTravels) {
			for (Destiny dst : trvl.getDestinies()) {

				if (dst.getName() != null && StringUtils.contains(dst.getName(), param)) {
					return true;
				}
				if (checkAddress(dst, param)) {
					return true;
				}
				if (checkFlights(dst, param)) {
					return true;
				}
				if (checkHotels(dst, param)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean checkAddress(Destiny dst, String param) {
		return dst.getAddress() != null && StringUtils.contains(dst.getAddress(), param);
	}

	private boolean checkFlights(Destiny dst, String param) {
		for (FlightBooking flight : dst.getFlights()) {

			if (flight.getFlightInfo() != null) {

				if (flight.getFlightInfo().getDestinationCity() != null
						&& StringUtils.contains(
								flight.getFlightInfo().getDestinationCity(),
								param)) {
					return true;
				}

				if (flight.getFlightInfo().getDestinationAirportName() != null
						&& StringUtils.contains(flight.getFlightInfo()
								.getDestinationAirportName(), param)) {
					return true;
				}

				if (flight.getFlightInfo().getOriginCity() != null
						&& StringUtils.contains(flight.getFlightInfo().getOriginCity(),
								param)) {
					return true;
				}

				if (flight.getFlightInfo().getOriginAirportName() != null
						&& StringUtils.contains(flight.getFlightInfo()
								.getOriginAirportName(), param)) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean checkHotels(Destiny dst, String param) {
		for (HotelBooking hotel : dst.getHotels()) {

			if (hotel.getHotelInfo() != null) {

				if (hotel.getHotelInfo().getName() != null
						&& StringUtils.contains(hotel.getHotelInfo().getName(), param)) {
					return true;
				}
				if (hotel.getHotelInfo().getCity() != null
						&& StringUtils.contains(hotel.getHotelInfo().getCity(), param)) {
					return true;
				}
			}
		}
		return false;
	}

}

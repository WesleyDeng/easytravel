package com.armandorv.easytravel.business.service.impl.mapper;

import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.flightswsclient.model.Flight;

class FlightMapper implements Mapper<Flight, FlightInfo> {

	@Override
	public FlightInfo map(Flight source) {
		FlightInfo info = new FlightInfo();

		info.setFlightId(source.getId());
		
		info.setArrivalTime(source.getArrivalTime());
		info.setDepartureTime(source.getDepartureTime());

		info.setDestinationAirportICAO(source.getDestinationAirportICAO());
		info.setDestinationAirportName(source.getDestinationAirportName());
		info.setDestinationCity(source.getDestinationCity());

		info.setOriginAirportICAO(source.getOriginAirportICAO());
		info.setOriginAirportName(source.getOriginAirportName());
		info.setOriginCity(source.getOriginCity());

		return info;
	}

}

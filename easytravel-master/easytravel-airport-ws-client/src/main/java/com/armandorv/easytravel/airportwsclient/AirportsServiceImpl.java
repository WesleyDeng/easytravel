package com.armandorv.easytravel.airportwsclient;

import net.restfulwebservices.servicecontracts._2008._01.IAirportService;
import net.restfulwebservices.servicecontracts._2008._01.IAirportServiceGetDetailsByAirportNameDefaultFaultContractFaultFaultMessage;
import net.restfulwebservices.servicecontracts._2008._01.IAirportServiceGetDetailsByCityDefaultFaultContractFaultFaultMessage;
import net.restfulwebservices.servicecontracts._2008._01.IAirportServiceGetDetailsByICAOCodeDefaultFaultContractFaultFaultMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.airportwsclient.exception.AirportsException;
import com.armandorv.easytravel.airportwsclient.model.Airport;

@Component
public class AirportsServiceImpl implements AirportsService {

	private static Logger log = Logger.getLogger(AirportsServiceImpl.class);

	@Autowired
	private IAirportService port;

	@Override
	public Airport getAirportByICAO(String ICAO) throws AirportsException {
		try {
			AirportBuilder builder = new AirportBuilder(
					port.getDetailsByICAOCode(ICAO));
			return airport(builder);
		} catch (IAirportServiceGetDetailsByICAOCodeDefaultFaultContractFaultFaultMessage e) {
			log.error("Error invoking airports service.", e);
			throw new AirportsException("Error gettng airports : "
					+ e.getMessage());
		}
	}

	@Override
	public Airport getAirportByCity(String city) throws AirportsException {
		try {
			AirportBuilder builder = new AirportBuilder(
					port.getDetailsByCity(city));
			return airport(builder);
		} catch (IAirportServiceGetDetailsByCityDefaultFaultContractFaultFaultMessage e) {
			log.error("Error invoking airports service.", e);
			throw new AirportsException("Error gettng airports : "
					+ e.getMessage());
		}
	}

	@Override
	public Airport getAirportByName(String name) throws AirportsException {
		try {
			AirportBuilder builder = new AirportBuilder(
					port.getDetailsByAirportName(name));
			return airport(builder);
		} catch (IAirportServiceGetDetailsByAirportNameDefaultFaultContractFaultFaultMessage e) {
			log.error("Error invoking airports service.", e);
			throw new AirportsException("Error gettng airports : "
					+ e.getMessage());
		}
	}

	private Airport airport(AirportBuilder builder) {
		return builder.city().country().icao().lattitude().longitude().name()
				.build();
	}
}

package com.armandorv.easytravel.flightxml2wsclient;

import java.util.List;

import javax.xml.ws.soap.SOAPFaultException;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.flightxml2wsclient.exception.FlightsException;
import com.flightaware.flightxml.soap.flightxml2.AirlineFlightScheduleStruct;
import com.flightaware.flightxml.soap.flightxml2.AirlineFlightSchedulesRequest;
import com.flightaware.flightxml.soap.flightxml2.AirlineFlightSchedulesResults;
import com.flightaware.flightxml.soap.flightxml2.FlightXML2Soap;
import com.flightaware.flightxml.soap.flightxml2.ScheduledFlightStruct;
import com.flightaware.flightxml.soap.flightxml2.ScheduledRequest;
import com.flightaware.flightxml.soap.flightxml2.ScheduledResults;

@Component
public class FlightsServiceImpl implements FlightsService {

	private Logger log = Logger.getLogger(FlightsServiceImpl.class);

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private FlightXML2Soap port;

	public List<ScheduledFlightStruct>  findFlights(String airportCode) throws FlightsException {
		try {
			ScheduledRequest request = new ScheduledRequest();
			request.setAirport(airportCode);
			request.setFilter("");
			request.setHowMany(10);
			request.setOffset(0);
			
			ScheduledResults results = port.scheduled(request);

			if (results == null || results.getScheduledResult() == null) {
				throw new FlightsException();
			}
			
			List<ScheduledFlightStruct> flights =  results.getScheduledResult().getScheduled();
			
			return flights;

		} catch (SOAPFaultException e) {
			log.error(e);
			throw new FlightsException(e);
		}
	}

	public List<AirlineFlightScheduleStruct> findFlightss()
			throws FlightsException {

		AirlineFlightSchedulesRequest request = new AirlineFlightSchedulesRequest();

		DateTime startD = new DateTime("2013-03-09");
		DateTime endD = new DateTime("2013-03-14");

		long start = startD.getMillis() / 1000;
		long end = endD.getMillis() / 1000;

		Integer endInt = (int) end;
		Integer startInt = (int) start;

		log.info("end " + endInt + " start" + startInt);

		request.setEndDate(endInt);
		request.setStartDate(startInt);
		request.setHowMany(10);

		try {
			AirlineFlightSchedulesResults results = port
					.airlineFlightSchedules(request);

			if (results == null
					|| results.getAirlineFlightSchedulesResult() == null) {
				throw new FlightsException();
			}

			return results.getAirlineFlightSchedulesResult().getData();

		} catch (SOAPFaultException e) {
			log.error(e);
			throw new FlightsException(e);
		}
	}

}
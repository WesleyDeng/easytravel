package com.armandorv.easytrave.flightswsclient.flightstats;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.flightswsclient.FlightsService;
import com.armandorv.easytravel.flightswsclient.exception.FlightsException;
import com.armandorv.easytravel.flightswsclient.model.Flight;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-flightstats-ws-client.xml")
public class FlightsServiceTest {

	private static final String BARCELONA_ICAO = "LEBL";

	private static Logger log = Logger.getLogger(FlightsServiceTest.class);

	@Autowired
	private FlightsService flightsService;

	@Before
	public void setUp() {
		Assert.assertNotNull(flightsService);
		log.info("Test context loaded");
	}

	@Test
	public void testFindFlights() throws FlightsException {
		List<Flight> flights = flightsService.findFlights(BARCELONA_ICAO);
		Assert.assertNotNull(flights);
		Assert.assertFalse(flights.isEmpty());

		for (Flight flight : flights) {
			printFlight(flight);
		}
	}

	private void printFlight(Flight flight) {

		System.out.println(" ********* Airport ************");
		
		System.out.println("ID: " + flight.getId());
		
		System.out.println("Destiny ICAO: " + flight.getDestinationAirportICAO());
		System.out.println("Destiny Name: " + flight.getDestinationAirportName());
		System.out.println("Destiny City: " + flight.getDestinationCity());

		System.out.println("Origin ICAO: " + flight.getOriginAirportICAO());
		System.out.println("Origin Name: " + flight.getOriginAirportName());
		System.out.println("Origin City: " + flight.getOriginCity());

	}

}

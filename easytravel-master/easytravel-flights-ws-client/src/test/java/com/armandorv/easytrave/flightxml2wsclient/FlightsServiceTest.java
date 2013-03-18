package com.armandorv.easytrave.flightxml2wsclient;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.flightswsclient.FlightsService;
import com.armandorv.easytravel.flightswsclient.exception.FlightsException;
import com.armandorv.easytravel.flightswsclient.model.Flight;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-flightaware-ws-client.xml")
public class FlightsServiceTest {

	private static final String BARCELONA_ICAO = "LEBL";

	private static Logger log = Logger.getLogger(FlightsServiceTest.class);

	@Autowired
	private FlightsService flightsService;

	@Autowired
	private ApplicationContext applicationContext;

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
		log.info(flights);
	}

}

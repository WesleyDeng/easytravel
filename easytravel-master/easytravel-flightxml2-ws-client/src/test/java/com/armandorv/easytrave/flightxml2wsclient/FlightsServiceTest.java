package com.armandorv.easytrave.flightxml2wsclient;

import java.lang.invoke.MethodHandles;
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

import com.armandorv.easytravel.flightxml2wsclient.FlightsServiceImpl;
import com.armandorv.easytravel.flightxml2wsclient.exception.FlightsException;
import com.flightaware.flightxml.soap.flightxml2.AirlineFlightScheduleStruct;
import com.flightaware.flightxml.soap.flightxml2.ScheduledFlightStruct;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-flightaware-ws-client.xml")
public class FlightsServiceTest {

	private static Logger log = Logger.getLogger(MethodHandles.lookup()
			.getClass());

	@Autowired
	private FlightsServiceImpl flightsService;

	@Autowired
	private ApplicationContext applicationContext;

	@Before
	public void setUp() {
		Assert.assertNotNull(flightsService);
		log.info("Test context loaded");
	}

	@Test
	public void testFindFlights() throws FlightsException {
		List<ScheduledFlightStruct> flights = flightsService.findFlights("KAUS");
		
		for (ScheduledFlightStruct scheduledFlightStruct : flights) {
			log.info("Destination " + scheduledFlightStruct.getDestination());
		}
	}

}

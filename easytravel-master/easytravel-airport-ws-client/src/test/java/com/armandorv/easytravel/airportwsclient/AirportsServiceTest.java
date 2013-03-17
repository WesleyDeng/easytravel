package com.armandorv.easytravel.airportwsclient;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.airportwsclient.exception.AirportsException;
import com.armandorv.easytravel.airportwsclient.model.Airport;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-airports-ws-client.xml")
public class AirportsServiceTest {

	private static final String MADRID = "Madrid";

	private static final String BARCELONA = "Barcelona";

	private static final String BARAJAS = "Barajas";

	private static final String LEAB = "LEAB";

	private static Logger log = Logger.getLogger(AirportsServiceTest.class);

	@Autowired
	private AirportsService airportsService;

	@Autowired
	private ApplicationContext applicationContext;

	@Before
	public void setUp() {
		Assert.assertNotNull(airportsService);
		log.info("Test context loaded");
	}

	@Test
	public void testGetAirportByCity() throws AirportsException {

		Airport madrid = airportsService.getAirportByCity(MADRID);
		Assert.assertNotNull(madrid);

		Airport barcelona = airportsService.getAirportByCity(BARCELONA);
		Assert.assertNotNull(barcelona);

		log.info(madrid);
		log.info(barcelona);
	}
	
	@Test
	public void testGetAirportByICAO() throws AirportsException {

		Airport leab = airportsService.getAirportByICAO(LEAB);
		Assert.assertNotNull(leab);

		log.info(leab);
	}
	
	@Test
	public void testGetAirportByName() throws AirportsException {

		Airport barajas = airportsService.getAirportByName(BARAJAS);
		Assert.assertNotNull(barajas);

		log.info(barajas);
	}

}

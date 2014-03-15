package com.armandorv.easytravel.business.service;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.exception.BusinessException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-service-context.xml")
public class LogisitcsServiceTest {

	private static Logger log = Logger.getLogger(LogisitcsServiceTest.class);

	@Autowired
	private LogisticsService logisticsManager;

	private Destiny target = new Destiny();

	@Before
	public void setUp() {
		Assert.assertNotNull(logisticsManager);
		log.info("Spring Context loaded");

		// Barcelona locality

		target.setLattitude(41.3825F);
		target.setLongitude(2.17694F);
	}

	@Test
	public void testGetAddress() throws BusinessException {
		String address = logisticsManager.getAddress(target.getLattitude(),
				target.getLongitude());

		Assert.assertNotNull(address);
		log.info(address);
	}

	@Test
	public void testGetTimeZone() throws BusinessException {
		String timeZone = logisticsManager.getTimeZone(target.getLattitude(),
				target.getLongitude());
		Assert.assertNotNull(timeZone);
		log.info(timeZone);
	}

	@Test
	public void testGetHotels() throws BusinessException {
		Collection<HotelInfo> hotels = logisticsManager.getHotels(target);
		Assert.assertNotNull(hotels);
		Assert.assertFalse(hotels.isEmpty());
		log.info(hotels);
	}

	@Test
	public void testGetFlights() throws BusinessException {
		Collection<FlightInfo> flights = logisticsManager.getFlights(target);
		Assert.assertNotNull(flights);
		log.info(flights);
	}
}

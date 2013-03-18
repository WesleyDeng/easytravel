package com.armandorv.easytravel.business.service.travel;

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
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.exception.LogisticsException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-service-context.xml")
public class LogisitcsManagerTest {

	private static Logger log = Logger.getLogger(LogisitcsManagerTest.class);

	@Autowired
	private LogisticsManager logisticsManager;

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
	public void testGetAddress() throws LogisticsException {
		String address = logisticsManager.getAddress(target.getLattitude(),
				target.getLongitude());

		Assert.assertNotNull(address);
		log.info(address);
	}
	
	@Test
	public void testGetTimeZone() throws LogisticsException {
		String timeZone = logisticsManager.getTimeZone(target.getLattitude(),
				target.getLongitude());
		Assert.assertNotNull(timeZone);
		log.info(timeZone);
	}

	@Test
	public void testGetHotels() throws LogisticsException {
		Collection<HotelInfo> hotels = logisticsManager.getHotels(target);
		Assert.assertNotNull(hotels);
		Assert.assertFalse(hotels.isEmpty());
		log.info(hotels);
	}
	
	@Test
	public void testGetFlights() throws LogisticsException {
		Collection<String> flights =  logisticsManager.getFlights(target);
		Assert.assertNotNull(flights);
		Assert.assertFalse(flights.isEmpty());
		log.info(flights);
	}
}

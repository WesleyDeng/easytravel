package com.armandorv.easytravel.expediawsclient;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.expediawsclient.exception.HotelsException;
import com.armandorv.easytravel.expediawsclient.model.Hotel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-expedia-ws-client.xml")
public class HotelsServiceTest {

	private static final String MADRID = "Madrid";

	private static Logger log = Logger.getLogger(HotelsServiceTest.class);

	@Autowired
	private HotelsService service;

	@Autowired
	private ApplicationContext applicationContext;

	@Before
	public void setUp() {
		Assert.assertNotNull(service);
		log.info("Test context loaded");
	}

	@Test
	public void testfindHotels() {
		try {
			Collection<Hotel> hotels = service.findHotels(MADRID);

			Assert.assertNotNull(hotels);
			Assert.assertFalse(hotels.isEmpty());

			log.info("Found " + hotels.size() + "hotels");
			log.info(hotels);

		} catch (HotelsException e) {
			log.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@Test(expected = HotelsException.class)
	public void testfindHotelsError() throws HotelsException {
		service.findHotels("");
	}

}

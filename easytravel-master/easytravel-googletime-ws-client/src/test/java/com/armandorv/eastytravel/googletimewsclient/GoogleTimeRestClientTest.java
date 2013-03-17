package com.armandorv.eastytravel.googletimewsclient;

import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.googletimewsclient.GoogleTimeService;
import com.armandorv.easytravel.googletimewsclient.model.TimeZone;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-googletime-ws-client.xml")
public class GoogleTimeRestClientTest {

	private static Logger log = Logger.getLogger(GoogleTimeRestClientTest.class);

	private final float lattitude = 43.3724177F;

	private final float longitude = -5.8116522F;

	@Autowired
	private GoogleTimeService googleTimeService;

	@Before
	public void setUp() {
		Assert.assertNotNull(googleTimeService);
		log.info("Test context loaded");
	}

	@Test
	public void testGetGeometryNorena() {

		try {

			TimeZone timeZone = googleTimeService.getTimeZone(lattitude,
					longitude);
			Assert.assertNotNull(timeZone);
			log.info(timeZone);

		} catch (Exception e) {
			log.error(e);
			fail(e.getMessage());
		}
	}
}
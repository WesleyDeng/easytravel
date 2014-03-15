package com.armandorv.easytravel.googlegeocodewsclient;

import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.googlegeocodewsclient.GeocodingService;
import com.armandorv.easytravel.googlegeocodewsclient.exception.GoogleGeocodingException;
import com.armandorv.easytravel.googlegeocodewsclient.model.Address;
import com.armandorv.easytravel.googlegeocodewsclient.model.Geometry;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-googlegeocode-ws-client.xml")
public class GeocodignRestClientTest {

	private static final String COUNTRY_CODE_ES = "ES";

	private static final String POSTAL_CODE_33010 = "33010";

	private static Logger log = Logger.getLogger(GeocodignRestClientTest.class);

	@Autowired
	private GeocodingService geocodingService;

	@Before
	public void setUp() {
		Assert.assertNotNull(geocodingService);
		log.info("Test context loaded");
	}

	@Test
	public void testGetGeometry() {

		try {
			Geometry geometry = geocodingService.getGeometry(POSTAL_CODE_33010, COUNTRY_CODE_ES);
			Assert.assertNotNull(geometry);
			log.info(geometry);
			
		} catch (GoogleGeocodingException e) {
			log.error(e);
			fail(e.getMessage());
			
		}
	}
	
	@Test
	public void testGetAddress() {
		//2018430933,41.383366
		//40.714224F, -73.961452F
		//37.370155/-5.963173
		try {
			Address address= geocodingService.getAddress(37.370155F, -5.963173F);
			Assert.assertNotNull(address);
			log.info(address);
			
		} catch (GoogleGeocodingException e) {
			log.error(e);
			fail(e.getMessage());
			
		}
	}

}

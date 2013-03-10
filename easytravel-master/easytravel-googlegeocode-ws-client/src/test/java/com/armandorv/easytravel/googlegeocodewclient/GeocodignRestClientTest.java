package com.armandorv.easytravel.googlegeocodewclient;

import static org.junit.Assert.*;

import java.lang.invoke.MethodHandles;

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
import com.armandorv.easytravel.googlegeocodewsclient.model.Geometry;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-googlegeocode-ws-client.xml")
public class GeocodignRestClientTest {

	private static Logger log = Logger.getLogger(MethodHandles.lookup().getClass());

	@Autowired
	private GeocodingService geocodingService;

	@Before
	public void setUp() {
		Assert.assertNotNull(geocodingService);
		log.info("Test context loaded");
	}

	@Test
	public void testGetGeometryNorena() {

		try {
			Geometry geometry = geocodingService.getGeometry("33010", "ES");
			Assert.assertNotNull(geometry);
			log.info(geometry);
			
		} catch (GoogleGeocodingException e) {
			log.error(e);
			fail(e.getMessage());
			
		}
	}

}

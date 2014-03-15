package com.armandorv.easytravel.travelsws;


import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.travelsws.exception.TravelsWsException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-travels-ws-context.xml")
public class TravelsWebServiceTestIT {

	@Autowired
	private TravelsWebService travelsWebService;
	
	@Test
	public void testGetTravels() throws TravelsWsException {
		Collection<Travel> travels  =travelsWebService.getTravels("a");
		Assert.assertNotNull(travels);
	}

	@Test
	public void testHasVisited() {
		
	}

	@Test
	public void testNumberTravelsByDestination() {
	
	}

	@Test
	public void testMostVistedDestination() {
		
	}

	@Test
	public void testMostVistedDestinations() {
		
	}

}

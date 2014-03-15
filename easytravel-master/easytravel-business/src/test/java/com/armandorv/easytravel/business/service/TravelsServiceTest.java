package com.armandorv.easytravel.business.service;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-service-context.xml")
public class TravelsServiceTest {

	private static Logger log = Logger.getLogger(TravelsServiceTest.class);

	@Autowired
	private TravelsService travelsService;

	@Test @Ignore
	public void testCreateTravel() {
		fail("Not yet implemented");
	}

	@Test @Ignore
	public void testGetTravelsString() {
		fail("Not yet implemented");
	}

	@Test @Ignore
	public void testGetTravels() {
		fail("Not yet implemented");
	}

	@Test @Ignore
	public void testRemoveTravel() {
		fail("Not yet implemented");
	}

	@Test @Ignore
	public void testSummarizeTravel() {
		fail("Not yet implemented");
	}

	@Test @Ignore
	public void testGetDestinies() {
		fail("Not yet implemented");
	}

	@Test 
	public void testGetTravelsByDestination() {
		int count = travelsService.getTravelsByDestination("Barcelona"); 
		log.info(count);
		System.out.println(count);
	}

	@Test
	public void testGetMostVisitedDestination() {
		Destiny destination = travelsService
				.getMostVisitedDestination();
		Assert.assertNull(destination);
	}

	@Test
	public void GetMostVisitedDestinations() {
		List<Destiny> destinations = travelsService
				.getMostVisitedDestinations(4);
		Assert.assertNotNull(destinations);
	}

	@Test
	public void testGetTravelsByTerm() {
		Collection<Travel> travels = travelsService.getTravelsByTerm("bar");
		Assert.assertNotNull(travels);
	}

	@Test
	public void testHasUserVisited() {
		boolean yes = travelsService.hasUserVisited("armandorvila", "Barcelona");
		log.info(yes);
		
		 boolean yes2 = travelsService.hasUserVisited("armandorv", "Barcelona");
		log.info(yes);
		
		Assert.assertFalse(yes || yes2) ; 
	}

}

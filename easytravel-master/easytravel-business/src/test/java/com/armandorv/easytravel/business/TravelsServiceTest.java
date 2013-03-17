package com.armandorv.easytravel.business;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.business.service.TravelsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-service-context.xml")
public class TravelsServiceTest {
	
	private static Logger log = Logger.getLogger(TravelsServiceTest.class); 
	
	@Autowired
	private TravelsService travelsService;
	
	@Before
	public void setUp(){
		Assert.assertNotNull(travelsService);
		log.info("Context loaded");
	}
	
	@Test
	public void testNewTravel(){
		
	}
	
	@Test
	public void testGetTime(){
		
	}
	
}

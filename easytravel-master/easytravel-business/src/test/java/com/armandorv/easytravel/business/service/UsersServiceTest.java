package com.armandorv.easytravel.business.service;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.business.service.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-service-context.xml")
public class UsersServiceTest {
	
	private static Logger log = Logger.getLogger(UsersServiceTest.class); 
	
	@Autowired
	private UsersService usersService;
	
	@Before
	public void setUp(){
		Assert.assertNotNull(usersService);
		log.info("Context loaded");
	}
	
	@Test
	public void testNewTravel(){
		
	}
	
}

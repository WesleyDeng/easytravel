package com.armandorv.easytravel.web;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.web.application.TravelsBusinessDelegate;
import com.armandorv.easytravel.web.exception.PresentationException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-web-context.xml")
public class TravelsBusinessDelegateTest {
	
	private static Logger log = Logger.getLogger(TravelsBusinessDelegateTest.class); 
	
	@Autowired
	private TravelsBusinessDelegate travelsBD;
	
	@Before
	public void setUp(){
		Assert.assertNotNull(travelsBD);
		log.info("Context loaded");
	}
	
	@Test
	public void testPrepareDestiny() throws PresentationException{
		Destiny destiny = travelsBD.setUpDestiny("Title",41.383366, 41.383366);
		Assert.assertNotNull(destiny);
		log.info(destiny);
	}
	
	
}

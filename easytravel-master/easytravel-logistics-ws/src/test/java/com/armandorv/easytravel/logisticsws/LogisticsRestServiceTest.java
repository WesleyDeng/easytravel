package com.armandorv.easytravel.logisticsws;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.exception.BusinessException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-logistics-ws-context.xml")
public class LogisticsRestServiceTest {

	private static Logger log = Logger
			.getLogger(LogisticsRestServiceTest.class);
	
	@Autowired
	private LogisticsRestService service;

	@Before
	public void setUp() {
	}

	
	@Test
	public void testGetHotels() throws BusinessException{
		log.info("Context loaded");
		Collection<HotelInfo> hotels =  service.getHotels(23, 56);
		Assert.assertNotNull(hotels);
		log.info(hotels);
	}

}

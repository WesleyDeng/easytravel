package com.armandorv.easytravel.logisticsws;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
	public void test() {
		log.info("Context loaded");
	}

}

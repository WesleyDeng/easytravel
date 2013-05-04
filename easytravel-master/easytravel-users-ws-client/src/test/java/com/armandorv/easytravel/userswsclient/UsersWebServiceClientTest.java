package com.armandorv.easytravel.userswsclient;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.userswsclient.exception.UsersException;
import com.armandorv.easytravel.userswsclient.model.UserDetails;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-users-ws-client.xml")
public class UsersWebServiceClientTest {

	private static Logger log = Logger
			.getLogger(UsersWebServiceClientTest.class);

	@Autowired
	private UsersService usersService;

	@Autowired
	private ApplicationContext applicationContext;

	@Before
	public void setUp() {
		Assert.assertNotNull(usersService);
		log.info("Test context loaded");
	}

	@Test
	public void testfindUsers() {
		try {
			Collection<UserDetails> users = usersService.getUsers(2);

			Assert.assertNotNull(users);
			Assert.assertFalse(users.isEmpty());

			log.info("Found " + users.size() + "hotels");
			log.info(users);

		} catch (UsersException e) {
			log.error(e);
			Assert.fail(e.getMessage());
		}
	}

}

package com.armandorv.easytravel.business.persistence;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.business.domain.User;
import com.armandorv.easytravel.business.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-service-context.xml")
public class TravelRepositoryTest {

	private static Logger log = Logger.getLogger(TravelRepositoryTest.class);

	@Autowired
	private UserRepository userRepository;

	@Test
	@Rollback(value = false)
	public void testSave() {
		User user = userRepository.save(user());
		Assert.assertNotNull(user);
		Assert.assertNotNull(user.getId());
	}

	private User user() {
		User user = new User();
		user.setName("JUnit");
		user.setMail("junit@gmail.com");
		user.setLastname("4");
		user.setUsername("junit");
		user.setPassword(UUID.randomUUID().toString());

		return user;
	}

	@Test
	@Rollback(value = false)
	public void testFindAll() {
		Iterable<User> user = userRepository.findAll();
		Assert.assertNotNull(user);
	}

	@Test
	@Rollback(value = false)
	public void testDelete() {
		if (userRepository.count() > 0) {
			userRepository.delete(userRepository.findAll()
					.iterator().next());
		} else {
			log.error("there is no users");
			Assert.fail("There is no users");
		}
	}

}

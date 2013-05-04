package com.armandorv.easytravel.business.persistence;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.repository.DestinyRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:easytravel-service-context.xml")
public class DestinyRepositoryTest {

	private static Logger log = Logger.getLogger(DestinyRepositoryTest.class);

	@Autowired
	private DestinyRepository destinyRepository;

	@Test
	@Rollback(value = false)
	public void testSave() {
		Destiny destiny = destinyRepository.save(destiny());
		Assert.assertNotNull(destiny);
		Assert.assertNotNull(destiny.getId());
	}

	private Destiny destiny() {
		Destiny destiny = new Destiny();
		destiny.setAddress("Where ever");
		destiny.setEstimatedDate(new Date());
		destiny.setLattitude(54F);
		destiny.setLongitude(34F);
		destiny.setName("A destiny");
		destiny.setTimeZone("Madrid");
		return destiny;
	}

	@Test
	@Rollback(value = false)
	public void testFindAll() {
		Iterable<Destiny> destiny = destinyRepository.findAll();
		Assert.assertNotNull(destiny);
	}

	@Test
	@Rollback(value = false)
	public void testDelete() {
		if (destinyRepository.count() > 0) {
			destinyRepository.delete(destinyRepository.findAll()
					.iterator().next());
		} else {
			log.error("there is no destiny");
			Assert.fail("There is no destiny");
		}
	}

}

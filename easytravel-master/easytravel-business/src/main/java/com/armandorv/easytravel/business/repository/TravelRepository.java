package com.armandorv.easytravel.business.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.domain.User;

@Repository
public interface TravelRepository extends CrudRepository<Travel, Long> {

	@Query("select t from Travel t where t.user= ?1")
	Iterable<Travel> findByUser(User user);

	@Query("select t from Travel t where ?1 in elements(t.destinies)")
	Iterable<Travel> findByDestiny(Destiny destiny);
}

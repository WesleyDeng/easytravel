package com.armandorv.easytravel.business.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armandorv.easytravel.business.domain.Destiny;

@Repository
public interface DestinyRepository extends CrudRepository<Destiny, Long> {

	@Query("select d from Destiny d where d.name= ?1")
	Iterable<Destiny> findByName(String name);
}

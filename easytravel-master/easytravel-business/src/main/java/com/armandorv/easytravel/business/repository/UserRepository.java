package com.armandorv.easytravel.business.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armandorv.easytravel.business.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	@Query("select u from User u where u.username = ?1")
	User findByUsername(String username);
}

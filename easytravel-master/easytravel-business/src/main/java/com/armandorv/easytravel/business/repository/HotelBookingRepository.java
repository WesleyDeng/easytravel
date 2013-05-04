package com.armandorv.easytravel.business.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armandorv.easytravel.business.domain.HotelBooking;

@Repository
public interface HotelBookingRepository extends
		CrudRepository<HotelBooking, Long> {

}

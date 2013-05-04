package com.armandorv.easytravel.business.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armandorv.easytravel.business.domain.FlightBooking;

@Repository
public interface FlightBookingRepository extends CrudRepository<FlightBooking, Long>{

}

package com.armandorv.easytravel.business.domain;

import java.util.Date;
import java.util.Set;

public class HotelBooking {
	
	private Long id;
	
	private int persons;
	
	private Date checkInDate;
	
	private Date checkOutDate;
	
	private User booker;
	
	//@Min(1)
	private Set<HotelRoom> rooms;
	
	private BookingState state;
}

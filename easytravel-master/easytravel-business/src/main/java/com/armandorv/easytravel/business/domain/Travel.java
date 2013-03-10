package com.armandorv.easytravel.business.domain;

import java.util.Set;

public class Travel {

	private Long id;
	
	private User user;
	
	private Set<HotelBooking> hotels;
	
	private Set<FligthBooking> fligths;
}

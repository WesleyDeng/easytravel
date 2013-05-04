package com.armandorv.easytravel.expediawsclient;

import java.util.Set;

import com.armandorv.easytravel.expediawsclient.exception.HotelsException;
import com.armandorv.easytravel.expediawsclient.model.Hotel;

public interface HotelsService {
	
	Set<Hotel> findHotels(String city, String country) throws HotelsException;

}

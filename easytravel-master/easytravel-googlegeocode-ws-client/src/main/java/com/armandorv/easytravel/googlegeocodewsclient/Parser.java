package com.armandorv.easytravel.googlegeocodewsclient;

import com.armandorv.easytravel.googlegeocodewsclient.exception.GoogleGeocodingException;

public interface Parser <T> {
	
	T parse (String xml) throws GoogleGeocodingException;
}

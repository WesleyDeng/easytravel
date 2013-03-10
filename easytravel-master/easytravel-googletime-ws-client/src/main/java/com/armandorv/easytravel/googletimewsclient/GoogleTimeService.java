package com.armandorv.easytravel.googletimewsclient;

import com.armandorv.easytravel.googletimewsclient.exception.GoogleTimeException;
import com.armandorv.easytravel.googletimewsclient.model.TimeZone;

public interface GoogleTimeService {

	/**
	 * Get the time zone info for a given location.
	 * 
	 * @param lattitue
	 * @param longitude
	 * @return
	 */
	TimeZone getTimeZone(float lattitue, float longitude) throws GoogleTimeException;
}

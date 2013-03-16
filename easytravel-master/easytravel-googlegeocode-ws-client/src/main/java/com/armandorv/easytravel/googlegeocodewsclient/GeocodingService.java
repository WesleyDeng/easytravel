package com.armandorv.easytravel.googlegeocodewsclient;

import com.armandorv.easytravel.googlegeocodewsclient.exception.GoogleGeocodingException;
import com.armandorv.easytravel.googlegeocodewsclient.model.Address;
import com.armandorv.easytravel.googlegeocodewsclient.model.Geometry;

/**
 * Interface with the geocode service of Google.
 * 
 * @author armandorv
 * 
 */
public interface GeocodingService {

	/**
	 * Return the geometry of a zip code given a country.
	 * 
	 * @param zipCode
	 *            postal code.
	 * @param country
	 *            the country according to ISO 3166-1.
	 * 
	 * @return a cuple of lattitude and longitude wrapped on a Geometry object.
	 */
	Geometry getGeometry(String zipCode, String country)
			throws GoogleGeocodingException;

	/**
	 * 
	 * @param lattitude
	 * @param longitude
	 * @return
	 * @throws GoogleGeocodingException
	 */
	Address getAddress(float lattitude, float longitude)
			throws GoogleGeocodingException;
}

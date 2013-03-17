package com.armandorv.easytravel.googlegeocodewsclient;

import java.lang.invoke.MethodHandles;

import org.apache.log4j.Logger;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.googlegeocodewsclient.exception.GoogleGeocodingException;
import com.armandorv.easytravel.googlegeocodewsclient.model.Address;
import com.armandorv.easytravel.googlegeocodewsclient.model.Geometry;

/**
 * URI/?location=country:lattitude,longitude&timestamp=timestamp$sensor=false
 * 
 * @author armandorv
 * 
 */
@Component
class GeocodingRestClient implements GeocodingService {

	private static Logger log = Logger.getLogger(MethodHandles.lookup()
			.getClass());

	@Value("$geo{googlegeocode.rest.uri}")
	private String uri;

	@Value("$geo{googlegeocode.rest.sensor_name}")
	private String sensorName;

	@Value("$geo{googlegeocode.rest.components_name}")
	private String componentsName;

	@Value("$geo{googlegeocode.rest.country_name}")
	private String countryName;

	@Value("$geo{googlegeocode.rest.zip_code_name}")
	private String zipCodeName;

	@Autowired
	@Qualifier("geometryParser")
	private Parser<Geometry> gemetryParser;

	@Autowired
	@Qualifier("addressParser")
	private Parser<Address> addressParser;

	@Override
	public Geometry getGeometry(String zipCode, String country)
			throws GoogleGeocodingException {

		String response = invokeRest(zipCode, country);
		log.info("Google Response : " + response);
		return gemetryParser.parse(response);
	}

	@Override
	public Address getAddress(float lattitude, float longitude)
			throws GoogleGeocodingException {

		String response = invokeRest(lattitude, longitude);
		log.info("Google Response : " + response);
		return addressParser.parse(response);
	}

	private String invokeRest(String zipCode, String country)
			throws GoogleGeocodingException {

		try {
			ClientRequest request = new ClientRequest(uri);

			request.queryParameter(componentsName, countryName + ":" + country
					+ "|" + zipCodeName + ":" + zipCode);
			request.queryParameter(sensorName, false);

			request.accept("application/xml");

			log.debug("Invoking  " + request.getUri());

			ClientResponse<String> response = request.get(String.class);
			return response.getEntity();

		} catch (Exception e) {
			String message = "Error invoking google geocoding service for uri = "
					+ uri + " zipCode = " + zipCode + "," + country;
			log.error(message, e);
			throw new GoogleGeocodingException(message, e);
		}
	}

	private String invokeRest(float lattitude, float longitude)
			throws GoogleGeocodingException {

		try {
			ClientRequest request = new ClientRequest(uri);

			request.queryParameter("latlng", lattitude + "," + longitude);
			request.queryParameter(sensorName, false);

			request.accept("application/xml");

			log.debug("Invoking  " + request.getUri());

			ClientResponse<String> response = request.get(String.class);
			return response.getEntity();

		} catch (Exception e) {
			String message = "Error invoking google geocoding service for uri = "
					+ uri + " location = " + lattitude + "," + longitude;
			log.error(message, e);
			throw new GoogleGeocodingException(message, e);
		}
	}

}
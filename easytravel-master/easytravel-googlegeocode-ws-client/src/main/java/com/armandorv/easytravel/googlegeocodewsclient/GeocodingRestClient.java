package com.armandorv.easytravel.googlegeocodewsclient;

import java.lang.invoke.MethodHandles;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.googlegeocodewsclient.exception.GoogleGeocodingException;
import com.armandorv.easytravel.googlegeocodewsclient.model.Geometry;

/**
 * URI/?location=country:lattitude,longitude&timestamp=timestamp$sensor=false
 * 
 * @author armandorv
 * 
 */
@Component
public class GeocodingRestClient implements GeocodingService {

	private static Logger log = Logger.getLogger(MethodHandles.lookup().getClass());

	@Value("${googlegeocode.rest.uri}")
	private String uri;

	@Value("${googlegeocode.rest.sensor_name}")
	private String sensorName;

	@Value("${googlegeocode.rest.components_name}")
	private String componentsName;

	@Value("${googlegeocode.rest.country_name}")
	private String countryName;

	@Value("${googlegeocode.rest.zip_code_name}")
	private String zipCodeName;

	@Autowired
	private GeocodingJaxbParser jaxbParser;

	@Override
	public Geometry getGeometry(String zipCode, String country)
			throws GoogleGeocodingException {
		
		String response = invokeRest(zipCode, country);
		log.info("Google Response : " + response);
		return jaxbParser.parse(response);
	}

	private String invokeRest(String zipCode, String country) {
		WebClient client = WebClient.create(uri);

		client.query(sensorName, false);
		client.query(componentsName, countryName + ":" + country + "|"
				+ zipCodeName + ":" + zipCode);
		return client.get().readEntity(String.class);
	}

}
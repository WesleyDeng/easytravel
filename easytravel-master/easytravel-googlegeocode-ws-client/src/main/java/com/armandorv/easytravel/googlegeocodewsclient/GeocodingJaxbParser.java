package com.armandorv.easytravel.googlegeocodewsclient;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.net.URL;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.googlegeocodewsclient.exception.GoogleGeocodingException;
import com.armandorv.easytravel.googlegeocodewsclient.jaxb.GeocodeResponse;
import com.armandorv.easytravel.googlegeocodewsclient.jaxb.GeocodeResponse.Result.Geometry.Location;
import com.armandorv.easytravel.googlegeocodewsclient.model.Geometry;

/**
 * Class to parse String from the google geocode service.
 * 
 * @author armandorv
 * 
 */
@Component
class GeocodingJaxbParser {

	private static final String OK = "OK";

	private static Logger log = Logger.getLogger(MethodHandles.lookup()
			.getClass());

	private URL xsd;

	@PostConstruct
	public void postConstruct() {
		xsd = this.getClass().getClassLoader()
				.getResource("google-geocoding.xsd");
	}

	public Geometry parse(String xml) throws GoogleGeocodingException {
		assertNotNullOrEmpty(xml);
		assertNotNull(xsd);

		try {
			InputStream xmlIn = new ByteArrayInputStream(xml.getBytes());

			JAXBContext context = JAXBContext
					.newInstance(GeocodeResponse.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();

			GeocodeResponse response = (GeocodeResponse) unmarshaller
					.unmarshal(xmlIn);

			return geometry(response);

		} catch (JAXBException | IllegalArgumentException e) {
			log.error("Error parsing xml content :" + e.getMessage(), e);
			throw new GoogleGeocodingException("Error parsing xml content :"
					+ e.getMessage(), e);
		}
	}

	private Geometry geometry(GeocodeResponse response) {
		assertStatus(response);
		Location location = response.getResult().getGeometry().getLocation();
		return new Geometry(location.getLat(), location.getLng());
	}

	/* Assertions methods */

	private void assertStatus(GeocodeResponse response) {
		if (!OK.equals(response.getStatus())) {
			throw new IllegalArgumentException(
					"Error invocando al servicio de geocoding : status = "
							+ response.getStatus());
		}
	}

	private void assertNotNullOrEmpty(String xml) {
		if (xml == null || "".equals(xml)) {
			throw new IllegalArgumentException("XMl must not be empty.");
		}
	}

	private void assertNotNull(URL xml) {
		if (xml == null) {
			throw new IllegalArgumentException("XMl must not be empty.");
		}
	}

}
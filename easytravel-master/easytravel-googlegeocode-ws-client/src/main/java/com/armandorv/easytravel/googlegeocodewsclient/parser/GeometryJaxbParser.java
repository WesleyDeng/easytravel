package com.armandorv.easytravel.googlegeocodewsclient.parser;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.googlegeocodewsclient.Parser;
import com.armandorv.easytravel.googlegeocodewsclient.exception.GoogleGeocodingException;
import com.armandorv.easytravel.googlegeocodewsclient.jaxb.GeocodeResponse;
import com.armandorv.easytravel.googlegeocodewsclient.jaxb.GeocodeResponse.Result.Geometry.Location;
import com.armandorv.easytravel.googlegeocodewsclient.model.Geometry;

/**
 * Class to parse String from the google geocoding service.
 * 
 * @author armandorv
 *  
 */
@Component
@Qualifier("geometryParser")
class GeometryJaxbParser extends ParserTemplate<GeocodeResponse> implements
		Parser<Geometry> {

	private static Logger log = Logger.getLogger(GeometryJaxbParser.class);

	@Override
	public Geometry parse(String xml) throws GoogleGeocodingException {
		assertNotNullOrEmpty(xml);
		try {
			GeocodeResponse response = (GeocodeResponse) unmarshaller(
					GeocodeResponse.class).unmarshal(asIs(xml));

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
}
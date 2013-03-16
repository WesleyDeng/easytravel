package com.armandorv.easytravel.googlegeocodewsclient.parser;

import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.googlegeocodewsclient.Parser;
import com.armandorv.easytravel.googlegeocodewsclient.exception.GoogleGeocodingException;
import com.armandorv.easytravel.googlegeocodewsclient.exception.NoAddressFoundException;
import com.armandorv.easytravel.googlegeocodewsclient.jaxb.inverse.GeocodeResponse;
import com.armandorv.easytravel.googlegeocodewsclient.jaxb.inverse.GeocodeResponse.Result;
import com.armandorv.easytravel.googlegeocodewsclient.model.Address;

/**
 * Class to parse String from the google geocode service.
 * 
 * @author armandorv
 * 
 */
@Component
@Qualifier("addressParser")
class AddressJaxbParser extends ParserTemplate<GeocodeResponse> implements
		Parser<Address> {

	private static Logger log = Logger.getLogger(AddressJaxbParser.class);

	@Override
	public Address parse(String xml) throws GoogleGeocodingException {
		assertNotNullOrEmpty(xml);

		try {
			GeocodeResponse response = (GeocodeResponse) unmarshaller(
					GeocodeResponse.class).unmarshal(asIs(xml));

			return address(response);

		} catch (JAXBException | IllegalArgumentException e) {
			log.error("Error parsing xml content :" + e.getMessage(), e);
			throw new GoogleGeocodingException("Error parsing xml content :"
					+ e.getMessage(), e);
		}
	}

	private Address address(GeocodeResponse response)
			throws NoAddressFoundException {
		assertStatus(response);
		List<Result> results = response.getResult();

		if (results == null || results.isEmpty()) {
			log.warn("There is no results for the couple lat,long.");
			throw new NoAddressFoundException();
		}

		return address(results.get(0));
	}

	private Address address(Result result) {
		AddressBuilder builder = new AddressBuilder();
		
		AddressComponentReader reader = new AddressComponentReader(
				result.getAddressComponent());

		builder.fullText(result.getFormattedAddress());
		
		builder.country(reader.readCountry());
		builder.state(reader.readState());
		builder.locality(reader.readLocality());
		builder.sublocality(reader.readSubLocalityNumber());
		builder.street(reader.readStreet());
		builder.streetNumber(reader.readStreetNumber());
		builder.postalCode(reader.readPostalCode());

		return builder.build();
	}

}
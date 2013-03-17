package com.armandorv.easytravel.googletimewsclient;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.googletimewsclient.exception.GoogleTimeException;
import com.armandorv.easytravel.googletimewsclient.jaxb.TimeZoneResponse;
import com.armandorv.easytravel.googletimewsclient.model.TimeZone;

@Component
public class GoogleTimeJaxbParser {

	private static final String OK = "OK";

	private static Logger log = Logger.getLogger(GoogleTimeJaxbParser.class);

	public TimeZone parse(String xml) throws GoogleTimeException {

		assertNotNullOrEmpty(xml , "XML");

		try {
			xml = new String(xml.getBytes(), "UTF-8");
			InputStream xmlIn = new ByteArrayInputStream(xml.getBytes());

			JAXBContext context = JAXBContext
					.newInstance(TimeZoneResponse.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();

			TimeZoneResponse response = (TimeZoneResponse) unmarshaller
					.unmarshal(xmlIn);

			return timeZone(response);

		} catch (JAXBException | IllegalArgumentException | UnsupportedEncodingException e) {
			log.error("Error parsing xml content :" + e.getMessage(), e);
			throw new GoogleTimeException("Error parsing xml content :"
					+ e.getMessage(), e);
		}
	}

	private TimeZone timeZone(TimeZoneResponse response) {
		assertStatus(response);
		return new TimeZone(response.getTimeZoneName(), response.getRawOffset());
	}

	/* Assertions methods */

	private void assertStatus(TimeZoneResponse response) {
		if (!OK.equals(response.getStatus())) {
			throw new IllegalArgumentException(
					"Error invocando al servicio de google time : status = "
							+ response.getStatus());
		}
	}

	private void assertNotNullOrEmpty(String param,String name) {
		if (param == null || "".equals(param)) {
			throw new IllegalArgumentException(name + " must not be empty.");
		}
	}

}
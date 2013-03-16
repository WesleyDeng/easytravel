package com.armandorv.easytravel.googlegeocodewsclient.parser;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.armandorv.easytravel.googlegeocodewsclient.jaxb.inverse.GeocodeResponse;

public class ParserTemplate<T> {

	private static final String OK = "OK";

	protected Unmarshaller unmarshaller(Class<T> type) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(type);
		return context.createUnmarshaller();
	}

	protected InputStream asIs(String xml) {
		return new ByteArrayInputStream(xml.getBytes());
	}

	/* Assertions methods */

	protected void assertStatus(GeocodeResponse response) {
		if (!OK.equals(response.getStatus())) {
			throw new IllegalArgumentException(
					"Error invocando al servicio de geocoding : status = "
							+ response.getStatus());
		}
	}

	protected void assertStatus(
			com.armandorv.easytravel.googlegeocodewsclient.jaxb.GeocodeResponse response) {
		if (!OK.equals(response.getStatus())) {
			throw new IllegalArgumentException(
					"Error invocando al servicio de geocoding : status = "
							+ response.getStatus());
		}
	}

	protected void assertNotNullOrEmpty(String xml) {
		if (xml == null || "".equals(xml)) {
			throw new IllegalArgumentException("XMl must not be empty.");
		}
	}

	protected void assertNotNull(URL xml) {
		if (xml == null) {
			throw new IllegalArgumentException("XMl must not be empty.");
		}
	}
}

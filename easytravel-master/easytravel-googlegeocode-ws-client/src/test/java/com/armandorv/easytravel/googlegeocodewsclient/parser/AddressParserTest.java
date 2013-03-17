package com.armandorv.easytravel.googlegeocodewsclient.parser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import junit.framework.Assert;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.armandorv.easytravel.googlegeocodewsclient.exception.GoogleGeocodingException;
import com.armandorv.easytravel.googlegeocodewsclient.model.Address;

public class AddressParserTest {

	private static Logger log = Logger.getLogger(AddressParserTest.class);

	private AddressJaxbParser parser = new AddressJaxbParser();

	@Test
	public void test() throws FileNotFoundException, GoogleGeocodingException,
			IOException {
		InputStream in = this.getClass().getClassLoader()
				.getResourceAsStream("response");
		Assert.assertNotNull(in);
		Address address = parser.parse(IOUtils.toString(in));
		Assert.assertNotNull(address);
		log.info(address);
	}

}

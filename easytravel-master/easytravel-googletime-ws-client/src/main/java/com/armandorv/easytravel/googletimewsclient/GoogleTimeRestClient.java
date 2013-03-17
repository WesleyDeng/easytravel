package com.armandorv.easytravel.googletimewsclient;

import java.lang.invoke.MethodHandles;
import java.util.Date;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.googletimewsclient.exception.GoogleTimeException;
import com.armandorv.easytravel.googletimewsclient.model.TimeZone;

@Component
class GoogleTimeRestClient implements GoogleTimeService {

	private static Logger log = Logger.getLogger(MethodHandles.lookup()
			.getClass());

	@Value("$gtime{googletime.rest.uri}")
	private String uri;

	@Value("$gtime{googletime.rest.sensor_name}")
	private String sensorName;

	@Value("$gtime{googletime.rest.location_name}")
	private String locationName;

	@Value("$gtime{googletime.rest.timestamp_name}")
	private String timeStampName;

	@Value("$gtime{googletime.rest.encoding}")
	private String urlEncoding;

	@Autowired
	private GoogleTimeJaxbParser parser;

	public TimeZone getTimeZone(float lattitude, float longitude)
			throws GoogleTimeException {

		String xml = invokeRest(lattitude, longitude);
		log.info("Retrieved " + xml + " from gooogle time service.");
		return parser.parse(xml);
	}

	private String invokeRest(float lattitude, float longitude) {
		WebClient client = WebClient.create(uri);

		String location = lattitude + "," + longitude;
		client.encoding(urlEncoding);
		client.query(locationName, location);
		client.query(timeStampName, (int)new Date().getTime());
		client.query(sensorName, false);

		log.info("Executing rest invocation to :" + client.getCurrentURI());

		return client.get().readEntity(String.class);
	}

}

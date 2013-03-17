package com.armandorv.easytravel.googletimewsclient;

import java.util.Date;

import org.apache.log4j.Logger;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.googletimewsclient.exception.GoogleTimeException;
import com.armandorv.easytravel.googletimewsclient.model.TimeZone;

@Component
public class GoogleTimeRestClient implements GoogleTimeService {

	private static Logger log = Logger.getLogger(GoogleTimeRestClient.class);

	@Value("$gtime{googletime.rest.uri}")
	private String uri;

	@Value("$gtime{googletime.rest.sensor_name}")
	private String sensorName;

	@Value("$gtime{googletime.rest.location_name}")
	private String locationName;

	@Value("$gtime{googletime.rest.timestamp_name}")
	private String timeStampName;

	@Autowired
	private GoogleTimeJaxbParser parser;

	@Override
	public TimeZone getTimeZone(float lattitude, float longitude)
			throws GoogleTimeException {

		String xml = invokeRest(lattitude, longitude);
		log.info("Retrieved " + xml + " from gooogle time service.");
		return parser.parse(xml);
	}

	private String invokeRest(float lattitude, float longitude)
			throws GoogleTimeException {
		try {
			ClientRequest request = new ClientRequest(uri);

			 String location = lattitude + "," + longitude;
			 request.queryParameter(locationName, location);
			 request.queryParameter(timeStampName, (int) new
			 Date().getTime());
			 request.queryParameter(sensorName, false);
			
			 request.accept("application/xml");
			
			 log.debug("Invoking  " + request.getUri());
			 ClientResponse<String> response = request.get(String.class);
			 return response.getEntity();

//			HttpClient client = new HttpClient();
//			HttpGet get = new HttpGet(
//					new URI(
//							"https://maps.googleapis.com/maps/api/timezone/xml?sensor=false&timestamp=2034390582&location=43.372417%2C-5.811652"));
//			HttpMethod method = get; 
//			HttpResponse response = client.executeMethod(method);
//			HttpEntity entity = response.getEntity();

		} catch (Exception e) {
			String message = "Error invoking google time service for uri = "
					+ uri + " location = " + lattitude + "," + longitude;
			log.error(message, e);
			throw new GoogleTimeException(message, e);
		}
	}
}

package com.armandorv.easytravel.logisticsws;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import org.jboss.resteasy.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.service.LogisticsService;

@Component
public class LogisticsRestServiceIml implements LogisticsRestService {

	private static Logger log = Logger.getLogger(LogisticsRestServiceIml.class);

	@Autowired
	private LogisticsService logisticsService;

	@Override
	@GET
	@Path("/timezone/{lat}/{lng}")
	public String getTimeZone(@PathParam("lat") float lattitude,
			@PathParam("lng") float longitude) {
		try {
			return "<timezone>"
					+ logisticsService.getTimeZone(lattitude, longitude)
					+ "</timezone>";
		} catch (BusinessException e) {
			log.error("Error at rest service : " + e.getMessage(), e);
			throw new WebApplicationException(error(e.getMessage()));
		}
		catch (Exception e){
			log.error("Error at rest service : " + e.getMessage(), e);
			throw new WebApplicationException(error(e.getMessage()));
		}
		
	}

	private Response error(String message) {
		ResponseBuilder builder = Response.status(Status.INTERNAL_SERVER_ERROR);
		builder.type("application/xml");
		builder.entity("<error>" + message + "</error>");
		return builder.build();
	}

	@Override
	@GET
	@Path("/address/{lat}/{lng}")
	public String getAddress(@PathParam("lat") float lattitude,
			@PathParam("lng") float longitude) {
		try {
			return "<address>"
					+ logisticsService.getAddress(lattitude, longitude)
					+ "</address>";
		} catch (BusinessException e) {
			log.error("Error at rest service : " + e.getMessage(), e);
			throw new WebApplicationException(error(e.getMessage()));
		}
		catch (Exception e){
			log.error("Error at rest service : " + e.getMessage(), e);
			throw new WebApplicationException(error(e.getMessage()));
		}
	}

	@Override
	@GET
	@Path("/hotels/{lat}/{lng}")
	public Collection<HotelInfo> getHotels(@PathParam("lat") float lattitude,
			@PathParam("lng") float longitude) throws BusinessException {
		try {
			return logisticsService.getHotels(destiny(lattitude, longitude));
		} catch (BusinessException e) {
			log.error("Error at rest service : " + e.getMessage(), e);
			throw new WebApplicationException(error(e.getMessage()));
		}
		catch (Exception e){
			log.error("Error at rest service : " + e.getMessage(), e);
			throw new WebApplicationException(error(e.getMessage()));
		}
	}

	@Override
	@GET
	@Path("/flights/{lat}/{lng}")
	public Collection<FlightInfo> getFlights(@PathParam("lat") float lattitude,
			@PathParam("lng") float longitude) throws BusinessException {
		try {
			return logisticsService.getFlights(destiny(lattitude, longitude));
		} catch (BusinessException e) {
			log.error("Error at rest service : " + e.getMessage(), e);
			throw new WebApplicationException(error(e.getMessage()));
		}
		catch (Exception e){
			log.error("Error at rest service : " + e.getMessage(), e);
			throw new WebApplicationException(error(e.getMessage()));
		}
	}

	private Destiny destiny(float lattitude, float longitude) {
		Destiny destiny = new Destiny();
		destiny.setLattitude(lattitude);
		destiny.setLongitude(longitude);
		return destiny;
	}

}
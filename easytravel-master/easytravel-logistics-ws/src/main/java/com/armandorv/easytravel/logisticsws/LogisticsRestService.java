package com.armandorv.easytravel.logisticsws;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.exception.BusinessException;

/**
 * This is the Root Resource of this restful web service.
 * 
 * 
 * We have a high coupling problem since HotelInfo and FlightInfo classes must
 * to be annotated as XmlRootElement.
 * 
 * @author armandorv
 * 
 */
@Path("/logistics")
@Produces("application/xml")
@Component
public interface LogisticsRestService {

	@GET
	@Path("/timezone/{lat}/{lng}")
	String getTimeZone(@PathParam("lat") float lattitude,
			@PathParam("lng") float longitude);

	@GET
	@Path("/address/{lat}/{lng}")
	String getAddress(@PathParam("lat") float lattitude,
			@PathParam("lng") float longitude);

	@GET
	@Path("/hotels/{lat}/{lng}")
	Collection<HotelInfo> getHotels(@PathParam("lat") float lattitude,
			@PathParam("lng") float longitude) throws BusinessException;

	@GET
	@Path("/flights/{lat}/{lng}")
	Collection<FlightInfo> getFlights(@PathParam("lat") float lattitude,
			@PathParam("lng") float longitude) throws BusinessException;
}

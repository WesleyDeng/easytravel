package com.armandorv.easytravel.expediawsclient;

import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.expediawsclient.exception.HotelsException;
import com.armandorv.easytravel.expediawsclient.model.Hotel;
import com.ean.wsapi.hotel.v3.HotelListRequest;
import com.ean.wsapi.hotel.v3.HotelListResponse;
import com.ean.wsapi.hotel.v3.HotelServices;

@Component
public class HotelsServiceImpl implements HotelsService {

	private Logger log = Logger.getLogger(HotelsServiceImpl.class);

	@Value("${ws.username}")
	private String username;

	@Value("${ws.password}")
	private String password;

	@Autowired
	private HotelServices hotelsService;

	@Override
	public Set<Hotel> findHotels(String city) throws HotelsException {
		HotelListResponse response = hotelsService
				.getList(hotelListRequest(city));
		validateResponse(response);
		log.info("Retrieved " + response.getHotelList().getSize() + " hotels");
		return new HotelsMapper(response.getHotelList()).map();
	}

	private void validateResponse(HotelListResponse response)
			throws HotelsException {
		if (response.getEanWsError() != null) {
			log.error("Error invoking hotels web service "
					+ response.getEanWsError().getPresentationMessage());
			throw new HotelsException(response.getEanWsError());
		}

	}

	private HotelListRequest hotelListRequest(String city) {
		HotelListRequest hotelListRequest = new HotelListRequest();

		hotelListRequest.setApiKey(username);
		hotelListRequest.setCid(new Long(password));
		hotelListRequest.setDestinationString(city);
		hotelListRequest.setNumberOfResults(100);

		return hotelListRequest;
	}

}
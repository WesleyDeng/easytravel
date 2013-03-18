package com.armandorv.easytravel.business.service.mapper;

import java.util.Collection;

import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.service.Mapper;
import com.armandorv.easytravel.expediawsclient.model.Hotel;

public class MappersFactory {

	private static Mapper<Hotel, HotelInfo> hotelsMaper = new HotelMapper();

	private static Mapper<Collection<Hotel>, Collection<HotelInfo>> hotelsCollectionMaper = new CollectionMapper<Hotel, HotelInfo>(
			hotelsMaper);

	private MappersFactory() {
	}

	public static Mapper<Hotel, HotelInfo> hotelsMaper() {
		return hotelsMaper;
	}

	public static Mapper<Collection<Hotel>, Collection<HotelInfo>> hotelsCollectionMaper() {
		return hotelsCollectionMaper;
	}
}

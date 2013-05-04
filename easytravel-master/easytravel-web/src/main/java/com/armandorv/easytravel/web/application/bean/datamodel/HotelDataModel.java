package com.armandorv.easytravel.web.application.bean.datamodel;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.primefaces.model.SelectableDataModel;

import com.armandorv.easytravel.business.domain.HotelInfo;

public class HotelDataModel extends BaseDataModel<HotelInfo> implements
		SelectableDataModel<HotelInfo>, Serializable {

	private static final long serialVersionUID = -6323779488605456121L;

	public HotelDataModel() {
	}

	public HotelDataModel(Collection<HotelInfo> flights) {
		super(flights);
	}

	@Override
	public Object getRowKey(HotelInfo hotel) {
		return hotel.getHotelId();
	}

	@Override
	public HotelInfo getRowData(String rowKey) {

		List<HotelInfo> hotels = (List<HotelInfo>) getWrappedData();

		for (HotelInfo hotel : hotels) {

			if (hotel.getHotelId() != null
					&& hotel.getHotelId().toString().equals(rowKey))
				return hotel;
		}
		return null;
	}
}

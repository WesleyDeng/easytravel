package com.armandorv.easytravel.web.application.bean.datamodel;

import java.io.Serializable;
import java.util.Collection;

import org.primefaces.model.SelectableDataModel;

import com.armandorv.easytravel.business.domain.FlightInfo;

public class FlightsDataModel extends BaseDataModel<FlightInfo> implements
		SelectableDataModel<FlightInfo>, Serializable {

	private static final long serialVersionUID = -7951197829722660820L;

	public FlightsDataModel() {
	}

	public FlightsDataModel(Collection<FlightInfo> flights) {
		super(flights);
	}

	@Override
	public Object getRowKey(FlightInfo flight) {
		return flight.getFlightId();
	}

	@Override
	public FlightInfo getRowData(String rowKey) {
		Collection<FlightInfo> flights = getWrappedData();
		for (FlightInfo flight : flights) {					
			if (rowKey.equals(flight.getFlightId()))
				return flight;
		}
		return null;
	}
}

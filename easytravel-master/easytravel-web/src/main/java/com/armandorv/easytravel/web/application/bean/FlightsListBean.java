package com.armandorv.easytravel.web.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.web.application.TravelsBusinessDelegate;
import com.armandorv.easytravel.web.application.bean.datamodel.FlightsDataModel;
import com.armandorv.easytravel.web.exception.PresentationException;
import com.armandorv.easytravel.web.util.FacesContextUtils;

@Component
@Scope("view")
public class FlightsListBean implements Serializable {

	private static final long serialVersionUID = -3845147360914074730L;

	private Destiny destiny;

	private FlightInfo selected;

	private Collection<FlightInfo> flights = new ArrayList<>();
	
	private FlightsDataModel flightsDataModel = new FlightsDataModel(flights);

	@Autowired
	private TravelsBusinessDelegate travelsBD;

	public void loadFlights() {
		try {
			flights = travelsBD.loadFlights(destiny);
			flightsDataModel = new FlightsDataModel(flights);
		} catch (PresentationException e) {
			FacesContextUtils.addMessageError("Error", e.getMessage());
		}
	}

	public Destiny getDestiny() {
		return destiny;
	}

	public void setDestiny(Destiny destiny) {
		this.destiny = destiny;
	}

	public FlightInfo getSelected() {
		return selected;
	}

	public void setSelected(FlightInfo selected) {
		this.selected = selected;
	}

	public Collection<FlightInfo> getFlights() {
		return flights;
	}

	public void setFlights(Collection<FlightInfo> flights) {
		this.flights = flights;
	}

	public FlightsDataModel getFlightsDataModel() {
		return flightsDataModel;
	}

	public void setFlightsDataModel(FlightsDataModel flightsDataModel) {
		this.flightsDataModel = flightsDataModel;
	}

}

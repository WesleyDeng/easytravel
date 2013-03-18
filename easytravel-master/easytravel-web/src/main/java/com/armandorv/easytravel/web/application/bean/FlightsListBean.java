package com.armandorv.easytravel.web.application.bean;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.web.application.TravelsBusinessDelegate;
import com.armandorv.easytravel.web.exception.PresentationException;
import com.armandorv.easytravel.web.util.FacesContextUtils;

@Component
@Scope("view")
public class FlightsListBean {

	private Destiny destiny;

	private String selected;

	private Collection<FlightInfo> flights = new ArrayList<>();;

	@Autowired
	private TravelsBusinessDelegate travelsBD;

	public void loadFlights() {
		try {
			flights = travelsBD.loadTravels(destiny);
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

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	public Collection<FlightInfo> getFlights() {
		return flights;
	}

	public void setFlights(Collection<FlightInfo> flights) {
		this.flights = flights;
	}

}

package com.armandorv.easytravel.web.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightBooking;
import com.armandorv.easytravel.business.domain.HotelBooking;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.web.application.TravelsBusinessDelegate;
import com.armandorv.easytravel.web.exception.PresentationException;
import com.armandorv.easytravel.web.util.FacesContextUtils;
import com.armandorv.easytravel.web.util.ListAdapter;

@Component
@Scope("view")
public class TravelsHistoryBean implements Serializable {

	private static final long serialVersionUID = -8854794334318455704L;

	@Autowired
	private TravelsBusinessDelegate travelsBD;

	private List<Travel> travels = new ArrayList<>();

	private Travel selected;

	private List<Destiny> selectedDestinies = new ArrayList<>();

	private Destiny selectedDestiny;

	@PostConstruct
	public void postConstruct() {
		try {
			travels = travelsBD.getPrincipalTravels();
		} catch (PresentationException e) {
			FacesContextUtils.addMessageError("Error loading travels.",
					e.getMessage());
		}
	}

	public void removeTravel() {
		try {
			travels.remove(selected);
			travelsBD.removeTravel(selected);
			FacesContextUtils.addMessageInfo("Travel deleted.",
					"All destinations has been deleted too.");
		} catch (PresentationException e) {
			FacesContextUtils.addMessageError("Error deleting travel.",
					e.getMessage());
		}
	}

	public void summarize() {
		try {
			travelsBD.summarizeTravel(selected);
		} catch (PresentationException e) {
			FacesContextUtils.addMessageError("Error summarizing travel.",
					e.getMessage());
		}
	}
	
	public void loadDestinies(){
		try {
			selectedDestinies =travelsBD.getDestinies(selected);
		} catch (PresentationException e) {
			FacesContextUtils.addMessageError("Error summarizing travel.",
					e.getMessage());
		}
	}

	/**
	 * *************************************************************************
	 * False properties to wrap selected.getHotels() set into a List.
	 * ******************************************************************
	 */
	public List<HotelBooking> getSelectedHotels() {
		return (selectedDestiny == null) ? new ArrayList<HotelBooking>()
				: new ListAdapter<>(selectedDestiny.getHotels());
	}

	public List<FlightBooking> getSelectedFlights() {
		return (selectedDestiny == null) ? new ArrayList<FlightBooking>()
				: new ListAdapter<>(selectedDestiny.getFlights());
	}

	/* ******************** Getters and Setters ************************* */

	public List<Travel> getTravels() {
		return travels;
	}

	public void setTravels(List<Travel> travels) {
		this.travels = travels;
	}

	public Travel getSelected() {
		return selected;
	}

	public void setSelected(Travel selected) {
		this.selected = selected;
	}

	public Destiny getSelectedDestiny() {
		return selectedDestiny;
	}

	public void setSelectedDestiny(Destiny selectedDestiny) {
		this.selectedDestiny = selectedDestiny;
	}

	public List<Destiny> getSelectedDestinies() {
		return selectedDestinies;
	}

	public void setSelectedDestinies(List<Destiny> selectedDestinies) {
		this.selectedDestinies = selectedDestinies;
	}

}

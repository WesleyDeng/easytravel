package com.armandorv.easytravel.web.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.event.FlowEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.FlightBooking;
import com.armandorv.easytravel.business.domain.FlightInfo;
import com.armandorv.easytravel.business.domain.HotelBooking;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.web.application.TravelsBusinessDelegate;
import com.armandorv.easytravel.web.exception.PresentationException;
import com.armandorv.easytravel.web.util.FacesContextUtils;
import com.armandorv.easytravel.web.util.ListAdapter;

/**
 * JSF backing bean used during the new travel creation.
 */
@Component
@Scope("view")
public class NewTravelBean implements Serializable {

	private static final long serialVersionUID = -7615029317019210908L;

	private String title;

	private double lat;

	private double lng;

	private MapModel emptyModel = new DefaultMapModel();

	private Travel travel = new Travel();

	private List<Destiny> destinies = new ArrayList<>();

	private Destiny selected;

	@Autowired
	private TravelsBusinessDelegate travelsBD;

	public String start() {
		travel = new Travel();
		return "success";
	}

	public void addDestiny() {
		try {
			Destiny destiny = travelsBD.setUpDestiny(title, lat, lng);

			destinies.add(destiny);
			emptyModel.addOverlay(new Marker(new LatLng(lat, lng), title));

			FacesContextUtils.addMessageInfo("Destiny added :",
					destinies.size() + " destinies");
		} catch (PresentationException e) {
			FacesContextUtils.addMessageError("Error", e.getMessage());
		}
	}

	public void removeDestiny() {
		destinies.remove(selected);
		selected = null;
	}

	public void addHotel(SelectEvent event) {
		HotelInfo hotel = ((HotelInfo) event.getObject());
		FacesContextUtils.addMessageInfo("Hotel added", "");

		HotelBooking booking = new HotelBooking();
		booking.setHotelInfo(hotel);
		booking.setPersons(1);

		selected.addHotel(booking);
	}

	public void addFlight(SelectEvent event) {
		FlightInfo flight = ((FlightInfo) event.getObject());
		FacesContextUtils.addMessageInfo("Flight added", "");

		FlightBooking booking = new FlightBooking();
		booking.setFlightInfo(flight);

		selected.addFlight(booking);
	}

	public String confirmTravel() {
		try {
			travelsBD.comfirmTravel(travel, destinies);
		} catch (PresentationException e) {
			FacesContextUtils.addMessageError("Error", e.getMessage());
		}
		return "endNewTravel";
	}

	public String onFlowProcess(FlowEvent event) {
		return event.getNewStep();
	}

	/* ******* Getters and setters of the managed bean. ******* */

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public Destiny getSelected() {
		return selected;
	}

	public void setSelected(Destiny selected) {
		this.selected = selected;
	}

	public List<Destiny> getDestinies() {
		return destinies;
	}

	public void setDestinies(List<Destiny> destinies) {
		this.destinies = destinies;
	}

	public MapModel getEmptyModel() {
		return emptyModel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public void setEmptyModel(MapModel emptyModel) {
		this.emptyModel = emptyModel;
	}

	/**
	 * *************************************************************************
	 * False properties to wrap selected.getHotels() set into a List.
	 * ******************************************************************
	 */
	public List<HotelBooking> getSelectedHotels() {
		return (selected == null) ? new ArrayList<HotelBooking>()
				: new ListAdapter<>(selected.getHotels());
	}

	public List<FlightBooking> getSelectedFlights() {
		return (selected == null) ? new ArrayList<FlightBooking>()
				: new ListAdapter<>(selected.getFlights());
	}

}
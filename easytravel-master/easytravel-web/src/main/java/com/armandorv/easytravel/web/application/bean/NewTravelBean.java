package com.armandorv.easytravel.web.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.event.FlowEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.web.application.TravelsBusinessDelegate;
import com.armandorv.easytravel.web.exception.PresentationException;
import com.armandorv.easytravel.web.util.FacesContextUtils;

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

	/* Getters and setters of the managed bean. */

	public String onFlowProcess(FlowEvent event) {
		return event.getNewStep();
	}

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

}

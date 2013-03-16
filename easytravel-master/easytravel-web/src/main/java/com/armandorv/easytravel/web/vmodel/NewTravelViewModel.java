package com.armandorv.easytravel.web.vmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.web.util.FacesContextUtils;

@ManagedBean
@ViewScoped/* request > view < session */
public class NewTravelViewModel implements Serializable {

	private static final long serialVersionUID = -7615029317019210908L;

	private String title;

	private double lat;

	private double lng;

	private MapModel emptyModel = new DefaultMapModel();

	private Travel travel = new Travel();

	private List<Destiny> destinies = new ArrayList<>();

	private Destiny selectedDestiny;

	public String start() {
		travel = new Travel();
		return "success";
	}

	public void addMarker() {

		emptyModel.addOverlay(new Marker(new LatLng(lat, lng), title));

		Destiny destiny = new Destiny();

		destiny.setName(title);
		destiny.setLattitude((float) lat);
		destiny.setLongitude((float) lng);
		destiny.setEstimatedDate(new Date());

		destinies.add(destiny);

		FacesContextUtils.addMessage("Destiny added", destinies.size()
				+ " destinies", FacesMessage.SEVERITY_INFO);
	}

	public String onFlowProcess(FlowEvent event) {
		return event.getNewStep();
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public Destiny getSelectedDestiny() {
		return selectedDestiny;
	}

	public void setSelectedDestiny(Destiny selectedDestiny) {
		this.selectedDestiny = selectedDestiny;
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

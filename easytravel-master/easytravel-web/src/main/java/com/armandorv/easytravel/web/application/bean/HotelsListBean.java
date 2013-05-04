package com.armandorv.easytravel.web.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.web.application.TravelsBusinessDelegate;
import com.armandorv.easytravel.web.application.bean.datamodel.HotelDataModel;
import com.armandorv.easytravel.web.exception.PresentationException;
import com.armandorv.easytravel.web.util.FacesContextUtils;

/**
 * Backing bean for the List of hotels which is shown inside a dialog to add
 * hotels to any destiny.
 * 
 * @author armandorv
 * 
 */
@Component
@Scope("view")
public class HotelsListBean implements Serializable {

	private static final long serialVersionUID = 5538869896003431321L;

	private Destiny destiny;

	private HotelInfo selected;

	private Collection<HotelInfo> hotels = new ArrayList<>();

	private HotelDataModel hotelDataModel = new HotelDataModel(hotels);

	@Autowired
	private TravelsBusinessDelegate travelsBD;

	public void loadHotels() {
		try {
			hotels = travelsBD.loadHotels(destiny);
			hotelDataModel = new HotelDataModel(hotels);
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

	public HotelInfo getSelected() {
		return selected;
	}

	public void setSelected(HotelInfo selected) {
		this.selected = selected;
	}

	public Collection<HotelInfo> getHotels() {
		return hotels;
	}

	public void setHotels(Collection<HotelInfo> hotels) {
		this.hotels = hotels;
	}

	public HotelDataModel getHotelDataModel() {
		return hotelDataModel;
	}

	public void setHotelDataModel(HotelDataModel hotelDataModel) {
		this.hotelDataModel = hotelDataModel;
	}

}

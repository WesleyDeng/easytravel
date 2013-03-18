package com.armandorv.easytravel.web.application.bean;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.HotelInfo;
import com.armandorv.easytravel.web.application.TravelsBusinessDelegate;
import com.armandorv.easytravel.web.exception.PresentationException;
import com.armandorv.easytravel.web.util.FacesContextUtils;

@Component
@Scope("view")
public class HotelsListBean {

	private Destiny destiny;

	private HotelInfo selected;

	private Collection<HotelInfo> hotels = new ArrayList<>();

	@Autowired
	private TravelsBusinessDelegate travelsBD;

	public void loadHotels() {
		try {
			hotels = travelsBD.loadHotels(destiny);
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

}

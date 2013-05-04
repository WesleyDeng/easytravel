package com.armandorv.easytravel.business.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="easytravel_hotel_booking")
public class HotelBooking implements Serializable{
	
	private static final long serialVersionUID = 8338790887829938359L;

	@Id
	@GeneratedValue
	private Long id;
	
	private HotelInfo hotelInfo;
	
	private Integer persons;
	
	@ManyToOne
	private Destiny destiny;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPersons() {
		return persons;
	}

	public void setPersons(Integer persons) {
		this.persons = persons;
	}

	public Destiny getDestiny() {
		return destiny;
	}

	public void setDestiny(Destiny destiny) {
		this.destiny = destiny;
	}

	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destiny == null) ? 0 : destiny.hashCode());
		result = prime * result
				+ ((hotelInfo == null) ? 0 : hotelInfo.hashCode());
		result = prime * result + ((persons == null) ? 0 : persons.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelBooking other = (HotelBooking) obj;
		if (destiny == null) {
			if (other.destiny != null)
				return false;
		} else if (!destiny.equals(other.destiny))
			return false;
		if (hotelInfo == null) {
			if (other.hotelInfo != null)
				return false;
		} else if (!hotelInfo.equals(other.hotelInfo))
			return false;
		if (persons == null) {
			if (other.persons != null)
				return false;
		} else if (!persons.equals(other.persons))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HotelBooking [id=" + id + ", hotelInfo=" + hotelInfo
				+ ", persons=" + persons + ", destiny=" + destiny + "]";
	}
	
}
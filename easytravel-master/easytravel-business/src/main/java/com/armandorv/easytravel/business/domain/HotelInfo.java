package com.armandorv.easytravel.business.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlRootElement;

@Embeddable
@XmlRootElement(name = "Hotel")
public class HotelInfo implements Serializable{

	private static final long serialVersionUID = 3651530139811203082L;
	
	private Long hotelId;
	private String name;
	private String city;
	private String postalCode;
	private String phoneNumber;
	private Float hotelRating;
	private Float lowRate;
	private Float highRate;
	private String locationDescription;

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public Float getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(Float hotelRating) {
		this.hotelRating = hotelRating;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Float getLowRate() {
		return lowRate;
	}

	public Float getHighRate() {
		return highRate;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setLowRate(Float lowRate) {
		this.lowRate = lowRate;
	}

	public void setHighRate(Float highRate) {
		this.highRate = highRate;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
		HotelInfo other = (HotelInfo) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", name=" + name + ", city="
				+ city + ", postalCode=" + postalCode + ", phoneNumber="
				+ phoneNumber + ", hotelRating=" + hotelRating + ", lowRate="
				+ lowRate + ", highRate=" + highRate + ", locationDescription="
				+ locationDescription + "]";
	}

}

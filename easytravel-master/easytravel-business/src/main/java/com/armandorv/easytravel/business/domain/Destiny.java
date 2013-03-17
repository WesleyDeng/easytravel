package com.armandorv.easytravel.business.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Destiny {

	private Long id;

	private String name;

	private String address;

	private Float lattitude;

	private Float longitude;

	private String timeZone;

	private Date estimatedDate;

	private Destiny previous;

	private Destiny next;

	private FlightBooking flight;

	private Set<HotelBooking> hotels = new HashSet<>();

	public Destiny() {
		// Forbidden
	}

	public boolean isEnd() {
		return next == null;
	}

	public boolean isStart() {
		return previous == null;
	}

	public void addHotel(HotelBooking booking) {
		booking.setDestiny(this);
		hotels.add(booking);
	}

	public void removeHotel(HotelBooking booking) {
		hotels.remove(booking);
		booking.setDestiny(null);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Float getLattitude() {
		return lattitude;
	}

	public void setLattitude(Float lattitude) {
		this.lattitude = lattitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public Date getEstimatedDate() {
		return estimatedDate;
	}

	public void setEstimatedDate(Date estimatedDate) {
		this.estimatedDate = estimatedDate;
	}

	public Destiny getPrevious() {
		return previous;
	}

	public void setPrevious(Destiny previous) {
		this.previous = previous;
	}

	public Destiny getNext() {
		return next;
	}

	public void setNext(Destiny next) {
		this.next = next;
	}

	public FlightBooking getFlight() {
		return flight;
	}

	public void setFlight(FlightBooking flight) {
		this.flight = flight;
	}

	public Set<HotelBooking> getHotels() {
		return hotels;
	}

	public void setHotels(Set<HotelBooking> hotels) {
		this.hotels = hotels;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((estimatedDate == null) ? 0 : estimatedDate.hashCode());
		result = prime * result
				+ ((lattitude == null) ? 0 : lattitude.hashCode());
		result = prime * result
				+ ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Destiny other = (Destiny) obj;
		if (estimatedDate == null) {
			if (other.estimatedDate != null)
				return false;
		} else if (!estimatedDate.equals(other.estimatedDate))
			return false;
		if (lattitude == null) {
			if (other.lattitude != null)
				return false;
		} else if (!lattitude.equals(other.lattitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Destiny [id=" + id + ", name=" + name + ", address=" + address
				+ ", lattitude=" + lattitude + ", longitude=" + longitude
				+ ", timeZone=" + timeZone + ", estimatedDate=" + estimatedDate
				+ ", previous=" + previous + ", next=" + next + ", flight="
				+ flight + ", hotels=" + hotels + "]";
	}

}

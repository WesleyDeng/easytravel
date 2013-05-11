package com.armandorv.easytravel.business.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "easytravel_destiny")
public class Destiny implements Serializable {

	private static final long serialVersionUID = -4844476680907137289L;

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String address;

	private Float lattitude;

	private Float longitude;

	private String timeZone;

	@Temporal(TemporalType.DATE)
	private Date estimatedDate;

	@XmlTransient
	@OneToOne(optional = true)
	private Destiny previous;

	@XmlTransient
	@OneToOne(optional = true)
	private Destiny next;

	@ManyToOne
	private Travel travel;

	@XmlTransient
	@OneToMany(mappedBy = "destiny", cascade = { CascadeType.REMOVE,
			CascadeType.PERSIST })
	private Set<FlightBooking> flights = new HashSet<>();

	@XmlTransient
	@OneToMany(mappedBy = "destiny", cascade = { CascadeType.REMOVE,
			CascadeType.PERSIST })
	private Set<HotelBooking> hotels = new HashSet<>();

	public Destiny() {
	}

	/* ********** Domain logic methods ************** */

	public boolean isEnd() {
		return next == null;
	}

	public boolean isStart() {
		return previous == null;
	}

	public int getHotelsNumber() {
		return hotels.size();
	}

	public int getFlightsNumber() {
		return flights.size();
	}

	public void addHotel(HotelBooking booking) {
		booking.setDestiny(this);
		hotels.add(booking);
	}

	public void removeHotel(FlightBooking booking) {
		hotels.remove(booking);
		booking.setDestiny(null);
	}

	public void addFlight(FlightBooking booking) {
		booking.setDestiny(this);
		flights.add(booking);
	}

	public void removeFlight(HotelBooking booking) {
		flights.remove(booking);
		booking.setDestiny(null);
	}

	/* ********** Get and set methods ************** */

	public Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
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

	public Set<FlightBooking> getFlights() {
		return flights;
	}

	public void setFlights(Set<FlightBooking> flights) {
		this.flights = flights;
	}

	public Set<HotelBooking> getHotels() {
		return hotels;
	}

	public void setHotels(Set<HotelBooking> hotels) {
		this.hotels = hotels;
	}

	/* ********** Get and set methods ************** */

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
				+ ", previous=" + previous + ", next=" + next + ", flights="
				+ flights + ", hotels=" + hotels + "]";
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

}
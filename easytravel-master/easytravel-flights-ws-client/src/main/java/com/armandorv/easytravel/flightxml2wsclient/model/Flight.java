package com.armandorv.easytravel.flightxml2wsclient.model;

import java.util.Date;

public class Flight {

	private String id;

	private String destinationAirportICAO;

	private String destinationAirportName;

	private String destinationCity;

	private String originAirportICAO;

	private String originAirportName;

	private String originCity;

	private Date departureTime;

	private Date arrivalTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDestinationAirportICAO() {
		return destinationAirportICAO;
	}

	public void setDestinationAirportICAO(String destinationAirportICAO) {
		this.destinationAirportICAO = destinationAirportICAO;
	}

	public String getDestinationAirportName() {
		return destinationAirportName;
	}

	public void setDestinationAirportName(String destinationAirportName) {
		this.destinationAirportName = destinationAirportName;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getOriginAirportICAO() {
		return originAirportICAO;
	}

	public void setOriginAirportICAO(String originAirportICAO) {
		this.originAirportICAO = originAirportICAO;
	}

	public String getOriginAirportName() {
		return originAirportName;
	}

	public void setOriginAirportName(String originAirportName) {
		this.originAirportName = originAirportName;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Flight other = (Flight) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", destinationAirportICAO="
				+ destinationAirportICAO + ", destinationAirportName="
				+ destinationAirportName + ", destinationCity="
				+ destinationCity + ", originAirportICAO=" + originAirportICAO
				+ ", originAirportName=" + originAirportName + ", originCity="
				+ originCity + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + "]";
	}

}
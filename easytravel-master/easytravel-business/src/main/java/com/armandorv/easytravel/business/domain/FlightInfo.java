package com.armandorv.easytravel.business.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlRootElement;

@Embeddable
@XmlRootElement(name = "Flight")
public class FlightInfo implements Serializable {

	private static final long serialVersionUID = 4607038063676808461L;

	private String flightId;

	private String destinationAirportICAO;
	private String destinationAirportName;
	private String destinationCity;
	private String originAirportICAO;
	private String originAirportName;
	private String originCity;

	private Date departureTime;
	private Date arrivalTime;

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
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
		result = prime * result
				+ ((flightId == null) ? 0 : flightId.hashCode());
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
		FlightInfo other = (FlightInfo) obj;
		if (flightId == null) {
			if (other.flightId != null)
				return false;
		} else if (!flightId.equals(other.flightId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FlightInfo [id=" + flightId + ", destinationAirportICAO="
				+ destinationAirportICAO + ", destinationAirportName="
				+ destinationAirportName + ", destinationCity="
				+ destinationCity + ", originAirportICAO=" + originAirportICAO
				+ ", originAirportName=" + originAirportName + ", originCity="
				+ originCity + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + "]";
	}
}

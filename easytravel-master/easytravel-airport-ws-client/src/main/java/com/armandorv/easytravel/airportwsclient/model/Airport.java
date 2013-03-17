package com.armandorv.easytravel.airportwsclient.model;

public class Airport {

	private String ICAO;

	private String name;

	private String city;

	private String country;

	private float lattitude;

	private float longitude;

	public Airport(String iCAO, String name, String city, String country,
			float lattitude, float longitude) {
		super();
		ICAO = iCAO;
		this.name = name;
		this.city = city;
		this.country = country;
		this.lattitude = lattitude;
		this.longitude = longitude;
	}

	public String getICAO() {
		return ICAO;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public float getLattitude() {
		return lattitude;
	}

	public float getLongitude() {
		return longitude;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ICAO == null) ? 0 : ICAO.hashCode());
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
		Airport other = (Airport) obj;
		if (ICAO == null) {
			if (other.ICAO != null)
				return false;
		} else if (!ICAO.equals(other.ICAO))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airport [ICAO=" + ICAO + ", name=" + name + ", city=" + city
				+ ", country=" + country + ", lattitude=" + lattitude
				+ ", longitude=" + longitude + "]";
	}

}
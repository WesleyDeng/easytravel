package com.armandorv.easytravel.googlegeocodewsclient.model;

/**
 * Inmutable class to wrap a couple of lattitude and longitude values.
 *
 * @author armandorv
 * 
 */
public class Geometry {

	private float lattitude;

	private float longitude;

	public Geometry(float lattitude, float longitude) {
		super();
		this.lattitude = lattitude;
		this.longitude = longitude;
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
		result = prime * result + Float.floatToIntBits(lattitude);
		result = prime * result + Float.floatToIntBits(longitude);
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
		Geometry other = (Geometry) obj;
		if (Float.floatToIntBits(lattitude) != Float
				.floatToIntBits(other.lattitude))
			return false;
		if (Float.floatToIntBits(longitude) != Float
				.floatToIntBits(other.longitude))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Geometry [lattitude=" + lattitude + ", longitude=" + longitude
				+ "]";
	}
}

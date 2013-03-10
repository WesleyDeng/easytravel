package com.armandorv.easytravel.googletimewsclient.model;

public class TimeZone {
	
	private String name;
	
	private float offset;

	public TimeZone(String name, float offset) {
		super();
		this.name = name;
		this.offset = offset;
	}

	public String getName() {
		return name;
	}

	public float getOffset() {
		return offset;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(offset);
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
		TimeZone other = (TimeZone) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(offset) != Float.floatToIntBits(other.offset))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TimeZone [name=" + name + ", offset=" + offset + "]";
	}
}
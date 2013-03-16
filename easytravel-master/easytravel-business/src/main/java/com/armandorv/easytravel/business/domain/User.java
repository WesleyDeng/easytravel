package com.armandorv.easytravel.business.domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class User {

	private Long id;

	private String name;

	private String Lastname;

	private String mail;

	private Set<Travel> travels = new HashSet<>();
	
	public void addTravel(Travel travel){
		travels.add(travel);
		travel.setUser(this);
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

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Set<Travel> getTravels() {
		return Collections.unmodifiableSet(travels);
	}

	public void setTravels(Set<Travel> travels) {
		this.travels = travels;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
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
		User other = (User) obj;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Lastname=" + Lastname
				+ ", mail=" + mail + ", travels=" + travels + "]";
	}
}

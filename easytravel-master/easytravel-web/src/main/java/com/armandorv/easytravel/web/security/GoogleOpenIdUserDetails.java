package com.armandorv.easytravel.web.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class GoogleOpenIdUserDetails implements UserDetails {

	private static final long serialVersionUID = -2218629264640858979L;

	private String googleOpenId;

	public GoogleOpenIdUserDetails(String googleOpenId) {
		super();
		this.googleOpenId = googleOpenId;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return googleOpenId;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}

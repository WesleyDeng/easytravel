package com.armandorv.easytravel.web.security;

import org.apache.log4j.Logger;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class GoogleOpenIdUserDetailsService implements UserDetailsService {

	
	private static Logger log = Logger.getLogger(GoogleOpenIdUserDetailsService.class);
	
	public GoogleOpenIdUserDetailsService() {
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		log.info("Logged user " + username);
		return new GoogleOpenIdUserDetails(username);
	}

}

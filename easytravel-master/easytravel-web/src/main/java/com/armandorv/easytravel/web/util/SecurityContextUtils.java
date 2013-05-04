package com.armandorv.easytravel.web.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Clase con utlidades para obtener información del contexto de seguridad.
 * 
 * @author armandorv
 * 
 */
public class SecurityContextUtils {

	private SecurityContextUtils() {
	}

	/**
	 * True si hay un usuario authenticated.
	 * 
	 * @return
	 */
	public static boolean isAuthenticated() {
		return !authentication().isAuthenticated();
	}

	public static String principal() {
		return authentication().getName();
	}

	private static Authentication authentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}
}
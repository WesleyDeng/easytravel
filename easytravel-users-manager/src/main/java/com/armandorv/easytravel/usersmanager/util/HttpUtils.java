package com.armandorv.easytravel.usersmanager.util;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;

public class HttpUtils {

	private static ResourceBundle usersws = ResourceBundle.getBundle("usersws");

	private HttpUtils() {
	}

	public static boolean checkConnection() {
		try {
			URL url = new URL(usersws.getString("port.soap.address"));
			URLConnection con = url.openConnection();
			con.connect();
			return true;
		} catch (IOException e) {
			return false;
		}

	}

}

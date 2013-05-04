package com.armandorv.easytravel.web.util;

import org.apache.log4j.Logger;

public class StringsUtils {
	
	private static Logger log = Logger.getLogger(StringsUtils.class);
	
	public static void assetThatIsString(Object value) {
		if (!(value instanceof String)) {
			log.error("Este validador debe recibir un String.");
			throw new IllegalArgumentException(
					"Este validador debe recibir un String.");
		}
	}

}

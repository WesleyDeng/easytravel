package com.armandorv.easytravel.business.util;

public class StringUtils {

	private StringUtils() {
	}

	public static boolean isEmpty(String string) {
		return string == null || "".equals(string);
	}

	public static boolean isAnyEmpty(String... strings) {

		for (String string : strings) {
			if (isEmpty(string))
				return true;
		}

		return false;
	}

	public static boolean contains(String a, String b) {
		return a.toLowerCase().contains(b.toLowerCase())
				|| b.toLowerCase().contains(a.toLowerCase());
	}
}

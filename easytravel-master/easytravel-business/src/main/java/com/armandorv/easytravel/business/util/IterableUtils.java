package com.armandorv.easytravel.business.util;

import java.util.Iterator;

public class IterableUtils {

	private IterableUtils() {
	}

	public static <T> int size(Iterable<T> iterable) {
		int count = 0;
		for (Iterator<T> iterator = iterable.iterator(); iterator.hasNext();) {
			count++;
		}
		return count;
	}
}

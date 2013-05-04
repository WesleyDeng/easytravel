package com.armandorv.easytravel.business.service;

/**
 * It defines an interface to carry out object to object mapping operations.
 * 
 * S-> Source object R-> Resultant object
 * 
 * @author armandorv
 * 
 */
public interface Mapper<S, R> {

	/**
	 * Map an object source of type S to another object of type R.
	 * 
	 * @param source
	 *            source object.
	 * @return
	 */
	R map(S source);
}

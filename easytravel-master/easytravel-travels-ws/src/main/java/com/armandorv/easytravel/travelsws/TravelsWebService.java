package com.armandorv.easytravel.travelsws;

import java.util.Collection;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.travelsws.exception.TravelsWsException;

/**
 * SEI for the users web service, a ws intended for query travels.
 * 
 * @author armandorv
 * 
 */
@WebService(name = "travelsWebService", targetNamespace = "http://armandorv.com/easytravel/travelsws")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface TravelsWebService {

	@WebMethod(operationName = "getTravels")
	Collection<Travel> getTravels(@WebParam(name = "term") String term)
			throws TravelsWsException;

	@WebMethod(operationName = "isVisited")
	boolean hasVisited(@WebParam(name = "username") String username,
			@WebParam(name = "destinyName") String destinyName)
			throws TravelsWsException;

	@WebMethod(operationName = "numberTravelsByDestination")
	int numberTravelsByDestination(
			@WebParam(name = "destinyName") String destinyName)
			throws TravelsWsException;

	@WebMethod(operationName = "mostVistedDestination")
	public Destiny mostVistedDestination() throws TravelsWsException;

	@WebMethod(operationName = "mostVistedDestinations")
	public List<Destiny> mostVistedDestinations(int max)
			throws TravelsWsException;
}

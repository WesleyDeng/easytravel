package com.armandorv.easytravel.travelsws;

import java.util.Collection;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;

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
	Collection<Travel> getTravels(@WebParam(name = "term") String term);

	@WebMethod(operationName = "isVisited")
	boolean isVisited(String destinyName);

	@WebMethod(operationName = "numberTravelsByDestination")
	int numberTravelsByDestination(String destinyName);

	@WebMethod(operationName = "mostVistedDestination")
	public Destiny mostVistedDestination();
}

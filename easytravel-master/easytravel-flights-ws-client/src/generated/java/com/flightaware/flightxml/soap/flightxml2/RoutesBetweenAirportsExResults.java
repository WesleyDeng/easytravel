
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoutesBetweenAirportsExResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoutesBetweenAirportsExResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoutesBetweenAirportsExResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfRoutesBetweenAirportsExStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutesBetweenAirportsExResults", propOrder = {
    "routesBetweenAirportsExResult"
})
public class RoutesBetweenAirportsExResults {

    @XmlElement(name = "RoutesBetweenAirportsExResult", required = true)
    protected ArrayOfRoutesBetweenAirportsExStruct routesBetweenAirportsExResult;

    /**
     * Obtiene el valor de la propiedad routesBetweenAirportsExResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoutesBetweenAirportsExStruct }
     *     
     */
    public ArrayOfRoutesBetweenAirportsExStruct getRoutesBetweenAirportsExResult() {
        return routesBetweenAirportsExResult;
    }

    /**
     * Define el valor de la propiedad routesBetweenAirportsExResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoutesBetweenAirportsExStruct }
     *     
     */
    public void setRoutesBetweenAirportsExResult(ArrayOfRoutesBetweenAirportsExStruct value) {
        this.routesBetweenAirportsExResult = value;
    }

}

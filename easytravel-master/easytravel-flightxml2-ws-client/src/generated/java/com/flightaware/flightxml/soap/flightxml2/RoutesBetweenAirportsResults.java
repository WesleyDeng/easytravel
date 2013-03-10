
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoutesBetweenAirportsResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoutesBetweenAirportsResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoutesBetweenAirportsResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfRoutesBetweenAirportsStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutesBetweenAirportsResults", propOrder = {
    "routesBetweenAirportsResult"
})
public class RoutesBetweenAirportsResults {

    @XmlElement(name = "RoutesBetweenAirportsResult", required = true)
    protected ArrayOfRoutesBetweenAirportsStruct routesBetweenAirportsResult;

    /**
     * Obtiene el valor de la propiedad routesBetweenAirportsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoutesBetweenAirportsStruct }
     *     
     */
    public ArrayOfRoutesBetweenAirportsStruct getRoutesBetweenAirportsResult() {
        return routesBetweenAirportsResult;
    }

    /**
     * Define el valor de la propiedad routesBetweenAirportsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoutesBetweenAirportsStruct }
     *     
     */
    public void setRoutesBetweenAirportsResult(ArrayOfRoutesBetweenAirportsStruct value) {
        this.routesBetweenAirportsResult = value;
    }

}

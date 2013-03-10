
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirportInfoResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirportInfoResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirportInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}AirportInfoStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportInfoResults", propOrder = {
    "airportInfoResult"
})
public class AirportInfoResults {

    @XmlElement(name = "AirportInfoResult", required = true)
    protected AirportInfoStruct airportInfoResult;

    /**
     * Obtiene el valor de la propiedad airportInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link AirportInfoStruct }
     *     
     */
    public AirportInfoStruct getAirportInfoResult() {
        return airportInfoResult;
    }

    /**
     * Define el valor de la propiedad airportInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportInfoStruct }
     *     
     */
    public void setAirportInfoResult(AirportInfoStruct value) {
        this.airportInfoResult = value;
    }

}

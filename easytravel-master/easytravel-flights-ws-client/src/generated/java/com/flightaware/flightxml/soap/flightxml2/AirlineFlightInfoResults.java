
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirlineFlightInfoResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineFlightInfoResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineFlightInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}AirlineFlightInfoStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineFlightInfoResults", propOrder = {
    "airlineFlightInfoResult"
})
public class AirlineFlightInfoResults {

    @XmlElement(name = "AirlineFlightInfoResult", required = true)
    protected AirlineFlightInfoStruct airlineFlightInfoResult;

    /**
     * Obtiene el valor de la propiedad airlineFlightInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link AirlineFlightInfoStruct }
     *     
     */
    public AirlineFlightInfoStruct getAirlineFlightInfoResult() {
        return airlineFlightInfoResult;
    }

    /**
     * Define el valor de la propiedad airlineFlightInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineFlightInfoStruct }
     *     
     */
    public void setAirlineFlightInfoResult(AirlineFlightInfoStruct value) {
        this.airlineFlightInfoResult = value;
    }

}

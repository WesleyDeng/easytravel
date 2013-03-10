
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirlineInfoResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineInfoResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}AirlineInfoStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineInfoResults", propOrder = {
    "airlineInfoResult"
})
public class AirlineInfoResults {

    @XmlElement(name = "AirlineInfoResult", required = true)
    protected AirlineInfoStruct airlineInfoResult;

    /**
     * Obtiene el valor de la propiedad airlineInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link AirlineInfoStruct }
     *     
     */
    public AirlineInfoStruct getAirlineInfoResult() {
        return airlineInfoResult;
    }

    /**
     * Define el valor de la propiedad airlineInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineInfoStruct }
     *     
     */
    public void setAirlineInfoResult(AirlineInfoStruct value) {
        this.airlineInfoResult = value;
    }

}

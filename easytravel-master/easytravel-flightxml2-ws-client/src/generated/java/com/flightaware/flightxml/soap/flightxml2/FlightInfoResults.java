
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FlightInfoResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FlightInfoResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}FlightInfoStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoResults", propOrder = {
    "flightInfoResult"
})
public class FlightInfoResults {

    @XmlElement(name = "FlightInfoResult", required = true)
    protected FlightInfoStruct flightInfoResult;

    /**
     * Obtiene el valor de la propiedad flightInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoStruct }
     *     
     */
    public FlightInfoStruct getFlightInfoResult() {
        return flightInfoResult;
    }

    /**
     * Define el valor de la propiedad flightInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoStruct }
     *     
     */
    public void setFlightInfoResult(FlightInfoStruct value) {
        this.flightInfoResult = value;
    }

}

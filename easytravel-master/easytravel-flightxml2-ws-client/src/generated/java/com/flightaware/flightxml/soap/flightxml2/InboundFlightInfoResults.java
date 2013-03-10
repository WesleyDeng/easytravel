
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InboundFlightInfoResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InboundFlightInfoResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InboundFlightInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}FlightExStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InboundFlightInfoResults", propOrder = {
    "inboundFlightInfoResult"
})
public class InboundFlightInfoResults {

    @XmlElement(name = "InboundFlightInfoResult", required = true)
    protected FlightExStruct inboundFlightInfoResult;

    /**
     * Obtiene el valor de la propiedad inboundFlightInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link FlightExStruct }
     *     
     */
    public FlightExStruct getInboundFlightInfoResult() {
        return inboundFlightInfoResult;
    }

    /**
     * Define el valor de la propiedad inboundFlightInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightExStruct }
     *     
     */
    public void setInboundFlightInfoResult(FlightExStruct value) {
        this.inboundFlightInfoResult = value;
    }

}

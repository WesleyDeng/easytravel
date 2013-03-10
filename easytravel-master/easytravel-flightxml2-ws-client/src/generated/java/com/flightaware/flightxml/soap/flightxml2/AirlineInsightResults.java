
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirlineInsightResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineInsightResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineInsightResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfAirlineInsightStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineInsightResults", propOrder = {
    "airlineInsightResult"
})
public class AirlineInsightResults {

    @XmlElement(name = "AirlineInsightResult", required = true)
    protected ArrayOfAirlineInsightStruct airlineInsightResult;

    /**
     * Obtiene el valor de la propiedad airlineInsightResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirlineInsightStruct }
     *     
     */
    public ArrayOfAirlineInsightStruct getAirlineInsightResult() {
        return airlineInsightResult;
    }

    /**
     * Define el valor de la propiedad airlineInsightResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirlineInsightStruct }
     *     
     */
    public void setAirlineInsightResult(ArrayOfAirlineInsightStruct value) {
        this.airlineInsightResult = value;
    }

}


package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CountAllEnrouteAirlineOperationsResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CountAllEnrouteAirlineOperationsResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountAllEnrouteAirlineOperationsResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfCountAirlineOperationsStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountAllEnrouteAirlineOperationsResults", propOrder = {
    "countAllEnrouteAirlineOperationsResult"
})
public class CountAllEnrouteAirlineOperationsResults {

    @XmlElement(name = "CountAllEnrouteAirlineOperationsResult", required = true)
    protected ArrayOfCountAirlineOperationsStruct countAllEnrouteAirlineOperationsResult;

    /**
     * Obtiene el valor de la propiedad countAllEnrouteAirlineOperationsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountAirlineOperationsStruct }
     *     
     */
    public ArrayOfCountAirlineOperationsStruct getCountAllEnrouteAirlineOperationsResult() {
        return countAllEnrouteAirlineOperationsResult;
    }

    /**
     * Define el valor de la propiedad countAllEnrouteAirlineOperationsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountAirlineOperationsStruct }
     *     
     */
    public void setCountAllEnrouteAirlineOperationsResult(ArrayOfCountAirlineOperationsStruct value) {
        this.countAllEnrouteAirlineOperationsResult = value;
    }

}

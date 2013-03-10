
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchBirdseyeInFlightResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchBirdseyeInFlightResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchBirdseyeInFlightResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}InFlightStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBirdseyeInFlightResults", propOrder = {
    "searchBirdseyeInFlightResult"
})
public class SearchBirdseyeInFlightResults {

    @XmlElement(name = "SearchBirdseyeInFlightResult", required = true)
    protected InFlightStruct searchBirdseyeInFlightResult;

    /**
     * Obtiene el valor de la propiedad searchBirdseyeInFlightResult.
     * 
     * @return
     *     possible object is
     *     {@link InFlightStruct }
     *     
     */
    public InFlightStruct getSearchBirdseyeInFlightResult() {
        return searchBirdseyeInFlightResult;
    }

    /**
     * Define el valor de la propiedad searchBirdseyeInFlightResult.
     * 
     * @param value
     *     allowed object is
     *     {@link InFlightStruct }
     *     
     */
    public void setSearchBirdseyeInFlightResult(InFlightStruct value) {
        this.searchBirdseyeInFlightResult = value;
    }

}

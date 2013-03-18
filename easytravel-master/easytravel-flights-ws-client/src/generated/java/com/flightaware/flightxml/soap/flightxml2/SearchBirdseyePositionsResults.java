
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchBirdseyePositionsResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchBirdseyePositionsResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchBirdseyePositionsResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfTrackExStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBirdseyePositionsResults", propOrder = {
    "searchBirdseyePositionsResult"
})
public class SearchBirdseyePositionsResults {

    @XmlElement(name = "SearchBirdseyePositionsResult", required = true)
    protected ArrayOfTrackExStruct searchBirdseyePositionsResult;

    /**
     * Obtiene el valor de la propiedad searchBirdseyePositionsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackExStruct }
     *     
     */
    public ArrayOfTrackExStruct getSearchBirdseyePositionsResult() {
        return searchBirdseyePositionsResult;
    }

    /**
     * Define el valor de la propiedad searchBirdseyePositionsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackExStruct }
     *     
     */
    public void setSearchBirdseyePositionsResult(ArrayOfTrackExStruct value) {
        this.searchBirdseyePositionsResult = value;
    }

}

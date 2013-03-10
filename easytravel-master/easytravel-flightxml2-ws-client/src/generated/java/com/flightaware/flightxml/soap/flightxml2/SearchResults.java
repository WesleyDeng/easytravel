
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}InFlightStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResults", propOrder = {
    "searchResult"
})
public class SearchResults {

    @XmlElement(name = "SearchResult", required = true)
    protected InFlightStruct searchResult;

    /**
     * Obtiene el valor de la propiedad searchResult.
     * 
     * @return
     *     possible object is
     *     {@link InFlightStruct }
     *     
     */
    public InFlightStruct getSearchResult() {
        return searchResult;
    }

    /**
     * Define el valor de la propiedad searchResult.
     * 
     * @param value
     *     allowed object is
     *     {@link InFlightStruct }
     *     
     */
    public void setSearchResult(InFlightStruct value) {
        this.searchResult = value;
    }

}

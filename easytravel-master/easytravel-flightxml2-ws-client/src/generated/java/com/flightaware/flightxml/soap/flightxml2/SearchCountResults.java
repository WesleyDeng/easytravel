
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchCountResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchCountResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCountResults", propOrder = {
    "searchCountResult"
})
public class SearchCountResults {

    @XmlElement(name = "SearchCountResult")
    protected int searchCountResult;

    /**
     * Obtiene el valor de la propiedad searchCountResult.
     * 
     */
    public int getSearchCountResult() {
        return searchCountResult;
    }

    /**
     * Define el valor de la propiedad searchCountResult.
     * 
     */
    public void setSearchCountResult(int value) {
        this.searchCountResult = value;
    }

}


package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MapFlightExResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MapFlightExResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MapFlightExResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapFlightExResults", propOrder = {
    "mapFlightExResult"
})
public class MapFlightExResults {

    @XmlElement(name = "MapFlightExResult", required = true)
    protected String mapFlightExResult;

    /**
     * Obtiene el valor de la propiedad mapFlightExResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapFlightExResult() {
        return mapFlightExResult;
    }

    /**
     * Define el valor de la propiedad mapFlightExResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapFlightExResult(String value) {
        this.mapFlightExResult = value;
    }

}


package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LatLongsToHeadingResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LatLongsToHeadingResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatLongsToHeadingResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLongsToHeadingResults", propOrder = {
    "latLongsToHeadingResult"
})
public class LatLongsToHeadingResults {

    @XmlElement(name = "LatLongsToHeadingResult")
    protected int latLongsToHeadingResult;

    /**
     * Obtiene el valor de la propiedad latLongsToHeadingResult.
     * 
     */
    public int getLatLongsToHeadingResult() {
        return latLongsToHeadingResult;
    }

    /**
     * Define el valor de la propiedad latLongsToHeadingResult.
     * 
     */
    public void setLatLongsToHeadingResult(int value) {
        this.latLongsToHeadingResult = value;
    }

}

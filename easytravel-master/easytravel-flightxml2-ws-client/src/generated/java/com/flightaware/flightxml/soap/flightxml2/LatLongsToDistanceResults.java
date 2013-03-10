
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LatLongsToDistanceResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LatLongsToDistanceResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatLongsToDistanceResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLongsToDistanceResults", propOrder = {
    "latLongsToDistanceResult"
})
public class LatLongsToDistanceResults {

    @XmlElement(name = "LatLongsToDistanceResult")
    protected int latLongsToDistanceResult;

    /**
     * Obtiene el valor de la propiedad latLongsToDistanceResult.
     * 
     */
    public int getLatLongsToDistanceResult() {
        return latLongsToDistanceResult;
    }

    /**
     * Define el valor de la propiedad latLongsToDistanceResult.
     * 
     */
    public void setLatLongsToDistanceResult(int value) {
        this.latLongsToDistanceResult = value;
    }

}

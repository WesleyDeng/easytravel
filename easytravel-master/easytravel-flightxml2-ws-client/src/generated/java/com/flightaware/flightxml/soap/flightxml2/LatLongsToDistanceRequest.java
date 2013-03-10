
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LatLongsToDistanceRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LatLongsToDistanceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lat1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="lon1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="lat2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="lon2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLongsToDistanceRequest", propOrder = {
    "lat1",
    "lon1",
    "lat2",
    "lon2"
})
public class LatLongsToDistanceRequest {

    protected float lat1;
    protected float lon1;
    protected float lat2;
    protected float lon2;

    /**
     * Obtiene el valor de la propiedad lat1.
     * 
     */
    public float getLat1() {
        return lat1;
    }

    /**
     * Define el valor de la propiedad lat1.
     * 
     */
    public void setLat1(float value) {
        this.lat1 = value;
    }

    /**
     * Obtiene el valor de la propiedad lon1.
     * 
     */
    public float getLon1() {
        return lon1;
    }

    /**
     * Define el valor de la propiedad lon1.
     * 
     */
    public void setLon1(float value) {
        this.lon1 = value;
    }

    /**
     * Obtiene el valor de la propiedad lat2.
     * 
     */
    public float getLat2() {
        return lat2;
    }

    /**
     * Define el valor de la propiedad lat2.
     * 
     */
    public void setLat2(float value) {
        this.lat2 = value;
    }

    /**
     * Obtiene el valor de la propiedad lon2.
     * 
     */
    public float getLon2() {
        return lon2;
    }

    /**
     * Define el valor de la propiedad lon2.
     * 
     */
    public void setLon2(float value) {
        this.lon2 = value;
    }

}

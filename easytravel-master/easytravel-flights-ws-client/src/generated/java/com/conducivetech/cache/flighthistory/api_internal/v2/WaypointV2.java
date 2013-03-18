
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para waypointV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="waypointV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waypointV2", propOrder = {
    "lon",
    "lat"
})
public class WaypointV2 {

    protected double lon;
    protected double lat;

    /**
     * Obtiene el valor de la propiedad lon.
     * 
     */
    public double getLon() {
        return lon;
    }

    /**
     * Define el valor de la propiedad lon.
     * 
     */
    public void setLon(double value) {
        this.lon = value;
    }

    /**
     * Obtiene el valor de la propiedad lat.
     * 
     */
    public double getLat() {
        return lat;
    }

    /**
     * Define el valor de la propiedad lat.
     * 
     */
    public void setLat(double value) {
        this.lat = value;
    }

}

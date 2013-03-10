
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoutesBetweenAirportsExStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoutesBetweenAirportsExStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filedAltitude_min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filedAltitude_max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="last_departuretime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutesBetweenAirportsExStruct", propOrder = {
    "count",
    "route",
    "filedAltitudeMin",
    "filedAltitudeMax",
    "lastDeparturetime"
})
public class RoutesBetweenAirportsExStruct {

    protected int count;
    @XmlElement(required = true)
    protected String route;
    @XmlElement(name = "filedAltitude_min")
    protected int filedAltitudeMin;
    @XmlElement(name = "filedAltitude_max")
    protected int filedAltitudeMax;
    @XmlElement(name = "last_departuretime")
    protected int lastDeparturetime;

    /**
     * Obtiene el valor de la propiedad count.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Define el valor de la propiedad count.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Obtiene el valor de la propiedad route.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Define el valor de la propiedad route.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Obtiene el valor de la propiedad filedAltitudeMin.
     * 
     */
    public int getFiledAltitudeMin() {
        return filedAltitudeMin;
    }

    /**
     * Define el valor de la propiedad filedAltitudeMin.
     * 
     */
    public void setFiledAltitudeMin(int value) {
        this.filedAltitudeMin = value;
    }

    /**
     * Obtiene el valor de la propiedad filedAltitudeMax.
     * 
     */
    public int getFiledAltitudeMax() {
        return filedAltitudeMax;
    }

    /**
     * Define el valor de la propiedad filedAltitudeMax.
     * 
     */
    public void setFiledAltitudeMax(int value) {
        this.filedAltitudeMax = value;
    }

    /**
     * Obtiene el valor de la propiedad lastDeparturetime.
     * 
     */
    public int getLastDeparturetime() {
        return lastDeparturetime;
    }

    /**
     * Define el valor de la propiedad lastDeparturetime.
     * 
     */
    public void setLastDeparturetime(int value) {
        this.lastDeparturetime = value;
    }

}

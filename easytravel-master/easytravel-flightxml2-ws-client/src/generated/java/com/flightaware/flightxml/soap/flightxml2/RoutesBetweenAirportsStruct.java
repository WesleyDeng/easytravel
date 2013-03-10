
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoutesBetweenAirportsStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoutesBetweenAirportsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filedAltitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutesBetweenAirportsStruct", propOrder = {
    "count",
    "route",
    "filedAltitude"
})
public class RoutesBetweenAirportsStruct {

    protected int count;
    @XmlElement(required = true)
    protected String route;
    protected int filedAltitude;

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
     * Obtiene el valor de la propiedad filedAltitude.
     * 
     */
    public int getFiledAltitude() {
        return filedAltitude;
    }

    /**
     * Define el valor de la propiedad filedAltitude.
     * 
     */
    public void setFiledAltitude(int value) {
        this.filedAltitude = value;
    }

}


package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CountAirportOperationsStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CountAirportOperationsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enroute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scheduled_departures" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scheduled_arrivals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountAirportOperationsStruct", propOrder = {
    "enroute",
    "departed",
    "scheduledDepartures",
    "scheduledArrivals"
})
public class CountAirportOperationsStruct {

    protected int enroute;
    protected int departed;
    @XmlElement(name = "scheduled_departures")
    protected int scheduledDepartures;
    @XmlElement(name = "scheduled_arrivals")
    protected int scheduledArrivals;

    /**
     * Obtiene el valor de la propiedad enroute.
     * 
     */
    public int getEnroute() {
        return enroute;
    }

    /**
     * Define el valor de la propiedad enroute.
     * 
     */
    public void setEnroute(int value) {
        this.enroute = value;
    }

    /**
     * Obtiene el valor de la propiedad departed.
     * 
     */
    public int getDeparted() {
        return departed;
    }

    /**
     * Define el valor de la propiedad departed.
     * 
     */
    public void setDeparted(int value) {
        this.departed = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduledDepartures.
     * 
     */
    public int getScheduledDepartures() {
        return scheduledDepartures;
    }

    /**
     * Define el valor de la propiedad scheduledDepartures.
     * 
     */
    public void setScheduledDepartures(int value) {
        this.scheduledDepartures = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduledArrivals.
     * 
     */
    public int getScheduledArrivals() {
        return scheduledArrivals;
    }

    /**
     * Define el valor de la propiedad scheduledArrivals.
     * 
     */
    public void setScheduledArrivals(int value) {
        this.scheduledArrivals = value;
    }

}

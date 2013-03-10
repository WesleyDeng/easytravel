
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SetAlertRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SetAlertRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alert_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aircrafttype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_start" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date_end" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="channels" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="max_weekly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetAlertRequest", propOrder = {
    "alertId",
    "ident",
    "origin",
    "destination",
    "aircrafttype",
    "dateStart",
    "dateEnd",
    "channels",
    "enabled",
    "maxWeekly"
})
public class SetAlertRequest {

    @XmlElement(name = "alert_id")
    protected int alertId;
    @XmlElement(required = true)
    protected String ident;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String aircrafttype;
    @XmlElement(name = "date_start")
    protected int dateStart;
    @XmlElement(name = "date_end")
    protected int dateEnd;
    @XmlElement(required = true)
    protected String channels;
    protected boolean enabled;
    @XmlElement(name = "max_weekly")
    protected int maxWeekly;

    /**
     * Obtiene el valor de la propiedad alertId.
     * 
     */
    public int getAlertId() {
        return alertId;
    }

    /**
     * Define el valor de la propiedad alertId.
     * 
     */
    public void setAlertId(int value) {
        this.alertId = value;
    }

    /**
     * Obtiene el valor de la propiedad ident.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Define el valor de la propiedad ident.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Obtiene el valor de la propiedad origin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Define el valor de la propiedad origin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Obtiene el valor de la propiedad destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Define el valor de la propiedad destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Obtiene el valor de la propiedad aircrafttype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircrafttype() {
        return aircrafttype;
    }

    /**
     * Define el valor de la propiedad aircrafttype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircrafttype(String value) {
        this.aircrafttype = value;
    }

    /**
     * Obtiene el valor de la propiedad dateStart.
     * 
     */
    public int getDateStart() {
        return dateStart;
    }

    /**
     * Define el valor de la propiedad dateStart.
     * 
     */
    public void setDateStart(int value) {
        this.dateStart = value;
    }

    /**
     * Obtiene el valor de la propiedad dateEnd.
     * 
     */
    public int getDateEnd() {
        return dateEnd;
    }

    /**
     * Define el valor de la propiedad dateEnd.
     * 
     */
    public void setDateEnd(int value) {
        this.dateEnd = value;
    }

    /**
     * Obtiene el valor de la propiedad channels.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannels() {
        return channels;
    }

    /**
     * Define el valor de la propiedad channels.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannels(String value) {
        this.channels = value;
    }

    /**
     * Obtiene el valor de la propiedad enabled.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Define el valor de la propiedad enabled.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Obtiene el valor de la propiedad maxWeekly.
     * 
     */
    public int getMaxWeekly() {
        return maxWeekly;
    }

    /**
     * Define el valor de la propiedad maxWeekly.
     * 
     */
    public void setMaxWeekly(int value) {
        this.maxWeekly = value;
    }

}

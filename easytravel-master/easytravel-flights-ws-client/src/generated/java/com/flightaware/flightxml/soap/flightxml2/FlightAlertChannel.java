
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FlightAlertChannel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FlightAlertChannel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channel_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="channel_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mask_summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="e_filed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="e_departure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="e_arrival" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="e_diverted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="e_cancelled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="target_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightAlertChannel", propOrder = {
    "channelId",
    "channelName",
    "maskSummary",
    "eFiled",
    "eDeparture",
    "eArrival",
    "eDiverted",
    "eCancelled",
    "targetAddress"
})
public class FlightAlertChannel {

    @XmlElement(name = "channel_id")
    protected int channelId;
    @XmlElement(name = "channel_name", required = true)
    protected String channelName;
    @XmlElement(name = "mask_summary", required = true)
    protected String maskSummary;
    @XmlElement(name = "e_filed")
    protected boolean eFiled;
    @XmlElement(name = "e_departure")
    protected boolean eDeparture;
    @XmlElement(name = "e_arrival")
    protected boolean eArrival;
    @XmlElement(name = "e_diverted")
    protected boolean eDiverted;
    @XmlElement(name = "e_cancelled")
    protected boolean eCancelled;
    @XmlElement(name = "target_address", required = true)
    protected String targetAddress;

    /**
     * Obtiene el valor de la propiedad channelId.
     * 
     */
    public int getChannelId() {
        return channelId;
    }

    /**
     * Define el valor de la propiedad channelId.
     * 
     */
    public void setChannelId(int value) {
        this.channelId = value;
    }

    /**
     * Obtiene el valor de la propiedad channelName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Define el valor de la propiedad channelName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * Obtiene el valor de la propiedad maskSummary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskSummary() {
        return maskSummary;
    }

    /**
     * Define el valor de la propiedad maskSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskSummary(String value) {
        this.maskSummary = value;
    }

    /**
     * Obtiene el valor de la propiedad eFiled.
     * 
     */
    public boolean isEFiled() {
        return eFiled;
    }

    /**
     * Define el valor de la propiedad eFiled.
     * 
     */
    public void setEFiled(boolean value) {
        this.eFiled = value;
    }

    /**
     * Obtiene el valor de la propiedad eDeparture.
     * 
     */
    public boolean isEDeparture() {
        return eDeparture;
    }

    /**
     * Define el valor de la propiedad eDeparture.
     * 
     */
    public void setEDeparture(boolean value) {
        this.eDeparture = value;
    }

    /**
     * Obtiene el valor de la propiedad eArrival.
     * 
     */
    public boolean isEArrival() {
        return eArrival;
    }

    /**
     * Define el valor de la propiedad eArrival.
     * 
     */
    public void setEArrival(boolean value) {
        this.eArrival = value;
    }

    /**
     * Obtiene el valor de la propiedad eDiverted.
     * 
     */
    public boolean isEDiverted() {
        return eDiverted;
    }

    /**
     * Define el valor de la propiedad eDiverted.
     * 
     */
    public void setEDiverted(boolean value) {
        this.eDiverted = value;
    }

    /**
     * Obtiene el valor de la propiedad eCancelled.
     * 
     */
    public boolean isECancelled() {
        return eCancelled;
    }

    /**
     * Define el valor de la propiedad eCancelled.
     * 
     */
    public void setECancelled(boolean value) {
        this.eCancelled = value;
    }

    /**
     * Obtiene el valor de la propiedad targetAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAddress() {
        return targetAddress;
    }

    /**
     * Define el valor de la propiedad targetAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAddress(String value) {
        this.targetAddress = value;
    }

}


package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para operationalTimesV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operationalTimesV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publishedDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="publishedArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="scheduledGateDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="estimatedGateDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="actualGateDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="flightPlanPlannedDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="estimatedRunwayDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="actualRunwayDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="scheduledGateArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="estimatedGateArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="actualGateArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="flightPlanPlannedArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="estimatedRunwayArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="actualRunwayArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operationalTimesV2", propOrder = {
    "publishedDeparture",
    "publishedArrival",
    "scheduledGateDeparture",
    "estimatedGateDeparture",
    "actualGateDeparture",
    "flightPlanPlannedDeparture",
    "estimatedRunwayDeparture",
    "actualRunwayDeparture",
    "scheduledGateArrival",
    "estimatedGateArrival",
    "actualGateArrival",
    "flightPlanPlannedArrival",
    "estimatedRunwayArrival",
    "actualRunwayArrival"
})
public class OperationalTimesV2 {

    protected DateInfoV2 publishedDeparture;
    protected DateInfoV2 publishedArrival;
    protected DateInfoV2 scheduledGateDeparture;
    protected DateInfoV2 estimatedGateDeparture;
    protected DateInfoV2 actualGateDeparture;
    protected DateInfoV2 flightPlanPlannedDeparture;
    protected DateInfoV2 estimatedRunwayDeparture;
    protected DateInfoV2 actualRunwayDeparture;
    protected DateInfoV2 scheduledGateArrival;
    protected DateInfoV2 estimatedGateArrival;
    protected DateInfoV2 actualGateArrival;
    protected DateInfoV2 flightPlanPlannedArrival;
    protected DateInfoV2 estimatedRunwayArrival;
    protected DateInfoV2 actualRunwayArrival;

    /**
     * Obtiene el valor de la propiedad publishedDeparture.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getPublishedDeparture() {
        return publishedDeparture;
    }

    /**
     * Define el valor de la propiedad publishedDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setPublishedDeparture(DateInfoV2 value) {
        this.publishedDeparture = value;
    }

    /**
     * Obtiene el valor de la propiedad publishedArrival.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getPublishedArrival() {
        return publishedArrival;
    }

    /**
     * Define el valor de la propiedad publishedArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setPublishedArrival(DateInfoV2 value) {
        this.publishedArrival = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduledGateDeparture.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getScheduledGateDeparture() {
        return scheduledGateDeparture;
    }

    /**
     * Define el valor de la propiedad scheduledGateDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setScheduledGateDeparture(DateInfoV2 value) {
        this.scheduledGateDeparture = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedGateDeparture.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getEstimatedGateDeparture() {
        return estimatedGateDeparture;
    }

    /**
     * Define el valor de la propiedad estimatedGateDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setEstimatedGateDeparture(DateInfoV2 value) {
        this.estimatedGateDeparture = value;
    }

    /**
     * Obtiene el valor de la propiedad actualGateDeparture.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getActualGateDeparture() {
        return actualGateDeparture;
    }

    /**
     * Define el valor de la propiedad actualGateDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setActualGateDeparture(DateInfoV2 value) {
        this.actualGateDeparture = value;
    }

    /**
     * Obtiene el valor de la propiedad flightPlanPlannedDeparture.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getFlightPlanPlannedDeparture() {
        return flightPlanPlannedDeparture;
    }

    /**
     * Define el valor de la propiedad flightPlanPlannedDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setFlightPlanPlannedDeparture(DateInfoV2 value) {
        this.flightPlanPlannedDeparture = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedRunwayDeparture.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getEstimatedRunwayDeparture() {
        return estimatedRunwayDeparture;
    }

    /**
     * Define el valor de la propiedad estimatedRunwayDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setEstimatedRunwayDeparture(DateInfoV2 value) {
        this.estimatedRunwayDeparture = value;
    }

    /**
     * Obtiene el valor de la propiedad actualRunwayDeparture.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getActualRunwayDeparture() {
        return actualRunwayDeparture;
    }

    /**
     * Define el valor de la propiedad actualRunwayDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setActualRunwayDeparture(DateInfoV2 value) {
        this.actualRunwayDeparture = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduledGateArrival.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getScheduledGateArrival() {
        return scheduledGateArrival;
    }

    /**
     * Define el valor de la propiedad scheduledGateArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setScheduledGateArrival(DateInfoV2 value) {
        this.scheduledGateArrival = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedGateArrival.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getEstimatedGateArrival() {
        return estimatedGateArrival;
    }

    /**
     * Define el valor de la propiedad estimatedGateArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setEstimatedGateArrival(DateInfoV2 value) {
        this.estimatedGateArrival = value;
    }

    /**
     * Obtiene el valor de la propiedad actualGateArrival.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getActualGateArrival() {
        return actualGateArrival;
    }

    /**
     * Define el valor de la propiedad actualGateArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setActualGateArrival(DateInfoV2 value) {
        this.actualGateArrival = value;
    }

    /**
     * Obtiene el valor de la propiedad flightPlanPlannedArrival.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getFlightPlanPlannedArrival() {
        return flightPlanPlannedArrival;
    }

    /**
     * Define el valor de la propiedad flightPlanPlannedArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setFlightPlanPlannedArrival(DateInfoV2 value) {
        this.flightPlanPlannedArrival = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedRunwayArrival.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getEstimatedRunwayArrival() {
        return estimatedRunwayArrival;
    }

    /**
     * Define el valor de la propiedad estimatedRunwayArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setEstimatedRunwayArrival(DateInfoV2 value) {
        this.estimatedRunwayArrival = value;
    }

    /**
     * Obtiene el valor de la propiedad actualRunwayArrival.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getActualRunwayArrival() {
        return actualRunwayArrival;
    }

    /**
     * Define el valor de la propiedad actualRunwayArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setActualRunwayArrival(DateInfoV2 value) {
        this.actualRunwayArrival = value;
    }

}


package com.conducivetech.cache.flighthistory.api_internal.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightStatusV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightStatusV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="carrier" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airlineV1" minOccurs="0"/>
 *         &lt;element name="carrierFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureAirport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="departureAirportFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalAirport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="arrivalAirportFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="divertedAirport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="divertedAirportFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2"/>
 *         &lt;element name="arrivalDate" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schedule" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}scheduleDataV2" minOccurs="0"/>
 *         &lt;element name="operationalTimes" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}operationalTimesV2"/>
 *         &lt;element name="codeshares" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codeshare" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}codeshareV2" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="delays" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}delaysV2" minOccurs="0"/>
 *         &lt;element name="flightDurations" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightDurationsV2" minOccurs="0"/>
 *         &lt;element name="airportResources" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airportResourcesV2" minOccurs="0"/>
 *         &lt;element name="flightEquipment" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightEquipmentV2" minOccurs="0"/>
 *         &lt;element name="flightStatusUpdates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightStatusUpdate" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightStatusUpdateV2" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightStatusV2", propOrder = {
    "flightId",
    "carrier",
    "carrierFsCode",
    "flightNumber",
    "departureAirport",
    "departureAirportFsCode",
    "arrivalAirport",
    "arrivalAirportFsCode",
    "divertedAirport",
    "divertedAirportFsCode",
    "departureDate",
    "arrivalDate",
    "status",
    "schedule",
    "operationalTimes",
    "codeshares",
    "delays",
    "flightDurations",
    "airportResources",
    "flightEquipment",
    "flightStatusUpdates"
})
public class FlightStatusV2 {

    protected long flightId;
    protected AirlineV1 carrier;
    protected String carrierFsCode;
    @XmlElement(required = true)
    protected String flightNumber;
    protected AirportV1 departureAirport;
    protected String departureAirportFsCode;
    protected AirportV1 arrivalAirport;
    protected String arrivalAirportFsCode;
    protected AirportV1 divertedAirport;
    protected String divertedAirportFsCode;
    @XmlElement(required = true)
    protected DateInfoV2 departureDate;
    @XmlElement(required = true)
    protected DateInfoV2 arrivalDate;
    @XmlElement(required = true)
    protected String status;
    protected ScheduleDataV2 schedule;
    @XmlElement(required = true)
    protected OperationalTimesV2 operationalTimes;
    protected FlightStatusV2 .Codeshares codeshares;
    protected DelaysV2 delays;
    protected FlightDurationsV2 flightDurations;
    protected AirportResourcesV2 airportResources;
    protected FlightEquipmentV2 flightEquipment;
    protected FlightStatusV2 .FlightStatusUpdates flightStatusUpdates;

    /**
     * Obtiene el valor de la propiedad flightId.
     * 
     */
    public long getFlightId() {
        return flightId;
    }

    /**
     * Define el valor de la propiedad flightId.
     * 
     */
    public void setFlightId(long value) {
        this.flightId = value;
    }

    /**
     * Obtiene el valor de la propiedad carrier.
     * 
     * @return
     *     possible object is
     *     {@link AirlineV1 }
     *     
     */
    public AirlineV1 getCarrier() {
        return carrier;
    }

    /**
     * Define el valor de la propiedad carrier.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineV1 }
     *     
     */
    public void setCarrier(AirlineV1 value) {
        this.carrier = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierFsCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierFsCode() {
        return carrierFsCode;
    }

    /**
     * Define el valor de la propiedad carrierFsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierFsCode(String value) {
        this.carrierFsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad flightNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Define el valor de la propiedad flightNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad departureAirport.
     * 
     * @return
     *     possible object is
     *     {@link AirportV1 }
     *     
     */
    public AirportV1 getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Define el valor de la propiedad departureAirport.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportV1 }
     *     
     */
    public void setDepartureAirport(AirportV1 value) {
        this.departureAirport = value;
    }

    /**
     * Obtiene el valor de la propiedad departureAirportFsCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirportFsCode() {
        return departureAirportFsCode;
    }

    /**
     * Define el valor de la propiedad departureAirportFsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirportFsCode(String value) {
        this.departureAirportFsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalAirport.
     * 
     * @return
     *     possible object is
     *     {@link AirportV1 }
     *     
     */
    public AirportV1 getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Define el valor de la propiedad arrivalAirport.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportV1 }
     *     
     */
    public void setArrivalAirport(AirportV1 value) {
        this.arrivalAirport = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalAirportFsCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirportFsCode() {
        return arrivalAirportFsCode;
    }

    /**
     * Define el valor de la propiedad arrivalAirportFsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirportFsCode(String value) {
        this.arrivalAirportFsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad divertedAirport.
     * 
     * @return
     *     possible object is
     *     {@link AirportV1 }
     *     
     */
    public AirportV1 getDivertedAirport() {
        return divertedAirport;
    }

    /**
     * Define el valor de la propiedad divertedAirport.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportV1 }
     *     
     */
    public void setDivertedAirport(AirportV1 value) {
        this.divertedAirport = value;
    }

    /**
     * Obtiene el valor de la propiedad divertedAirportFsCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivertedAirportFsCode() {
        return divertedAirportFsCode;
    }

    /**
     * Define el valor de la propiedad divertedAirportFsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivertedAirportFsCode(String value) {
        this.divertedAirportFsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad departureDate.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getDepartureDate() {
        return departureDate;
    }

    /**
     * Define el valor de la propiedad departureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setDepartureDate(DateInfoV2 value) {
        this.departureDate = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalDate.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Define el valor de la propiedad arrivalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setArrivalDate(DateInfoV2 value) {
        this.arrivalDate = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad schedule.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDataV2 }
     *     
     */
    public ScheduleDataV2 getSchedule() {
        return schedule;
    }

    /**
     * Define el valor de la propiedad schedule.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDataV2 }
     *     
     */
    public void setSchedule(ScheduleDataV2 value) {
        this.schedule = value;
    }

    /**
     * Obtiene el valor de la propiedad operationalTimes.
     * 
     * @return
     *     possible object is
     *     {@link OperationalTimesV2 }
     *     
     */
    public OperationalTimesV2 getOperationalTimes() {
        return operationalTimes;
    }

    /**
     * Define el valor de la propiedad operationalTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalTimesV2 }
     *     
     */
    public void setOperationalTimes(OperationalTimesV2 value) {
        this.operationalTimes = value;
    }

    /**
     * Obtiene el valor de la propiedad codeshares.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusV2 .Codeshares }
     *     
     */
    public FlightStatusV2 .Codeshares getCodeshares() {
        return codeshares;
    }

    /**
     * Define el valor de la propiedad codeshares.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusV2 .Codeshares }
     *     
     */
    public void setCodeshares(FlightStatusV2 .Codeshares value) {
        this.codeshares = value;
    }

    /**
     * Obtiene el valor de la propiedad delays.
     * 
     * @return
     *     possible object is
     *     {@link DelaysV2 }
     *     
     */
    public DelaysV2 getDelays() {
        return delays;
    }

    /**
     * Define el valor de la propiedad delays.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysV2 }
     *     
     */
    public void setDelays(DelaysV2 value) {
        this.delays = value;
    }

    /**
     * Obtiene el valor de la propiedad flightDurations.
     * 
     * @return
     *     possible object is
     *     {@link FlightDurationsV2 }
     *     
     */
    public FlightDurationsV2 getFlightDurations() {
        return flightDurations;
    }

    /**
     * Define el valor de la propiedad flightDurations.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDurationsV2 }
     *     
     */
    public void setFlightDurations(FlightDurationsV2 value) {
        this.flightDurations = value;
    }

    /**
     * Obtiene el valor de la propiedad airportResources.
     * 
     * @return
     *     possible object is
     *     {@link AirportResourcesV2 }
     *     
     */
    public AirportResourcesV2 getAirportResources() {
        return airportResources;
    }

    /**
     * Define el valor de la propiedad airportResources.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportResourcesV2 }
     *     
     */
    public void setAirportResources(AirportResourcesV2 value) {
        this.airportResources = value;
    }

    /**
     * Obtiene el valor de la propiedad flightEquipment.
     * 
     * @return
     *     possible object is
     *     {@link FlightEquipmentV2 }
     *     
     */
    public FlightEquipmentV2 getFlightEquipment() {
        return flightEquipment;
    }

    /**
     * Define el valor de la propiedad flightEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightEquipmentV2 }
     *     
     */
    public void setFlightEquipment(FlightEquipmentV2 value) {
        this.flightEquipment = value;
    }

    /**
     * Obtiene el valor de la propiedad flightStatusUpdates.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusV2 .FlightStatusUpdates }
     *     
     */
    public FlightStatusV2 .FlightStatusUpdates getFlightStatusUpdates() {
        return flightStatusUpdates;
    }

    /**
     * Define el valor de la propiedad flightStatusUpdates.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusV2 .FlightStatusUpdates }
     *     
     */
    public void setFlightStatusUpdates(FlightStatusV2 .FlightStatusUpdates value) {
        this.flightStatusUpdates = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="codeshare" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}codeshareV2" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codeshare"
    })
    public static class Codeshares {

        protected List<CodeshareV2> codeshare;

        /**
         * Gets the value of the codeshare property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codeshare property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodeshare().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeshareV2 }
         * 
         * 
         */
        public List<CodeshareV2> getCodeshare() {
            if (codeshare == null) {
                codeshare = new ArrayList<CodeshareV2>();
            }
            return this.codeshare;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="flightStatusUpdate" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightStatusUpdateV2" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightStatusUpdate"
    })
    public static class FlightStatusUpdates {

        protected List<FlightStatusUpdateV2> flightStatusUpdate;

        /**
         * Gets the value of the flightStatusUpdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightStatusUpdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightStatusUpdate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightStatusUpdateV2 }
         * 
         * 
         */
        public List<FlightStatusUpdateV2> getFlightStatusUpdate() {
            if (flightStatusUpdate == null) {
                flightStatusUpdate = new ArrayList<FlightStatusUpdateV2>();
            }
            return this.flightStatusUpdate;
        }

    }

}

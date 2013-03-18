
package com.conducivetech.cache.flighthistory.api_internal.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightTrackV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightTrackV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="carrier" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airlineV1" minOccurs="0"/>
 *         &lt;element name="carrierFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callsign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureAirport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="departureAirportFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalAirport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="arrivalAirportFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2"/>
 *         &lt;element name="equipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delayMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bearing" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="heading" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="positions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="position" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}positionV2" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="waypoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="waypoint" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}waypointV2" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="legacyRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightTrackV2", propOrder = {
    "flightId",
    "carrier",
    "carrierFsCode",
    "flightNumber",
    "tailNumber",
    "callsign",
    "departureAirport",
    "departureAirportFsCode",
    "arrivalAirport",
    "arrivalAirportFsCode",
    "departureDate",
    "equipment",
    "delayMinutes",
    "bearing",
    "heading",
    "positions",
    "waypoints",
    "legacyRoute"
})
public class FlightTrackV2 {

    protected long flightId;
    protected AirlineV1 carrier;
    protected String carrierFsCode;
    @XmlElement(required = true)
    protected String flightNumber;
    protected String tailNumber;
    protected String callsign;
    protected AirportV1 departureAirport;
    protected String departureAirportFsCode;
    protected AirportV1 arrivalAirport;
    protected String arrivalAirportFsCode;
    @XmlElement(required = true)
    protected DateInfoV2 departureDate;
    protected String equipment;
    protected Integer delayMinutes;
    protected double bearing;
    protected Double heading;
    protected FlightTrackV2 .Positions positions;
    protected FlightTrackV2 .Waypoints waypoints;
    protected String legacyRoute;

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
     * Obtiene el valor de la propiedad tailNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailNumber() {
        return tailNumber;
    }

    /**
     * Define el valor de la propiedad tailNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailNumber(String value) {
        this.tailNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad callsign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallsign() {
        return callsign;
    }

    /**
     * Define el valor de la propiedad callsign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallsign(String value) {
        this.callsign = value;
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
     * Obtiene el valor de la propiedad equipment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Define el valor de la propiedad equipment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipment(String value) {
        this.equipment = value;
    }

    /**
     * Obtiene el valor de la propiedad delayMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelayMinutes() {
        return delayMinutes;
    }

    /**
     * Define el valor de la propiedad delayMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelayMinutes(Integer value) {
        this.delayMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad bearing.
     * 
     */
    public double getBearing() {
        return bearing;
    }

    /**
     * Define el valor de la propiedad bearing.
     * 
     */
    public void setBearing(double value) {
        this.bearing = value;
    }

    /**
     * Obtiene el valor de la propiedad heading.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeading() {
        return heading;
    }

    /**
     * Define el valor de la propiedad heading.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeading(Double value) {
        this.heading = value;
    }

    /**
     * Obtiene el valor de la propiedad positions.
     * 
     * @return
     *     possible object is
     *     {@link FlightTrackV2 .Positions }
     *     
     */
    public FlightTrackV2 .Positions getPositions() {
        return positions;
    }

    /**
     * Define el valor de la propiedad positions.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTrackV2 .Positions }
     *     
     */
    public void setPositions(FlightTrackV2 .Positions value) {
        this.positions = value;
    }

    /**
     * Obtiene el valor de la propiedad waypoints.
     * 
     * @return
     *     possible object is
     *     {@link FlightTrackV2 .Waypoints }
     *     
     */
    public FlightTrackV2 .Waypoints getWaypoints() {
        return waypoints;
    }

    /**
     * Define el valor de la propiedad waypoints.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTrackV2 .Waypoints }
     *     
     */
    public void setWaypoints(FlightTrackV2 .Waypoints value) {
        this.waypoints = value;
    }

    /**
     * Obtiene el valor de la propiedad legacyRoute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyRoute() {
        return legacyRoute;
    }

    /**
     * Define el valor de la propiedad legacyRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyRoute(String value) {
        this.legacyRoute = value;
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
     *         &lt;element name="position" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}positionV2" maxOccurs="unbounded"/>
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
        "position"
    })
    public static class Positions {

        @XmlElement(required = true)
        protected List<PositionV2> position;

        /**
         * Gets the value of the position property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the position property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PositionV2 }
         * 
         * 
         */
        public List<PositionV2> getPosition() {
            if (position == null) {
                position = new ArrayList<PositionV2>();
            }
            return this.position;
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
     *         &lt;element name="waypoint" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}waypointV2" maxOccurs="unbounded" minOccurs="0"/>
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
        "waypoint"
    })
    public static class Waypoints {

        protected List<WaypointV2> waypoint;

        /**
         * Gets the value of the waypoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the waypoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWaypoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WaypointV2 }
         * 
         * 
         */
        public List<WaypointV2> getWaypoint() {
            if (waypoint == null) {
                waypoint = new ArrayList<WaypointV2>();
            }
            return this.waypoint;
        }

    }

}

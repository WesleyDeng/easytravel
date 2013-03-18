
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InFlightAircraftStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InFlightAircraftStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faFlightID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstPositionTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="lowLongitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="lowLatitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="highLongitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="highLatitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="groundspeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="heading" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altitudeStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="altitudeChange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="waypoints" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InFlightAircraftStruct", propOrder = {
    "faFlightID",
    "ident",
    "prefix",
    "type",
    "suffix",
    "origin",
    "destination",
    "timeout",
    "timestamp",
    "departureTime",
    "firstPositionTime",
    "arrivalTime",
    "longitude",
    "latitude",
    "lowLongitude",
    "lowLatitude",
    "highLongitude",
    "highLatitude",
    "groundspeed",
    "altitude",
    "heading",
    "altitudeStatus",
    "updateType",
    "altitudeChange",
    "waypoints"
})
public class InFlightAircraftStruct {

    @XmlElement(required = true)
    protected String faFlightID;
    @XmlElement(required = true)
    protected String ident;
    @XmlElement(required = true)
    protected String prefix;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String suffix;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String timeout;
    protected int timestamp;
    protected int departureTime;
    protected int firstPositionTime;
    protected int arrivalTime;
    protected float longitude;
    protected float latitude;
    protected float lowLongitude;
    protected float lowLatitude;
    protected float highLongitude;
    protected float highLatitude;
    protected int groundspeed;
    protected int altitude;
    protected int heading;
    @XmlElement(required = true)
    protected String altitudeStatus;
    @XmlElement(required = true)
    protected String updateType;
    @XmlElement(required = true)
    protected String altitudeChange;
    @XmlElement(required = true)
    protected String waypoints;

    /**
     * Obtiene el valor de la propiedad faFlightID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaFlightID() {
        return faFlightID;
    }

    /**
     * Define el valor de la propiedad faFlightID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaFlightID(String value) {
        this.faFlightID = value;
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
     * Obtiene el valor de la propiedad prefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Define el valor de la propiedad prefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad suffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Define el valor de la propiedad suffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
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
     * Obtiene el valor de la propiedad timeout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeout() {
        return timeout;
    }

    /**
     * Define el valor de la propiedad timeout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeout(String value) {
        this.timeout = value;
    }

    /**
     * Obtiene el valor de la propiedad timestamp.
     * 
     */
    public int getTimestamp() {
        return timestamp;
    }

    /**
     * Define el valor de la propiedad timestamp.
     * 
     */
    public void setTimestamp(int value) {
        this.timestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad departureTime.
     * 
     */
    public int getDepartureTime() {
        return departureTime;
    }

    /**
     * Define el valor de la propiedad departureTime.
     * 
     */
    public void setDepartureTime(int value) {
        this.departureTime = value;
    }

    /**
     * Obtiene el valor de la propiedad firstPositionTime.
     * 
     */
    public int getFirstPositionTime() {
        return firstPositionTime;
    }

    /**
     * Define el valor de la propiedad firstPositionTime.
     * 
     */
    public void setFirstPositionTime(int value) {
        this.firstPositionTime = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalTime.
     * 
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Define el valor de la propiedad arrivalTime.
     * 
     */
    public void setArrivalTime(int value) {
        this.arrivalTime = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Obtiene el valor de la propiedad latitude.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Define el valor de la propiedad latitude.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Obtiene el valor de la propiedad lowLongitude.
     * 
     */
    public float getLowLongitude() {
        return lowLongitude;
    }

    /**
     * Define el valor de la propiedad lowLongitude.
     * 
     */
    public void setLowLongitude(float value) {
        this.lowLongitude = value;
    }

    /**
     * Obtiene el valor de la propiedad lowLatitude.
     * 
     */
    public float getLowLatitude() {
        return lowLatitude;
    }

    /**
     * Define el valor de la propiedad lowLatitude.
     * 
     */
    public void setLowLatitude(float value) {
        this.lowLatitude = value;
    }

    /**
     * Obtiene el valor de la propiedad highLongitude.
     * 
     */
    public float getHighLongitude() {
        return highLongitude;
    }

    /**
     * Define el valor de la propiedad highLongitude.
     * 
     */
    public void setHighLongitude(float value) {
        this.highLongitude = value;
    }

    /**
     * Obtiene el valor de la propiedad highLatitude.
     * 
     */
    public float getHighLatitude() {
        return highLatitude;
    }

    /**
     * Define el valor de la propiedad highLatitude.
     * 
     */
    public void setHighLatitude(float value) {
        this.highLatitude = value;
    }

    /**
     * Obtiene el valor de la propiedad groundspeed.
     * 
     */
    public int getGroundspeed() {
        return groundspeed;
    }

    /**
     * Define el valor de la propiedad groundspeed.
     * 
     */
    public void setGroundspeed(int value) {
        this.groundspeed = value;
    }

    /**
     * Obtiene el valor de la propiedad altitude.
     * 
     */
    public int getAltitude() {
        return altitude;
    }

    /**
     * Define el valor de la propiedad altitude.
     * 
     */
    public void setAltitude(int value) {
        this.altitude = value;
    }

    /**
     * Obtiene el valor de la propiedad heading.
     * 
     */
    public int getHeading() {
        return heading;
    }

    /**
     * Define el valor de la propiedad heading.
     * 
     */
    public void setHeading(int value) {
        this.heading = value;
    }

    /**
     * Obtiene el valor de la propiedad altitudeStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitudeStatus() {
        return altitudeStatus;
    }

    /**
     * Define el valor de la propiedad altitudeStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitudeStatus(String value) {
        this.altitudeStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad updateType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateType() {
        return updateType;
    }

    /**
     * Define el valor de la propiedad updateType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateType(String value) {
        this.updateType = value;
    }

    /**
     * Obtiene el valor de la propiedad altitudeChange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitudeChange() {
        return altitudeChange;
    }

    /**
     * Define el valor de la propiedad altitudeChange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitudeChange(String value) {
        this.altitudeChange = value;
    }

    /**
     * Obtiene el valor de la propiedad waypoints.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaypoints() {
        return waypoints;
    }

    /**
     * Define el valor de la propiedad waypoints.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaypoints(String value) {
        this.waypoints = value;
    }

}

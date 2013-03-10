
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TrackExStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TrackExStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faFlightID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="groundspeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altitudeStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="altitudeChange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackExStruct", propOrder = {
    "faFlightID",
    "timestamp",
    "latitude",
    "longitude",
    "groundspeed",
    "altitude",
    "altitudeStatus",
    "updateType",
    "altitudeChange"
})
public class TrackExStruct {

    @XmlElement(required = true)
    protected String faFlightID;
    protected int timestamp;
    protected float latitude;
    protected float longitude;
    protected int groundspeed;
    protected int altitude;
    @XmlElement(required = true)
    protected String altitudeStatus;
    @XmlElement(required = true)
    protected String updateType;
    @XmlElement(required = true)
    protected String altitudeChange;

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

}

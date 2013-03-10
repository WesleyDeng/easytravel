
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MetarStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MetarStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cloud_friendly" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cloud_altitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cloud_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conditions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pressure" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="temp_air" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="temp_dewpoint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="temp_relhum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="wind_friendly" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wind_direction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wind_speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wind_speed_gust" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="raw_data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetarStruct", propOrder = {
    "airport",
    "time",
    "cloudFriendly",
    "cloudAltitude",
    "cloudType",
    "conditions",
    "pressure",
    "tempAir",
    "tempDewpoint",
    "tempRelhum",
    "visibility",
    "windFriendly",
    "windDirection",
    "windSpeed",
    "windSpeedGust",
    "rawData"
})
public class MetarStruct {

    @XmlElement(required = true)
    protected String airport;
    protected int time;
    @XmlElement(name = "cloud_friendly", required = true)
    protected String cloudFriendly;
    @XmlElement(name = "cloud_altitude")
    protected int cloudAltitude;
    @XmlElement(name = "cloud_type", required = true)
    protected String cloudType;
    @XmlElement(required = true)
    protected String conditions;
    protected float pressure;
    @XmlElement(name = "temp_air")
    protected int tempAir;
    @XmlElement(name = "temp_dewpoint")
    protected int tempDewpoint;
    @XmlElement(name = "temp_relhum")
    protected int tempRelhum;
    protected float visibility;
    @XmlElement(name = "wind_friendly", required = true)
    protected String windFriendly;
    @XmlElement(name = "wind_direction")
    protected int windDirection;
    @XmlElement(name = "wind_speed")
    protected int windSpeed;
    @XmlElement(name = "wind_speed_gust")
    protected int windSpeedGust;
    @XmlElement(name = "raw_data", required = true)
    protected String rawData;

    /**
     * Obtiene el valor de la propiedad airport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirport() {
        return airport;
    }

    /**
     * Define el valor de la propiedad airport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirport(String value) {
        this.airport = value;
    }

    /**
     * Obtiene el valor de la propiedad time.
     * 
     */
    public int getTime() {
        return time;
    }

    /**
     * Define el valor de la propiedad time.
     * 
     */
    public void setTime(int value) {
        this.time = value;
    }

    /**
     * Obtiene el valor de la propiedad cloudFriendly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudFriendly() {
        return cloudFriendly;
    }

    /**
     * Define el valor de la propiedad cloudFriendly.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudFriendly(String value) {
        this.cloudFriendly = value;
    }

    /**
     * Obtiene el valor de la propiedad cloudAltitude.
     * 
     */
    public int getCloudAltitude() {
        return cloudAltitude;
    }

    /**
     * Define el valor de la propiedad cloudAltitude.
     * 
     */
    public void setCloudAltitude(int value) {
        this.cloudAltitude = value;
    }

    /**
     * Obtiene el valor de la propiedad cloudType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudType() {
        return cloudType;
    }

    /**
     * Define el valor de la propiedad cloudType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudType(String value) {
        this.cloudType = value;
    }

    /**
     * Obtiene el valor de la propiedad conditions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * Define el valor de la propiedad conditions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditions(String value) {
        this.conditions = value;
    }

    /**
     * Obtiene el valor de la propiedad pressure.
     * 
     */
    public float getPressure() {
        return pressure;
    }

    /**
     * Define el valor de la propiedad pressure.
     * 
     */
    public void setPressure(float value) {
        this.pressure = value;
    }

    /**
     * Obtiene el valor de la propiedad tempAir.
     * 
     */
    public int getTempAir() {
        return tempAir;
    }

    /**
     * Define el valor de la propiedad tempAir.
     * 
     */
    public void setTempAir(int value) {
        this.tempAir = value;
    }

    /**
     * Obtiene el valor de la propiedad tempDewpoint.
     * 
     */
    public int getTempDewpoint() {
        return tempDewpoint;
    }

    /**
     * Define el valor de la propiedad tempDewpoint.
     * 
     */
    public void setTempDewpoint(int value) {
        this.tempDewpoint = value;
    }

    /**
     * Obtiene el valor de la propiedad tempRelhum.
     * 
     */
    public int getTempRelhum() {
        return tempRelhum;
    }

    /**
     * Define el valor de la propiedad tempRelhum.
     * 
     */
    public void setTempRelhum(int value) {
        this.tempRelhum = value;
    }

    /**
     * Obtiene el valor de la propiedad visibility.
     * 
     */
    public float getVisibility() {
        return visibility;
    }

    /**
     * Define el valor de la propiedad visibility.
     * 
     */
    public void setVisibility(float value) {
        this.visibility = value;
    }

    /**
     * Obtiene el valor de la propiedad windFriendly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindFriendly() {
        return windFriendly;
    }

    /**
     * Define el valor de la propiedad windFriendly.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindFriendly(String value) {
        this.windFriendly = value;
    }

    /**
     * Obtiene el valor de la propiedad windDirection.
     * 
     */
    public int getWindDirection() {
        return windDirection;
    }

    /**
     * Define el valor de la propiedad windDirection.
     * 
     */
    public void setWindDirection(int value) {
        this.windDirection = value;
    }

    /**
     * Obtiene el valor de la propiedad windSpeed.
     * 
     */
    public int getWindSpeed() {
        return windSpeed;
    }

    /**
     * Define el valor de la propiedad windSpeed.
     * 
     */
    public void setWindSpeed(int value) {
        this.windSpeed = value;
    }

    /**
     * Obtiene el valor de la propiedad windSpeedGust.
     * 
     */
    public int getWindSpeedGust() {
        return windSpeedGust;
    }

    /**
     * Define el valor de la propiedad windSpeedGust.
     * 
     */
    public void setWindSpeedGust(int value) {
        this.windSpeedGust = value;
    }

    /**
     * Obtiene el valor de la propiedad rawData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawData() {
        return rawData;
    }

    /**
     * Define el valor de la propiedad rawData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawData(String value) {
        this.rawData = value;
    }

}

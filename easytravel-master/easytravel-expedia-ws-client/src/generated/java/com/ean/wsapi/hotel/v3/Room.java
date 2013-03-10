
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Room complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Room">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfChildren" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="childAges" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bedTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bedTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfBeds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="smokingPreference" type="{http://v3.hotel.wsapi.ean.com/}SmokingPreference" minOccurs="0"/>
 *         &lt;element name="roomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeableRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Room", propOrder = {
    "numberOfAdults",
    "numberOfChildren",
    "childAges",
    "firstName",
    "lastName",
    "bedTypeId",
    "bedTypeDescription",
    "numberOfBeds",
    "smokingPreference",
    "roomTypeCode",
    "rateCode",
    "rateKey",
    "roomDescription",
    "chargeableRate"
})
public class Room {

    protected int numberOfAdults;
    protected Integer numberOfChildren;
    @XmlElement(type = Integer.class)
    protected List<Integer> childAges;
    protected String firstName;
    protected String lastName;
    protected String bedTypeId;
    protected String bedTypeDescription;
    protected Integer numberOfBeds;
    protected SmokingPreference smokingPreference;
    protected String roomTypeCode;
    protected String rateCode;
    protected String rateKey;
    protected String roomDescription;
    protected Float chargeableRate;

    /**
     * Obtiene el valor de la propiedad numberOfAdults.
     * 
     */
    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * Define el valor de la propiedad numberOfAdults.
     * 
     */
    public void setNumberOfAdults(int value) {
        this.numberOfAdults = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfChildren.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * Define el valor de la propiedad numberOfChildren.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfChildren(Integer value) {
        this.numberOfChildren = value;
    }

    /**
     * Gets the value of the childAges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childAges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildAges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getChildAges() {
        if (childAges == null) {
            childAges = new ArrayList<Integer>();
        }
        return this.childAges;
    }

    /**
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad bedTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedTypeId() {
        return bedTypeId;
    }

    /**
     * Define el valor de la propiedad bedTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedTypeId(String value) {
        this.bedTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad bedTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedTypeDescription() {
        return bedTypeDescription;
    }

    /**
     * Define el valor de la propiedad bedTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedTypeDescription(String value) {
        this.bedTypeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfBeds.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    /**
     * Define el valor de la propiedad numberOfBeds.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBeds(Integer value) {
        this.numberOfBeds = value;
    }

    /**
     * Obtiene el valor de la propiedad smokingPreference.
     * 
     * @return
     *     possible object is
     *     {@link SmokingPreference }
     *     
     */
    public SmokingPreference getSmokingPreference() {
        return smokingPreference;
    }

    /**
     * Define el valor de la propiedad smokingPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link SmokingPreference }
     *     
     */
    public void setSmokingPreference(SmokingPreference value) {
        this.smokingPreference = value;
    }

    /**
     * Obtiene el valor de la propiedad roomTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * Define el valor de la propiedad roomTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad rateCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Define el valor de la propiedad rateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Obtiene el valor de la propiedad rateKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateKey() {
        return rateKey;
    }

    /**
     * Define el valor de la propiedad rateKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateKey(String value) {
        this.rateKey = value;
    }

    /**
     * Obtiene el valor de la propiedad roomDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * Define el valor de la propiedad roomDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomDescription(String value) {
        this.roomDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeableRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getChargeableRate() {
        return chargeableRate;
    }

    /**
     * Define el valor de la propiedad chargeableRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setChargeableRate(Float value) {
        this.chargeableRate = value;
    }

}

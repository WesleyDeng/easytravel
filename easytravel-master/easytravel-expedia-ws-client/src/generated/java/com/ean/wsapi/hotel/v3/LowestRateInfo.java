
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LowestRateInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LowestRateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NightlyRates" type="{http://v3.hotel.wsapi.ean.com/}NightlyRates" minOccurs="0"/>
 *         &lt;element name="rateCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierType" type="{http://v3.hotel.wsapi.ean.com/}SupplierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowestRateInfo", propOrder = {
    "nightlyRates",
    "rateCurrencyCode",
    "roomDescription",
    "promotion",
    "rateCode",
    "roomTypeCode",
    "supplierType"
})
public class LowestRateInfo {

    @XmlElement(name = "NightlyRates")
    protected NightlyRates nightlyRates;
    protected String rateCurrencyCode;
    protected String roomDescription;
    protected String promotion;
    protected String rateCode;
    protected String roomTypeCode;
    protected SupplierType supplierType;

    /**
     * Obtiene el valor de la propiedad nightlyRates.
     * 
     * @return
     *     possible object is
     *     {@link NightlyRates }
     *     
     */
    public NightlyRates getNightlyRates() {
        return nightlyRates;
    }

    /**
     * Define el valor de la propiedad nightlyRates.
     * 
     * @param value
     *     allowed object is
     *     {@link NightlyRates }
     *     
     */
    public void setNightlyRates(NightlyRates value) {
        this.nightlyRates = value;
    }

    /**
     * Obtiene el valor de la propiedad rateCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCurrencyCode() {
        return rateCurrencyCode;
    }

    /**
     * Define el valor de la propiedad rateCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCurrencyCode(String value) {
        this.rateCurrencyCode = value;
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
     * Obtiene el valor de la propiedad promotion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * Define el valor de la propiedad promotion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotion(String value) {
        this.promotion = value;
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
     * Obtiene el valor de la propiedad supplierType.
     * 
     * @return
     *     possible object is
     *     {@link SupplierType }
     *     
     */
    public SupplierType getSupplierType() {
        return supplierType;
    }

    /**
     * Define el valor de la propiedad supplierType.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierType }
     *     
     */
    public void setSupplierType(SupplierType value) {
        this.supplierType = value;
    }

}

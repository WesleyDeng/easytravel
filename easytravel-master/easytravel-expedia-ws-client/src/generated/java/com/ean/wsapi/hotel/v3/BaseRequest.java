
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BaseRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BaseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apiKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="customerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerUserAgent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://v3.hotel.wsapi.ean.com/}LocaleType" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalData" type="{http://v3.hotel.wsapi.ean.com/}mapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debug" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="test" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequest", propOrder = {
    "apiKey",
    "cid",
    "customerIpAddress",
    "customerSessionId",
    "customerUserAgent",
    "locale",
    "currencyCode",
    "additionalData",
    "sig",
    "debug",
    "test"
})
@XmlSeeAlso({
    HotelBaseRequest.class
})
public abstract class BaseRequest {

    @XmlElement(required = true)
    protected String apiKey;
    protected long cid;
    @XmlElement(required = true)
    protected String customerIpAddress;
    protected String customerSessionId;
    @XmlElement(required = true)
    protected String customerUserAgent;
    protected LocaleType locale;
    protected String currencyCode;
    protected List<MapEntry> additionalData;
    protected String sig;
    protected Boolean debug;
    protected Boolean test;

    /**
     * Obtiene el valor de la propiedad apiKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Define el valor de la propiedad apiKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Obtiene el valor de la propiedad cid.
     * 
     */
    public long getCid() {
        return cid;
    }

    /**
     * Define el valor de la propiedad cid.
     * 
     */
    public void setCid(long value) {
        this.cid = value;
    }

    /**
     * Obtiene el valor de la propiedad customerIpAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIpAddress() {
        return customerIpAddress;
    }

    /**
     * Define el valor de la propiedad customerIpAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIpAddress(String value) {
        this.customerIpAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad customerSessionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSessionId() {
        return customerSessionId;
    }

    /**
     * Define el valor de la propiedad customerSessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSessionId(String value) {
        this.customerSessionId = value;
    }

    /**
     * Obtiene el valor de la propiedad customerUserAgent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUserAgent() {
        return customerUserAgent;
    }

    /**
     * Define el valor de la propiedad customerUserAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUserAgent(String value) {
        this.customerUserAgent = value;
    }

    /**
     * Obtiene el valor de la propiedad locale.
     * 
     * @return
     *     possible object is
     *     {@link LocaleType }
     *     
     */
    public LocaleType getLocale() {
        return locale;
    }

    /**
     * Define el valor de la propiedad locale.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleType }
     *     
     */
    public void setLocale(LocaleType value) {
        this.locale = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define el valor de la propiedad currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapEntry }
     * 
     * 
     */
    public List<MapEntry> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<MapEntry>();
        }
        return this.additionalData;
    }

    /**
     * Obtiene el valor de la propiedad sig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSig() {
        return sig;
    }

    /**
     * Define el valor de la propiedad sig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSig(String value) {
        this.sig = value;
    }

    /**
     * Obtiene el valor de la propiedad debug.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDebug() {
        return debug;
    }

    /**
     * Define el valor de la propiedad debug.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDebug(Boolean value) {
        this.debug = value;
    }

    /**
     * Obtiene el valor de la propiedad test.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTest() {
        return test;
    }

    /**
     * Define el valor de la propiedad test.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTest(Boolean value) {
        this.test = value;
    }

}

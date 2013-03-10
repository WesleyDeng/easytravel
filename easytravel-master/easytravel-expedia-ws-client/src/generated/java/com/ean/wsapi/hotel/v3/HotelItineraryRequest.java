
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelItineraryRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelItineraryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}HotelBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="itineraryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliateConfirmationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliateCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItineraryQuery" type="{http://v3.hotel.wsapi.ean.com/}ItineraryQuery" minOccurs="0"/>
 *         &lt;element name="confirmationExtras" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supplierConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelItineraryRequest", propOrder = {
    "itineraryId",
    "lastName",
    "email",
    "affiliateConfirmationId",
    "affiliateCustomerId",
    "creditCardNumber",
    "itineraryQuery",
    "confirmationExtras",
    "supplierConfirmationNumber"
})
public class HotelItineraryRequest
    extends HotelBaseRequest
{

    protected Long itineraryId;
    protected String lastName;
    protected String email;
    protected String affiliateConfirmationId;
    protected String affiliateCustomerId;
    protected String creditCardNumber;
    @XmlElement(name = "ItineraryQuery")
    protected ItineraryQuery itineraryQuery;
    protected List<String> confirmationExtras;
    protected String supplierConfirmationNumber;

    /**
     * Obtiene el valor de la propiedad itineraryId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItineraryId() {
        return itineraryId;
    }

    /**
     * Define el valor de la propiedad itineraryId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItineraryId(Long value) {
        this.itineraryId = value;
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
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad affiliateConfirmationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateConfirmationId() {
        return affiliateConfirmationId;
    }

    /**
     * Define el valor de la propiedad affiliateConfirmationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateConfirmationId(String value) {
        this.affiliateConfirmationId = value;
    }

    /**
     * Obtiene el valor de la propiedad affiliateCustomerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateCustomerId() {
        return affiliateCustomerId;
    }

    /**
     * Define el valor de la propiedad affiliateCustomerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateCustomerId(String value) {
        this.affiliateCustomerId = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Define el valor de la propiedad creditCardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad itineraryQuery.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryQuery }
     *     
     */
    public ItineraryQuery getItineraryQuery() {
        return itineraryQuery;
    }

    /**
     * Define el valor de la propiedad itineraryQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryQuery }
     *     
     */
    public void setItineraryQuery(ItineraryQuery value) {
        this.itineraryQuery = value;
    }

    /**
     * Gets the value of the confirmationExtras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmationExtras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmationExtras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConfirmationExtras() {
        if (confirmationExtras == null) {
            confirmationExtras = new ArrayList<String>();
        }
        return this.confirmationExtras;
    }

    /**
     * Obtiene el valor de la propiedad supplierConfirmationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierConfirmationNumber() {
        return supplierConfirmationNumber;
    }

    /**
     * Define el valor de la propiedad supplierConfirmationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierConfirmationNumber(String value) {
        this.supplierConfirmationNumber = value;
    }

}

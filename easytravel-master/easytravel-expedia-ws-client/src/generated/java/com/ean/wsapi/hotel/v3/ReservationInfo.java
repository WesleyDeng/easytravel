
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reservationInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reservationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faxPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardIssueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardPasHttpUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardPasHttpAccept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardPasPaRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailItineraryList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservationInfo", propOrder = {
    "email",
    "firstName",
    "lastName",
    "homePhone",
    "workPhone",
    "extension",
    "faxPhone",
    "companyName",
    "creditCardType",
    "creditCardNumber",
    "creditCardIdentifier",
    "creditCardExpirationMonth",
    "creditCardExpirationYear",
    "creditCardStartDate",
    "creditCardIssueNumber",
    "creditCardPasHttpUserAgent",
    "creditCardPasHttpAccept",
    "creditCardPasPaRes",
    "emailItineraryList"
})
public class ReservationInfo {

    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String homePhone;
    @XmlElement(required = true)
    protected String workPhone;
    protected String extension;
    protected String faxPhone;
    protected String companyName;
    @XmlElement(required = true)
    protected String creditCardType;
    @XmlElement(required = true)
    protected String creditCardNumber;
    @XmlElement(required = true)
    protected String creditCardIdentifier;
    @XmlElement(required = true)
    protected String creditCardExpirationMonth;
    @XmlElement(required = true)
    protected String creditCardExpirationYear;
    protected String creditCardStartDate;
    protected String creditCardIssueNumber;
    protected String creditCardPasHttpUserAgent;
    protected String creditCardPasHttpAccept;
    protected String creditCardPasPaRes;
    protected List<String> emailItineraryList;

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
     * Obtiene el valor de la propiedad homePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Define el valor de la propiedad homePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad workPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Define el valor de la propiedad workPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad extension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Define el valor de la propiedad extension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Obtiene el valor de la propiedad faxPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxPhone() {
        return faxPhone;
    }

    /**
     * Define el valor de la propiedad faxPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxPhone(String value) {
        this.faxPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad companyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Define el valor de la propiedad companyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Define el valor de la propiedad creditCardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
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
     * Obtiene el valor de la propiedad creditCardIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardIdentifier() {
        return creditCardIdentifier;
    }

    /**
     * Define el valor de la propiedad creditCardIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardIdentifier(String value) {
        this.creditCardIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardExpirationMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    /**
     * Define el valor de la propiedad creditCardExpirationMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationMonth(String value) {
        this.creditCardExpirationMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardExpirationYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    /**
     * Define el valor de la propiedad creditCardExpirationYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationYear(String value) {
        this.creditCardExpirationYear = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardStartDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardStartDate() {
        return creditCardStartDate;
    }

    /**
     * Define el valor de la propiedad creditCardStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardStartDate(String value) {
        this.creditCardStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardIssueNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardIssueNumber() {
        return creditCardIssueNumber;
    }

    /**
     * Define el valor de la propiedad creditCardIssueNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardIssueNumber(String value) {
        this.creditCardIssueNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardPasHttpUserAgent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardPasHttpUserAgent() {
        return creditCardPasHttpUserAgent;
    }

    /**
     * Define el valor de la propiedad creditCardPasHttpUserAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardPasHttpUserAgent(String value) {
        this.creditCardPasHttpUserAgent = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardPasHttpAccept.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardPasHttpAccept() {
        return creditCardPasHttpAccept;
    }

    /**
     * Define el valor de la propiedad creditCardPasHttpAccept.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardPasHttpAccept(String value) {
        this.creditCardPasHttpAccept = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardPasPaRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardPasPaRes() {
        return creditCardPasPaRes;
    }

    /**
     * Define el valor de la propiedad creditCardPasPaRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardPasPaRes(String value) {
        this.creditCardPasPaRes = value;
    }

    /**
     * Gets the value of the emailItineraryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailItineraryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailItineraryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailItineraryList() {
        if (emailItineraryList == null) {
            emailItineraryList = new ArrayList<String>();
        }
        return this.emailItineraryList;
    }

}

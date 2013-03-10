
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EanWsError complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EanWsError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itineraryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="handling" type="{http://v3.hotel.wsapi.ean.com/}errorHandling" minOccurs="0"/>
 *         &lt;element name="category" type="{http://v3.hotel.wsapi.ean.com/}errorCategory" minOccurs="0"/>
 *         &lt;element name="exceptionConditionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorAttributes" type="{http://v3.hotel.wsapi.ean.com/}ErrorAttributes" minOccurs="0"/>
 *         &lt;element name="presentationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verboseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerInfo" type="{http://v3.hotel.wsapi.ean.com/}ServerInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EanWsError", propOrder = {
    "itineraryId",
    "handling",
    "category",
    "exceptionConditionId",
    "errorAttributes",
    "presentationMessage",
    "verboseMessage",
    "serverInfo"
})
public class EanWsError {

    protected long itineraryId;
    protected ErrorHandling handling;
    protected ErrorCategory category;
    protected int exceptionConditionId;
    @XmlElement(name = "ErrorAttributes")
    protected ErrorAttributes errorAttributes;
    protected String presentationMessage;
    protected String verboseMessage;
    @XmlElement(name = "ServerInfo")
    protected ServerInfo serverInfo;

    /**
     * Obtiene el valor de la propiedad itineraryId.
     * 
     */
    public long getItineraryId() {
        return itineraryId;
    }

    /**
     * Define el valor de la propiedad itineraryId.
     * 
     */
    public void setItineraryId(long value) {
        this.itineraryId = value;
    }

    /**
     * Obtiene el valor de la propiedad handling.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling }
     *     
     */
    public ErrorHandling getHandling() {
        return handling;
    }

    /**
     * Define el valor de la propiedad handling.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling }
     *     
     */
    public void setHandling(ErrorHandling value) {
        this.handling = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCategory }
     *     
     */
    public ErrorCategory getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCategory }
     *     
     */
    public void setCategory(ErrorCategory value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionConditionId.
     * 
     */
    public int getExceptionConditionId() {
        return exceptionConditionId;
    }

    /**
     * Define el valor de la propiedad exceptionConditionId.
     * 
     */
    public void setExceptionConditionId(int value) {
        this.exceptionConditionId = value;
    }

    /**
     * Obtiene el valor de la propiedad errorAttributes.
     * 
     * @return
     *     possible object is
     *     {@link ErrorAttributes }
     *     
     */
    public ErrorAttributes getErrorAttributes() {
        return errorAttributes;
    }

    /**
     * Define el valor de la propiedad errorAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorAttributes }
     *     
     */
    public void setErrorAttributes(ErrorAttributes value) {
        this.errorAttributes = value;
    }

    /**
     * Obtiene el valor de la propiedad presentationMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationMessage() {
        return presentationMessage;
    }

    /**
     * Define el valor de la propiedad presentationMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationMessage(String value) {
        this.presentationMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad verboseMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerboseMessage() {
        return verboseMessage;
    }

    /**
     * Define el valor de la propiedad verboseMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerboseMessage(String value) {
        this.verboseMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad serverInfo.
     * 
     * @return
     *     possible object is
     *     {@link ServerInfo }
     *     
     */
    public ServerInfo getServerInfo() {
        return serverInfo;
    }

    /**
     * Define el valor de la propiedad serverInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerInfo }
     *     
     */
    public void setServerInfo(ServerInfo value) {
        this.serverInfo = value;
    }

}

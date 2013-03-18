
package com.conducivetech.cache.flighthistory.api_internal.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightStatusUpdateV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightStatusUpdateV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updatedAt" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updatedTextFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="updatedTextField" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightStatusUpdatedTextV2" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="updatedDateFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="updatedDateField" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightStatusUpdatedDateV2" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightStatusUpdateV2", propOrder = {
    "updatedAt",
    "source",
    "updatedTextFields",
    "updatedDateFields"
})
public class FlightStatusUpdateV2 {

    @XmlElement(required = true)
    protected DateInfoV2 updatedAt;
    @XmlElement(required = true)
    protected String source;
    protected FlightStatusUpdateV2 .UpdatedTextFields updatedTextFields;
    protected FlightStatusUpdateV2 .UpdatedDateFields updatedDateFields;

    /**
     * Obtiene el valor de la propiedad updatedAt.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Define el valor de la propiedad updatedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setUpdatedAt(DateInfoV2 value) {
        this.updatedAt = value;
    }

    /**
     * Obtiene el valor de la propiedad source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Define el valor de la propiedad source.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Obtiene el valor de la propiedad updatedTextFields.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusUpdateV2 .UpdatedTextFields }
     *     
     */
    public FlightStatusUpdateV2 .UpdatedTextFields getUpdatedTextFields() {
        return updatedTextFields;
    }

    /**
     * Define el valor de la propiedad updatedTextFields.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusUpdateV2 .UpdatedTextFields }
     *     
     */
    public void setUpdatedTextFields(FlightStatusUpdateV2 .UpdatedTextFields value) {
        this.updatedTextFields = value;
    }

    /**
     * Obtiene el valor de la propiedad updatedDateFields.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusUpdateV2 .UpdatedDateFields }
     *     
     */
    public FlightStatusUpdateV2 .UpdatedDateFields getUpdatedDateFields() {
        return updatedDateFields;
    }

    /**
     * Define el valor de la propiedad updatedDateFields.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusUpdateV2 .UpdatedDateFields }
     *     
     */
    public void setUpdatedDateFields(FlightStatusUpdateV2 .UpdatedDateFields value) {
        this.updatedDateFields = value;
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
     *         &lt;element name="updatedDateField" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightStatusUpdatedDateV2" maxOccurs="unbounded" minOccurs="0"/>
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
        "updatedDateField"
    })
    public static class UpdatedDateFields {

        protected List<FlightStatusUpdatedDateV2> updatedDateField;

        /**
         * Gets the value of the updatedDateField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the updatedDateField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUpdatedDateField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightStatusUpdatedDateV2 }
         * 
         * 
         */
        public List<FlightStatusUpdatedDateV2> getUpdatedDateField() {
            if (updatedDateField == null) {
                updatedDateField = new ArrayList<FlightStatusUpdatedDateV2>();
            }
            return this.updatedDateField;
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
     *         &lt;element name="updatedTextField" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightStatusUpdatedTextV2" maxOccurs="unbounded" minOccurs="0"/>
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
        "updatedTextField"
    })
    public static class UpdatedTextFields {

        protected List<FlightStatusUpdatedTextV2> updatedTextField;

        /**
         * Gets the value of the updatedTextField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the updatedTextField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUpdatedTextField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightStatusUpdatedTextV2 }
         * 
         * 
         */
        public List<FlightStatusUpdatedTextV2> getUpdatedTextField() {
            if (updatedTextField == null) {
                updatedTextField = new ArrayList<FlightStatusUpdatedTextV2>();
            }
            return this.updatedTextField;
        }

    }

}

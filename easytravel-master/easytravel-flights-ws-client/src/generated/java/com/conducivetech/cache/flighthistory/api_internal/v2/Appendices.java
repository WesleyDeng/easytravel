
package com.conducivetech.cache.flighthistory.api_internal.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para appendices complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="appendices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airlines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="airline" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airlineV1" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="airports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="airport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airportV1" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="equipments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="equipment" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}equipmentV1" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "appendices", propOrder = {
    "airlines",
    "airports",
    "equipments"
})
public class Appendices {

    protected Appendices.Airlines airlines;
    protected Appendices.Airports airports;
    protected Appendices.Equipments equipments;

    /**
     * Obtiene el valor de la propiedad airlines.
     * 
     * @return
     *     possible object is
     *     {@link Appendices.Airlines }
     *     
     */
    public Appendices.Airlines getAirlines() {
        return airlines;
    }

    /**
     * Define el valor de la propiedad airlines.
     * 
     * @param value
     *     allowed object is
     *     {@link Appendices.Airlines }
     *     
     */
    public void setAirlines(Appendices.Airlines value) {
        this.airlines = value;
    }

    /**
     * Obtiene el valor de la propiedad airports.
     * 
     * @return
     *     possible object is
     *     {@link Appendices.Airports }
     *     
     */
    public Appendices.Airports getAirports() {
        return airports;
    }

    /**
     * Define el valor de la propiedad airports.
     * 
     * @param value
     *     allowed object is
     *     {@link Appendices.Airports }
     *     
     */
    public void setAirports(Appendices.Airports value) {
        this.airports = value;
    }

    /**
     * Obtiene el valor de la propiedad equipments.
     * 
     * @return
     *     possible object is
     *     {@link Appendices.Equipments }
     *     
     */
    public Appendices.Equipments getEquipments() {
        return equipments;
    }

    /**
     * Define el valor de la propiedad equipments.
     * 
     * @param value
     *     allowed object is
     *     {@link Appendices.Equipments }
     *     
     */
    public void setEquipments(Appendices.Equipments value) {
        this.equipments = value;
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
     *         &lt;element name="airline" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airlineV1" maxOccurs="unbounded" minOccurs="0"/>
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
        "airline"
    })
    public static class Airlines {

        protected List<AirlineV1> airline;

        /**
         * Gets the value of the airline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirline().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirlineV1 }
         * 
         * 
         */
        public List<AirlineV1> getAirline() {
            if (airline == null) {
                airline = new ArrayList<AirlineV1>();
            }
            return this.airline;
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
     *         &lt;element name="airport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airportV1" maxOccurs="unbounded" minOccurs="0"/>
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
        "airport"
    })
    public static class Airports {

        protected List<AirportV1> airport;

        /**
         * Gets the value of the airport property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airport property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirport().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirportV1 }
         * 
         * 
         */
        public List<AirportV1> getAirport() {
            if (airport == null) {
                airport = new ArrayList<AirportV1>();
            }
            return this.airport;
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
     *         &lt;element name="equipment" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}equipmentV1" maxOccurs="unbounded" minOccurs="0"/>
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
        "equipment"
    })
    public static class Equipments {

        protected List<EquipmentV1> equipment;

        /**
         * Gets the value of the equipment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the equipment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEquipment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EquipmentV1 }
         * 
         * 
         */
        public List<EquipmentV1> getEquipment() {
            if (equipment == null) {
                equipment = new ArrayList<EquipmentV1>();
            }
            return this.equipment;
        }

    }

}

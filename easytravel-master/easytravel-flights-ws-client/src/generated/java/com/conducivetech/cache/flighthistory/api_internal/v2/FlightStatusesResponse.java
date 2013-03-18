
package com.conducivetech.cache.flighthistory.api_internal.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightStatusesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightStatusesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}responseImpl">
 *       &lt;sequence>
 *         &lt;element name="flightStatuses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightStatus" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightStatusV2" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightStatusesResponse", propOrder = {
    "flightStatuses"
})
@XmlSeeAlso({
    ResponseAirportStatus.class
})
public abstract class FlightStatusesResponse
    extends ResponseImpl
{

    protected FlightStatusesResponse.FlightStatuses flightStatuses;

    /**
     * Obtiene el valor de la propiedad flightStatuses.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusesResponse.FlightStatuses }
     *     
     */
    public FlightStatusesResponse.FlightStatuses getFlightStatuses() {
        return flightStatuses;
    }

    /**
     * Define el valor de la propiedad flightStatuses.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusesResponse.FlightStatuses }
     *     
     */
    public void setFlightStatuses(FlightStatusesResponse.FlightStatuses value) {
        this.flightStatuses = value;
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
     *         &lt;element name="flightStatus" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightStatusV2" maxOccurs="unbounded" minOccurs="0"/>
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
        "flightStatus"
    })
    public static class FlightStatuses {

        protected List<FlightStatusV2> flightStatus;

        /**
         * Gets the value of the flightStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightStatusV2 }
         * 
         * 
         */
        public List<FlightStatusV2> getFlightStatus() {
            if (flightStatus == null) {
                flightStatus = new ArrayList<FlightStatusV2>();
            }
            return this.flightStatus;
        }

    }

}

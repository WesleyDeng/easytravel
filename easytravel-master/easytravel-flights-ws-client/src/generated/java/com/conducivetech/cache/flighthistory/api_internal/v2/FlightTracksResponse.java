
package com.conducivetech.cache.flighthistory.api_internal.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightTracksResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightTracksResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}responseImpl">
 *       &lt;sequence>
 *         &lt;element name="flightTracks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightTrack" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightTrackV2" maxOccurs="unbounded"/>
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
@XmlType(name = "flightTracksResponse", propOrder = {
    "flightTracks"
})
@XmlSeeAlso({
    ResponseAirportTracks.class
})
public abstract class FlightTracksResponse
    extends ResponseImpl
{

    protected FlightTracksResponse.FlightTracks flightTracks;

    /**
     * Obtiene el valor de la propiedad flightTracks.
     * 
     * @return
     *     possible object is
     *     {@link FlightTracksResponse.FlightTracks }
     *     
     */
    public FlightTracksResponse.FlightTracks getFlightTracks() {
        return flightTracks;
    }

    /**
     * Define el valor de la propiedad flightTracks.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTracksResponse.FlightTracks }
     *     
     */
    public void setFlightTracks(FlightTracksResponse.FlightTracks value) {
        this.flightTracks = value;
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
     *         &lt;element name="flightTrack" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightTrackV2" maxOccurs="unbounded"/>
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
        "flightTrack"
    })
    public static class FlightTracks {

        @XmlElement(required = true)
        protected List<FlightTrackV2> flightTrack;

        /**
         * Gets the value of the flightTrack property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightTrack property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightTrack().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightTrackV2 }
         * 
         * 
         */
        public List<FlightTrackV2> getFlightTrack() {
            if (flightTrack == null) {
                flightTrack = new ArrayList<FlightTrackV2>();
            }
            return this.flightTrack;
        }

    }

}


package com.armandorv.easytravel.usersws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para destiny complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="destiny">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flights" type="{http://armandorv.com/easytravel/usersws}flightBooking" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hotels" type="{http://armandorv.com/easytravel/usersws}hotelBooking" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lattitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="next" type="{http://armandorv.com/easytravel/usersws}destiny" minOccurs="0"/>
 *         &lt;element name="previous" type="{http://armandorv.com/easytravel/usersws}destiny" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="travel" type="{http://armandorv.com/easytravel/usersws}travel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "destiny", propOrder = {
    "address",
    "estimatedDate",
    "flights",
    "hotels",
    "lattitude",
    "longitude",
    "name",
    "next",
    "previous",
    "timeZone",
    "travel"
})
public class Destiny {

    protected String address;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDate;
    @XmlElement(nillable = true)
    protected List<FlightBooking> flights;
    @XmlElement(nillable = true)
    protected List<HotelBooking> hotels;
    protected Float lattitude;
    protected Float longitude;
    protected String name;
    protected Destiny next;
    protected Destiny previous;
    protected String timeZone;
    protected Travel travel;

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDate() {
        return estimatedDate;
    }

    /**
     * Define el valor de la propiedad estimatedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDate(XMLGregorianCalendar value) {
        this.estimatedDate = value;
    }

    /**
     * Gets the value of the flights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightBooking }
     * 
     * 
     */
    public List<FlightBooking> getFlights() {
        if (flights == null) {
            flights = new ArrayList<FlightBooking>();
        }
        return this.flights;
    }

    /**
     * Gets the value of the hotels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelBooking }
     * 
     * 
     */
    public List<HotelBooking> getHotels() {
        if (hotels == null) {
            hotels = new ArrayList<HotelBooking>();
        }
        return this.hotels;
    }

    /**
     * Obtiene el valor de la propiedad lattitude.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLattitude() {
        return lattitude;
    }

    /**
     * Define el valor de la propiedad lattitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLattitude(Float value) {
        this.lattitude = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLongitude(Float value) {
        this.longitude = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad next.
     * 
     * @return
     *     possible object is
     *     {@link Destiny }
     *     
     */
    public Destiny getNext() {
        return next;
    }

    /**
     * Define el valor de la propiedad next.
     * 
     * @param value
     *     allowed object is
     *     {@link Destiny }
     *     
     */
    public void setNext(Destiny value) {
        this.next = value;
    }

    /**
     * Obtiene el valor de la propiedad previous.
     * 
     * @return
     *     possible object is
     *     {@link Destiny }
     *     
     */
    public Destiny getPrevious() {
        return previous;
    }

    /**
     * Define el valor de la propiedad previous.
     * 
     * @param value
     *     allowed object is
     *     {@link Destiny }
     *     
     */
    public void setPrevious(Destiny value) {
        this.previous = value;
    }

    /**
     * Obtiene el valor de la propiedad timeZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Define el valor de la propiedad timeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Obtiene el valor de la propiedad travel.
     * 
     * @return
     *     possible object is
     *     {@link Travel }
     *     
     */
    public Travel getTravel() {
        return travel;
    }

    /**
     * Define el valor de la propiedad travel.
     * 
     * @param value
     *     allowed object is
     *     {@link Travel }
     *     
     */
    public void setTravel(Travel value) {
        this.travel = value;
    }

}


package com.armandorv.easytravel.usersws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para hotelBooking complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="hotelBooking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destiny" type="{http://armandorv.com/easytravel/usersws}destiny" minOccurs="0"/>
 *         &lt;element name="hotelInfo" type="{http://armandorv.com/easytravel/usersws}hotelInfo" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="persons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelBooking", propOrder = {
    "destiny",
    "hotelInfo",
    "id",
    "persons"
})
public class HotelBooking {

    protected Destiny destiny;
    protected HotelInfo hotelInfo;
    protected Long id;
    protected Integer persons;

    /**
     * Obtiene el valor de la propiedad destiny.
     * 
     * @return
     *     possible object is
     *     {@link Destiny }
     *     
     */
    public Destiny getDestiny() {
        return destiny;
    }

    /**
     * Define el valor de la propiedad destiny.
     * 
     * @param value
     *     allowed object is
     *     {@link Destiny }
     *     
     */
    public void setDestiny(Destiny value) {
        this.destiny = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelInfo.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfo }
     *     
     */
    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    /**
     * Define el valor de la propiedad hotelInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfo }
     *     
     */
    public void setHotelInfo(HotelInfo value) {
        this.hotelInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad persons.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersons() {
        return persons;
    }

    /**
     * Define el valor de la propiedad persons.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersons(Integer value) {
        this.persons = value;
    }

}

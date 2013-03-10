
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoomAmenity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoomAmenity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amenity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="amenityId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomAmenity", propOrder = {
    "amenity"
})
public class RoomAmenity {

    @XmlElement(required = true)
    protected String amenity;
    @XmlAttribute(name = "amenityId", required = true)
    protected long amenityId;

    /**
     * Obtiene el valor de la propiedad amenity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenity() {
        return amenity;
    }

    /**
     * Define el valor de la propiedad amenity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenity(String value) {
        this.amenity = value;
    }

    /**
     * Obtiene el valor de la propiedad amenityId.
     * 
     */
    public long getAmenityId() {
        return amenityId;
    }

    /**
     * Define el valor de la propiedad amenityId.
     * 
     */
    public void setAmenityId(long value) {
        this.amenityId = value;
    }

}


package com.flightaware.flightxml.soap.flightxml2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrivalStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrivalStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="next_offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arrivals" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrivalFlightStruct" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalStruct", propOrder = {
    "nextOffset",
    "arrivals"
})
public class ArrivalStruct {

    @XmlElement(name = "next_offset")
    protected int nextOffset;
    @XmlElement(required = true)
    protected List<ArrivalFlightStruct> arrivals;

    /**
     * Obtiene el valor de la propiedad nextOffset.
     * 
     */
    public int getNextOffset() {
        return nextOffset;
    }

    /**
     * Define el valor de la propiedad nextOffset.
     * 
     */
    public void setNextOffset(int value) {
        this.nextOffset = value;
    }

    /**
     * Gets the value of the arrivals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrivals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrivalFlightStruct }
     * 
     * 
     */
    public List<ArrivalFlightStruct> getArrivals() {
        if (arrivals == null) {
            arrivals = new ArrayList<ArrivalFlightStruct>();
        }
        return this.arrivals;
    }

}

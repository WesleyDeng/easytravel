
package com.flightaware.flightxml.soap.flightxml2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfAirlineInsightStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAirlineInsightStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://flightxml.flightaware.com/soap/FlightXML2}AirlineInsightStruct" maxOccurs="unbounded"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAirlineInsightStruct", propOrder = {
    "data",
    "startDate",
    "endDate"
})
public class ArrayOfAirlineInsightStruct {

    @XmlElement(required = true)
    protected List<AirlineInsightStruct> data;
    @XmlElement(name = "start_date")
    protected int startDate;
    @XmlElement(name = "end_date")
    protected int endDate;

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineInsightStruct }
     * 
     * 
     */
    public List<AirlineInsightStruct> getData() {
        if (data == null) {
            data = new ArrayList<AirlineInsightStruct>();
        }
        return this.data;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     */
    public int getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     */
    public void setStartDate(int value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     */
    public int getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     */
    public void setEndDate(int value) {
        this.endDate = value;
    }

}

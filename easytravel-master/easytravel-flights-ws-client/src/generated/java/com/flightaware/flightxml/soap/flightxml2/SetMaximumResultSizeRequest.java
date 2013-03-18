
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SetMaximumResultSizeRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SetMaximumResultSizeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="max_size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMaximumResultSizeRequest", propOrder = {
    "maxSize"
})
public class SetMaximumResultSizeRequest {

    @XmlElement(name = "max_size")
    protected int maxSize;

    /**
     * Obtiene el valor de la propiedad maxSize.
     * 
     */
    public int getMaxSize() {
        return maxSize;
    }

    /**
     * Define el valor de la propiedad maxSize.
     * 
     */
    public void setMaxSize(int value) {
        this.maxSize = value;
    }

}

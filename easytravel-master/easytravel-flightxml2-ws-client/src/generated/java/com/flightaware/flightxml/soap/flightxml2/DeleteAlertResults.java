
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DeleteAlertResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeleteAlertResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteAlertResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteAlertResults", propOrder = {
    "deleteAlertResult"
})
public class DeleteAlertResults {

    @XmlElement(name = "DeleteAlertResult")
    protected int deleteAlertResult;

    /**
     * Obtiene el valor de la propiedad deleteAlertResult.
     * 
     */
    public int getDeleteAlertResult() {
        return deleteAlertResult;
    }

    /**
     * Define el valor de la propiedad deleteAlertResult.
     * 
     */
    public void setDeleteAlertResult(int value) {
        this.deleteAlertResult = value;
    }

}

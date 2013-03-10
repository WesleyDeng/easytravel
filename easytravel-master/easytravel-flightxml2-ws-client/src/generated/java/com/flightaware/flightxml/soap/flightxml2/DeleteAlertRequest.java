
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DeleteAlertRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeleteAlertRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alert_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteAlertRequest", propOrder = {
    "alertId"
})
public class DeleteAlertRequest {

    @XmlElement(name = "alert_id")
    protected int alertId;

    /**
     * Obtiene el valor de la propiedad alertId.
     * 
     */
    public int getAlertId() {
        return alertId;
    }

    /**
     * Define el valor de la propiedad alertId.
     * 
     */
    public void setAlertId(int value) {
        this.alertId = value;
    }

}

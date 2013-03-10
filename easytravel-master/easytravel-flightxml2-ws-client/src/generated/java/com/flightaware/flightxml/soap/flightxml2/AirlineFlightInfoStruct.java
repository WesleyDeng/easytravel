
package com.flightaware.flightxml.soap.flightxml2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirlineFlightInfoStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineFlightInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faFlightID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeshares" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="tailnumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meal_service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gate_orig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gate_dest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="terminal_orig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="terminal_dest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bag_claim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seats_cabin_first" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seats_cabin_business" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seats_cabin_coach" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineFlightInfoStruct", propOrder = {
    "faFlightID",
    "ident",
    "codeshares",
    "tailnumber",
    "mealService",
    "gateOrig",
    "gateDest",
    "terminalOrig",
    "terminalDest",
    "bagClaim",
    "seatsCabinFirst",
    "seatsCabinBusiness",
    "seatsCabinCoach"
})
public class AirlineFlightInfoStruct {

    @XmlElement(required = true)
    protected String faFlightID;
    @XmlElement(required = true)
    protected String ident;
    @XmlElement(required = true)
    protected List<String> codeshares;
    @XmlElement(required = true)
    protected String tailnumber;
    @XmlElement(name = "meal_service", required = true)
    protected String mealService;
    @XmlElement(name = "gate_orig", required = true)
    protected String gateOrig;
    @XmlElement(name = "gate_dest", required = true)
    protected String gateDest;
    @XmlElement(name = "terminal_orig", required = true)
    protected String terminalOrig;
    @XmlElement(name = "terminal_dest", required = true)
    protected String terminalDest;
    @XmlElement(name = "bag_claim", required = true)
    protected String bagClaim;
    @XmlElement(name = "seats_cabin_first")
    protected int seatsCabinFirst;
    @XmlElement(name = "seats_cabin_business")
    protected int seatsCabinBusiness;
    @XmlElement(name = "seats_cabin_coach")
    protected int seatsCabinCoach;

    /**
     * Obtiene el valor de la propiedad faFlightID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaFlightID() {
        return faFlightID;
    }

    /**
     * Define el valor de la propiedad faFlightID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaFlightID(String value) {
        this.faFlightID = value;
    }

    /**
     * Obtiene el valor de la propiedad ident.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Define el valor de la propiedad ident.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the value of the codeshares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeshares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeshares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodeshares() {
        if (codeshares == null) {
            codeshares = new ArrayList<String>();
        }
        return this.codeshares;
    }

    /**
     * Obtiene el valor de la propiedad tailnumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailnumber() {
        return tailnumber;
    }

    /**
     * Define el valor de la propiedad tailnumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailnumber(String value) {
        this.tailnumber = value;
    }

    /**
     * Obtiene el valor de la propiedad mealService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealService() {
        return mealService;
    }

    /**
     * Define el valor de la propiedad mealService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealService(String value) {
        this.mealService = value;
    }

    /**
     * Obtiene el valor de la propiedad gateOrig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateOrig() {
        return gateOrig;
    }

    /**
     * Define el valor de la propiedad gateOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateOrig(String value) {
        this.gateOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad gateDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateDest() {
        return gateDest;
    }

    /**
     * Define el valor de la propiedad gateDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateDest(String value) {
        this.gateDest = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalOrig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalOrig() {
        return terminalOrig;
    }

    /**
     * Define el valor de la propiedad terminalOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalOrig(String value) {
        this.terminalOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalDest() {
        return terminalDest;
    }

    /**
     * Define el valor de la propiedad terminalDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalDest(String value) {
        this.terminalDest = value;
    }

    /**
     * Obtiene el valor de la propiedad bagClaim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagClaim() {
        return bagClaim;
    }

    /**
     * Define el valor de la propiedad bagClaim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagClaim(String value) {
        this.bagClaim = value;
    }

    /**
     * Obtiene el valor de la propiedad seatsCabinFirst.
     * 
     */
    public int getSeatsCabinFirst() {
        return seatsCabinFirst;
    }

    /**
     * Define el valor de la propiedad seatsCabinFirst.
     * 
     */
    public void setSeatsCabinFirst(int value) {
        this.seatsCabinFirst = value;
    }

    /**
     * Obtiene el valor de la propiedad seatsCabinBusiness.
     * 
     */
    public int getSeatsCabinBusiness() {
        return seatsCabinBusiness;
    }

    /**
     * Define el valor de la propiedad seatsCabinBusiness.
     * 
     */
    public void setSeatsCabinBusiness(int value) {
        this.seatsCabinBusiness = value;
    }

    /**
     * Obtiene el valor de la propiedad seatsCabinCoach.
     * 
     */
    public int getSeatsCabinCoach() {
        return seatsCabinCoach;
    }

    /**
     * Define el valor de la propiedad seatsCabinCoach.
     * 
     */
    public void setSeatsCabinCoach(int value) {
        this.seatsCabinCoach = value;
    }

}

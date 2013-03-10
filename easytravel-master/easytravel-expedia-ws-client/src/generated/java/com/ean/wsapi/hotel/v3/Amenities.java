
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Amenities complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Amenities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessCenter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fitnessCenter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hotTubOnsite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="interAccessAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="childrensActivities" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kitchenOrKitchinette" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="petsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pool" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="restaurantOnsite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="spaOnsite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="whirlPoolBathAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amenities", propOrder = {
    "businessCenter",
    "fitnessCenter",
    "hotTubOnsite",
    "interAccessAvailable",
    "childrensActivities",
    "kitchenOrKitchinette",
    "petsAllowed",
    "pool",
    "restaurantOnsite",
    "spaOnsite",
    "whirlPoolBathAvailable"
})
public class Amenities {

    protected boolean businessCenter;
    protected boolean fitnessCenter;
    protected boolean hotTubOnsite;
    protected boolean interAccessAvailable;
    protected boolean childrensActivities;
    protected boolean kitchenOrKitchinette;
    protected boolean petsAllowed;
    protected boolean pool;
    protected boolean restaurantOnsite;
    protected boolean spaOnsite;
    protected boolean whirlPoolBathAvailable;

    /**
     * Obtiene el valor de la propiedad businessCenter.
     * 
     */
    public boolean isBusinessCenter() {
        return businessCenter;
    }

    /**
     * Define el valor de la propiedad businessCenter.
     * 
     */
    public void setBusinessCenter(boolean value) {
        this.businessCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad fitnessCenter.
     * 
     */
    public boolean isFitnessCenter() {
        return fitnessCenter;
    }

    /**
     * Define el valor de la propiedad fitnessCenter.
     * 
     */
    public void setFitnessCenter(boolean value) {
        this.fitnessCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad hotTubOnsite.
     * 
     */
    public boolean isHotTubOnsite() {
        return hotTubOnsite;
    }

    /**
     * Define el valor de la propiedad hotTubOnsite.
     * 
     */
    public void setHotTubOnsite(boolean value) {
        this.hotTubOnsite = value;
    }

    /**
     * Obtiene el valor de la propiedad interAccessAvailable.
     * 
     */
    public boolean isInterAccessAvailable() {
        return interAccessAvailable;
    }

    /**
     * Define el valor de la propiedad interAccessAvailable.
     * 
     */
    public void setInterAccessAvailable(boolean value) {
        this.interAccessAvailable = value;
    }

    /**
     * Obtiene el valor de la propiedad childrensActivities.
     * 
     */
    public boolean isChildrensActivities() {
        return childrensActivities;
    }

    /**
     * Define el valor de la propiedad childrensActivities.
     * 
     */
    public void setChildrensActivities(boolean value) {
        this.childrensActivities = value;
    }

    /**
     * Obtiene el valor de la propiedad kitchenOrKitchinette.
     * 
     */
    public boolean isKitchenOrKitchinette() {
        return kitchenOrKitchinette;
    }

    /**
     * Define el valor de la propiedad kitchenOrKitchinette.
     * 
     */
    public void setKitchenOrKitchinette(boolean value) {
        this.kitchenOrKitchinette = value;
    }

    /**
     * Obtiene el valor de la propiedad petsAllowed.
     * 
     */
    public boolean isPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Define el valor de la propiedad petsAllowed.
     * 
     */
    public void setPetsAllowed(boolean value) {
        this.petsAllowed = value;
    }

    /**
     * Obtiene el valor de la propiedad pool.
     * 
     */
    public boolean isPool() {
        return pool;
    }

    /**
     * Define el valor de la propiedad pool.
     * 
     */
    public void setPool(boolean value) {
        this.pool = value;
    }

    /**
     * Obtiene el valor de la propiedad restaurantOnsite.
     * 
     */
    public boolean isRestaurantOnsite() {
        return restaurantOnsite;
    }

    /**
     * Define el valor de la propiedad restaurantOnsite.
     * 
     */
    public void setRestaurantOnsite(boolean value) {
        this.restaurantOnsite = value;
    }

    /**
     * Obtiene el valor de la propiedad spaOnsite.
     * 
     */
    public boolean isSpaOnsite() {
        return spaOnsite;
    }

    /**
     * Define el valor de la propiedad spaOnsite.
     * 
     */
    public void setSpaOnsite(boolean value) {
        this.spaOnsite = value;
    }

    /**
     * Obtiene el valor de la propiedad whirlPoolBathAvailable.
     * 
     */
    public boolean isWhirlPoolBathAvailable() {
        return whirlPoolBathAvailable;
    }

    /**
     * Define el valor de la propiedad whirlPoolBathAvailable.
     * 
     */
    public void setWhirlPoolBathAvailable(boolean value) {
        this.whirlPoolBathAvailable = value;
    }

}

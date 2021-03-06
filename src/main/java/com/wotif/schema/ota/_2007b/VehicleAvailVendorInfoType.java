//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.03 at 03:33:27 PM EST 
//


package com.wotif.schema.ota._2007b;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The VehicleAvailVendorInfoType complex type identifies the data that describes supplemental information relevant to a vendor and made available at the time that availability and rates are checked.
 * 
 * <p>Java class for VehicleAvailVendorInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailVendorInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}VendorMessagesType" minOccurs="0"/>
 *         &lt;element name="OffLocServices" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServicePricedType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="PaymentRules" type="{http://www.opentravel.org/OTA/2003/05}PaymentRulesType" minOccurs="0"/>
 *         &lt;element name="LocationDetails" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationDetailsType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="TourInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleTourInfoType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailVendorInfoType", propOrder = {
    "vendorMessages",
    "offLocServices",
    "paymentRules",
    "locationDetails",
    "tourInfo",
    "tpaExtensions"
})
public class VehicleAvailVendorInfoType {

    @XmlElement(name = "VendorMessages")
    protected VendorMessagesType vendorMessages;
    @XmlElement(name = "OffLocServices")
    protected List<OffLocationServicePricedType> offLocServices;
    @XmlElement(name = "PaymentRules")
    protected PaymentRulesType paymentRules;
    @XmlElement(name = "LocationDetails")
    protected List<VehicleLocationDetailsType> locationDetails;
    @XmlElement(name = "TourInfo")
    protected VehicleTourInfoType tourInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;

    /**
     * Gets the value of the vendorMessages property.
     * 
     * @return
     *     possible object is
     *     {@link VendorMessagesType }
     *     
     */
    public VendorMessagesType getVendorMessages() {
        return vendorMessages;
    }

    /**
     * Sets the value of the vendorMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorMessagesType }
     *     
     */
    public void setVendorMessages(VendorMessagesType value) {
        this.vendorMessages = value;
    }

    /**
     * Gets the value of the offLocServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offLocServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffLocServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffLocationServicePricedType }
     * 
     * 
     */
    public List<OffLocationServicePricedType> getOffLocServices() {
        if (offLocServices == null) {
            offLocServices = new ArrayList<OffLocationServicePricedType>();
        }
        return this.offLocServices;
    }

    /**
     * Gets the value of the paymentRules property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRulesType }
     *     
     */
    public PaymentRulesType getPaymentRules() {
        return paymentRules;
    }

    /**
     * Sets the value of the paymentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRulesType }
     *     
     */
    public void setPaymentRules(PaymentRulesType value) {
        this.paymentRules = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLocationDetailsType }
     * 
     * 
     */
    public List<VehicleLocationDetailsType> getLocationDetails() {
        if (locationDetails == null) {
            locationDetails = new ArrayList<VehicleLocationDetailsType>();
        }
        return this.locationDetails;
    }

    /**
     * Gets the value of the tourInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTourInfoType }
     *     
     */
    public VehicleTourInfoType getTourInfo() {
        return tourInfo;
    }

    /**
     * Sets the value of the tourInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTourInfoType }
     *     
     */
    public void setTourInfo(VehicleTourInfoType value) {
        this.tourInfo = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensions }
     *     
     */
    public TPAExtensions getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensions }
     *     
     */
    public void setTPAExtensions(TPAExtensions value) {
        this.tpaExtensions = value;
    }

}

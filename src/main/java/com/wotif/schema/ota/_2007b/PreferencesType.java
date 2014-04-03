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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Needs of the traveler related to travel experiences.
 * 
 * <p>Java class for PreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrefCollection" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CommonPref" type="{http://www.opentravel.org/OTA/2003/05}CommonPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="VehicleRentalPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleProfileRentalPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AirlinePref" type="{http://www.opentravel.org/OTA/2003/05}AirlinePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="HotelPref" type="{http://www.opentravel.org/OTA/2003/05}HotelPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OtherSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}OtherSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *                 &lt;attribute name="TravelPurpose" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferencesType", propOrder = {
    "prefCollections"
})
public class PreferencesType {

    @XmlElement(name = "PrefCollection", required = true)
    protected List<PreferencesType.PrefCollection> prefCollections;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

    /**
     * Gets the value of the prefCollections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefCollections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefCollections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferencesType.PrefCollection }
     * 
     * 
     */
    public List<PreferencesType.PrefCollection> getPrefCollections() {
        if (prefCollections == null) {
            prefCollections = new ArrayList<PreferencesType.PrefCollection>();
        }
        return this.prefCollections;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CommonPref" type="{http://www.opentravel.org/OTA/2003/05}CommonPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="VehicleRentalPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleProfileRentalPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AirlinePref" type="{http://www.opentravel.org/OTA/2003/05}AirlinePrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="HotelPref" type="{http://www.opentravel.org/OTA/2003/05}HotelPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OtherSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}OtherSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
     *       &lt;attribute name="TravelPurpose" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "commonPrefs",
        "vehicleRentalPrefs",
        "airlinePrefs",
        "hotelPrefs",
        "otherSrvcPrefs",
        "tpaExtensions"
    })
    public static class PrefCollection {

        @XmlElement(name = "CommonPref")
        protected List<CommonPrefType> commonPrefs;
        @XmlElement(name = "VehicleRentalPref")
        protected List<VehicleProfileRentalPrefType> vehicleRentalPrefs;
        @XmlElement(name = "AirlinePref")
        protected List<AirlinePrefType> airlinePrefs;
        @XmlElement(name = "HotelPref")
        protected List<HotelPrefType> hotelPrefs;
        @XmlElement(name = "OtherSrvcPref")
        protected List<OtherSrvcPrefType> otherSrvcPrefs;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensions tpaExtensions;
        @XmlAttribute(name = "TravelPurpose")
        protected String travelPurpose;
        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;

        /**
         * Gets the value of the commonPrefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commonPrefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommonPrefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommonPrefType }
         * 
         * 
         */
        public List<CommonPrefType> getCommonPrefs() {
            if (commonPrefs == null) {
                commonPrefs = new ArrayList<CommonPrefType>();
            }
            return this.commonPrefs;
        }

        /**
         * Gets the value of the vehicleRentalPrefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleRentalPrefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleRentalPrefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleProfileRentalPrefType }
         * 
         * 
         */
        public List<VehicleProfileRentalPrefType> getVehicleRentalPrefs() {
            if (vehicleRentalPrefs == null) {
                vehicleRentalPrefs = new ArrayList<VehicleProfileRentalPrefType>();
            }
            return this.vehicleRentalPrefs;
        }

        /**
         * Gets the value of the airlinePrefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlinePrefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlinePrefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirlinePrefType }
         * 
         * 
         */
        public List<AirlinePrefType> getAirlinePrefs() {
            if (airlinePrefs == null) {
                airlinePrefs = new ArrayList<AirlinePrefType>();
            }
            return this.airlinePrefs;
        }

        /**
         * Gets the value of the hotelPrefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelPrefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelPrefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelPrefType }
         * 
         * 
         */
        public List<HotelPrefType> getHotelPrefs() {
            if (hotelPrefs == null) {
                hotelPrefs = new ArrayList<HotelPrefType>();
            }
            return this.hotelPrefs;
        }

        /**
         * Gets the value of the otherSrvcPrefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherSrvcPrefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherSrvcPrefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherSrvcPrefType }
         * 
         * 
         */
        public List<OtherSrvcPrefType> getOtherSrvcPrefs() {
            if (otherSrvcPrefs == null) {
                otherSrvcPrefs = new ArrayList<OtherSrvcPrefType>();
            }
            return this.otherSrvcPrefs;
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

        /**
         * Gets the value of the travelPurpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelPurpose() {
            return travelPurpose;
        }

        /**
         * Sets the value of the travelPurpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelPurpose(String value) {
            this.travelPurpose = value;
        }

        /**
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

    }

}

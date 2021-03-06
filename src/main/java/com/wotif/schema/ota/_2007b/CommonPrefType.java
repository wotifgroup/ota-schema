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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identifies preferences for common travel needs not associated with a specific travel service.
 * 
 * <p>Java class for CommonPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamePref" type="{http://www.opentravel.org/OTA/2003/05}NamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhonePref" type="{http://www.opentravel.org/OTA/2003/05}PhonePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressPref" type="{http://www.opentravel.org/OTA/2003/05}AddressPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" type="{http://www.opentravel.org/OTA/2003/05}PaymentFormPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InterestPref" type="{http://www.opentravel.org/OTA/2003/05}InterestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InsurancePref" type="{http://www.opentravel.org/OTA/2003/05}InsurancePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatingPref" type="{http://www.opentravel.org/OTA/2003/05}SeatingPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TicketDistribPref" type="{http://www.opentravel.org/OTA/2003/05}TicketDistribPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MediaEntertainPref" type="{http://www.opentravel.org/OTA/2003/05}MediaEntertainPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PetInfoPref" type="{http://www.opentravel.org/OTA/2003/05}PetInfoPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://www.opentravel.org/OTA/2003/05}MealPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyPref" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://www.opentravel.org/OTA/2003/05}SpecRequestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedTravelerPref" type="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrimaryLangID_Group"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AltLangID_Group"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SmokingIndicatorGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonPrefType", propOrder = {
    "namePrefs",
    "phonePrefs",
    "addressPrefs",
    "paymentFormPrefs",
    "interestPrefs",
    "insurancePrefs",
    "seatingPrefs",
    "ticketDistribPrefs",
    "mediaEntertainPrefs",
    "petInfoPrefs",
    "mealPrefs",
    "loyaltyPrefs",
    "specRequestPrefs",
    "relatedTravelerPrefs",
    "tpaExtensions"
})
public class CommonPrefType {

    @XmlElement(name = "NamePref")
    protected List<NamePrefType> namePrefs;
    @XmlElement(name = "PhonePref")
    protected List<PhonePrefType> phonePrefs;
    @XmlElement(name = "AddressPref")
    protected List<AddressPrefType> addressPrefs;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPrefType> paymentFormPrefs;
    @XmlElement(name = "InterestPref")
    protected List<InterestPrefType> interestPrefs;
    @XmlElement(name = "InsurancePref")
    protected List<InsurancePrefType> insurancePrefs;
    @XmlElement(name = "SeatingPref")
    protected List<SeatingPrefType> seatingPrefs;
    @XmlElement(name = "TicketDistribPref")
    protected List<TicketDistribPrefType> ticketDistribPrefs;
    @XmlElement(name = "MediaEntertainPref")
    protected List<MediaEntertainPrefType> mediaEntertainPrefs;
    @XmlElement(name = "PetInfoPref")
    protected List<PetInfoPrefType> petInfoPrefs;
    @XmlElement(name = "MealPref")
    protected List<MealPrefType> mealPrefs;
    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPrefType> loyaltyPrefs;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPrefType> specRequestPrefs;
    @XmlElement(name = "RelatedTravelerPref")
    protected List<RelatedTravelerPrefType> relatedTravelerPrefs;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;

    /**
     * Gets the value of the namePrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namePrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamePrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamePrefType }
     * 
     * 
     */
    public List<NamePrefType> getNamePrefs() {
        if (namePrefs == null) {
            namePrefs = new ArrayList<NamePrefType>();
        }
        return this.namePrefs;
    }

    /**
     * Gets the value of the phonePrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phonePrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhonePrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhonePrefType }
     * 
     * 
     */
    public List<PhonePrefType> getPhonePrefs() {
        if (phonePrefs == null) {
            phonePrefs = new ArrayList<PhonePrefType>();
        }
        return this.phonePrefs;
    }

    /**
     * Gets the value of the addressPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressPrefType }
     * 
     * 
     */
    public List<AddressPrefType> getAddressPrefs() {
        if (addressPrefs == null) {
            addressPrefs = new ArrayList<AddressPrefType>();
        }
        return this.addressPrefs;
    }

    /**
     * Gets the value of the paymentFormPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormPrefType }
     * 
     * 
     */
    public List<PaymentFormPrefType> getPaymentFormPrefs() {
        if (paymentFormPrefs == null) {
            paymentFormPrefs = new ArrayList<PaymentFormPrefType>();
        }
        return this.paymentFormPrefs;
    }

    /**
     * Gets the value of the interestPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestPrefType }
     * 
     * 
     */
    public List<InterestPrefType> getInterestPrefs() {
        if (interestPrefs == null) {
            interestPrefs = new ArrayList<InterestPrefType>();
        }
        return this.interestPrefs;
    }

    /**
     * Gets the value of the insurancePrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurancePrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurancePrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsurancePrefType }
     * 
     * 
     */
    public List<InsurancePrefType> getInsurancePrefs() {
        if (insurancePrefs == null) {
            insurancePrefs = new ArrayList<InsurancePrefType>();
        }
        return this.insurancePrefs;
    }

    /**
     * Gets the value of the seatingPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatingPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatingPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatingPrefType }
     * 
     * 
     */
    public List<SeatingPrefType> getSeatingPrefs() {
        if (seatingPrefs == null) {
            seatingPrefs = new ArrayList<SeatingPrefType>();
        }
        return this.seatingPrefs;
    }

    /**
     * Gets the value of the ticketDistribPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDistribPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDistribPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDistribPrefType }
     * 
     * 
     */
    public List<TicketDistribPrefType> getTicketDistribPrefs() {
        if (ticketDistribPrefs == null) {
            ticketDistribPrefs = new ArrayList<TicketDistribPrefType>();
        }
        return this.ticketDistribPrefs;
    }

    /**
     * Gets the value of the mediaEntertainPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaEntertainPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaEntertainPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaEntertainPrefType }
     * 
     * 
     */
    public List<MediaEntertainPrefType> getMediaEntertainPrefs() {
        if (mediaEntertainPrefs == null) {
            mediaEntertainPrefs = new ArrayList<MediaEntertainPrefType>();
        }
        return this.mediaEntertainPrefs;
    }

    /**
     * Gets the value of the petInfoPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petInfoPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetInfoPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PetInfoPrefType }
     * 
     * 
     */
    public List<PetInfoPrefType> getPetInfoPrefs() {
        if (petInfoPrefs == null) {
            petInfoPrefs = new ArrayList<PetInfoPrefType>();
        }
        return this.petInfoPrefs;
    }

    /**
     * Gets the value of the mealPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MealPrefType }
     * 
     * 
     */
    public List<MealPrefType> getMealPrefs() {
        if (mealPrefs == null) {
            mealPrefs = new ArrayList<MealPrefType>();
        }
        return this.mealPrefs;
    }

    /**
     * Gets the value of the loyaltyPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPrefType }
     * 
     * 
     */
    public List<LoyaltyPrefType> getLoyaltyPrefs() {
        if (loyaltyPrefs == null) {
            loyaltyPrefs = new ArrayList<LoyaltyPrefType>();
        }
        return this.loyaltyPrefs;
    }

    /**
     * Gets the value of the specRequestPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specRequestPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecRequestPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecRequestPrefType }
     * 
     * 
     */
    public List<SpecRequestPrefType> getSpecRequestPrefs() {
        if (specRequestPrefs == null) {
            specRequestPrefs = new ArrayList<SpecRequestPrefType>();
        }
        return this.specRequestPrefs;
    }

    /**
     * Gets the value of the relatedTravelerPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTravelerPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTravelerPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedTravelerPrefType }
     * 
     * 
     */
    public List<RelatedTravelerPrefType> getRelatedTravelerPrefs() {
        if (relatedTravelerPrefs == null) {
            relatedTravelerPrefs = new ArrayList<RelatedTravelerPrefType>();
        }
        return this.relatedTravelerPrefs;
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
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

}

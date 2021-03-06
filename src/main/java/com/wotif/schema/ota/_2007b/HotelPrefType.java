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
 * These are the hotel preference elements used on an instance of a profile.
 * 
 * <p>Java class for HotelPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPref" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" type="{http://www.opentravel.org/OTA/2003/05}PaymentFormPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelChainPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyNamePref" type="{http://www.opentravel.org/OTA/2003/05}PropertyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyLocationPref" type="{http://www.opentravel.org/OTA/2003/05}PropertyLocationPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyTypePref" type="{http://www.opentravel.org/OTA/2003/05}PropertyTypePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyClassPref" type="{http://www.opentravel.org/OTA/2003/05}PropertyClassPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyAmenityPref" type="{http://www.opentravel.org/OTA/2003/05}PropertyAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomAmenityPref" type="{http://www.opentravel.org/OTA/2003/05}RoomAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomLocationPref" type="{http://www.opentravel.org/OTA/2003/05}RoomLocationPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BedTypePref" type="{http://www.opentravel.org/OTA/2003/05}BedTypePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FoodSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}FoodSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MediaEntertainPref" type="{http://www.opentravel.org/OTA/2003/05}MediaEntertainPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PetInfoPref" type="{http://www.opentravel.org/OTA/2003/05}PetInfoPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://www.opentravel.org/OTA/2003/05}MealPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecreationSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}RecreationSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}BusinessSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonalSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}PersonalSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SecurityFeaturePref" type="{http://www.opentravel.org/OTA/2003/05}SecurityFeaturePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysChallFeaturePref" type="{http://www.opentravel.org/OTA/2003/05}PhysChallFeaturePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://www.opentravel.org/OTA/2003/05}SpecRequestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SmokingIndicatorGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *       &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *       &lt;attribute name="HotelGuestType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPrefType", propOrder = {
    "loyaltyPrefs",
    "paymentFormPrefs",
    "hotelChainPrefs",
    "propertyNamePrefs",
    "propertyLocationPrefs",
    "propertyTypePrefs",
    "propertyClassPrefs",
    "propertyAmenityPrefs",
    "roomAmenityPrefs",
    "roomLocationPrefs",
    "bedTypePrefs",
    "foodSrvcPrefs",
    "mediaEntertainPrefs",
    "petInfoPrefs",
    "mealPrefs",
    "recreationSrvcPrefs",
    "businessSrvcPrefs",
    "personalSrvcPrefs",
    "securityFeaturePrefs",
    "physChallFeaturePrefs",
    "specRequestPrefs",
    "tpaExtensions"
})
public class HotelPrefType {

    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPrefType> loyaltyPrefs;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPrefType> paymentFormPrefs;
    @XmlElement(name = "HotelChainPref")
    protected List<CompanyNamePrefType> hotelChainPrefs;
    @XmlElement(name = "PropertyNamePref")
    protected List<PropertyNamePrefType> propertyNamePrefs;
    @XmlElement(name = "PropertyLocationPref")
    protected List<PropertyLocationPrefType> propertyLocationPrefs;
    @XmlElement(name = "PropertyTypePref")
    protected List<PropertyTypePrefType> propertyTypePrefs;
    @XmlElement(name = "PropertyClassPref")
    protected List<PropertyClassPrefType> propertyClassPrefs;
    @XmlElement(name = "PropertyAmenityPref")
    protected List<PropertyAmenityPrefType> propertyAmenityPrefs;
    @XmlElement(name = "RoomAmenityPref")
    protected List<RoomAmenityPrefType> roomAmenityPrefs;
    @XmlElement(name = "RoomLocationPref")
    protected List<RoomLocationPrefType> roomLocationPrefs;
    @XmlElement(name = "BedTypePref")
    protected List<BedTypePrefType> bedTypePrefs;
    @XmlElement(name = "FoodSrvcPref")
    protected List<FoodSrvcPrefType> foodSrvcPrefs;
    @XmlElement(name = "MediaEntertainPref")
    protected List<MediaEntertainPrefType> mediaEntertainPrefs;
    @XmlElement(name = "PetInfoPref")
    protected List<PetInfoPrefType> petInfoPrefs;
    @XmlElement(name = "MealPref")
    protected List<MealPrefType> mealPrefs;
    @XmlElement(name = "RecreationSrvcPref")
    protected List<RecreationSrvcPrefType> recreationSrvcPrefs;
    @XmlElement(name = "BusinessSrvcPref")
    protected List<BusinessSrvcPrefType> businessSrvcPrefs;
    @XmlElement(name = "PersonalSrvcPref")
    protected List<PersonalSrvcPrefType> personalSrvcPrefs;
    @XmlElement(name = "SecurityFeaturePref")
    protected List<SecurityFeaturePrefType> securityFeaturePrefs;
    @XmlElement(name = "PhysChallFeaturePref")
    protected List<PhysChallFeaturePrefType> physChallFeaturePrefs;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPrefType> specRequestPrefs;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "HotelGuestType")
    protected String hotelGuestType;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

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
     * Gets the value of the hotelChainPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelChainPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelChainPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNamePrefType }
     * 
     * 
     */
    public List<CompanyNamePrefType> getHotelChainPrefs() {
        if (hotelChainPrefs == null) {
            hotelChainPrefs = new ArrayList<CompanyNamePrefType>();
        }
        return this.hotelChainPrefs;
    }

    /**
     * Gets the value of the propertyNamePrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyNamePrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyNamePrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyNamePrefType }
     * 
     * 
     */
    public List<PropertyNamePrefType> getPropertyNamePrefs() {
        if (propertyNamePrefs == null) {
            propertyNamePrefs = new ArrayList<PropertyNamePrefType>();
        }
        return this.propertyNamePrefs;
    }

    /**
     * Gets the value of the propertyLocationPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyLocationPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyLocationPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyLocationPrefType }
     * 
     * 
     */
    public List<PropertyLocationPrefType> getPropertyLocationPrefs() {
        if (propertyLocationPrefs == null) {
            propertyLocationPrefs = new ArrayList<PropertyLocationPrefType>();
        }
        return this.propertyLocationPrefs;
    }

    /**
     * Gets the value of the propertyTypePrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyTypePrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyTypePrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyTypePrefType }
     * 
     * 
     */
    public List<PropertyTypePrefType> getPropertyTypePrefs() {
        if (propertyTypePrefs == null) {
            propertyTypePrefs = new ArrayList<PropertyTypePrefType>();
        }
        return this.propertyTypePrefs;
    }

    /**
     * Gets the value of the propertyClassPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyClassPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyClassPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyClassPrefType }
     * 
     * 
     */
    public List<PropertyClassPrefType> getPropertyClassPrefs() {
        if (propertyClassPrefs == null) {
            propertyClassPrefs = new ArrayList<PropertyClassPrefType>();
        }
        return this.propertyClassPrefs;
    }

    /**
     * Gets the value of the propertyAmenityPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyAmenityPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyAmenityPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyAmenityPrefType }
     * 
     * 
     */
    public List<PropertyAmenityPrefType> getPropertyAmenityPrefs() {
        if (propertyAmenityPrefs == null) {
            propertyAmenityPrefs = new ArrayList<PropertyAmenityPrefType>();
        }
        return this.propertyAmenityPrefs;
    }

    /**
     * Gets the value of the roomAmenityPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomAmenityPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomAmenityPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomAmenityPrefType }
     * 
     * 
     */
    public List<RoomAmenityPrefType> getRoomAmenityPrefs() {
        if (roomAmenityPrefs == null) {
            roomAmenityPrefs = new ArrayList<RoomAmenityPrefType>();
        }
        return this.roomAmenityPrefs;
    }

    /**
     * Gets the value of the roomLocationPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomLocationPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomLocationPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomLocationPrefType }
     * 
     * 
     */
    public List<RoomLocationPrefType> getRoomLocationPrefs() {
        if (roomLocationPrefs == null) {
            roomLocationPrefs = new ArrayList<RoomLocationPrefType>();
        }
        return this.roomLocationPrefs;
    }

    /**
     * Gets the value of the bedTypePrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bedTypePrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBedTypePrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BedTypePrefType }
     * 
     * 
     */
    public List<BedTypePrefType> getBedTypePrefs() {
        if (bedTypePrefs == null) {
            bedTypePrefs = new ArrayList<BedTypePrefType>();
        }
        return this.bedTypePrefs;
    }

    /**
     * Gets the value of the foodSrvcPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodSrvcPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodSrvcPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodSrvcPrefType }
     * 
     * 
     */
    public List<FoodSrvcPrefType> getFoodSrvcPrefs() {
        if (foodSrvcPrefs == null) {
            foodSrvcPrefs = new ArrayList<FoodSrvcPrefType>();
        }
        return this.foodSrvcPrefs;
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
     * Gets the value of the recreationSrvcPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recreationSrvcPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecreationSrvcPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecreationSrvcPrefType }
     * 
     * 
     */
    public List<RecreationSrvcPrefType> getRecreationSrvcPrefs() {
        if (recreationSrvcPrefs == null) {
            recreationSrvcPrefs = new ArrayList<RecreationSrvcPrefType>();
        }
        return this.recreationSrvcPrefs;
    }

    /**
     * Gets the value of the businessSrvcPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessSrvcPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessSrvcPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSrvcPrefType }
     * 
     * 
     */
    public List<BusinessSrvcPrefType> getBusinessSrvcPrefs() {
        if (businessSrvcPrefs == null) {
            businessSrvcPrefs = new ArrayList<BusinessSrvcPrefType>();
        }
        return this.businessSrvcPrefs;
    }

    /**
     * Gets the value of the personalSrvcPrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalSrvcPrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalSrvcPrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalSrvcPrefType }
     * 
     * 
     */
    public List<PersonalSrvcPrefType> getPersonalSrvcPrefs() {
        if (personalSrvcPrefs == null) {
            personalSrvcPrefs = new ArrayList<PersonalSrvcPrefType>();
        }
        return this.personalSrvcPrefs;
    }

    /**
     * Gets the value of the securityFeaturePrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityFeaturePrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityFeaturePrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityFeaturePrefType }
     * 
     * 
     */
    public List<SecurityFeaturePrefType> getSecurityFeaturePrefs() {
        if (securityFeaturePrefs == null) {
            securityFeaturePrefs = new ArrayList<SecurityFeaturePrefType>();
        }
        return this.securityFeaturePrefs;
    }

    /**
     * Gets the value of the physChallFeaturePrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physChallFeaturePrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysChallFeaturePrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysChallFeaturePrefType }
     * 
     * 
     */
    public List<PhysChallFeaturePrefType> getPhysChallFeaturePrefs() {
        if (physChallFeaturePrefs == null) {
            physChallFeaturePrefs = new ArrayList<PhysChallFeaturePrefType>();
        }
        return this.physChallFeaturePrefs;
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
     * Gets the value of the ratePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Sets the value of the ratePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Gets the value of the hotelGuestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelGuestType() {
        return hotelGuestType;
    }

    /**
     * Sets the value of the hotelGuestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelGuestType(String value) {
        this.hotelGuestType = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        if (preferLevel == null) {
            return PreferLevelType.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
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

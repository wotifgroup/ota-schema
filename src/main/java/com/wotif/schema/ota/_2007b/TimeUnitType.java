//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.03 at 03:33:27 PM EST 
//


package com.wotif.schema.ota._2007b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeUnitType">
 *   &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to16">
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Second"/>
 *     &lt;enumeration value="FullDuration"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeUnitType")
@XmlEnum
public enum TimeUnitType {

    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),
    @XmlEnumValue("Second")
    SECOND("Second"),
    @XmlEnumValue("FullDuration")
    FULL_DURATION("FullDuration");
    private final String value;

    TimeUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeUnitType fromValue(String v) {
        for (TimeUnitType c: TimeUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

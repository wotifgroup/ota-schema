package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.MessageAcknowledgementType;

import javax.xml.bind.annotation.XmlElement;

public class BookingRuleNotificationResponseBody {

    @XmlElement(name = "OTA_HotelBookingRuleNotifRS", namespace = "http://www.opentravel.org/OTA/2003/05")
    private MessageAcknowledgementType otaHotelBookingRuleNotifRS;

    public BookingRuleNotificationResponseBody() {
    }

    public BookingRuleNotificationResponseBody(MessageAcknowledgementType otaHotelBookingRuleNotifRS) {
        this.otaHotelBookingRuleNotifRS = otaHotelBookingRuleNotifRS;
    }

    public MessageAcknowledgementType getOtaHotelBookingRuleNotifRS() {
        return otaHotelBookingRuleNotifRS;
    }

}

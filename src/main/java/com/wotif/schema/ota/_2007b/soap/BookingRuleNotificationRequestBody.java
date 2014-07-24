package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTAHotelBookingRuleNotifRQ;

import javax.xml.bind.annotation.XmlElement;

public class BookingRuleNotificationRequestBody {

    @XmlElement(name = "OTA_HotelBookingRuleNotifRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAHotelBookingRuleNotifRQ otaHotelBookingRuleNotifRQ;

    public BookingRuleNotificationRequestBody() {
    }

    public OTAHotelBookingRuleNotifRQ getOtaHotelBookingRuleNotifRQ() {
        return otaHotelBookingRuleNotifRQ;
    }

}

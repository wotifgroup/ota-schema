package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.MessageAcknowledgementType;
import com.wotif.schema.ota._2007b.OTAHotelRatePlanNotifRS;

import javax.xml.bind.annotation.XmlElement;

public class RatePlanNotificationResponseBody {

    @XmlElement(name = "OTA_HotelRatePlanNotifRS", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAHotelRatePlanNotifRS otaHotelRatePlanNotifRS;

    public RatePlanNotificationResponseBody() {
    }

    public RatePlanNotificationResponseBody(OTAHotelRatePlanNotifRS otaHotelRatePlanNotifRS) {
        this.otaHotelRatePlanNotifRS = otaHotelRatePlanNotifRS;
    }

    public OTAHotelRatePlanNotifRS getOtaHotelRatePlanNotifRS() {
        return otaHotelRatePlanNotifRS;
    }

}

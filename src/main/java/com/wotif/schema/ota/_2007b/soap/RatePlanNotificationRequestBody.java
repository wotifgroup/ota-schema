package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTAHotelRatePlanNotifRQ;

import javax.xml.bind.annotation.XmlElement;

public class RatePlanNotificationRequestBody {

    @XmlElement(name = "OTA_HotelRatePlanNotifRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAHotelRatePlanNotifRQ otaHotelRatePlanNotifRQ;

    public RatePlanNotificationRequestBody() {
    }

    public OTAHotelRatePlanNotifRQ getOtaHotelRatePlanNotifRQ() {
        return otaHotelRatePlanNotifRQ;
    }

}

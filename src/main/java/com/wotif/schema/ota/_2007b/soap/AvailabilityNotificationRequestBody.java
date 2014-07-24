package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTAHotelAvailNotifRQ;
import com.wotif.schema.ota._2007b.OTAHotelAvailRQ;

import javax.xml.bind.annotation.XmlElement;

public class AvailabilityNotificationRequestBody {

    @XmlElement(name = "OTA_HotelAvailNotifRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAHotelAvailNotifRQ otaHotelAvailNotifRQ;

    public AvailabilityNotificationRequestBody() {
    }

    public OTAHotelAvailNotifRQ getOtaHotelAvailNotifRQ() {
        return otaHotelAvailNotifRQ;
    }

}

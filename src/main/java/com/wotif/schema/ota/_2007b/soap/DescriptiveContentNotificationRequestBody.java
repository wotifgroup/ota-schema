package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTAHotelDescriptiveContentNotifRQ;

import javax.xml.bind.annotation.XmlElement;

public class DescriptiveContentNotificationRequestBody {

    @XmlElement(name = "OTA_HotelDescriptiveContentNotifRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAHotelDescriptiveContentNotifRQ otaHotelDescriptiveContentNotifRQ;

    public DescriptiveContentNotificationRequestBody() {
    }

    public OTAHotelDescriptiveContentNotifRQ getOtaHotelDescriptiveContentNotifRQ() {
        return otaHotelDescriptiveContentNotifRQ;
    }

}

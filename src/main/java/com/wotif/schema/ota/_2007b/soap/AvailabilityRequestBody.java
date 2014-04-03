package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTAHotelAvailRQ;

import javax.xml.bind.annotation.XmlElement;

public class AvailabilityRequestBody {

    @XmlElement(name = "OTA_HotelAvailRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAHotelAvailRQ otaHotelAvailRQ;

    public AvailabilityRequestBody() {
    }

    public OTAHotelAvailRQ getOtaHotelAvailRQ() {
        return otaHotelAvailRQ;
    }

}

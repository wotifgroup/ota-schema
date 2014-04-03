package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTAHotelAvailRS;

import javax.xml.bind.annotation.XmlElement;

public class AvailabilityResponseBody {

    @XmlElement(name = "OTA_HotelAvailRS", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAHotelAvailRS otaHotelAvailRS;

    public OTAHotelAvailRS getOtaHotelAvailRS() {
        return otaHotelAvailRS;
    }

}

package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTAHotelResRS;

import javax.xml.bind.annotation.XmlElement;

public class ReservationResponseBody {

    @XmlElement(name = "OTA_HotelResRS", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAHotelResRS otaHotelResRS;

    public ReservationResponseBody(OTAHotelResRS otaHotelResRS) {
        this.otaHotelResRS = otaHotelResRS;
    }

    public OTAHotelResRS getOtaHotelResRS() {
        return otaHotelResRS;
    }
    
}

package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTAHotelResRQ;

import javax.xml.bind.annotation.XmlElement;

public class ReservationRequestBody {

    @XmlElement(name = "OTA_HotelResRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAHotelResRQ otaHotelResRQ;

    public ReservationRequestBody() {
    }

    public OTAHotelResRQ getOtaHotelResRQ() {
        return otaHotelResRQ;
    }

}

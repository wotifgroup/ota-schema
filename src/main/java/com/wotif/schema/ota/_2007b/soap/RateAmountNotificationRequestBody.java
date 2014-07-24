package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTAHotelRateAmountNotifRQ;

import javax.xml.bind.annotation.XmlElement;

public class RateAmountNotificationRequestBody {

    @XmlElement(name = "OTA_HotelRateAmountNotifRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAHotelRateAmountNotifRQ otaHotelRateAmountNotifRQ;

    public RateAmountNotificationRequestBody() {
    }

    public OTAHotelRateAmountNotifRQ getOtaHotelRateAmountNotifRQ() {
        return otaHotelRateAmountNotifRQ;
    }

}

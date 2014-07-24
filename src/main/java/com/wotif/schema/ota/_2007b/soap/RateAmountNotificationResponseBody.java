package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.MessageAcknowledgementType;

import javax.xml.bind.annotation.XmlElement;

public class RateAmountNotificationResponseBody {

    @XmlElement(name = "OTA_HotelRateAmountNotifRS", namespace = "http://www.opentravel.org/OTA/2003/05")
    private MessageAcknowledgementType otaHotelRateAmountNotifRS;

    public RateAmountNotificationResponseBody() {
    }

    public RateAmountNotificationResponseBody(MessageAcknowledgementType otaHotelRateAmountNotifRS) {
        this.otaHotelRateAmountNotifRS = otaHotelRateAmountNotifRS;
    }

    public MessageAcknowledgementType getOtaHotelRateAmountNotifRS() {
        return otaHotelRateAmountNotifRS;
    }

}

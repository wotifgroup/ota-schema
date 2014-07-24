package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.MessageAcknowledgementType;

import javax.xml.bind.annotation.XmlElement;

public class DescriptiveContentNotificationResponseBody {

    @XmlElement(name = "OTA_HotelDescriptiveContentNotifRS", namespace = "http://www.opentravel.org/OTA/2003/05")
    private MessageAcknowledgementType otaHotelDescriptiveContentNotifRS;

    public DescriptiveContentNotificationResponseBody() {
    }

    public DescriptiveContentNotificationResponseBody(MessageAcknowledgementType otaHotelDescriptiveContentNotifRS) {
        this.otaHotelDescriptiveContentNotifRS = otaHotelDescriptiveContentNotifRS;
    }

    public MessageAcknowledgementType getOtaHotelDescriptiveContentNotifRS() {
        return otaHotelDescriptiveContentNotifRS;
    }

}

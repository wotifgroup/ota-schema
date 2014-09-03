////////////////////////////////////////////////////////////////////////////////
//
// Copyright (c) 2014, Wotif.com. All rights reserved.
//
// This is unpublished proprietary source code of Wotif.com.
// The copyright notice above does not evidence any actual or intended
// publication of such source code.
//
////////////////////////////////////////////////////////////////////////////////
package com.wotif.schema.ota._2007b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Marketing")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Marketing", propOrder = { "items" })
public class Marketing {

    @XmlElement(name = "Item")
    private List<Item> items;

    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

}

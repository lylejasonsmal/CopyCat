package com.mugprintz.copycat.data.location;

import com.mugprintz.copycat.domain.Location;

public class TestLocations extends Location {
    public static Location WynbergCentre(){
        return Location.builder()
                .shoppingCentre("Wynberg Centre")
                .floor("Ground Floor")
                .streetNumber("123")
                .streetName("Main Rd.")
                .postalCode("7800")
                .city("Cape Town")
                .state("Western Cape")
                .country("South Africa")
                .uniqueId("LOC-1234-5678-9101")
                .build();
    }
}

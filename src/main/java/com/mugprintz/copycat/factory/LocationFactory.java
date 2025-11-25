package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.Location;
import com.mugprintz.copycat.util.UniqueIDGenerator;

public class LocationFactory {

    public static Location createLocation(String shoppingCentre,String floor, String streetNumber, String streetName, String postalCode, String city, String state, String country) {
        return Location.builder()
                .shoppingCentre(shoppingCentre)
                .floor(floor)
                .streetNumber(streetNumber)
                .streetName(streetName)
                .postalCode(postalCode)
                .city(city)
                .state(state)
                .country(country)
                .uniqueId(UniqueIDGenerator.generateUniqueID())
                .build();
    }
}

package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.Location;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class LocationFactoryTest {

    @Test
    void createLocation() {
        //Act
        Location location = LocationFactory.createLocation("Wynberg Centre", "Ground Level", "123", "Main Rd.", "7900", "Cape Town", "Western Cape", "South Africa");

        //Print for visual inspection
        System.out.println(location);

        //Assertions
        Assertions.assertNotNull(location.getShoppingCentre());
        Assertions.assertEquals("Wynberg Centre", location.getShoppingCentre());

        Assertions.assertNotNull(location.getFloor());
        Assertions.assertEquals("Ground Level", location.getFloor());

        Assertions.assertNotNull(location.getStreetNumber());
        Assertions.assertEquals("123", location.getStreetNumber());

        Assertions.assertNotNull(location.getStreetName());
        Assertions.assertEquals("Main Rd.", location.getStreetName());

        Assertions.assertNotNull(location.getPostalCode());
        Assertions.assertEquals("7900", location.getPostalCode());

        Assertions.assertNotNull(location.getCity());
        Assertions.assertEquals("Cape Town", location.getCity());

        Assertions.assertNotNull(location.getCountry());
        Assertions.assertEquals("South Africa", location.getCountry());

        Assertions.assertNotNull(location.getState());
        Assertions.assertEquals("Western Cape", location.getState());
    }
}
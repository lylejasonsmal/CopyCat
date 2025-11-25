package com.mugprintz.copycat.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UniqueIDGeneratorTest {

    @Test
    void generateUniqueID() {
        //Act
        String uniqueID = UniqueIDGenerator.generateUniqueID();

        //Print for visual inspection
        System.out.println("Generated Unique ID: " + uniqueID);

        //Assertions
        Assertions.assertNotNull(uniqueID);
    }
}
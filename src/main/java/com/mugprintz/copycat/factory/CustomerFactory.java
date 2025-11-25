package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.Customer;
import com.mugprintz.copycat.util.UniqueIDGenerator;

public class CustomerFactory {

    public static Customer createCustomer(String firstName, String lastName, String email) {
        //todo add validation
        return Customer.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .uniqueId(UniqueIDGenerator.generateUniqueID())
                .build();
    }
}

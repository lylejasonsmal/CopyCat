package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerFactoryTest {

    String firstName = "Test";
    String lastName = "Customer";
    String email = "test@customer";

    @Test
    void createCustomerWithAllFieldsPopulated() {
        //Act
        Customer customer = CustomerFactory.createCustomer(firstName, lastName, email);

        //Print for visual inspection
        System.out.println(customer);

        //Assertions
        Assertions.assertNotNull(firstName);
        Assertions.assertEquals(customer.getFirstName(), firstName);

        Assertions.assertNotNull(lastName);
        Assertions.assertEquals(customer.getLastName(), lastName);

        Assertions.assertNotNull(email);
        Assertions.assertEquals(customer.getEmail(), email);

        Assertions.assertNotNull(customer.getUniqueId());
    }
}
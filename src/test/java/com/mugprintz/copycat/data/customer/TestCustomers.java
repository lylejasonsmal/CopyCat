package com.mugprintz.copycat.data.customer;

import com.mugprintz.copycat.domain.Customer;
import com.mugprintz.copycat.factory.CustomerFactory;

public class TestCustomers extends Customer {
    public static Customer AuntySandy() {
        return CustomerFactory.createCustomer("Sandy", "Smith", "sandysmith123@yahoo.com");
    }
}

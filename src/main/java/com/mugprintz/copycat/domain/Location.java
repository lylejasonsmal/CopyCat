package com.mugprintz.copycat.domain;

import com.mugprintz.copycat.domain.interfaces.Address;
import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Location extends Address {
    private long id;
    private String uniqueId;
    private String shoppingCentre;
    private String floor;
    private String streetNumber;
    private String streetName;
    private String postalCode;
    private String city;
    private String state;
    private String country;
}

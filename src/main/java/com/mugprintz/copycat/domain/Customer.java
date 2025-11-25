package com.mugprintz.copycat.domain;

import com.mugprintz.copycat.domain.interfaces.HasID;
import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends HasID {
    private long id;
    private String uniqueId;
    private String firstName;
    private String lastName;
    private String email;
}

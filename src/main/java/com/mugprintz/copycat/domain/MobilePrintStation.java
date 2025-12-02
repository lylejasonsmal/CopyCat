package com.mugprintz.copycat.domain;

import com.mugprintz.copycat.domain.enums.DeviceStatus;
import com.mugprintz.copycat.domain.interfaces.HasID;
import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MobilePrintStation extends HasID {
    private long id;
    private String uniqueId;
    private String name;
    private String email;
    private String ipAddressV4;
    private DeviceStatus status;
    private Printer printer;
    private Location location;
}

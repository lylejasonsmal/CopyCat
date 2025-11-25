package com.mugprintz.copycat.domain;

import com.mugprintz.copycat.domain.enums.DeviceStatus;
import com.mugprintz.copycat.domain.interfaces.HasID;
import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Printer extends HasID {
        private long id;
        private String uniqueId;
        private String name;
        private DeviceStatus status;
        private int paperQuantity;
}

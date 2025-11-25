package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.MobilePrintStation;
import com.mugprintz.copycat.domain.Printer;
import com.mugprintz.copycat.domain.enums.DeviceStatus;
import com.mugprintz.copycat.util.UniqueIDGenerator;

public class MobilePrintStationFactory {

    public static MobilePrintStation createMobilePrintStation(String name, String email, String ipAddress, Printer printer) {
        return MobilePrintStation.builder()
                .email(email)
                .name(name)
                .ipAddressV4(ipAddress)
                .status(DeviceStatus.ONLINE)
                .uniqueId(UniqueIDGenerator.generateUniqueID())
                .printer(printer)
                .build();
    }
}

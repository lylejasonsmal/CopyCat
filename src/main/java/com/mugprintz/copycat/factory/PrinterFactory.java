package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.Printer;
import com.mugprintz.copycat.domain.enums.DeviceStatus;
import com.mugprintz.copycat.util.UniqueIDGenerator;

public class PrinterFactory {

    public static Printer createPrinter(String name, int currentAvailablePaperQuantity, int paperCapacity) {
        return Printer.builder()
                .name(name)
                .currentAvailablePaperQuantity(currentAvailablePaperQuantity)
                .status(DeviceStatus.OFFLINE)
                .uniqueId(UniqueIDGenerator.generateUniqueID())
                .paperCapacity(paperCapacity)
                .build();

    }
}

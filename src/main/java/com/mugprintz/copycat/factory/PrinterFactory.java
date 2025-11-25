package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.Printer;
import com.mugprintz.copycat.domain.enums.DeviceStatus;
import com.mugprintz.copycat.util.UniqueIDGenerator;

public class PrinterFactory {

    public static Printer createPrinter(String name, int paperQuantity) {
        return Printer.builder()
                .name(name)
                .paperQuantity(paperQuantity)
                .status(DeviceStatus.ONLINE)
                .uniqueId(UniqueIDGenerator.generateUniqueID())
                .build();

    }
}

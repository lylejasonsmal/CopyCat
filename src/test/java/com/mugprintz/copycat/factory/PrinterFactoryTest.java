package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.Printer;
import com.mugprintz.copycat.domain.enums.DeviceStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrinterFactoryTest {

    @Test
    void createPrinterWithAllFieldsPopulated() {
        //Act
        Printer printer = PrinterFactory.createPrinter("Samsung-01AB", 10, 99);

        //Print for visual inspection
        System.out.println(printer);

        //Assertions
        Assertions.assertNotNull(printer.getName());
        Assertions.assertEquals("Samsung-01AB", printer.getName());

        Assertions.assertNotNull(printer.getStatus());
        Assertions.assertEquals(DeviceStatus.OFFLINE, printer.getStatus());

        Assertions.assertEquals(10, printer.getCurrentAvailablePaperQuantity());

        Assertions.assertEquals(100, printer.getPaperCapacity());
    }
}
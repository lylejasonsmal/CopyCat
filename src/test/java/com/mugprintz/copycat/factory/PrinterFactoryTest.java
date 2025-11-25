package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.Printer;
import com.mugprintz.copycat.domain.enums.DeviceStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterFactoryTest {

    @Test
    void createPrinterWithAllFieldsPopulated() {
        //Act
        Printer printer = PrinterFactory.createPrinter("Samsung-01AB", 10);

        //Print for visual inspection
        System.out.println(printer);

        //Assertions
        Assertions.assertNotNull(printer.getName());
        Assertions.assertEquals("Samsung-01AB", printer.getName());

        Assertions.assertNotNull(printer.getStatus());
        Assertions.assertEquals(DeviceStatus.ONLINE, printer.getStatus());

        Assertions.assertNotEquals(0, printer.getPaperQuantity());
    }
}
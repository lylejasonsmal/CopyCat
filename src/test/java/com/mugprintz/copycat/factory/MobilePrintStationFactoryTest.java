package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.data.printer.TestPrinters;
import com.mugprintz.copycat.domain.MobilePrintStation;
import com.mugprintz.copycat.domain.enums.DeviceStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilePrintStationFactoryTest {

    private final String name = "Test Mobile Print Station";
    private final String email = "test@station.com";
    private final String ipAddress = "123.456.789.000";

    @Test
    void createMobilePrintStationWithAllFieldsPopulated() {
        //Act
        MobilePrintStation mobilePrintStation = MobilePrintStationFactory.createMobilePrintStation(name, email, ipAddress, TestPrinters.SamsungA500());

        //Print for visual inspection
        System.out.println(mobilePrintStation);

        //Assertions
        assertNotNull(name);
        assertEquals(name, mobilePrintStation.getName());

        assertNotNull(email);
        assertEquals(email, mobilePrintStation.getEmail());

        assertNotNull(ipAddress);
        assertEquals(ipAddress, mobilePrintStation.getIpAddressV4());

        assertNotNull(mobilePrintStation.getStatus());
        assertEquals(DeviceStatus.ONLINE, mobilePrintStation.getStatus());

        assertNotNull(mobilePrintStation.getUniqueId());

        assertNotNull(mobilePrintStation.getPrinter());
        Assertions.assertEquals(TestPrinters.SamsungA500().getUniqueId(), mobilePrintStation.getPrinter().getUniqueId());

    }
}
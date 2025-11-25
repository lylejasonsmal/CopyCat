package com.mugprintz.copycat.data.mobilePrintStations;

import com.mugprintz.copycat.data.printer.TestPrinters;
import com.mugprintz.copycat.domain.MobilePrintStation;
import com.mugprintz.copycat.domain.enums.DeviceStatus;

public class TestMobilePrintStations extends MobilePrintStation {
    public static MobilePrintStation BetaVersion1() {
        return new MobilePrintStation(1000, "MPS-001", "Beta Version 1", "beta@version1.com", "112.123.401.1", DeviceStatus.ONLINE, TestPrinters.SamsungA500());
    }
}

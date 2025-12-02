package com.mugprintz.copycat.data.printer;

import com.mugprintz.copycat.domain.Printer;
import com.mugprintz.copycat.domain.enums.DeviceStatus;

public class TestPrinters extends Printer {
    public static Printer SamsungA500() {
        return new Printer(
                1000,
                "PRN-SAMSUNG-A500",
                "Samsung-A500",
                DeviceStatus.ONLINE,
                100,
                1000
        );
    }
}

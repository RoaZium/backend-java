package com.DI01.toy;

import com.DI01.battery.Battery;
import com.DI01.battery.NormalBattery;

public class ElectronicCarToy {

    private Battery battery;

    public ElectronicCarToy(){
        battery = new NormalBattery();
    }
}

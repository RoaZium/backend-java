package com.spring.DI01.toy;

import com.spring.DI01.battery.NormalBattery;
import com.spring.DI01.battery.Battery;

public class ElectronicCarToy {

    private Battery battery;

    public ElectronicCarToy(){
        battery = new NormalBattery();
    }
}

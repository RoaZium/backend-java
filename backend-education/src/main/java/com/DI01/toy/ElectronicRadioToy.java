package com.DI01.toy;

import com.DI01.battery.Battery;

public class ElectronicRadioToy {

    private Battery battery;

    public ElectronicRadioToy(Battery battery){
        this.battery = battery;
    }

    public void setBattery(Battery battery){
        this.battery = battery;
    }
}

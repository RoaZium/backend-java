package com.spring.DI01.toy;

import com.spring.DI01.battery.Battery;

public class ElectronicRobotToy {

    private Battery battery;

    public ElectronicRobotToy(){

    }

    public void setBattery(Battery battery){
        this.battery = battery;
    }
}

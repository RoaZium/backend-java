package com.spring.DI01;

import com.spring.DI01.toy.ElectronicCarToy;
import com.spring.DI01.toy.ElectronicRobotToy;

public class MainClass {

    public static void main(String[] args){

        ElectronicCarToy carToy = new ElectronicCarToy();
        ElectronicRobotToy robotToy = new ElectronicRobotToy();
    }
}

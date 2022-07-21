package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Device;

public class WashingMachine extends Device {
    public WashingMachine() {
    }

    public WashingMachine(String version, Integer price) {
        super(version, price);
    }
}

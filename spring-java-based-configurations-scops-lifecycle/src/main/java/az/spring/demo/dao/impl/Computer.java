package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Device;

public class Computer extends Device {
    public Computer() {

    }

    public Computer(String version, Integer price) {
        super(version, price);
    }
}

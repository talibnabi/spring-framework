package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Device;

public class Telephone extends Device {

    public Telephone() {
    }

    public Telephone(String version, Integer price) {
        super(version, price);
    }

}

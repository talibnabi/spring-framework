package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Car;
import az.spring.demo.dao.service.Mechanic;

public class Mercedes extends Car implements Mechanic {
    @Override
    public void start() {
        System.out.println("Mercedes start.");
    }

    @Override
    public void speedUp() {
        System.out.println("Mercedes speed up.");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes stop.");
    }
}

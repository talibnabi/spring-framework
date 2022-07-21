package az.spring.demo.dao.impl;

import az.spring.demo.dao.inter.Car;

public class Mercedes implements Car {
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

package az.spring.demo.dao.impl;

import az.spring.demo.dao.inter.Car;

public class Bmw implements Car {
    @Override
    public void start() {
        System.out.println("Bmw start.");
    }

    @Override
    public void speedUp() {
        System.out.println("Bmw speed up.");
    }

    @Override
    public void stop() {
        System.out.println("Bmw stop.");
    }
}

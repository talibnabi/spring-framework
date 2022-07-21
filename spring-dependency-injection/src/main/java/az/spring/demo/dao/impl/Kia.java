package az.spring.demo.dao.impl;

import az.spring.demo.dao.inter.Car;

public class Kia implements Car {
    @Override
    public void start() {
        System.out.println("Kia start.");
    }

    @Override
    public void speedUp() {
        System.out.println("Kia speed up.");
    }

    @Override
    public void stop() {
        System.out.println("Kia stop.");
    }
}

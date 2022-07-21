package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Car;
import az.spring.demo.dao.service.Mechanic;

public class Kia extends Car implements Mechanic {
    public Kia() {
    }

    public Kia(String carVersion, Integer carYear) {
        super(carVersion, carYear);
    }

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

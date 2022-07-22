package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Car;
import az.spring.demo.dao.service.Mechanic;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("bmw")
public class Bmw extends Car implements Mechanic {
    public Bmw() {
    }

    public Bmw(String carVersion, Integer carYear) {
        super(carVersion, carYear);
    }


    @Override
    public void start() {
        System.out.println("bmw start");
    }

    @Override
    public void speedUp() {
        System.out.println("bmw speed up");
    }

    @Override
    public void stop() {
        System.out.println("bmw stop");
    }
}

package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Car;
import az.spring.demo.dao.service.Mechanic;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Kia extends Car implements Mechanic {
    @Override
    public void start() {
        System.out.println("kia start");
    }

    @Override
    public void speedUp() {
        System.out.println("kia speed up");
    }

    @Override
    public void stop() {
        System.out.println("kia stop");
    }

    public Kia() {
    }

    public Kia(String carVersion, Integer carYear) {
        super(carVersion, carYear);
    }


}

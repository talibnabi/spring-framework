package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Car;
import az.spring.demo.dao.service.Mechanic;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Mercedes extends Car implements Mechanic {
    @Override
    public void start() {
        System.out.println("mercedes start");
    }

    @Override
    public void speedUp() {
        System.out.println("mercedes speed up");
    }

    @Override
    public void stop() {
        System.out.println("mercedes stop");
    }
    public Mercedes() {
    }

    public Mercedes(String carVersion, Integer carYear) {
        super(carVersion, carYear);
    }

}

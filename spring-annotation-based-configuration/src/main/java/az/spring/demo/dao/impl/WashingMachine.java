package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Device;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class WashingMachine extends Device {
    public WashingMachine() {
    }

    public WashingMachine(String version, Integer price) {
        super(version, price);
    }

}

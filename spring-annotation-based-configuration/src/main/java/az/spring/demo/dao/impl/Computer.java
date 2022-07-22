package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Device;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("computer")
public class Computer extends Device {
    public Computer() {

    }

    public Computer(String version, Integer price) {
        super(version, price);
    }
}

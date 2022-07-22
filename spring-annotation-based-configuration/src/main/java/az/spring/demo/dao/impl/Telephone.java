package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Device;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Telephone extends Device {

    public Telephone() {
    }

    public Telephone(String version, Integer price) {
        super(version, price);
    }

}

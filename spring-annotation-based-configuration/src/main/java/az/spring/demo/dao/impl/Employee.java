package az.spring.demo.dao.impl;

import az.spring.demo.dao.service.Device;
import az.spring.demo.dao.service.Eat;
import az.spring.demo.dao.service.Human;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
@Component
public class Employee extends Human implements Eat {
    public Employee() {
    }

    public Employee(String name, String surname, Integer age, List<Integer> points, List<Device> devices, Set<Device> deviceSet, Map<Device, Integer> deviceIntegerMap, Properties properties) {
        super(name, surname, age, points, devices, deviceSet, deviceIntegerMap, properties);
    }

    @Override
    public void read() {
        System.out.println("It was read.");
    }

    @Override
    public void write() {
        System.out.println("It was wrote.");
    }

    @Override
    public void result() {
        System.out.println("He has been eaten.");
    }

}

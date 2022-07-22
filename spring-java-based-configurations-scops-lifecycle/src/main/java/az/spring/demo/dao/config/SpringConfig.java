package az.spring.demo.dao.config;

import az.spring.demo.dao.impl.*;
import az.spring.demo.dao.main.Info;
import az.spring.demo.dao.service.Car;
import az.spring.demo.dao.service.Device;
import az.spring.demo.dao.service.Human;
import az.spring.demo.dao.service.Mechanic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.*;

@Configuration
public class SpringConfig {
    @Bean("bmw")
    public Car getBmw() {
        Bmw bmw = new Bmw();
        bmw.setCarVersion("190");
        bmw.setCarYear(2001);
        return bmw;
    }

    @Bean("mercedes")
    public Car getMercedes() {
        Mercedes mercedes = new Mercedes();
        mercedes.setCarVersion("130");
        mercedes.setCarYear(2002);
        return mercedes;
    }

    @Bean("kia")
    public Car getKia() {
        Kia kia = new Kia();
        kia.setCarVersion("200");
        kia.setCarYear(2003);
        return kia;
    }

    @Bean("computer")
    public Device getComputer() {
        Computer computer = new Computer();
        computer.setVersion("110");
        computer.setPrice(30000);
        return computer;
    }

    @Bean("telephone")
    public Device getTelephone() {
        Telephone telephone = new Telephone();
        telephone.setVersion("320");
        telephone.setPrice(40000);
        return telephone;
    }

    @Bean("washing machine")
    public Device getWashingMachine() {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.setVersion("430");
        washingMachine.setPrice(43000);
        return washingMachine;
    }

    @Bean("employee")
    public Human getEmployee(@Qualifier("telephone") Device device, @Qualifier("washing machine") Device device2, @Qualifier("computer") Device device3) {
        Employee employee = new Employee();

        List<Device> devices = new ArrayList<>();
        devices.add(device3);
        devices.add(device);
        devices.add(device2);

        Set<Device> deviceSet = new HashSet<>();
        devices.add(device3);
        devices.add(device);
        devices.add(device2);

        List<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);

        Map<Device, Integer> deviceIntegerMap = new HashMap<>();
        deviceIntegerMap.put(device, 1);
        deviceIntegerMap.put(device2, 2);
        deviceIntegerMap.put(device3, 3);

        Properties properties = new Properties();
        properties.put("url", "jdbc:mysql://localhost:3306/resume");
        properties.put("username", "root");
        properties.put("password", "12345");
        employee.setName("Talib");
        employee.setSurname("Nabi");
        employee.setAge(20);
        employee.setDevices(devices);
        employee.setDevicesSecond(deviceSet);
        employee.setPoints(points);
        employee.setDeviceThird(deviceIntegerMap);
        employee.setDatabaseProperty(properties);
        return employee;
    }

    @Bean(initMethod = "myInit", destroyMethod = "myDestroy", name = "device-info")
    @Scope("singleton")
    public Info getInfoFirst(@Qualifier("telephone") Device device, @Qualifier("washing machine") Device device2, @Qualifier("computer") Device device3, @Qualifier("employee") Human human) {
        Info info = new Info();
        info.setDevice(device);
        info.setDevice(device2);
        info.setDevice(device3);
        info.setHuman(human);
        info.setMechanic((Mechanic) getMercedes());
        info.setMechanic((Mechanic) getKia());
        info.setMechanic((Mechanic) getBmw());
        return info;
    }

    @Bean(initMethod = "myInit", destroyMethod = "myDestroy", name = "car-info")
    @Scope("prototype")
    public Info getInfoSecond(@Qualifier("mercedes") Car car, @Qualifier("kia") Car car2, @Qualifier("bmw") Car car3, @Qualifier("employee") Human human) {
        Info info = new Info();
        info.setHuman(human);
        info.setMechanic((Mechanic) car2);
        info.setMechanic((Mechanic) car3);
        info.setMechanic((Mechanic) car);
        info.setDevice(getTelephone());
        info.setDevice(getComputer());
        info.setDevice(getWashingMachine());
        return info;
    }
}

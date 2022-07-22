package az.spring.demo.dao.main;

import az.spring.demo.dao.service.Car;
import az.spring.demo.dao.service.Device;
import az.spring.demo.dao.service.Human;
import az.spring.demo.dao.service.Mechanic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Info {
    private Mechanic mechanic;

    private Human human;

    private Device device;

    @Autowired
    public Info(@Qualifier("bmw") Mechanic mechanic, @Qualifier("employee") Human human, @Qualifier("computer") Device device) {
        this.mechanic = mechanic;
        this.human = human;
        this.device = device;
    }

    public Info() {
        System.out.println("Hello");
    }

//    @Autowired
//    @Qualifier("bmw")
//    public void setMechanic(Mechanic mechanic) {
//        this.mechanic = mechanic;
//    }
//
//    @Autowired()
//    @Qualifier("employee")
//    public void setHuman(Human human) {
//        this.human = human;
//    }
//
//    @Autowired()
//    @Qualifier("computer")
//    public void setDevice(Device device) {
//        this.device = device;
//    }

    public void sendInfo() {
        this.mechanic.start();
        this.mechanic.speedUp();
        this.mechanic.stop();
        System.out.println("-------------------------------------------------------");
        this.human.read();
        this.human.write();
        System.out.println(this.human.toString());
        System.out.println(this.mechanic.toString());
        System.out.println(this.device.toString());
    }

    //myInit and myDestroy methods are XML Based configuration methods for Lifecycle Callbacks
    @PostConstruct
    public void myInit() {
        System.out.println("my init method worked.");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("my destroy method worked");
    }
}

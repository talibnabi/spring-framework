package az.spring.demo.dao.main;

import az.spring.demo.dao.service.Device;
import az.spring.demo.dao.service.Human;
import az.spring.demo.dao.service.Mechanic;

public class Info {
    private Mechanic mechanic;
    private Human human;
    private Device device;

    public Info(Mechanic mechanic, Human human, Device device) {
        this.mechanic = mechanic;
        this.human = human;
        this.device = device;
    }

    public Info() {
        System.out.println("Hello");
    }


    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

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
    public void myInit() {
        System.out.println("my init method worked.");
    }

    public void myDestroy() {
        System.out.println("my destroy method worked.");
    }
}

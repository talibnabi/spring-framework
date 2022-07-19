package az.spring.demo.main;

import az.spring.demo.impl.Email;
import az.spring.demo.impl.Employee;
import az.spring.demo.impl.Hammer;
import az.spring.demo.inter.Device;
import az.spring.demo.inter.Human;
import az.spring.demo.inter.Message;

import java.util.ArrayList;

public class Notification {
    private Message message;
    private Human employee;

    //    constructor injection
//    public Notification(Message message) {
//        this.message = message;
//    }
//
//    public Notification(Human employee) {
//        this.employee = employee;
//    }
//
//    public Notification(Message message, Human employee) {
//        this.message = message;
//        this.employee = employee;
//    }

    //setter injection
    public void setMessage(Message message) {
        this.message = message;
    }

    public void setEmployee(Human employee) {
        this.employee = employee;
    }


    public void alert() {
        System.out.println("Notifications......");
        message.send();
        Employee human = (Employee) this.employee;
        Hammer hammer1 = (Hammer) human.hammers.get(0);
        hammer1.name = "hammerZor";
        hammer1.version = 999;
        human.hammers.add(new Hammer("first", 1));
        human.hammers.add(new Hammer("second", 2));
        human.hammers.add(new Hammer("third", 3));
        System.out.println(employee.toString());
        employee.send();
    }

}

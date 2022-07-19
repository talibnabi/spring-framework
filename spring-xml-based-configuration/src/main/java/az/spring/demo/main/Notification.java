package az.spring.demo.main;

import az.spring.demo.impl.Email;
import az.spring.demo.inter.Human;
import az.spring.demo.inter.Message;

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
        System.out.println(employee.toString());
        employee.send();
    }

}

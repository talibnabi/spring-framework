package az.spring.demo.main;

import az.spring.demo.inter.Message;

public class Notification {
    private Message message;

//    constructor injection
//    public Notification(Message message) {
//        this.message = message;
//    }

    //setter injection
    public void setMessage(Message message) {
        this.message = message;
    }

    public void alert() {
        System.out.println("Notifications......");
        message.send();
    }
}

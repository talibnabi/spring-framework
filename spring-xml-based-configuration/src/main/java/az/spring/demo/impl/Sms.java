package az.spring.demo.impl;

import az.spring.demo.inter.Message;

public class Sms implements Message {
    @Override
    public void send() {
        System.out.println("Sms was sent successfully");
    }
}

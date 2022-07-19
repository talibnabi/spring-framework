package az.spring.demo.impl;

import az.spring.demo.inter.Message;

public class Email implements Message {
    @Override
    public void send() {
        System.out.println("Email was sent successfully.");
    }
}

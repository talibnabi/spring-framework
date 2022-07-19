package az.spring.demo.impl;

import az.spring.demo.inter.Message;

public class InstagramMessage implements Message {
    @Override
    public void send() {
        System.out.println("Instagram message was sent successfully");
    }
}

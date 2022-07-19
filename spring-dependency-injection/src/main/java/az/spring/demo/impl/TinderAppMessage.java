package az.spring.demo.impl;

import az.spring.demo.inter.Message;

public class TinderAppMessage implements Message {
    @Override
    public void send() {
        System.out.println("Tinder app message was sent successfully");

    }
}

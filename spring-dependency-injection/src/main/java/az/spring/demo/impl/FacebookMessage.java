package az.spring.demo.impl;

import az.spring.demo.inter.Message;

public class FacebookMessage implements Message {
    @Override
    public void send() {
        System.out.println("Facebook message was sent successfully");
    }
}

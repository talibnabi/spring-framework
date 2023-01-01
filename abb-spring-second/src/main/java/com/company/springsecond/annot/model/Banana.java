package com.company.springsecond.annot.model;

import com.company.springsecond.annot.a.Ripe;

@Ripe(level = 80,owner = "Alex")
public class Banana implements Fruit {
    public void eatMe() {
        System.out.println("i am banana");
    }
}

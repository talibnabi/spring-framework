package com.company.springsecond.annot.model;

import com.company.springsecond.annot.a.Good;
import com.company.springsecond.annot.a.Ripe;
import com.company.springsecond.annot.a.RunMe;

@Ripe(level = 90, owner = "Alex")
public class Watermelon implements Fruit {
    @Good
    int x;

    @RunMe
    public void eatMe() {
        System.out.println("I am watermelon");
        System.out.printf("I am ready to %d ", this.getClass().getAnnotation(Ripe.class).level());
    }

    public void doSomething(@Good int x) {
        System.out.printf("This is %d", x);
    }
}

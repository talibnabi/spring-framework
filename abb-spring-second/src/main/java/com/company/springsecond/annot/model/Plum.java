package com.company.springsecond.annot.model;

import com.company.springsecond.annot.a.Ripe;

@Ripe(level = 70,owner = "Amina")
public class Plum implements Fruit{
    public void eatMe(){
        System.out.println("I am plum");
    }
}

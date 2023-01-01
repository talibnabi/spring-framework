package com.company.springsecond.annot.model;


import com.company.springsecond.annot.a.Comment;
import com.company.springsecond.annot.a.Ripe;

@Comment(comment = "bla bla bla", owner = "Alisa")
@Ripe(level = 30, owner = "Salima")
public class Apple implements Fruit {
    public void eatMe(){
        System.out.println("I am apple");
    }
}

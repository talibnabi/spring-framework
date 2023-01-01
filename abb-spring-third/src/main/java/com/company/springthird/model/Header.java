package com.company.springthird.model;


import lombok.Getter;

@Getter
public class Header {
     String name;
     String price;

    public Header(String name, String price) {
        this.name = name;
        this.price = price;
    }
}

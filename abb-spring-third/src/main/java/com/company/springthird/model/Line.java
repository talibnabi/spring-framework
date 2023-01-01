package com.company.springthird.model;

import lombok.Getter;

@Getter
public class Line {
    String name;
    Double price;

    public Line(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String priceFormatted() {
        return String.format("%.3f", price);
    }
}

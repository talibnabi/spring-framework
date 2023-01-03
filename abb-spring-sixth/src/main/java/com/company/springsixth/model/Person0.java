package com.company.springsixth.model;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Person0 {

    @Id
    private Integer id;

    // NEVER EVER USE PRIMITIVES: bool, char, byte, short, int, long, float, double
    // YOU WILL NOT BE ABLE TO DISTINGUISH zero (default value) and data absence
    private int age; // 10, 0 - FAIL

    private String username;

}

package com.company.springfifth.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Airline {

    private UUID id;
    private String name;
    private String code;
    private String country;
}

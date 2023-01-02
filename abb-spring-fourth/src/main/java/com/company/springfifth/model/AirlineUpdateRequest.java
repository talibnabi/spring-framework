package com.company.springfifth.model;


import lombok.Data;

@Data
public class AirlineUpdateRequest {
    private String name;
    private String code;
    private String country;
}

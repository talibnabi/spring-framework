package com.company.springfifth.session;

import lombok.Data;

@Data
public class CustomerDetails {

    public final static String ATTR = "cd";

    private String seat;
    private String firstName;
    private String lastName;
    private String cardNo;

}

package com.company.springfifth2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserData {
    public final static String keyName = "data";

    private String language;
    private Integer screen;

    public static UserData make() {
        return new UserData("German", 1024);
    }
}

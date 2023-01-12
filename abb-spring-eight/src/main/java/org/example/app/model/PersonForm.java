package org.example.app.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PersonForm {

    @NotBlank
    private String name;
    @NotNull
    @Min(18)
    private Integer age;
}

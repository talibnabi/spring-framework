package com.company.springvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.*;


@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "username shouldn't be null")
    @NotEmpty(message = "username shouldn't be empty")
    private String name;

    @Email(message = "invalid email address")
    private String email;

    @NotNull(message = "password shouldn't be null")
    @NotBlank(message = "password shouldn't be blank")
    private String password;

    @NotNull(message = "password shouldn't be null")
    @NotEmpty(message = "password shouldn't be empty")
    @Pattern(regexp = "\\d{10}", message = "invalid mobile number")
    private String mobile;

    private String gender;

    @Min(18)
    private Integer age;

    @NotBlank
    private String nationality;
}

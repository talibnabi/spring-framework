package com.company.springvalidation.entity.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //User name should not be null or empty
    //User name should have at least 2 character
    @NotEmpty
    @Size(min = 5, message = "User name should have at least 2 character")
    @Column(name = "name", nullable = false)
    private String name;

    //Email should be a valid email format
    //Email should be null or empty
    @NotEmpty
    @Email
    @Column(name = "email")
    private String email;

    //Password should not be null or empty
    //Password should have at least 8 characters
    @NotEmpty
    @Size(min = 8, message = "Password should have at least 8 characters")
    @Column(name = "password")
    private String password;

}

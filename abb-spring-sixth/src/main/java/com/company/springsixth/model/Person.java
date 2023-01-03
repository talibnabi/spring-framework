package com.company.springsixth.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "person1")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    private Integer age;

    private Boolean checked;

}

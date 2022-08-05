package com.company.springvalidation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table(name = "users")
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer userId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private Integer age;
    @Column(name = "nationality")
    private String nationality;
}

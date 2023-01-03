package com.company.springseventh4.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long id;

    @Column(name = "p_number")
    private String number;

}

package com.company.springseventh2.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "extra")
public class Extra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "x_id")
    private Long id;

    @Column(name = "x_info")
    private String info;

    @OneToOne
    @MapsId
    private Person person;

}

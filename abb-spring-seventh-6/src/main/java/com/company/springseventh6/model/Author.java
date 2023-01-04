package com.company.springseventh6.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private Integer id;

    @Column(name = "a_name")
    private String name;

    @ManyToMany
    private Set<Book> books;
}

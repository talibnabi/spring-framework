package com.company.springseventh6.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "b_id")
    private Integer id;

    @Column(name = "b_title")
    private String title;

    @ManyToMany
    private Set<Author> authors;

}

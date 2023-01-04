package com.company.springseventh7.model.db;


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

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;

}

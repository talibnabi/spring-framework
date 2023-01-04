package com.company.springseventh7.model.db;

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

    @ManyToMany//(fetch = FetchType.EAGER)
    @JoinTable(name = "ab",
            joinColumns = {
                    @JoinColumn(
                            name = "author_id",
                            referencedColumnName = "a_id") },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "book_id",
                            referencedColumnName = "b_id") }
    )
    private Set<Book> books;

}

package com.company.springseventh7.model.ui;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Book {

    private Integer id;

    private String title;

    private Set<Author> authors;

}

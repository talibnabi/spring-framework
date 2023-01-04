package com.company.springseventh7;

import com.company.springseventh7.model.db.Book;
import com.company.springseventh7.repo.AuthorRepo;
import com.company.springseventh7.repo.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("ab")
@RequiredArgsConstructor
public class AppController {

    private final BookRepo bookRepo;
    private final AuthorRepo authorRepo;

    // http://localhost:8099/ab/books
    @GetMapping("books")
    public List<Book> handle1() {
        List<com.company.springseventh7.model.db.Book> books = bookRepo.findAll();
        return books;
    }
    @GetMapping("books2")
    public List<com.company.springseventh7.model.ui.Book> handle2() {
        List<com.company.springseventh7.model.db.Book> books = bookRepo.findAll();
        return books.stream().map(book -> new com.company.springseventh7.model.ui.Book(book.getId(), book.getTitle(), book.getAuthors().stream().map(a -> new com.company.springseventh7.model.ui.Author(a.getId(), a.getName())).collect(Collectors.toSet()))).collect(Collectors.toList());
    }

}

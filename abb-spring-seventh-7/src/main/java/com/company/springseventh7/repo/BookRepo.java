package com.company.springseventh7.repo;

import com.company.springseventh7.model.db.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo  extends JpaRepository<Book, Integer> {
}

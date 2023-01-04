package com.company.springseventh7.repo;

import com.company.springseventh7.model.db.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
}

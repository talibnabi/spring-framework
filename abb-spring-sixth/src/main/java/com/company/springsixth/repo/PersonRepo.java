package com.company.springsixth.repo;

import com.company.springsixth.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

    // Spring Data - Query Creation
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
    List<Person> findAllByAgeBetweenAndUsernameContaining(int age1, int age2, String part);

    //@Query("SELECT ... FROM ... WHERE X = ? AND Y = ?")
    //List<Person> myCustomQuery(Integer x, Integer y);

}

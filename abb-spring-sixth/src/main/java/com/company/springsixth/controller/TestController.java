package com.company.springsixth.controller;


import com.company.springsixth.model.Person;
import com.company.springsixth.model.PersonCreateRequest;
import com.company.springsixth.repo.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("person")
@RequiredArgsConstructor
public class TestController {

    // ANTI-PATTERN
    // Inject it into the service (not a controller)
    private final PersonRepo repo;
    private final EntityManager em;

    @GetMapping
    public List<Person> handle1() {
        List<Person> data = repo.findAll();
        return data;
    }

    @GetMapping("{id}")
    public ResponseEntity<Person> handle2(@PathVariable Integer id) {
        Optional<Person> data = repo.findById(id);
        return ResponseEntity.of(data);
    }

    @PostMapping
    public void handle3(@RequestBody PersonCreateRequest rq) {
        Person p = new Person();
        // DO NOT SET ID
        p.setUsername(rq.getUsername());
        p.setPassword(rq.getPassword());
        // SQL: INSERT
        repo.save(p);
    }

    @PostMapping("buggy")
    public void handle4(@RequestBody Person p) {
        // INSERT vs UPDATE ???
        p.setId(null); // to guarantee INSERT
        repo.save(p);
    }

    public void test() {
        /** SQL: SELECT */
        Optional<Person> byId = repo.findById(123);
        /** ANTI-PATTERN !!! it fetches ALL the reloads */
        List<Person> all = repo.findAll();

        /**
         * pageSize = 20
         * you want to skip 4 pages ==== SELECT .... FROM .... WHERE .... OFFSET 4 * 20
         * and take only 5th page ==== ................................................ LIMIT 20
         */
        Pageable pageable = Pageable.ofSize(20).withPage(5);
        Page<Person> page = repo.findAll(pageable);

        List<Person> allById = repo.findAllById(Arrays.asList(1, 3, 6, 76, 34));

        /** SQL: DELETE */
        repo.deleteById(1);
        repo.deleteAll();
        repo.deleteAllById(Arrays.asList(1, 3, 6, 76, 34));

        Person p = null;
        /** p.id must be set !!! */
        repo.delete(p);

        /**
         * HOW TO DISTINGUISH
         *   - INSERT (id MUST BE NULL)
         *   - UPDATE (id mustn't be NULL, entity must exist)
         */
        Person p1 = new Person();
        p1.setUsername("Jim");
        p1.setPassword("qwe-123");
        // SQL: INSERT
        repo.save(p1);

        Person p2 = new Person();
        p2.setId(1);
        p2.setUsername("Jim");
        p2.setPassword("qwe-123");
        // SQL: UPDATE
        repo.save(p2);

        Person p11 = new Person();
        p11.setUsername("Jack"); // no id

        Person p21 = new Person();
        p11.setUsername("Jimmy"); // no id

        // after saveAll,
        // List<Person> will contain SAVED entities with IDs
        List<Person> saved = repo.saveAll(Arrays.asList(p11, p21));

        repo.findAllByAgeBetweenAndUsernameContaining(16, 25, "J");

        em.persist(p21);
//        em.find(Person.class, )

    }

}

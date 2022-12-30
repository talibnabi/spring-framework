package com.company.springpractice.controller;


import com.company.springpractice.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {

    @GetMapping("alisa")
    public Person test1() {
        return new Person(2, "Alisai");
    }

    @GetMapping("{personName}")
    public Person test2(@PathVariable("personName") String name) {
        return new Person(44, name);
    }

    @PostMapping
    public Person test3(@RequestBody Person person) {
        System.out.println(person);
        return person;
    }
}

package com.company.controller;

import com.company.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
@RequestMapping("person")
public class PersonController {
    //http:localhost:8099/person
//    @ResponseBody
    @GetMapping
    public Person test11() {
        return new Person(44, "John");
    }

    @GetMapping("{personName}")
    public Person test12(@PathVariable("personName") String name) {
        return new Person(44, name);
    }

    @PostMapping
    public String test13(@RequestBody Person person) {
        System.out.println(person);
        return "Look into the logs...";
    }
}

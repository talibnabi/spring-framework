package com.company.springpractice.controller;


import com.company.springpractice.model.Car;
import com.company.springpractice.model.Hello;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Optional;

@RestController
//@RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("hello")
public class HelloController {

    @GetMapping("hello1")
    public String hello1(@RequestParam("info") String text) {
        return String.format("Info: %s", text);
    }

    @GetMapping("hello2")
    public String hello2(@RequestParam("info") String infoText, @RequestParam("count") Optional<Integer> countGreeting) {
        return String.format("Info: %s Count %s", infoText, countGreeting);
    }

    @PostMapping("hello3")
    public String hello3(@RequestBody Hello hello) {
        return String.format(hello.toString());
    }

    @PostMapping("hello4")
    public String hello4(@RequestBody Integer... integers) {
        System.out.println(Arrays.toString(integers));
        return String.format("Result:  %d", integers.length);
    }
}

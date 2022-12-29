package com.company.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
@RequestMapping(value = "hello",method = {RequestMethod.GET,RequestMethod.POST})
public class HelloController {
    //http://localhost:8099/hello/hello1?name=Jill
    //http://localhost:8099/hello/hello2?name=Jill&age=4
    @GetMapping("hello1")
    public String test1(@RequestParam("name") String name1, @RequestParam("age") Optional<Integer> age1) {
        return String.format("Hello, %s , %s", name1, age1);
    }

    @GetMapping("hello2")
    public String test1(HttpServletRequest request) {
        return String.format("Hello, %s , %s", request.getParameter("name"), request.getParameter("age"));
    }


}

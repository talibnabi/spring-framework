package com.company.springfifth.controller;


import com.company.springfifth.model.Airline;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("airline")
public class AirlineController {

    // status: 200 - OK
    //         204 - No Content
    @GetMapping
    public ResponseEntity<List<Airline>> list(@RequestParam("query") String query) {
        // 1. get all the data needed from request (query param, path var, cookie, header, attachment, ...)
        // 2. service call: service.list(query)
        Airline airline = new Airline();
        airline.setName(query);
        List<Airline> found = new ArrayList<>();
        found.add(airline);
        // 3. build response, add the cookie, headers, ...
        return found.isEmpty() ?
                ResponseEntity.status(HttpStatus.NO_CONTENT).build() :
                ResponseEntity.ok(found);
    }

//    @GetMapping("2")
//    public ResponseEntity<List<Airline>> list2(@RequestParam("query") String query) {
//        // 1. get all the data needed from request (query param, path var, cookie, header, attachment, ...)
//        // 2. service call: service.list(query)
//        List<Airline> found = null;
//        // 3. build response, add the cookie, headers, ...
//        return found.isEmpty() ?
//                ResponseEntity.status(HttpStatus.NO_CONTENT).build() :
//                ResponseEntity.ok(found);
//    }

    @GetMapping("3")
    public ResponseEntity<List<Airline>> list3(@RequestParam("query") String query) {
        // 1. get all the data needed from request (query param, path var, cookie, header, attachment, ...)
        // 2. service call: service.list(query)
        Optional<List<Airline>> found = Optional.empty();
        // 3. build response, add the cookie, headers, ...
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
